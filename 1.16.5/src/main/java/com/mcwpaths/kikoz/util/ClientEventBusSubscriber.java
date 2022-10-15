package com.mcwpaths.kikoz.util;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MacawsPaths.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_PLANKS_PATH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_PLANKS_PATH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_PLANKS_PATH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_PLANKS_PATH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_PLANKS_PATH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_PLANKS_PATH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_PLANKS_PATH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_PLANKS_PATH.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.ANDESITE_DIAMOND_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ANDESITE_BASKET_WEAVE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ANDESITE_SQUARE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ANDESITE_HONEYCOMB_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ANDESITE_CLOVER_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ANDESITE_DUMBLE_PAVING.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.DIORITE_DIAMOND_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DIORITE_BASKET_WEAVE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DIORITE_SQUARE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DIORITE_HONEYCOMB_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DIORITE_CLOVER_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DIORITE_DUMBLE_PAVING.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.GRANITE_DIAMOND_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GRANITE_BASKET_WEAVE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GRANITE_SQUARE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GRANITE_HONEYCOMB_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GRANITE_CLOVER_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GRANITE_DUMBLE_PAVING.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.SANDSTONE_DIAMOND_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SANDSTONE_BASKET_WEAVE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SANDSTONE_SQUARE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SANDSTONE_HONEYCOMB_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SANDSTONE_CLOVER_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SANDSTONE_DUMBLE_PAVING.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.RED_SANDSTONE_DIAMOND_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RED_SANDSTONE_BASKET_WEAVE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RED_SANDSTONE_SQUARE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RED_SANDSTONE_HONEYCOMB_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RED_SANDSTONE_CLOVER_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RED_SANDSTONE_DUMBLE_PAVING.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.BRICK_DIAMOND_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BRICK_BASKET_WEAVE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BRICK_SQUARE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BRICK_HONEYCOMB_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BRICK_CLOVER_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BRICK_DUMBLE_PAVING.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.COBBLESTONE_DIAMOND_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.COBBLESTONE_BASKET_WEAVE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.COBBLESTONE_SQUARE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.COBBLESTONE_HONEYCOMB_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.COBBLESTONE_CLOVER_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.COBBLESTONE_DUMBLE_PAVING.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.MOSSY_COBBLESTONE_DIAMOND_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MOSSY_COBBLESTONE_SQUARE_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MOSSY_COBBLESTONE_HONEYCOMB_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MOSSY_COBBLESTONE_CLOVER_PAVING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MOSSY_COBBLESTONE_DUMBLE_PAVING.get(), RenderType.cutout());

	}
}
	
