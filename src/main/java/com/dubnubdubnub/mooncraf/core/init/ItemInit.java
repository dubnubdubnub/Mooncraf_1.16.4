package com.dubnubdubnub.mooncraf.core.init;

import com.dubnubdubnub.mooncraf.Mooncraf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mooncraf.MOD_ID);
	
	public static final RegistryObject<Item> GRUEL = ITEMS.register("gruel", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
	
	
	
	
}
