package com.enokidake.noodlesdelight.item;

import com.enokidake.noodlesdelight.NoodlesDelight;
import com.enokidake.noodlesdelight.block.NoodlesBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoodlesItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NoodlesDelight.MOD_ID);

    public static final DeferredItem<BlockItem> WOODEN_CASE = ITEMS.registerSimpleBlockItem(NoodlesBlocks.WOODEN_CASE);
    public static final DeferredItem<BlockItem> WOODEN_CASE_KOJI_FILLED = ITEMS.registerSimpleBlockItem(NoodlesBlocks.WOODEN_CASE_KOJI_FILLED);
    public static final DeferredItem<BlockItem> WOODEN_CASE_KOJI_FERMENTED = ITEMS.registerSimpleBlockItem(NoodlesBlocks.WOODEN_CASE_KOJI_FERMENTED);
    public static final DeferredItem<BlockItem> WOODEN_CASE_WATER = ITEMS.registerSimpleBlockItem(NoodlesBlocks.WOODEN_CASE_WATER);
    public static final DeferredItem<BlockItem> WOODEN_CASE_SALT = ITEMS.registerSimpleBlockItem(NoodlesBlocks.WOODEN_CASE_SALT);
    public static final DeferredItem<BlockItem> BONITO_SLICER = ITEMS.registerSimpleBlockItem(NoodlesBlocks.BONITO_SLICER);
    public static final DeferredItem<BlockItem> MISO_BALLEL = ITEMS.registerSimpleBlockItem(NoodlesBlocks.MISO_BARREL);
    public static final DeferredItem<BlockItem> SOY_SAUCE_BALLEL = ITEMS.registerSimpleBlockItem(NoodlesBlocks.SOY_SAUCE_BARREL);

    public static final DeferredItem<BlockItem> SOYBEANS_BAG = ITEMS.registerSimpleBlockItem(NoodlesBlocks.SOYBEANS_BAG);
    public static final DeferredItem<BlockItem> EMPTY_CONTAINER = ITEMS.registerSimpleBlockItem(NoodlesBlocks.EMPTY_CONTAINER);
    public static final DeferredItem<BlockItem> BONITO_CONTAINER = ITEMS.registerSimpleBlockItem(NoodlesBlocks.BONITO_CONTAINER);
    public static final DeferredItem<BlockItem> FLYING_FISH_CONTAINER = ITEMS.registerSimpleBlockItem(NoodlesBlocks.FLYING_FISH_CONTAINER);
    public static final DeferredItem<BlockItem> SARDINE_CONTAINER = ITEMS.registerSimpleBlockItem(NoodlesBlocks.SARDINE_CONTAINER);

    public static final DeferredItem<Item> SOYBEANS = ITEMS.register("soybeans", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KOJI = ITEMS.register("koji", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BONITO = ITEMS.register("bonito", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMOKED_BONITO = ITEMS.register("smoked_bonito", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KATSUOBUSHI = ITEMS.register("katsuobushi", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLYING_FISH = ITEMS.register("flying_fish", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRILLED_FLYING_FISH = ITEMS.register("grilled_flying_fish", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SARDINE = ITEMS.register("sardine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIBOSHI = ITEMS.register("niboshi", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NOODLES_BOWL = ITEMS.register("noodles_bowl", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MISO = ITEMS.register("miso", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOY_SAUCE = ITEMS.register("soy_sauce", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MISO_RAMEN = registerFood("miso_ramen", null);
    public static final DeferredItem<Item> SHOYU_RAMEN = registerFood("shoyu_ramen", null);
    public static final DeferredItem<Item> TONKOTSU_RAMEN = registerFood("tonkotsu_ramen", null);
    public static final DeferredItem<Item> SHIO_RAMEN = registerFood("shio_ramen", null);
    public static final DeferredItem<Item> TANTANMEN = registerFood("tantanmen", null);

    private static DeferredItem<Item> registerFood(String name, FoodProperties food) {
        return ITEMS.registerItem(name, Item::new, new Item.Properties().food(food));
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
