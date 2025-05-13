package com.enokidake.noodlesdelight.provider;

import com.enokidake.noodlesdelight.NoodlesDelight;
import com.enokidake.noodlesdelight.block.NoodlesBlocks;
import com.enokidake.noodlesdelight.item.NoodlesItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoodlesModelProvider extends ItemModelProvider {

    public NoodlesModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NoodlesDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        DeferredRegister.Items register = NoodlesItems.ITEMS;
        for (DeferredHolder<Item, ? extends Item> entry : register.getEntries()) {
            Item item = entry.get();
            if (item instanceof BlockItem) continue;
            basicItem(item);
        }

        withExistingParent("wooden_case_empty", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/wooden_case_empty"));
        withExistingParent("wooden_case_koji_filled", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/wooden_case_koji_filled"));
        withExistingParent("wooden_case_koji_fermented", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/wooden_case_koji_fermented"));
        withExistingParent("wooden_case_water", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/wooden_case_water"));
        withExistingParent("wooden_case_salt", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/wooden_case_salt"));
        withExistingParent("bonito_slicer", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/bonito_slicer"));
        withExistingParent("miso_barrel", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/miso_barrel_0"));
        withExistingParent("soy_sauce_barrel", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/soy_sauce_barrel_0"));

        //withExistingParent("empty_storage_box", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/empty_storage_box"));
        //withExistingParent("rice_storage_box", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/rice_storage_box"));
        //withExistingParent("soybeans_storage_box", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/soybeans_storage_box"));
        //withExistingParent("koji_storage_box", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/koji_storage_box"));
        //withExistingParent("smoked_bonito_storage_box", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/smoked_bonito_storage_box"));
        withExistingParent("empty_container", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/empty_container"));
        withExistingParent("bonito_container", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/bonito_container"));
        withExistingParent("flying_fish_container", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/flying_fish_container"));
        withExistingParent("sardine_container", ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "block/sardine_container"));

    }


}
