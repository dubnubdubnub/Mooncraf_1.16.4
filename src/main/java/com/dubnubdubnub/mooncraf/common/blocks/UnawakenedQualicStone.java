package com.dubnubdubnub.mooncraf.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags.Items; 
import com.dubnubdubnub.mooncraf.core.init.ItemInit;

import net.minecraft.block.AbstractBlock.Properties;

public class UnawakenedQualicStone extends Block {
	public static final IntegerProperty CHARGES = BlockStateProperties.RESPAWN_ANCHOR_CHARGES;
	
	public UnawakenedQualicStone(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(CHARGES, Integer.valueOf(0)));
	}
	
	public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);
		if (handIn == Hand.MAIN_HAND && !isValidFuel(itemstack) && isValidFuel(player.getItemInHand(Hand.OFF_HAND))) {
			return ActionResultType.PASS;
		} else if (isValidFuel(itemstack) && notFullyCharged(state)) {
			chargeStone(worldIn, pos, state);
			if (!player.abilities.instabuild) {
				itemstack.shrink(1);
			}
		}
		return ActionResultType.CONSUME;
	}

	private void chargeStone(World world, BlockPos pos, BlockState state) {
		world.setBlock(pos, state.setValue(CHARGES, Integer.valueOf(state.getValue(CHARGES) + 1)), 3);
	}

	private boolean notFullyCharged(BlockState state) {
		return state.getValue(CHARGES) < 4;
	}

	
	private boolean isValidFuel(ItemStack stack) {
		return true;
	}
}