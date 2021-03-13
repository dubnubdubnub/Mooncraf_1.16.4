package com.dubnubdubnub.mooncraf.core.init;

import com.dubnubdubnub.mooncraf.Mooncraf;

import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mooncraf.MOD_ID);
	
	
	public static final RegistryObject<Block> UNAWAKENED_QUALIAC_STONE = BLOCKS.register ("Unawakened_Qualic_Stone, 
			() -> new Block(AbstractBlock.Properties.create(Material.OBSIDIAN, MaterialColor.RED)
					.hardnessAndResitance(50f, 3000f)
				        .harvestTool(ToolType.HOE)
				        .harvestLevel(3)));
					

}
