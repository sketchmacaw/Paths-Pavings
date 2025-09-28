package com.mcwpaths.kikoz.util;


import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nullable;
import java.util.List;

public class FlattenedBlockTooltip extends BlockItem implements IForgeItem {

	public FlattenedBlockTooltip(Block block, Properties prop) {
		super(block, prop);
	}

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable World level, List<ITextComponent> list, ITooltipFlag flag) {
		list.add(this.getDescription().withStyle(TextFormatting.GRAY));
	}

	@Override
		@OnlyIn(Dist.CLIENT)
		   public IFormattableTextComponent getDescription() {
			return new TranslationTextComponent("mcwpaths.flattened.desc");
		}



		
}