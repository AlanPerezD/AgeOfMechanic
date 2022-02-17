package net.fabricmc.ageofmechanic.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class CarpEntity extends PathAwareEntity {
    public CarpEntity(EntityType<? extends PathAwareEntity> entityType, World world){
        super(entityType, world);
    }
}
