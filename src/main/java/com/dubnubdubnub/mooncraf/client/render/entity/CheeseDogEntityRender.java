package com.dubnubdubnub.mooncraf.client.render.entity;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.client.render.model.CheeseDogEntityModel;
import com.dubnubdubnub.mooncraf.common.entities.CheeseDogEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CheeseDogEntityRender extends MobRenderer<CheeseDogEntity, CheeseDogEntityModel<CheeseDogEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Mooncraf.MOD_ID, "textures/entity/cheesedogtexture.png");
	
	public CheeseDogEntityRender(EntityRendererManager renderManagerIn) {
		super (renderManagerIn, new CheeseDogEntityModel<CheeseDogEntity>(), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CheeseDogEntity entity) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}

}