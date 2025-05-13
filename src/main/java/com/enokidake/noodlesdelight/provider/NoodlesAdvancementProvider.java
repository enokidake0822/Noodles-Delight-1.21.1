package com.enokidake.noodlesdelight.provider;

import com.enokidake.noodlesdelight.NoodlesDelight;
import com.enokidake.noodlesdelight.item.NoodlesItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.Optional;
import java.util.function.Consumer;

public class NoodlesAdvancementProvider implements AdvancementProvider.AdvancementGenerator {

    @Override
    public void generate(HolderLookup.Provider registries, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {

        var root = Advancement.Builder.advancement()
                .display(new DisplayInfo(
                        NoodlesItems.NOODLES_BOWL.toStack(),
                        Component.literal("Noodles Delight"),
                        Component.empty(),
                        Optional.ofNullable(ResourceLocation.tryParse(
                                "textures/gui/advancements/backgrounds/stone.png")),
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                ))
                .addCriterion("has_noodlesbowl",
                        InventoryChangeTrigger.TriggerInstance.hasItems(NoodlesItems.NOODLES_BOWL))
                .save(saver, ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "root").toString());
    }
}
