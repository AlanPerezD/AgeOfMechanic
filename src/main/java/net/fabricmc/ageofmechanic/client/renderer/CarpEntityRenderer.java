package net.fabricmc.ageofmechanic.client.renderer;

import net.fabricmc.ageofmechanic.AgeOfMechanicClient;
import net.fabricmc.ageofmechanic.client.model.CarpEntityModel;
import net.fabricmc.ageofmechanic.entity.CarpEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CarpEntityRenderer extends MobEntityRenderer<CarpEntity, CarpEntityModel> {

    public CarpEntityRenderer(EntityRendererFactory.Context context) {
        super(context ,new CarpEntityModel(context.getPart(AgeOfMechanicClient.MODEL_CARP_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(CarpEntity entity){
        return new Identifier("ageofmechanic","textures/entity/carp/carp.png");
    }
}
