package com.dubnubdubnub.mooncraf.common.items;

import java.util.function.Supplier;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;

public enum PlatedIronArmourMaterial implements IArmorMaterial {
	IRON_PLATES("iron_plates", 30, new int[] { 2, 6, 7, 3 }, 14, SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 0.0F,
			() -> Ingredient.of(ItemInit.IRON_PLATES.get()));

	private static final int[] MAX_DAMAGE_ARRAY = new int[] { 13, 15, 16, 11 };
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final float knockbackResistance;
	private final Lazy<Ingredient> repairMaterialLazy;

	private PlatedIronArmourMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountArrayIn,
			int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, float knockbackResistanceIn,
			Supplier<Ingredient> repairMaterialSupplier) {
		this.name = Mooncraf.MOD_ID + ":" + nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountArrayIn;
		this.enchantability = enchantabilityIn;
		this.soundEvent = soundEventIn;
		this.toughness = toughnessIn;
		this.knockbackResistance = knockbackResistanceIn;
		this.repairMaterialLazy = Lazy.concurrentOf(repairMaterialSupplier);
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		// TODO Auto-generated method stub
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return this.repairMaterialLazy.get();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return this.knockbackResistance;
	}

}
