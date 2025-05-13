package com.enokidake.noodlesdelight.provider;

import com.enokidake.noodlesdelight.NoodlesDelight;
import com.enokidake.noodlesdelight.block.NoodlesBarrel;
import com.enokidake.noodlesdelight.block.NoodlesBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class NoodlesBlockProvider extends BlockStateProvider {

    public NoodlesBlockProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NoodlesDelight.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        BlockModelProvider models = models();
        getVariantBuilder(NoodlesBlocks.MISO_BARREL.get())
                .forAllStates(state -> {
                    int progress = state.getValue(NoodlesBarrel.PROGRESS);
                    return ConfiguredModel.builder()
                            .modelFile(models.cubeBottomTop("miso_barrel_" + progress,
                                    models.modLoc("block/miso_barrel_side"),
                                    models.modLoc("block/miso_barrel_bottom"),
                                    models.modLoc("block/miso_barrel_top")
                            )
                    )
                            .build();
                });
        getVariantBuilder(NoodlesBlocks.SOY_SAUCE_BARREL.get())
                .forAllStates(state -> {
                    int progress = state.getValue(NoodlesBarrel.PROGRESS);
                    return ConfiguredModel.builder()
                            .modelFile(models.cubeBottomTop("soy_sauce_barrel_" + progress,
                                            models.modLoc("block/soy_sauce_barrel_side"),
                                            models.modLoc("block/miso_barrel_bottom"),
                                            models.modLoc("block/miso_barrel_top")
                                    )
                            )
                            .build();
                });

        simpleBlock(NoodlesBlocks.WOODEN_CASE.get(),
                new ModelFile.UncheckedModelFile(NoodlesBlocks.WOODEN_CASE.getId().withPrefix("block/")));
        simpleBlock(NoodlesBlocks.WOODEN_CASE_KOJI_FILLED.get(),
                new ModelFile.UncheckedModelFile(NoodlesBlocks.WOODEN_CASE_KOJI_FILLED.getId().withPrefix("block/")));
        simpleBlock(NoodlesBlocks.WOODEN_CASE_KOJI_FERMENTED.get(),
                new ModelFile.UncheckedModelFile(NoodlesBlocks.WOODEN_CASE_KOJI_FERMENTED.getId().withPrefix("block/")));
        simpleBlock(NoodlesBlocks.WOODEN_CASE_WATER.get(),
                new ModelFile.UncheckedModelFile(NoodlesBlocks.WOODEN_CASE_WATER.getId().withPrefix("block/")));
        simpleBlock(NoodlesBlocks.WOODEN_CASE_SALT.get(),
                new ModelFile.UncheckedModelFile(NoodlesBlocks.WOODEN_CASE_SALT.getId().withPrefix("block/")));
        simpleBlock(NoodlesBlocks.BONITO_SLICER.get(),
                new ModelFile.UncheckedModelFile(NoodlesBlocks.BONITO_SLICER.getId().withPrefix("block/")));

        getVariantBuilder(NoodlesBlocks.SOYBEANS_BAG.get())
                .forAllStates(state -> ConfiguredModel.builder()
                        .modelFile(models.cube("empty_storage_box",
                                        models.modLoc("block/storage_box_bottom"),
                                        models.modLoc("block/empty_storage_box_top"),
                                        models.modLoc("block/storage_box_side"),
                                        models.modLoc("block/storage_box_side"),
                                        models.modLoc("block/storage_box_handle"),
                                        models.modLoc("block/storage_box_handle")
                                )
                        )
                        .build());
        getVariantBuilder(NoodlesBlocks.EMPTY_CONTAINER.get())
                .forAllStates(state -> ConfiguredModel.builder()
                        .modelFile(models.cubeBottomTop("empty_container",
                                        models.modLoc("block/container_side"),
                                        models.modLoc("block/container_side"),
                                        models.modLoc("block/empty_container_top")
                                )
                        )
                        .build());
        getVariantBuilder(NoodlesBlocks.BONITO_CONTAINER.get())
                .forAllStates(state -> ConfiguredModel.builder()
                        .modelFile(models.cubeBottomTop("bonito_container",
                                        models.modLoc("block/container_side"),
                                        models.modLoc("block/container_side"),
                                        models.modLoc("block/bonito_container_top")
                                )
                        )
                        .build());
        getVariantBuilder(NoodlesBlocks.FLYING_FISH_CONTAINER.get())
                .forAllStates(state -> ConfiguredModel.builder()
                        .modelFile(models.cubeBottomTop("flying_fish_container",
                                        models.modLoc("block/container_side"),
                                        models.modLoc("block/container_side"),
                                        models.modLoc("block/flying_fish_container_top")
                                )
                        )
                        .build());
        getVariantBuilder(NoodlesBlocks.SARDINE_CONTAINER.get())
                .forAllStates(state -> ConfiguredModel.builder()
                        .modelFile(models.cubeBottomTop("sardine_container",
                                        models.modLoc("block/container_side"),
                                        models.modLoc("block/container_side"),
                                        models.modLoc("block/sardine_container_top")
                                )
                        )
                        .build());
    }
}
