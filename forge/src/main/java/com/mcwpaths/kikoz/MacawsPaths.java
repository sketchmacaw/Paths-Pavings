package com.mcwpaths.kikoz;

import com.mcwpaths.kikoz.init.BlockInit;
import com.mcwpaths.kikoz.init.ItemInit;
import com.mcwpaths.kikoz.init.TabInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mcwpaths")
public class MacawsPaths
{
	public static final String MOD_ID = "mcwpaths";
	public static MacawsPaths instance;
	
	public MacawsPaths(FMLJavaModLoadingContext context) {
		var modBusGroup = context.getModBusGroup();

		FMLCommonSetupEvent.getBus(modBusGroup).addListener(this::commonSetup);

		BlockInit.BLOCKS.register(modBusGroup);
		ItemInit.ITEMS.register(modBusGroup);
		TabInit.CREATIVE_TABS.register(modBusGroup);

	}

	private void commonSetup(final FMLCommonSetupEvent event) {
	}

	@Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
	public static class ClientModEvents {
		@net.minecraftforge.eventbus.api.listener.SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {

		}
	}
}