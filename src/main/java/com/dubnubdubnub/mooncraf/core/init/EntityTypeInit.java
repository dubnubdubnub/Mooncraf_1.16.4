package com.dubnubdubnub.mooncraf.core.init;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.common.entities.CheeseDogEntity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {
	
	private static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Mooncraf.MOD_ID);
	
	public static final RegistryObject<EntityType<CheeseDogEntity>> CHEESE_DOG_ENTITY = ENTITY_TYPES
			.register("cheese_dog_entity", 
					() -> EntityType.Builder.<CheeseDogEntity>of(CheeseDogEntity::new, EntityClassification.CREATURE)
					.sized(0.4f, 0.6f)
					.build(new ResourceLocation(Mooncraf.MOD_ID, "cheese_dog_entity")
							.toString()));

}
