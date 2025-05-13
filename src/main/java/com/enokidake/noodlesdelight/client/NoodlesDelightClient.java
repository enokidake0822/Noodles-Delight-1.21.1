package com.enokidake.noodlesdelight.client;

import com.enokidake.noodlesdelight.NoodlesDelight;
import com.enokidake.noodlesdelight.block.NoodlesBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@Mod(value = NoodlesDelight.MOD_ID, dist = Dist.CLIENT)
public class NoodlesDelightClient {

    public NoodlesDelightClient(IEventBus eventBus) {
        eventBus.addListener(this::registerColorHandler);
    }

    private void registerColorHandler(RegisterColorHandlersEvent.Block event) {
        event.register(
                (state, level, pos, tintIndex) -> {
                    if ( level != null && pos != null && tintIndex == 0){
                        return BiomeColors.getAverageWaterColor(level, pos);
                    }
                    return -1;
                },
                NoodlesBlocks.WOODEN_CASE_WATER.get()
        );
    }
}
