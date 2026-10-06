package me.codecraft.furnishedfurniture.entity.block;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.decoration.BlockAttachedEntity;
import net.minecraft.world.entity.decoration.Cushion;
import net.minecraft.world.level.Level;

public class Chair extends Cushion {
    public Chair(EntityType<? extends Cushion> type, Level level) {
        super((EntityType<Cushion>) type, level);
    }
}
