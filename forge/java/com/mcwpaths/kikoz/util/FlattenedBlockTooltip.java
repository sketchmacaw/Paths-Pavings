package com.mcwpaths.kikoz.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.extensions.IForgeItem;

import java.util.List;

public class FlattenedBlockTooltip extends BlockItem implements IForgeItem {

	public FlattenedBlockTooltip(Block block, Properties prop) {
		super(block, prop);
	}
	
	   @OnlyIn(Dist.CLIENT)
	   public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> list, TooltipFlag flag) {
	      list.add(this.getDescription().withStyle(ChatFormatting.GRAY));
	   }

		@OnlyIn(Dist.CLIENT)
		   public MutableComponent getDescription() {
		      return Component.translatable("mcwpaths.flattened.desc");
		}




		
}