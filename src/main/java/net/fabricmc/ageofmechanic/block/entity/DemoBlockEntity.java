package net.fabricmc.ageofmechanic.block.entity;

import net.fabricmc.ageofmechanic.AgeOfMechanic;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class DemoBlockEntity extends BlockEntity {
    // Store the current value of the number
    private int number = 7;

    public DemoBlockEntity(BlockPos pos, BlockState state) {
        super(AgeOfMechanic.DEMO_BLOCK_ENTITY, pos, state);
    }

    public static void tick(World world1, BlockPos pos, BlockState state1, BlockEntity be) {
    }

    // Serialize the BlockEntity
    @Override
    public void writeNbt(NbtCompound tag) {
        // Save the current value of the number to the tag
        tag.putInt("number", number);

        super.writeNbt(tag);
    }
    // Deserialize the BlockEntity
    @Override
    public void readNbt(NbtCompound tag) {
        super.readNbt(tag);

        number = tag.getInt("number");
    }
    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }

}

