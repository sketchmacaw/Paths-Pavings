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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.extensions.IForgeItem;

import java.util.List;
import java.util.function.Consumer;

public class EngravedBlockTooltip extends BlockItem implements IForgeItem {

	public EngravedBlockTooltip(Block block, Properties prop) {
		super(block, prop);
	}

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Item.TooltipContext tooltip, TooltipDisplay display, Consumer<Component> list, TooltipFlag flag) {
		list.accept(this.getDescription().withStyle(ChatFormatting.GRAY));
	}

	@OnlyIn(Dist.CLIENT)
	public MutableComponent getDescription() {
		return Component.translatable("mcwpaths.engraved.desc");
	}



		
}