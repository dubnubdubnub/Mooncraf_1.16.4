package com.dubnubdubnub.mooncraf.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties; 

public class UnawakenedQualicStone extends Block {
	public static final IntegerProperty CHARGES = BlockStateProperties.CHARGES;
	
	public UnawakenedQualicStone(Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(CHARGES, Integer.valueOf(0)));
	}
}