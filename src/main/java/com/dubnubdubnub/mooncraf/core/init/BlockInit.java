package com.dubnubdubnub.mooncraf.core.init;

import com.dubnubdubnub.mooncraf.Mooncraf;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mooncraf.MOD_ID);
	
	
	public static final RegistryObject<Block> UNAWAKENED_QUALIC_STONE = BLOCKS.register("unawakened_qualic_stone", 
			() -> new Block(AbstractBlock.Properties.create(Material.ANVIL, MaterialColor.RED)
						.hardnessAndResistance(50f, 3000f)
				        .harvestTool(ToolType.HOE)
				        .harvestLevel(3)));
					

}
