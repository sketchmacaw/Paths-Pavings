package com.mcwpaths.kikoz.tabs;

import com.mcwpaths.kikoz.init.BlockInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MacawPathsTab extends CreativeTabs 
{
	public MacawPathsTab(String label) { super("macawspathstab");
	this.setBackgroundImageName("macawspathstab.png");}
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.ANDESITE_HONEYCOMB_PAVING);}
}