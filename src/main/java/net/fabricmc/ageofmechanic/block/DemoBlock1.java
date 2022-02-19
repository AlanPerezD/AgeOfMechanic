package net.fabricmc.ageofmechanic.block;

import net.fabricmc.ageofmechanic.AgeOfMechanic;
import net.fabricmc.ageofmechanic.block.entity.DemoBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class DemoBlock1 extends BlockWithEntity {
    protected DemoBlock1(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        // With inheriting from BlockWithEntity this defaults to INVISIBLE, so we need to change that!
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, AgeOfMechanic.DEMO_BLOCK_ENTITY, (world1, pos, state1, be) -> DemoBlockEntity.tick(world1, pos, state1, be));
    }
}