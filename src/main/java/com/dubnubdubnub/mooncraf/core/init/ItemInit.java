package com.dubnubdubnub.mooncraf.core.init;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.common.items.PlatedIronArmourMaterial;
import com.dubnubdubnub.mooncraf.common.items.SpecialItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
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
	
	public static final RegistryObject<Item> ESSENCE = ITEMS.register("essence", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<SpecialItem> DEMONIC_SHARD = ITEMS.register("demonic_shard", 
			() -> new SpecialItem(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<SpecialItem> ANGELIC_SHARD = ITEMS.register("angelic_shard", 
			() -> new SpecialItem(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> IRON_PLATES = ITEMS.register("iron_plates", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	
	//Armour
	public static final RegistryObject<ArmorItem> PLATED_IRON_HELMET = ITEMS.register("plated_iron_helmet", () -> new ArmorItem(PlatedIronArmourMaterial.IRON_PLATES, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<ArmorItem> PLATED_IRON_CHESTPLATE = ITEMS.register("plated_iron_chestplate", () -> new ArmorItem(PlatedIronArmourMaterial.IRON_PLATES, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<ArmorItem> PLATED_IRON_LEGGINGS = ITEMS.register("plated_iron_leggings", () -> new ArmorItem(PlatedIronArmourMaterial.IRON_PLATES, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
	public static final RegistryObject<ArmorItem> PLATED_IRON_BOOTS = ITEMS.register("plated_iron_boots", () -> new ArmorItem(PlatedIronArmourMaterial.IRON_PLATES, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
	
	
	
	//Block Items
	public static final RegistryObject<BlockItem> UNAWAKENED_QUALIC_STONE = ITEMS.register("unawakened_qualic_stone", 
			() -> new BlockItem(BlockInit.UNAWAKENED_QUALIC_STONE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
