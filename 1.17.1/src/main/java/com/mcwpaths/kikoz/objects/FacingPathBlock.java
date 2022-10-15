package com.mcwpaths.kikoz.objects;

import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;

public class FacingPathBlock extends PathBlock {

	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	
	public FacingPathBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, Boolean.valueOf(false)));
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
		}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
	    final FluidState ifluidstate = context.getLevel().getFluidState(context.getClickedPos());
		   return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getClockWise()).setValue(WATERLOGGED, ifluidstate.is(FluidTags.WATER) && ifluidstate
	                   .getAmount() == 8);
		   }
	
	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
	builder.add(FACING, WATERLOGGED);
	}
}