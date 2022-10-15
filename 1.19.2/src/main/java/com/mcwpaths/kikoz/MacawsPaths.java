package com.mcwpaths.kikoz;

import javax.annotation.Nonnull;

import com.mcwpaths.kikoz.init.BlockInit;
import com.mcwpaths.kikoz.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mcwpaths")
@Mod.EventBusSubscriber(modid = MacawsPaths.MOD_ID, bus = Bus.MOD)
public class MacawsPaths 
{
	public static final String MOD_ID = "mcwpaths";
	public static MacawsPaths instance;
	
	public MacawsPaths() 
	{
			IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
			modEventBus.addListener(this::setup);
			modEventBus.addListener(this::doClientStuff);

			BlockInit.BLOCKS.register(modEventBus);
			ItemInit.ITEMS.register(modEventBus);

			instance = this;
			MinecraftForge.EVENT_BUS.register(this);
	}
	
	
	private void setup(final FMLCommonSetupEvent event)
	{
	
	}
	
	private void doClientStuff(final FMLClientSetupEvent event)
	{
		 
	}
	
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event)
	{
	
	}

	
    public static final CreativeModeTab PathsItemGroup = new CreativeModeTab(MOD_ID) {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.OAK_PLANKS_PATH.get());
        }
    };	
}



