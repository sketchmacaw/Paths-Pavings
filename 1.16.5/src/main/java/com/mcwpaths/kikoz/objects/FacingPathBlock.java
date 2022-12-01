package com.mcwpaths.kikoz.objects;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;

public class FacingPathBlock extends PathBlock {

	public static final DirectionProperty FACING = HorizontalBlock.FACING;
	
	public FacingPathBlock(Block.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, Boolean.valueOf(false)));
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
		}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
	    final FluidState ifluidstate = context.getLevel().getFluidState(context.getClickedPos());
		   return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getClockWise()).setValue(WATERLOGGED, ifluidstate.is(FluidTags.WATER) && ifluidstate
	                   .getAmount() == 8);
		   }
	
	@Override
	protected void createBlockStateDefinition(final StateContainer.Builder<Block, BlockState> builder) {
	builder.add(FACING, WATERLOGGED);
	}
}