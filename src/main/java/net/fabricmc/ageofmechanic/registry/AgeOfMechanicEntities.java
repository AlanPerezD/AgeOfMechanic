package net.fabricmc.ageofmechanic.registry;

import net.fabricmc.ageofmechanic.AgeOfMechanic;
import net.fabricmc.ageofmechanic.block.entity.DemoBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import static net.fabricmc.ageofmechanic.block.ModBlocks.DEMO_BLOCK;

public class AgeOfMechanicEntities {

    public static BlockEntityType<DemoBlockEntity> DEMO_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "ageofmechanic:demo_block_entity", FabricBlockEntityTypeBuilder.create(DemoBlockEntity::new, DEMO_BLOCK).build(null));


    public static void registerBlockEntities(){
        AgeOfMechanic.LOGGER.info("Registering BlockEntities for" + AgeOfMechanic.MOD_ID);

    }

}
