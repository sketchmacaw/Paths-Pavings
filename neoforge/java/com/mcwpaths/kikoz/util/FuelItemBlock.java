package com.mcwpaths.kikoz.util;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;


public class FuelItemBlock extends BlockItem {

		public FuelItemBlock(Block block, Properties prop) {
			super(block, prop);
		}


		public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
			return 50;
		}
}