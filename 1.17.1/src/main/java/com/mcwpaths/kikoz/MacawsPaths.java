package com.mcwpaths.kikoz;

import javax.annotation.Nonnull;

import com.mcwpaths.kikoz.init.BlockInit;
import com.mcwpaths.kikoz.objects.FuelItemBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("mcwpaths")
@Mod.EventBusSubscriber(modid = MacawsPaths.MOD_ID, bus = Bus.MOD)
public class MacawsPaths 
{
	public static final String MOD_ID = "mcwpaths";
	public static MacawsPaths instance;
	
	public MacawsPaths() 
	{
			final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
			modEventBus.addListener(this::setup);
			modEventBus.addListener(this::doClientStuff);

			BlockInit.BLOCKS.register(modEventBus);
			BlockInit.BLOCKS_STONE.register(modEventBus);

			instance = this;
			MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(PathsItemGroup);
			final BlockItem blockItem = new FuelItemBlock(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
		
		BlockInit.BLOCKS_STONE.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(PathsItemGroup);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
	
	}
	
	private void doClientStuff(final FMLClientSetupEvent event)
	{
		 
	}
	
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event)
	{
	
	}
	
    private static final CreativeModeTab PathsItemGroup = new CreativeModeTab(MOD_ID) {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.ANDESITE_HONEYCOMB_PAVING.get());
        }
    };	
}



