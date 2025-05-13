package com.enokidake.noodlesdelight.provider;

import com.enokidake.noodlesdelight.NoodlesDelight;
import com.enokidake.noodlesdelight.block.NoodlesBlocks;
import com.enokidake.noodlesdelight.item.NoodlesItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class NoodlesJapaneseProvider extends LanguageProvider {

    public NoodlesJapaneseProvider(PackOutput output) {
        super(output, NoodlesDelight.MOD_ID, "ja_jp");
    }

    @Override
    protected void addTranslations() {
        addBlock(NoodlesBlocks.WOODEN_CASE, "木箱");
        addBlock(NoodlesBlocks.WOODEN_CASE_KOJI_FILLED, "麹の種入り木箱");
        addBlock(NoodlesBlocks.WOODEN_CASE_KOJI_FERMENTED, "麹入り木箱");
        addBlock(NoodlesBlocks.WOODEN_CASE_WATER, "水入り木箱");
        addBlock(NoodlesBlocks.WOODEN_CASE_SALT, "塩入り木箱");
        addBlock(NoodlesBlocks.BONITO_SLICER, "削り箱");
        addBlock(NoodlesBlocks.MISO_BARREL, "味噌樽");
        addBlock(NoodlesBlocks.SOY_SAUCE_BARREL, "醤油樽");

        //addBlock(NoodlesBlocks.EMPTY_STORAGE_BOX, "空の保管箱");
        //addBlock(NoodlesBlocks.RICE_STORAGE_BOX, "米の保管箱");
        //addBlock(NoodlesBlocks.SOYBEANS_STORAGE_BOX, "大豆の保管箱");
        //addBlock(NoodlesBlocks.KOJI_STORAGE_BOX, "麹の保管箱");
        //addBlock(NoodlesBlocks.SMOKED_BONITO_STORAGE_BOX, "カツオの燻製の保管箱");
        addBlock(NoodlesBlocks.EMPTY_CONTAINER, "空のコンテナ");
        addBlock(NoodlesBlocks.BONITO_CONTAINER, "カツオ入りコンテナ");
        addBlock(NoodlesBlocks.FLYING_FISH_CONTAINER, "トビウオ入りコンテナ");
        addBlock(NoodlesBlocks.SARDINE_CONTAINER, "イワシ入りコンテナ");

        addItem(NoodlesItems.SOYBEANS, "大豆");
        addItem(NoodlesItems.KOJI, "麹");
        addItem(NoodlesItems.MISO, "味噌");
        addItem(NoodlesItems.SOY_SAUCE, "醤油");
        addItem(NoodlesItems.SALT, "塩");
        addItem(NoodlesItems.BONITO, "カツオ");
        addItem(NoodlesItems.SMOKED_BONITO, "カツオの燻製");
        addItem(NoodlesItems.KATSUOBUSHI, "カツオ節");
        addItem(NoodlesItems.FLYING_FISH, "トビウオ");
        addItem(NoodlesItems.GRILLED_FLYING_FISH, "焼きアゴ");
        addItem(NoodlesItems.SARDINE, "イワシ");
        addItem(NoodlesItems.NIBOSHI, "煮干し");
        addItem(NoodlesItems.NOODLES_BOWL, "どんぶり");

        addItem(NoodlesItems.MISO_RAMEN, "味噌ラーメン");
        addItem(NoodlesItems.SHOYU_RAMEN, "醤油ラーメン");
        addItem(NoodlesItems.TONKOTSU_RAMEN, "豚骨ラーメン");
        addItem(NoodlesItems.SHIO_RAMEN, "塩ラーメン");
        addItem(NoodlesItems.TANTANMEN, "担々麺");
    }
}
