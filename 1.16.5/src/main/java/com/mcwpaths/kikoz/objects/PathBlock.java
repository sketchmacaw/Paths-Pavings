package com.mcwpaths.kikoz.objects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class PathBlock extends Block implements IWaterLoggable{
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	
	   public PathBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
				.setValue(WATERLOGGED, Boolean.valueOf(false)));
	}

	   protected static final VoxelShape SHAPE = Block.box(0.0D, 0.01D, 0.0D, 16.0D, 0.99D, 16.0D);

	@Override
	   public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
	      return SHAPE;
	   }

	
    @Override
    public ToolType getHarvestTool(BlockState state) {
    	if (this.material == Material.WOOD) {
    		return ToolType.AXE;
    	}
    	else return ToolType.PICKAXE;
    }
	   
	   @SuppressWarnings("deprecation")
	   public FluidState getFluidState(BlockState state) {
	      return state.getValue(WATERLOGGED) ? Fluids.WATER.defaultFluidState() : super.getFluidState(state);
	   }

	   @SuppressWarnings("deprecation")
	   public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, World worldIn, BlockPos currentPos, BlockPos facingPos) {
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
	   protected void createBlockStateDefinition(final StateContainer.Builder<Block, BlockState> builder) {
		   builder.add(WATERLOGGED);
		   }
	}