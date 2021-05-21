package com.dubnubdubnub.mooncraf.core.event;

import com.dubnubdubnub.mooncraf.Mooncraf;

import com.dubnubdubnub.mooncraf.core.init.BlockInit;

import net.minecraft.block.AnvilBlock;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.FaceDirection.Constants;
import net.minecraft.util.Direction;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Mooncraf.MOD_ID, bus = Bus.FORGE)
public class EventHandler {

	
	  @SubscribeEvent public static void onBlockBreak(final BlockEvent.BreakEvent
	  event) { if(event.getState().getBlock() instanceof AnvilBlock &&
	  event.getPlayer().isAirBorne == true) { for(int x = 0; x < 5; x++) { for(int
	  y = 0; y < 5; y++) { for(int z = 0; z < 5; z++) {
	  event.getWorld().setBlockState(event.getPos().add(x,y,z),
	  BlockInit.UNAWAKENED_QUALIC_STONE.get().getDefaultState().with(CustomBlock.HORIZONTAL_FACING, Direction.Plane.HORIZONTAL.random(event.getWorld().getRandom())), Constants.BlockFlags.BLOCK_UPDATE); } } } } }
	 

}
