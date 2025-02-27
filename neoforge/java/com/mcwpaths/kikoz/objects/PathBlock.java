package com.mcwpaths.kikoz.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PathBlock extends Block {

    public PathBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any());
    }

	protected static final VoxelShape SHAPE = Block.box(0.0D, 0.01D, 0.0D, 16.0D, 0.99D, 16.0D);

	@Override
	   public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
	      return SHAPE;
	   }
	   

	}