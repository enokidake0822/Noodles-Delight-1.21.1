package com.enokidake.noodlesdelight.provider;

import com.enokidake.noodlesdelight.NoodlesDelight;
import net.minecraft.core.HolderLookup;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = NoodlesDelight.MOD_ID)
public class NoodlesDatagen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){

        var generator = event.getGenerator();
        var output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new NoodlesRecipeProvider(output, provider));

        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(
                event.includeServer(),
                new AdvancementProvider(output, provider, helper, List.of(new NoodlesAdvancementProvider())));

        generator.addProvider(event.includeClient(), new NoodlesJapaneseProvider(output));
        generator.addProvider(event.includeClient(), new NoodlesEnglishProvider(output));
        generator.addProvider(event.includeClient(), new NoodlesBlockProvider(output, helper));
        generator.addProvider(event.includeClient(), new NoodlesModelProvider(output, helper));

    }

}
