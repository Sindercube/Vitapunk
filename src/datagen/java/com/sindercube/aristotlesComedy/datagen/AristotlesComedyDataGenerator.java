package com.sindercube.aristotlesComedy.datagen;

import com.sindercube.aristotlesComedy.AristotlesComedy;
import com.sindercube.aristotlesComedy.datagen.provider.ModLanguageProvider;
import com.sindercube.aristotlesComedy.datagen.provider.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.entry.RegistryEntry;

public class AristotlesComedyDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		FabricDataGenerator.Pack pack = generator.createPack();
		try {
			pack.addProvider(ModLanguageProvider::new);
		} catch (Exception ignored) {}
		pack.addProvider(ModModelProvider::new);
	}

	public static boolean ownsRegistry(RegistryEntry<?> entry) {
		return entry.getKey().orElseThrow().getValue().getNamespace().equals(AristotlesComedy.MOD_ID);
	}

}
