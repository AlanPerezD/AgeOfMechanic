package net.fabricmc.ageofmechanic.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.registry.Registry;

import static net.fabricmc.ageofmechanic.block.ModBlocks.DEMO_BLOCK;

public class BlockEntityType<D extends BlockEntity> implements BlockEntityType2 {


    public static net.minecraft.block.entity.BlockEntityType<DemoBlockEntity> DEMO_BLOCK_ENTITY;

    @Override
    public void onInitialize() {
        DEMO_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "tutorial:demo_block_entity",
                FabricBlockEntityTypeBuilder.create(DemoBlockEntity::new, DEMO_BLOCK).build(null));
    }
}