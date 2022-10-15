package com.mcwpaths.kikoz.objects;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.Direction;

public class FacingPathBlock extends PathBlock {

	public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
	
	public FacingPathBlock(AbstractBlock.Settings properties) {
		super(properties);
		this.setDefaultState((BlockState)this.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, Boolean.valueOf(false)));
	}

	@Override
	public BlockState rotate(BlockState state, BlockRotation rotation) {
		return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext context) {
		return (BlockState)this.getDefaultState().with(WATERLOGGED, Boolean.valueOf(false)).with(FACING, context.getPlayerFacing().rotateYClockwise());
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
	builder.add(FACING, WATERLOGGED);
	}
}
