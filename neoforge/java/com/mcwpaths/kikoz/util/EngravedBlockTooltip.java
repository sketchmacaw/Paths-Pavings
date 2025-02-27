package com.mcwpaths.kikoz.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;

public class EngravedBlockTooltip extends BlockItem {

	public EngravedBlockTooltip(Block block, Properties prop) {
		super(block, prop);
	}

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Item.TooltipContext pContext, List<Component> comp, TooltipFlag flag) {
		comp.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
	}

		@OnlyIn(Dist.CLIENT)
		   public MutableComponent getDisplayName() {
		      return Component.translatable("mcwpaths.engraved.desc");
		}



		
}