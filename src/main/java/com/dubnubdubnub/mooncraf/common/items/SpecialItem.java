package com.dubnubdubnub.mooncraf.common.items;

import java.util.List;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SpecialItem extends Item{

	public SpecialItem(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		// TODO Auto-generated method stub
		super.addInformation(stack, worldIn, tooltip, flagIn);
		
		tooltip.add(new TranslationTextComponent("tooltip.demonic_shard.hold_shift"));
		
		if(InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(),GLFW.GLFW_KEY_LEFT_SHIFT)) {
			tooltip.add(new StringTextComponent("Rare. Powerful. Also Hurts. Seal Quickly, either into an artichoke or a branch"));
		}
	}
	
	@Override
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
		// TODO Auto-generated method stub
		super.onCreated(stack, worldIn, playerIn);
	}

}
