package com.dubnubdubnub.mooncraf.client.event;

import com.dubnubdubnub.mooncraf.Mooncraf;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Mooncraf.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {
	
	@SubscribeEvent
	public static void oneBlockBreak(final Event event) {
		
	}
	
}
