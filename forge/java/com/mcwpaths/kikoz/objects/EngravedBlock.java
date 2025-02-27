package com.mcwpaths.kikoz.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class EngravedBlock  extends Block {

	public static final BooleanProperty ENGRAVED = BooleanProperty.create("engraved");
	
	protected static final VoxelShape CUBE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
	protected static final VoxelShape ENGRAVE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
	
    public EngravedBlock(Properties properties) {
        super(properties);
    	this.registerDefaultState(this.stateDefinition.any().setValue(ENGRAVED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        boolean engraved = state.getValue(ENGRAVED);
        return engraved ? ENGRAVE : CUBE;
    }

    @Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
	    builder.add(ENGRAVED);
	}
    
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);
        Item item = heldItem.getItem();

        if (item == Items.DIAMOND_PICKAXE || 
        	    item == Items.GOLDEN_PICKAXE || 
        	    item == Items.IRON_PICKAXE || 
        	    item == Items.STONE_PICKAXE || 
        	    item == Items.WOODEN_PICKAXE || 
        	    item == Items.NETHERITE_PICKAXE) {
        	    if (level.isClientSide()) {
        	        return InteractionResult.SUCCESS;
        	    }

            level.playSound(null, pos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundSource.BLOCKS, 1.0F, level.getRandom().nextFloat() * 0.1F + 0.9F);

            BlockState newState = state.cycle(ENGRAVED);
            level.setBlock(pos, newState, 3); 
            
            return InteractionResult.SUCCESS; 
        }
        return InteractionResult.PASS;
    }
    
	}