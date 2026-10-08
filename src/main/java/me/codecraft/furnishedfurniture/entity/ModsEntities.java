package me.codecraft.furnishedfurniture.entity;

import me.codecraft.furnishedfurniture.FurnishedFurniture;
import me.codecraft.furnishedfurniture.entity.block.Chair;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.*;

public class ModsEntities {

    private static <T extends Entity> EntityType<T> register(ResourceKey<EntityType<?>> id, EntityType.Builder<T> builder) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, id, builder.build(id));
    }

    private static ResourceKey<EntityType<?>> create(String name) {
        return ResourceKey.create(Registries.ENTITY_TYPE, FurnishedFurniture.id(name));
    }

    public static void init(){
        FurnishedFurniture.LOGGER.info("Loaded Entities");
    }

    public static final ResourceKey<EntityType<?>> CHAIR_ID = create("chair");
    public static final EntityType<Chair> CHAIR = ModsEntities.register(ModsEntities.CHAIR_ID, EntityType.Builder.of(Chair::new, MobCategory.MISC).noLootTable().sized(1.0f, 0.45f).clientTrackingRange(10).updateInterval(Integer.MAX_VALUE).dontTrackDeltas());
}
