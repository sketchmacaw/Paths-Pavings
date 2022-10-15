package com.mcwpaths.kikoz.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PathBlock extends CarpetBlock implements SimpleWaterloggedBlock{
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	
	   public PathBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
				.setValue(WATERLOGGED, Boolean.valueOf(false)));
	}

	protected static final VoxelShape SHAPE = Block.box(0.0D, 0.01D, 0.0D, 16.0D, 0.99D, 16.0D);

	@Override
	   public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
	      return SHAPE;
	   }

	   @SuppressWarnings("deprecation")
	   public FluidState getFluidState(BlockState state) {
	      return state.getValue(WATERLOGGED) ? Fluids.WATER.defaultFluidState() : super.getFluidState(state);
	   }

	   public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, Level worldIn, BlockPos currentPos, BlockPos facingPos) {
	      if (stateIn.getValue(WATERLOGGED)) {
	          worldIn.getLiquidTicks().hasScheduledTick(currentPos, Fluids.WATER);
	      }

	      return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	   }
	
	   @Override
	   public PushReaction getPistonPushReaction(BlockState state) {
	      return PushReaction.DESTROY;
	   }
	   
	   @Override
	   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		   builder.add(WATERLOGGED);
		   }
	}