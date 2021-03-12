package com.dubnubdubnub.mooncraf.core.init;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.common.items.SpecialItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mooncraf.MOD_ID);
	
	
	//Items
	public static final RegistryObject<Item> GRUEL = ITEMS.register("gruel", 
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
	
	public static final RegistryObject<SpecialItem> DEMONIC_SHARD = ITEMS.register("demonic shard", 
			() -> new SpecialItem(new Item.Properties().group(ItemGroup.MISC)));
	
	
	
	
}
//bruh bruh bruh this is test btw 
