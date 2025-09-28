package com.mcwpaths.kikoz.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;
import java.util.function.Consumer;

public class EngravedBlockTooltip extends BlockItem {

	public EngravedBlockTooltip(Block block, Properties prop) {
		super(block, prop);
	}

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext tooltip, TooltipDisplay display, Consumer<Component> list, TooltipFlag flag) {
		list.accept(this.getDisplayName().withStyle(ChatFormatting.GRAY));
	}

		   public MutableComponent getDisplayName() {
		      return Component.translatable("mcwpaths.engraved.desc");
		}



		
}