package com.enokidake.noodlesdelight.block;

import com.enokidake.noodlesdelight.NoodlesDelight;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoodlesBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(NoodlesDelight.MOD_ID);

    public static final DeferredBlock<Block> WOODEN_CASE = BLOCKS.registerSimpleBlock("wooden_case_empty",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion());
    public static final DeferredBlock<Block> WOODEN_CASE_KOJI_FILLED = BLOCKS.registerSimpleBlock("wooden_case_koji_filled",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion());
    public static final DeferredBlock<Block> WOODEN_CASE_KOJI_FERMENTED = BLOCKS.registerSimpleBlock("wooden_case_koji_fermented",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion());
    public static final DeferredBlock<Block> WOODEN_CASE_WATER = BLOCKS.registerSimpleBlock("wooden_case_water",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion());
    public static final DeferredBlock<Block> WOODEN_CASE_SALT = BLOCKS.registerSimpleBlock("wooden_case_salt",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion());
    public static final DeferredBlock<Block> BONITO_SLICER = BLOCKS.registerSimpleBlock("bonito_slicer",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion());
    public static final DeferredBlock<Block> MISO_BARREL = BLOCKS.registerBlock("miso_barrel",
            NoodlesBarrel::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL));
    public static final DeferredBlock<Block> SOY_SAUCE_BARREL = BLOCKS.registerBlock("soy_sauce_barrel",
            NoodlesBarrel::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL));

    public static final DeferredBlock<Block> SOYBEANS_BAG = BLOCKS.registerBlock("soybeans_bag",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL));
    public static final DeferredBlock<Block> EMPTY_CONTAINER = BLOCKS.registerBlock("empty_container",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final DeferredBlock<Block> BONITO_CONTAINER = BLOCKS.registerBlock("bonito_container",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final DeferredBlock<Block> FLYING_FISH_CONTAINER = BLOCKS.registerBlock("flying_fish_container",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final DeferredBlock<Block> SARDINE_CONTAINER = BLOCKS.registerBlock("sardine_container",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
