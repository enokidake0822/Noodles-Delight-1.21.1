package com.enokidake.noodlesdelight.provider;

import com.enokidake.noodlesdelight.NoodlesDelight;
import com.enokidake.noodlesdelight.item.NoodlesItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class NoodlesRecipeProvider extends RecipeProvider {

    public NoodlesRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NoodlesItems.NOODLES_BOWL)
                .pattern("CNC")
                .pattern(" C ")
                .define('C', Items.CLAY_BALL)
                .define('N', Items.BOWL)
                .unlockedBy("has_noodlesbowl", has(Items.BOWL))
                .save(output, ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "noodles_bowl"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NoodlesItems.MISO_BALLEL)
                .pattern("KKK")
                .pattern("SSS")
                .pattern(" B ")
                .define('K', NoodlesItems.KOJI)
                .define('S', NoodlesItems.SOYBEANS)
                .define('B', Blocks.BARREL)
                .unlockedBy("has_miso_barrel", has(Blocks.BARREL))
                .save(output, ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "miso_barrel"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NoodlesItems.SOY_SAUCE_BALLEL)
                .pattern("KKK")
                .pattern("SSS")
                .pattern(" B ")
                .define('K', NoodlesItems.KOJI)
                .define('S', NoodlesItems.SALT)
                .define('B', Blocks.BARREL)
                .unlockedBy("has_soy_sauce_barrel", has(Blocks.BARREL))
                .save(output, ResourceLocation.fromNamespaceAndPath(NoodlesDelight.MOD_ID, "soy_sauce_barrel"));
    }
}
