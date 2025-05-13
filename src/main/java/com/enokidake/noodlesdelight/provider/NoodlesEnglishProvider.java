package com.enokidake.noodlesdelight.provider;

import com.enokidake.noodlesdelight.NoodlesDelight;
import com.enokidake.noodlesdelight.block.NoodlesBlocks;
import com.enokidake.noodlesdelight.item.NoodlesItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class NoodlesEnglishProvider extends LanguageProvider {

    public NoodlesEnglishProvider(PackOutput output) {
        super(output, NoodlesDelight.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addBlock(NoodlesBlocks.WOODEN_CASE, "Wooden Case");
        addBlock(NoodlesBlocks.WOODEN_CASE_KOJI_FILLED, "Koji Seed Wooden Case");
        addBlock(NoodlesBlocks.WOODEN_CASE_KOJI_FERMENTED, "Koji Wooden Case");
        addBlock(NoodlesBlocks.WOODEN_CASE_WATER, "Water Wooden Case");
        addBlock(NoodlesBlocks.WOODEN_CASE_SALT, "Salt Wooden Case");
        addBlock(NoodlesBlocks.BONITO_SLICER, "Bonito Slicer");
        addBlock(NoodlesBlocks.MISO_BARREL, "Miso Barrel");
        addBlock(NoodlesBlocks.SOY_SAUCE_BARREL, "Soy Sauce Barrel");

        //addBlock(NoodlesBlocks.EMPTY_STORAGE_BOX, "Empty Storage Box");
        //addBlock(NoodlesBlocks.RICE_STORAGE_BOX, "Rice Storage Box");
        //addBlock(NoodlesBlocks.SOYBEANS_STORAGE_BOX, "Soybeans Storage Box");
        //addBlock(NoodlesBlocks.KOJI_STORAGE_BOX, "Koji Storage Box");
        //addBlock(NoodlesBlocks.SMOKED_BONITO_STORAGE_BOX, "Smoked Bonito Storage Box");
        addBlock(NoodlesBlocks.EMPTY_CONTAINER, "Empty Container");
        addBlock(NoodlesBlocks.BONITO_CONTAINER, "Bonito Container");
        addBlock(NoodlesBlocks.FLYING_FISH_CONTAINER, "Flying Fish Container");
        addBlock(NoodlesBlocks.SARDINE_CONTAINER, "Sardine Container");

        addItem(NoodlesItems.SOYBEANS, "Soybeans");
        addItem(NoodlesItems.KOJI, "Koji");
        addItem(NoodlesItems.MISO, "Miso");
        addItem(NoodlesItems.SOY_SAUCE, "Soy Sauce");
        addItem(NoodlesItems.SALT, "Salt");
        addItem(NoodlesItems.BONITO, "Bonito");
        addItem(NoodlesItems.SMOKED_BONITO, "Smoked Bonito");
        addItem(NoodlesItems.KATSUOBUSHI, "Katsuobushi");
        addItem(NoodlesItems.FLYING_FISH, "Flying Fish");
        addItem(NoodlesItems.GRILLED_FLYING_FISH, "Grilled Flying Fish");
        addItem(NoodlesItems.SARDINE, "Sardine");
        addItem(NoodlesItems.NIBOSHI, "Niboshi");
        addItem(NoodlesItems.NOODLES_BOWL, "Noodles Bowl");

        addItem(NoodlesItems.MISO_RAMEN, "Miso Ramen");
        addItem(NoodlesItems.SHOYU_RAMEN, "Shoyu Ramen");
        addItem(NoodlesItems.TONKOTSU_RAMEN, "Tonkotsu Ramen");
        addItem(NoodlesItems.SHIO_RAMEN, "Shio Ramen");
        addItem(NoodlesItems.TANTANMEN, "Tantanmen");
    }
}
