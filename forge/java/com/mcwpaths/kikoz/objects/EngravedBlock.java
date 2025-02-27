package com.mcwpaths.kikoz.objects;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.state.StateContainer;
import net.minecraft.util.*;
import net.minecraft.state.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class EngravedBlock  extends Block {

	public static final BooleanProperty ENGRAVED = BooleanProperty.create("engraved");
	
	protected static final VoxelShape CUBE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
	protected static final VoxelShape ENGRAVE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
	
    public EngravedBlock(Properties properties) {
        super(properties);
    	this.registerDefaultState(this.stateDefinition.any().setValue(ENGRAVED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext contx) {
        boolean engraved = state.getValue(ENGRAVED);
        return engraved ? ENGRAVE : CUBE;
    }

    @Override
    protected void createBlockStateDefinition(final StateContainer.Builder<Block, BlockState> builder) {
	    builder.add(ENGRAVED);
	}
    
    @Override
    public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);
        Item item = heldItem.getItem();

        if (item == Items.DIAMOND_PICKAXE ||
        	    item == Items.GOLDEN_PICKAXE || 
        	    item == Items.IRON_PICKAXE || 
        	    item == Items.STONE_PICKAXE || 
        	    item == Items.WOODEN_PICKAXE || 
        	    item == Items.NETHERITE_PICKAXE) {
        	    if (level.isClientSide()) {
        	        return ActionResultType.SUCCESS;
        	    }

            level.playSound(null, pos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, level.getRandom().nextFloat() * 0.1F + 0.9F);

            BlockState newState = state.cycle(ENGRAVED);
            level.setBlock(pos, newState, 3); 
            
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.PASS;
    }
    
	}