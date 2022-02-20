package net.fabricmc.ageofmechanic.block.entity;

import net.fabricmc.ageofmechanic.registry.AgeOfMechanicEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

public class DemoBlockEntity extends BlockEntity {
    // porque usaban NBT para guadar valores (asi funcionaban los cofres)
    private int number = 7;

    public DemoBlockEntity(BlockPos pos, BlockState state){
        super (AgeOfMechanicEntities.DEMO_BLOCK_ENTITY, pos ,state);
    }
    @Override
    public void writeNbt(NbtCompound tag) {
        tag.putInt("number", number);
        super.writeNbt(tag);
    }
    @Override
    public void readNbt(NbtCompound tag) {
        super.readNbt(tag);
        number = tag.getInt("number");
    }

}
