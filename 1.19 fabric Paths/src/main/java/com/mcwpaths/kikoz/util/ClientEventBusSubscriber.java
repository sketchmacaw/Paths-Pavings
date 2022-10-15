package com.mcwpaths.kikoz.util;

import com.mcwpaths.kikoz.init.BlockInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ClientEventBusSubscriber implements ClientModInitializer {
	@Override
	public void onInitializeClient() {


		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_PLANKS_PATH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_PLANKS_PATH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_PLANKS_PATH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_PLANKS_PATH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_PLANKS_PATH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_PLANKS_PATH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_PLANKS_PATH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_PLANKS_PATH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_PLANKS_PATH, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ANDESITE_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ANDESITE_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ANDESITE_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ANDESITE_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ANDESITE_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ANDESITE_DUMBLE_PAVING, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DIORITE_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DIORITE_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DIORITE_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DIORITE_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DIORITE_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DIORITE_DUMBLE_PAVING, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GRANITE_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GRANITE_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GRANITE_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GRANITE_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GRANITE_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GRANITE_DUMBLE_PAVING, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SANDSTONE_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SANDSTONE_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SANDSTONE_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SANDSTONE_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SANDSTONE_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SANDSTONE_DUMBLE_PAVING, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RED_SANDSTONE_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RED_SANDSTONE_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RED_SANDSTONE_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RED_SANDSTONE_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RED_SANDSTONE_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RED_SANDSTONE_DUMBLE_PAVING, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRICK_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRICK_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRICK_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRICK_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRICK_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BRICK_DUMBLE_PAVING, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLESTONE_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLESTONE_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLESTONE_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLESTONE_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLESTONE_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLESTONE_DUMBLE_PAVING, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MOSSY_COBBLESTONE_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MOSSY_COBBLESTONE_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MOSSY_COBBLESTONE_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MOSSY_COBBLESTONE_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MOSSY_COBBLESTONE_DUMBLE_PAVING, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLED_DEEPSLATE_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLED_DEEPSLATE_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLED_DEEPSLATE_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLED_DEEPSLATE_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLED_DEEPSLATE_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.COBBLED_DEEPSLATE_DUMBLE_PAVING, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEEPSLATE_DUMBLE_PAVING, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MUD_BRICK_DIAMOND_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MUD_BRICK_BASKET_WEAVE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MUD_BRICK_SQUARE_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MUD_BRICK_HONEYCOMB_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MUD_BRICK_CLOVER_PAVING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MUD_BRICK_DUMBLE_PAVING, RenderLayer.getCutout());
	}
}
	
