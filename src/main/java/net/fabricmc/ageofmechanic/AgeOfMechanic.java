package net.fabricmc.ageofmechanic;

import net.fabricmc.ageofmechanic.block.ModBlocks;
import net.fabricmc.ageofmechanic.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.passive.SalmonEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgeOfMechanic implements ModInitializer {

//This need to go in a class named ModEntities
/*	 public static final EntityType<SalmonEntity> CARP = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("ageofmechanic","carp"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SalmonEntity::new)
					.dimensions(EntityDimensions
					.fixed(0.7F, 0.4F))
					.build()
		);
*/
    public static final String MOD_ID = "ageofmechanic";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
	//	FabricDefaultAttributeRegistry.register(CARP, SalmonEntity.createMobAttributes());


		ModBlocks.registerModBlock();
		ModItems.registerModItems();
	}
}
