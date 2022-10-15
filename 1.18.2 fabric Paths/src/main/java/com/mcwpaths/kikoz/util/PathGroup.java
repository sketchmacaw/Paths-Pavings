package com.mcwpaths.kikoz.util;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.init.BlockInit;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class PathGroup {
    public static final ItemGroup PATHGROUP = FabricItemGroupBuilder.build(new Identifier(MacawsPaths.MOD_ID, "paths"),
            () -> new ItemStack(BlockInit.ANDESITE_HONEYCOMB_PAVING));
}