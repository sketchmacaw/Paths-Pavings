package com.mcwpaths.kikoz.objects;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class FlattenedBlock extends PathBlock {

	public static final BooleanProperty FLATTENED = BooleanProperty.of("flattened");

	protected static final VoxelShape CUBE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
	protected static final VoxelShape ENGRAVE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);

	public FlattenedBlock(Settings properties) {
		super(properties);
		this.setDefaultState((BlockState)this.getDefaultState().with(FLATTENED, false));
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView reader, BlockPos pos, ShapeContext context) {
		boolean engraved = state.get(FLATTENED);
		return engraved ? ENGRAVE : CUBE;
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FLATTENED);
	}

	@Override
	public ActionResult onUse(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		ItemStack heldItem = player.getStackInHand(hand);
		Item item = heldItem.getItem();

		if (item == Items.DIAMOND_SHOVEL ||
				item == Items.GOLDEN_SHOVEL ||
				item == Items.IRON_SHOVEL ||
				item == Items.STONE_SHOVEL ||
				item == Items.WOODEN_SHOVEL ||
				item == Items.NETHERITE_SHOVEL) {
			if (level.isClient()) {
				return ActionResult.SUCCESS;
			}

			level.playSound(null, pos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, level.getRandom().nextFloat() * 0.1F + 0.9F);

			BlockState newState = state.cycle(FLATTENED);
			level.setBlockState(pos, newState, 3);

			return ActionResult.SUCCESS;
		}
		return ActionResult.PASS;
	}

}

