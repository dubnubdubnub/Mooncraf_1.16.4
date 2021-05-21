package com.dubnubdubnub.mooncraf.core.init;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.common.blocks.UnawakenedQualicStone;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			Mooncraf.MOD_ID);

	public static final RegistryObject<UnawakenedQualicStone> UNAWAKENED_QUALIC_STONE = BLOCKS.register("unawakened_qualic_stone",
			() -> new UnawakenedQualicStone(AbstractBlock.Properties.create(Material.ANVIL, MaterialColor.CRIMSON_HYPHAE).harvestTool(ToolType.PICKAXE)
					.harvestLevel(3).sound(SoundType.ANCIENT_DEBRIS).setRequiresTool()));
	
	/*
	 * 
	 * 
	 * { "parent": "block/cube", "textures": { "top":
	 * "mooncraf:blocks/qstone_top_inactive", "front":
	 * "mooncraf:blocks/qstone_front_inactive", "side":
	 * "mooncraf:blocks/qstone_side_inactive" } }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
