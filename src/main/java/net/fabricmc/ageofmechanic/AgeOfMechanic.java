package net.fabricmc.ageofmechanic;

import net.fabricmc.ageofmechanic.block.ModBlocks;

import net.fabricmc.ageofmechanic.entity.CarpEntity;
import net.fabricmc.ageofmechanic.item.ModItems;
import net.fabricmc.ageofmechanic.registry.AgeOfMechanicEntities;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgeOfMechanic implements ModInitializer {

	public static final EntityType<CarpEntity> CARP = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("ageofmechanic", "carp"),
			FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, CarpEntity::new).dimensions(EntityDimensions.fixed(0.75f,0.75f)).build()
	);
    public static final String MOD_ID = "ageofmechanic";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");


	@Override
	public void onInitialize() {
		ModBlocks.registerModBlock();
		ModItems.registerModItems();
		AgeOfMechanicEntities.registerBlockEntities();
		FabricDefaultAttributeRegistry.register(CARP, CarpEntity.createMobAttributes());
	}
}
