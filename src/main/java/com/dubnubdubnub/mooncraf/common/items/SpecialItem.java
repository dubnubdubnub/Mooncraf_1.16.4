package com.dubnubdubnub.mooncraf.common.items;

import java.util.List;

import org.lwjgl.glfw.GLFW;

import com.dubnubdubnub.mooncraf.common.blocks.UnawakenedQualicStone;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.item.Item.Properties;

public class SpecialItem extends Item {

	public SpecialItem(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		// TODO Auto-generated method stub
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		if (InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
			tooltip.add(new StringTextComponent(
					"Rare. Powerful. Also Hurts. Seal Quickly, either into an artichoke or a branch"));
		} else {
			// "Hold " + "\u00A7e" + "Shift" + "\u00A77" + " for More Information"
			tooltip.add(new TranslationTextComponent("tooltip.demonic_shard.hold_shift"));

		}
	}

	@Override
	public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
		// TODO Auto-generated method stub
		playerIn.addEffect(new EffectInstance(Effects.GLOWING, 200, 5));
		ZombieEntity entity = new ZombieEntity(worldIn);
		entity.setPos(playerIn.getX(), playerIn.getY(), playerIn.getZ());
		worldIn.addFreshEntity(entity);
		return ActionResult.success(playerIn.getItemInHand(handIn));
	}

	@Override
	public void onCraftedBy(ItemStack stack, World worldIn, PlayerEntity playerIn) {
		// TODO Auto-generated method stub

	}
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 600;
	}
	
	
	/*
	@Override
	public ActionResult<ItemStack> RightClickBlockWithItemTrigger(World worldIn, Playerentity playerIn, Hand handIn) {
		playerIn.addPotionEffect(new EffectInstance(Effects.GLOWING, 200, 5));
		UnawakenedQualicStone BLOCK = new UnawakenedQualicStone(worldIn);
		BLOCK.setPosition(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ());
		worldIn.addBLOCK(BLOCK);
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
	}
	*/
	
}
