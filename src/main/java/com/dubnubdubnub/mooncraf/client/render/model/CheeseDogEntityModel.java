package com.dubnubdubnub.mooncraf.client.render.model;
// Made with Blockbench 3.5.0
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.dubnubdubnub.mooncraf.common.entities.CheeseDogEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class CheeseDogEntityModel<T extends CheeseDogEntity> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer legs;
	private final ModelRenderer back;
	private final ModelRenderer backright;
	private final ModelRenderer backleft;
	private final ModelRenderer front;
	private final ModelRenderer frontright;
	private final ModelRenderer frontleft;
	private final ModelRenderer bodyblocks;
	private final ModelRenderer mainbody;
	private final ModelRenderer neck;
	private final ModelRenderer head;
	private final ModelRenderer ears;
	private final ModelRenderer rightear;
	private final ModelRenderer leftear;
	private final ModelRenderer headshape;
	private final ModelRenderer eyes;
	private final ModelRenderer lefteye;
	private final ModelRenderer righteye;
	private final ModelRenderer tail;

	public CheeseDogEntityModel() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		

		legs = new ModelRenderer(this);
		legs.setPos(0.0F, 0.0F, 5.0F);
		body.addChild(legs);
		

		back = new ModelRenderer(this);
		back.setPos(0.0F, 0.0F, 0.0F);
		legs.addChild(back);
		

		backright = new ModelRenderer(this);
		backright.setPos(0.0F, 0.0F, 0.0F);
		back.addChild(backright);
		backright.texOffs(8, 33).addBox(-3.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		backleft = new ModelRenderer(this);
		backleft.setPos(0.0F, 0.0F, 0.0F);
		back.addChild(backleft);
		backleft.texOffs(0, 33).addBox(1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		front = new ModelRenderer(this);
		front.setPos(0.0F, 0.0F, 0.0F);
		legs.addChild(front);
		

		frontright = new ModelRenderer(this);
		frontright.setPos(0.0F, 0.0F, 0.0F);
		front.addChild(frontright);
		frontright.texOffs(28, 28).addBox(-3.0F, -8.0F, -11.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		frontleft = new ModelRenderer(this);
		frontleft.setPos(0.0F, 0.0F, 0.0F);
		front.addChild(frontleft);
		frontleft.texOffs(0, 0).addBox(1.0F, -8.0F, -11.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		bodyblocks = new ModelRenderer(this);
		bodyblocks.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(bodyblocks);
		

		mainbody = new ModelRenderer(this);
		mainbody.setPos(0.0F, 0.0F, 0.0F);
		bodyblocks.addChild(mainbody);
		mainbody.texOffs(0, 0).addBox(-3.0F, -12.0F, -6.0F, 6.0F, 6.0F, 14.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setPos(0.0F, 0.0F, 0.0F);
		bodyblocks.addChild(neck);
		neck.texOffs(0, 20).addBox(-4.0F, -13.0F, -6.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		

		ears = new ModelRenderer(this);
		ears.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(ears);
		

		rightear = new ModelRenderer(this);
		rightear.setPos(0.0F, 0.0F, 0.0F);
		ears.addChild(rightear);
		rightear.texOffs(8, 0).addBox(-3.0F, -14.0F, -7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		leftear = new ModelRenderer(this);
		leftear.setPos(0.0F, 0.0F, 0.0F);
		ears.addChild(leftear);
		leftear.texOffs(0, 22).addBox(2.0F, -14.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftear.texOffs(8, 8).addBox(1.0F, -13.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		headshape = new ModelRenderer(this);
		headshape.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(headshape);
		headshape.texOffs(8, 3).addBox(-1.0F, -9.0F, -12.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		headshape.texOffs(26, 0).addBox(-3.0F, -12.0F, -9.0F, 6.0F, 6.0F, 3.0F, 0.0F, false);
		headshape.texOffs(34, 20).addBox(-1.5F, -10.0F, -11.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		headshape.texOffs(0, 10).addBox(-3.0F, -9.0F, -10.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);

		eyes = new ModelRenderer(this);
		eyes.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(eyes);
		

		lefteye = new ModelRenderer(this);
		lefteye.setPos(0.0F, 0.0F, 0.0F);
		eyes.addChild(lefteye);
		lefteye.texOffs(8, 6).addBox(1.0F, -10.0F, -9.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		righteye = new ModelRenderer(this);
		righteye.setPos(0.0F, 0.0F, 0.0F);
		eyes.addChild(righteye);
		righteye.texOffs(0, 20).addBox(-3.0F, -10.0F, -9.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -9.0F, 8.0F);
		body.addChild(tail);
		setRotationAngle(tail, -1.5708F, 0.0F, 0.0F);
		tail.texOffs(16, 33).addBox(-1.0F, -5.1008F, -1.4284F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		tail.texOffs(22, 20).addBox(-1.0F, -5.1008F, -2.4284F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		tail.texOffs(26, 9).addBox(-2.0F, -5.1008F, -1.4284F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		tail.texOffs(28, 25).addBox(-1.0F, -6.1008F, -1.4284F, 2.0F, 1.0F, 2.0F, 0.0F, false);
	}

	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay);
    }

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// TODO Auto-generated method stub
		
	}
} 

