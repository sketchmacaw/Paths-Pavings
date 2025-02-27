package com.mcwpaths.kikoz;

import com.mcwpaths.kikoz.init.BlockInit;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacawsPaths implements ModInitializer {

	public static final String MOD_ID = "mcwpaths";
	public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockInit.registerModBlocks();
	}
}


