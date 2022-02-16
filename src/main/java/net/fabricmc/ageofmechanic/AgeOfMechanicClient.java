package net.fabricmc.ageofmechanic;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.SalmonEntityRenderer;

@Environment(EnvType.CLIENT)
public class AgeOfMechanicClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //EntityRendererRegistry.register(AgeOfMechanic.CARP,);


    }
}
