package com.mcwpaths.kikoz.util;

import javax.annotation.Nullable;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;


public class FuelItemBlock extends BlockItem {

		public FuelItemBlock(Block block, Properties prop) {
			super(block, prop);
		}

		@Override
		public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
			return 50;
		}
}