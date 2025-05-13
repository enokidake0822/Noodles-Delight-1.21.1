package com.enokidake.noodlesdelight.item;

import com.enokidake.noodlesdelight.NoodlesDelight;
import com.enokidake.noodlesdelight.block.NoodlesBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NoodlesCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NoodlesDelight.MOD_ID);

    public static final Supplier<CreativeModeTab> NOODLES_DELIGHT_TAB = CREATIVE_TAB.register("noodles_delight_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NoodlesItems.MISO_RAMEN.get()))
                    .title(Component.literal("Noodle's Delight"))
                    .displayItems((parameters, output) -> {
                        output.accept(NoodlesBlocks.WOODEN_CASE);
                        //output.accept(NoodlesBlocks.WOODEN_CASE_KOJI_FILLED);
                        //output.accept(NoodlesBlocks.WOODEN_CASE_KOJI_FERMENTED);
                        //output.accept(NoodlesBlocks.WOODEN_CASE_WATER);
                        //output.accept(NoodlesBlocks.WOODEN_CASE_SALT);
                        output.accept(NoodlesBlocks.BONITO_SLICER);
                        output.accept(NoodlesBlocks.MISO_BARREL);
                        output.accept(NoodlesBlocks.SOY_SAUCE_BARREL);

                        //output.accept(NoodlesBlocks.EMPTY_STORAGE_BOX);
                        //output.accept(NoodlesBlocks.RICE_STORAGE_BOX);
                        //output.accept(NoodlesBlocks.SOYBEANS_STORAGE_BOX);
                        //output.accept(NoodlesBlocks.KOJI_STORAGE_BOX);
                        //output.accept(NoodlesBlocks.SMOKED_BONITO_STORAGE_BOX);
                        output.accept(NoodlesBlocks.EMPTY_CONTAINER);
                        output.accept(NoodlesBlocks.BONITO_CONTAINER);
                        output.accept(NoodlesBlocks.FLYING_FISH_CONTAINER);
                        output.accept(NoodlesBlocks.SARDINE_CONTAINER);

                        output.accept(NoodlesItems.SOYBEANS);
                        output.accept(NoodlesItems.KOJI);
                        output.accept(NoodlesItems.MISO);
                        output.accept(NoodlesItems.SOY_SAUCE);
                        output.accept(NoodlesItems.SALT);
                        output.accept(NoodlesItems.BONITO);
                        output.accept(NoodlesItems.SMOKED_BONITO);
                        output.accept(NoodlesItems.KATSUOBUSHI);
                        output.accept(NoodlesItems.FLYING_FISH);
                        output.accept(NoodlesItems.GRILLED_FLYING_FISH);
                        output.accept(NoodlesItems.SARDINE);
                        output.accept(NoodlesItems.NIBOSHI);
                        output.accept(NoodlesItems.NOODLES_BOWL);

                        output.accept(NoodlesItems.MISO_RAMEN);
                        output.accept(NoodlesItems.SHOYU_RAMEN);
                        output.accept(NoodlesItems.TONKOTSU_RAMEN);
                        output.accept(NoodlesItems.SHIO_RAMEN);
                        output.accept(NoodlesItems.TANTANMEN);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_TAB.register(eventBus);
    }

}
