package net.fabricmc.ageofmechanic;

import net.fabricmc.ageofmechanic.client.model.CarpEntityModel;
import net.fabricmc.ageofmechanic.client.renderer.CarpEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class AgeOfMechanicClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_CARP_LAYER = new EntityModelLayer(new Identifier("ageofmechanic", "carp"),"main");

    @Override
    public void onInitializeClient(){
        EntityRendererRegistry.register(AgeOfMechanic.CARP, CarpEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MODEL_CARP_LAYER, CarpEntityModel::getTexturedModelData);

    }
}
