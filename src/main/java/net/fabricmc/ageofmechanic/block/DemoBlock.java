package net.fabricmc.ageofmechanic.block;

import net.fabricmc.ageofmechanic.block.entity.DemoBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class DemoBlock extends Block implements BlockEntityProvider {
    public DemoBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new DemoBlockEntity(pos, state);
    }
}
