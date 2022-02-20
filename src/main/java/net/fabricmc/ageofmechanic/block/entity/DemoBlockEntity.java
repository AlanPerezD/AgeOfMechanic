package net.fabricmc.ageofmechanic.block.entity;

import net.fabricmc.ageofmechanic.item.inventory.ImplementedInventory;
import net.fabricmc.ageofmechanic.registry.AgeOfMechanicEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public class DemoBlockEntity extends BlockEntity implements ImplementedInventory {
    private final DefaultedList<ItemStack> items =
            DefaultedList.ofSize(2,ItemStack.EMPTY);

    public DemoBlockEntity(BlockPos pos, BlockState state){
        super (AgeOfMechanicEntities.DEMO_BLOCK_ENTITY, pos ,state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }

    @Override
    public void readNbt(NbtCompound tag) {
        super.readNbt(tag);
        Inventories.readNbt(tag, items);
    }

    @Override
    public void writeNbt(NbtCompound tag) {
        Inventories.writeNbt(tag, items);
        super.writeNbt(tag);
    }

}
