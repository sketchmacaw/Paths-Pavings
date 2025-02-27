package com.mcwpaths.kikoz.util;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.init.BlockInit;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PathGroup {

public static ItemGroup PATHGROUP;

public static void registerTabs() {
    PATHGROUP = FabricItemGroup.builder(new Identifier(MacawsPaths.MOD_ID, "paths"))
        .displayName(Text.translatable("itemGroup.mcwpaths"))
        .icon(() -> new ItemStack(BlockInit.ANDESITE_HONEYCOMB_PAVING)).build();
        }

}