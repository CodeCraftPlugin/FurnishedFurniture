package me.codecraft.furnishedfurniture.client.entity;

import com.geckolib.renderer.GeoEntityRenderer;
import me.codecraft.furnishedfurniture.entity.ModsEntities;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.entity.EntityRenderers;

public class FurnishedFurnitureClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRenderers.register(ModsEntities.CHAIR, context -> new GeoEntityRenderer<>(context,ModsEntities.CHAIR));

    }
}