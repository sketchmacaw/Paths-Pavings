package com.mcwpaths.kikoz;

import com.mcwpaths.kikoz.init.BlockInit;
import com.mcwpaths.kikoz.init.ItemInit;
import com.mcwpaths.kikoz.init.TabInit;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(MacawsPaths.MOD_ID)

public class MacawsPaths 
{
	public static final String MOD_ID = "mcwpaths";

	public MacawsPaths(IEventBus bus) {
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		TabInit.CREATIVE_TABS.register(bus);
	}
}
