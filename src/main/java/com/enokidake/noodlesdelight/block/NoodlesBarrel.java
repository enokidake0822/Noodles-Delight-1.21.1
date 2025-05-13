package com.enokidake.noodlesdelight.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.neoforged.neoforge.common.Tags;

public class NoodlesBarrel extends Block {

    public static final IntegerProperty PROGRESS = IntegerProperty.create("progerss", 0 , 3 );

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(PROGRESS);
    }

    public NoodlesBarrel(Properties properties) {
        super(properties.randomTicks());
        registerDefaultState(this.getStateDefinition().any().setValue(PROGRESS, 0));
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(7) != 0) return;
        if (!level.getBlockState(pos.above()).is(Tags.Blocks.COBBLESTONES)) return;
        int progress = state.getValue(PROGRESS);
        if (progress >= 3) return;
        level.setBlockAndUpdate(pos, state.setValue(PROGRESS, progress + 1));
        super.randomTick(state, level, pos, random);
    }

    @Override
    protected boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    @Override
    protected int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos) {
        return state.getValue(PROGRESS) == 3 ? 15 : 0;
    }
}
