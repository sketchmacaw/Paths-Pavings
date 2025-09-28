package com.mcwpaths.kikoz.objects;


import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PathBlock extends Block {

	   public PathBlock(AbstractBlock.Settings properties) {
		super(properties);
		   this.setDefaultState((BlockState)this.getDefaultState());
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


	}