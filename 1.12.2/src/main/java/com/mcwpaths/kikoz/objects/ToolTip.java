package com.mcwpaths.kikoz.objects;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.init.ItemInit;

import net.minecraft.item.Item;

public class ToolTip extends Item
{
	public ToolTip(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MacawsPaths.MACAWSTPATHSTAB);
		
		ItemInit.ITEMS.add(this);
	}
}