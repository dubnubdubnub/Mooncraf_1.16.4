package com.dubnubdubnub.mooncraf.common.entities;

import javax.annotation.Nullable;

import com.dubnubdubnub.mooncraf.core.init.EntityTypeInit;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class CheeseDogEntity extends AnimalEntity{

	public CheeseDogEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super(type, worldIn);
	}

	 
	@Nullable
	public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
		// TODO Auto-generated method stub
		CheeseDogEntity entity1 = new CheeseDogEntity(EntityTypeInit.CHEESE_DOG_ENTITY.get(), this.level);
		entity1.finalizeSpawn((IServerWorld) this.level, this.level.getCurrentDifficultyAt(blockPosition()), SpawnReason.BREEDING, (ILivingEntityData)null, (CompoundNBT)null);
		return entity1;
	}
	
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new SwimGoal(this));
	    this.goalSelector.addGoal(3, new BreedGoal(this, 1.0D));
	    this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
	    this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 8.0F));
	    this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
		
	}
	 
	public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return MobEntity.createLivingAttributes()
        		.add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.FOLLOW_RANGE, 40.0D);
    }
	public boolean isFood(ItemStack stack) {
	      Item item = stack.getItem();
	      return item.isEdible() && item.getFoodProperties().isMeat();
	   }
	
	public void onStruckByLightning(LightningBoltEntity lightningBolt) {
		this.noPhysics = true;
		this.addEffect(new EffectInstance(Effects.LEVITATION, 9999, 1));
	}
	
	protected void playStepSound(BlockPos pos, BlockState blockIn) {
	      this.playSound(SoundEvents.WOLF_STEP, 0.15F, 1.0F);
	       }
	
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		      return SoundEvents.WOLF_HURT;
		   }

	protected SoundEvent getDeathSound() {
		      return SoundEvents.WOLF_DEATH;
		   }

	protected float getSoundVolume() {
	      return 0.4F;
	   }
	
	


}
