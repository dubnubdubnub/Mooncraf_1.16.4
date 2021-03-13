package com.dubnubdubnub.mooncraf.core.init;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.common.items.SpecialItem;

import net.minecraft.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mooncraf.MOD_ID);
	
	
	//Items
	public static final RegistryObject<Item> GRUEL = ITEMS.register("gruel", 
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).fastToEat().saturation(0.6F).setAlwaysEdible().build())));
	
	public static final RegistryObject<SpecialItem> DEMONIC_SHARD = ITEMS.register("demonic_shard", 
			() -> new SpecialItem(new Item.Properties().group(ItemGroup.MISC)));
	
	//Block Items
	public static final RegistryObject<BlockItem> UNAWAKENED_QUALIAC_STONE = ITEMS.register("Unawakened_Qualic_Stone", 
			() -> new BlockItem(BlockInit.UNAWAKENED_QUALIC_STONE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
