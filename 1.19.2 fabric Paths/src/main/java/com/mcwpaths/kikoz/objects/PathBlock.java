package com.mcwpaths.kikoz.objects;


import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.fluid.FluidState;
import net.minecraft.world.World;

public class PathBlock extends Block implements Waterloggable {
	public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
	
	   public PathBlock(AbstractBlock.Settings properties) {
		super(properties);
		   this.setDefaultState((BlockState)this.getDefaultState()
				.with(WATERLOGGED, Boolean.valueOf(false)));
	}

	protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0D, 0.01D, 0.0D, 16.0D, 0.99D, 16.0D);

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
	      return SHAPE;
	   }

	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		if (state.get(WATERLOGGED).booleanValue()) {
			return Fluids.WATER.getStill(false);
		}
		return super.getFluidState(state);
	}

	   @SuppressWarnings("deprecation")
	   public BlockState getStateForNeighborUpdate(BlockState stateIn, Direction facing, BlockState facingState, World worldIn, BlockPos currentPos, BlockPos facingPos) {
		   if (stateIn.get(WATERLOGGED)) {
			   worldIn.createAndScheduleFluidTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
		   }

		   return super.getStateForNeighborUpdate(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	   }
	   
	   @Override
	   public PistonBehavior getPistonBehavior(BlockState state) {
		   return PistonBehavior.DESTROY;
	   }
	   
	   @Override
	   protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		   builder.add(WATERLOGGED);
		   }
	}