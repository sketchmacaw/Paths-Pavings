package com.mcwpaths.kikoz.init;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.objects.FuelItemBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsPaths.MOD_ID);

	public static final RegistryObject<Item> OAK_PLANKS_PATH = ITEMS.register("oak_planks_path",() -> new FuelItemBlock(BlockInit.OAK_PLANKS_PATH.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_PLANKS_PATH = ITEMS.register("birch_planks_path",() -> new FuelItemBlock(BlockInit.BIRCH_PLANKS_PATH.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_PLANKS_PATH = ITEMS.register("spruce_planks_path",() -> new FuelItemBlock(BlockInit.SPRUCE_PLANKS_PATH.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_PLANKS_PATH = ITEMS.register("jungle_planks_path",() -> new FuelItemBlock(BlockInit.JUNGLE_PLANKS_PATH.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_PLANKS_PATH = ITEMS.register("acacia_planks_path",() -> new FuelItemBlock(BlockInit.ACACIA_PLANKS_PATH.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_PLANKS_PATH = ITEMS.register("dark_oak_planks_path",() -> new FuelItemBlock(BlockInit.DARK_OAK_PLANKS_PATH.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_PLANKS_PATH = ITEMS.register("crimson_planks_path",() -> new FuelItemBlock(BlockInit.CRIMSON_PLANKS_PATH.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_PLANKS_PATH = ITEMS.register("warped_planks_path",() -> new FuelItemBlock(BlockInit.WARPED_PLANKS_PATH.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_PLANKS_PATH = ITEMS.register("mangrove_planks_path",() -> new FuelItemBlock(BlockInit.MANGROVE_PLANKS_PATH.get(), new Item.Properties()));

	
	public static final RegistryObject<Item> ANDESITE_DIAMOND_PAVING = ITEMS.register("andesite_diamond_paving",() -> new BlockItem(BlockInit.ANDESITE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_BASKET_WEAVE_PAVING = ITEMS.register("andesite_basket_weave_paving",() -> new BlockItem(BlockInit.ANDESITE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_SQUARE_PAVING = ITEMS.register("andesite_square_paving",() -> new BlockItem(BlockInit.ANDESITE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_HONEYCOMB_PAVING = ITEMS.register("andesite_honeycomb_paving",() -> new BlockItem(BlockInit.ANDESITE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_CLOVER_PAVING = ITEMS.register("andesite_clover_paving",() -> new BlockItem(BlockInit.ANDESITE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_DUMBLE_PAVING = ITEMS.register("andesite_dumble_paving",() -> new BlockItem(BlockInit.ANDESITE_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> DIORITE_DIAMOND_PAVING = ITEMS.register("diorite_diamond_paving",() -> new BlockItem(BlockInit.DIORITE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_BASKET_WEAVE_PAVING = ITEMS.register("diorite_basket_weave_paving",() -> new BlockItem(BlockInit.DIORITE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_SQUARE_PAVING = ITEMS.register("diorite_square_paving",() -> new BlockItem(BlockInit.DIORITE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_HONEYCOMB_PAVING = ITEMS.register("diorite_honeycomb_paving",() -> new BlockItem(BlockInit.DIORITE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_CLOVER_PAVING = ITEMS.register("diorite_clover_paving",() -> new BlockItem(BlockInit.DIORITE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_DUMBLE_PAVING = ITEMS.register("diorite_dumble_paving",() -> new BlockItem(BlockInit.DIORITE_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> GRANITE_DIAMOND_PAVING = ITEMS.register("granite_diamond_paving",() -> new BlockItem(BlockInit.GRANITE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_BASKET_WEAVE_PAVING = ITEMS.register("granite_basket_weave_paving",() -> new BlockItem(BlockInit.GRANITE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_SQUARE_PAVING = ITEMS.register("granite_square_paving",() -> new BlockItem(BlockInit.GRANITE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_HONEYCOMB_PAVING = ITEMS.register("granite_honeycomb_paving",() -> new BlockItem(BlockInit.GRANITE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_CLOVER_PAVING = ITEMS.register("granite_clover_paving",() -> new BlockItem(BlockInit.GRANITE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_DUMBLE_PAVING = ITEMS.register("granite_dumble_paving",() -> new BlockItem(BlockInit.GRANITE_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> SANDSTONE_DIAMOND_PAVING = ITEMS.register("sandstone_diamond_paving",() -> new BlockItem(BlockInit.SANDSTONE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_BASKET_WEAVE_PAVING = ITEMS.register("sandstone_basket_weave_paving",() -> new BlockItem(BlockInit.SANDSTONE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_SQUARE_PAVING = ITEMS.register("sandstone_square_paving",() -> new BlockItem(BlockInit.SANDSTONE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_HONEYCOMB_PAVING = ITEMS.register("sandstone_honeycomb_paving",() -> new BlockItem(BlockInit.SANDSTONE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_CLOVER_PAVING = ITEMS.register("sandstone_clover_paving",() -> new BlockItem(BlockInit.SANDSTONE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_DUMBLE_PAVING = ITEMS.register("sandstone_dumble_paving",() -> new BlockItem(BlockInit.SANDSTONE_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> RED_SANDSTONE_DIAMOND_PAVING = ITEMS.register("red_sandstone_diamond_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_SANDSTONE_BASKET_WEAVE_PAVING = ITEMS.register("red_sandstone_basket_weave_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_SANDSTONE_SQUARE_PAVING = ITEMS.register("red_sandstone_square_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_SANDSTONE_HONEYCOMB_PAVING = ITEMS.register("red_sandstone_honeycomb_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_SANDSTONE_CLOVER_PAVING = ITEMS.register("red_sandstone_clover_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_SANDSTONE_DUMBLE_PAVING = ITEMS.register("red_sandstone_dumble_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> BRICK_DIAMOND_PAVING = ITEMS.register("brick_diamond_paving",() -> new BlockItem(BlockInit.BRICK_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> BRICK_BASKET_WEAVE_PAVING = ITEMS.register("brick_basket_weave_paving",() -> new BlockItem(BlockInit.BRICK_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> BRICK_SQUARE_PAVING = ITEMS.register("brick_square_paving",() -> new BlockItem(BlockInit.BRICK_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> BRICK_HONEYCOMB_PAVING = ITEMS.register("brick_honeycomb_paving",() -> new BlockItem(BlockInit.BRICK_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> BRICK_CLOVER_PAVING = ITEMS.register("brick_clover_paving",() -> new BlockItem(BlockInit.BRICK_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> BRICK_DUMBLE_PAVING = ITEMS.register("brick_dumble_paving",() -> new BlockItem(BlockInit.BRICK_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> COBBLESTONE_DIAMOND_PAVING = ITEMS.register("cobblestone_diamond_paving",() -> new BlockItem(BlockInit.COBBLESTONE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> COBBLESTONE_BASKET_WEAVE_PAVING = ITEMS.register("cobblestone_basket_weave_paving",() -> new BlockItem(BlockInit.COBBLESTONE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> COBBLESTONE_SQUARE_PAVING = ITEMS.register("cobblestone_square_paving",() -> new BlockItem(BlockInit.COBBLESTONE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> COBBLESTONE_HONEYCOMB_PAVING = ITEMS.register("cobblestone_honeycomb_paving",() -> new BlockItem(BlockInit.COBBLESTONE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> COBBLESTONE_CLOVER_PAVING = ITEMS.register("cobblestone_clover_paving",() -> new BlockItem(BlockInit.COBBLESTONE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> COBBLESTONE_DUMBLE_PAVING = ITEMS.register("cobblestone_dumble_paving",() -> new BlockItem(BlockInit.COBBLESTONE_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> MOSSY_COBBLESTONE_DIAMOND_PAVING = ITEMS.register("mossy_cobblestone_diamond_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING = ITEMS.register("mossy_cobblestone_basket_weave_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_COBBLESTONE_SQUARE_PAVING = ITEMS.register("mossy_cobblestone_square_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_COBBLESTONE_HONEYCOMB_PAVING = ITEMS.register("mossy_cobblestone_honeycomb_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_COBBLESTONE_CLOVER_PAVING = ITEMS.register("mossy_cobblestone_clover_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_COBBLESTONE_DUMBLE_PAVING = ITEMS.register("mossy_cobblestone_dumble_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> COBBLED_DEEPSLATE_DIAMOND_PAVING = ITEMS.register("cobbled_deepslate_diamond_paving",() -> new BlockItem(BlockInit.COBBLED_DEEPSLATE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> COBBLED_DEEPSLATE_BASKET_WEAVE_PAVING = ITEMS.register("cobbled_deepslate_basket_weave_paving",() -> new BlockItem(BlockInit.COBBLED_DEEPSLATE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> COBBLED_DEEPSLATE_SQUARE_PAVING = ITEMS.register("cobbled_deepslate_square_paving",() -> new BlockItem(BlockInit.COBBLED_DEEPSLATE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> COBBLED_DEEPSLATE_HONEYCOMB_PAVING = ITEMS.register("cobbled_deepslate_honeycomb_paving",() -> new BlockItem(BlockInit.COBBLED_DEEPSLATE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> COBBLED_DEEPSLATE_CLOVER_PAVING = ITEMS.register("cobbled_deepslate_clover_paving",() -> new BlockItem(BlockInit.COBBLED_DEEPSLATE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> COBBLED_DEEPSLATE_DUMBLE_PAVING = ITEMS.register("cobbled_deepslate_dumble_paving",() -> new BlockItem(BlockInit.COBBLED_DEEPSLATE_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> DEEPSLATE_DIAMOND_PAVING = ITEMS.register("deepslate_diamond_paving",() -> new BlockItem(BlockInit.DEEPSLATE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_BASKET_WEAVE_PAVING = ITEMS.register("deepslate_basket_weave_paving",() -> new BlockItem(BlockInit.DEEPSLATE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_SQUARE_PAVING = ITEMS.register("deepslate_square_paving",() -> new BlockItem(BlockInit.DEEPSLATE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_HONEYCOMB_PAVING = ITEMS.register("deepslate_honeycomb_paving",() -> new BlockItem(BlockInit.DEEPSLATE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_CLOVER_PAVING = ITEMS.register("deepslate_clover_paving",() -> new BlockItem(BlockInit.DEEPSLATE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_DUMBLE_PAVING = ITEMS.register("deepslate_dumble_paving",() -> new BlockItem(BlockInit.DEEPSLATE_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> MUD_BRICK_DIAMOND_PAVING = ITEMS.register("mud_brick_diamond_paving",() -> new BlockItem(BlockInit.MUD_BRICK_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_BASKET_WEAVE_PAVING = ITEMS.register("mud_brick_basket_weave_paving",() -> new BlockItem(BlockInit.MUD_BRICK_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_SQUARE_PAVING = ITEMS.register("mud_brick_square_paving",() -> new BlockItem(BlockInit.MUD_BRICK_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_HONEYCOMB_PAVING = ITEMS.register("mud_brick_honeycomb_paving",() -> new BlockItem(BlockInit.MUD_BRICK_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_CLOVER_PAVING = ITEMS.register("mud_brick_clover_paving",() -> new BlockItem(BlockInit.MUD_BRICK_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_DUMBLE_PAVING = ITEMS.register("mud_brick_dumble_paving",() -> new BlockItem(BlockInit.MUD_BRICK_DUMBLE_PAVING.get(), new Item.Properties()));

	//1.0.2 Update
	
	public static final RegistryObject<Item> BLACKSTONE_DIAMOND_PAVING = ITEMS.register("blackstone_diamond_paving",() -> new BlockItem(BlockInit.BLACKSTONE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_BASKET_WEAVE_PAVING = ITEMS.register("blackstone_basket_weave_paving",() -> new BlockItem(BlockInit.BLACKSTONE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_SQUARE_PAVING = ITEMS.register("blackstone_square_paving",() -> new BlockItem(BlockInit.BLACKSTONE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_HONEYCOMB_PAVING = ITEMS.register("blackstone_honeycomb_paving",() -> new BlockItem(BlockInit.BLACKSTONE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_CLOVER_PAVING = ITEMS.register("blackstone_clover_paving",() -> new BlockItem(BlockInit.BLACKSTONE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_DUMBLE_PAVING = ITEMS.register("blackstone_dumble_paving",() -> new BlockItem(BlockInit.BLACKSTONE_DUMBLE_PAVING.get(), new Item.Properties()));

	public static final RegistryObject<Item> DARK_PRISMARINE_DIAMOND_PAVING = ITEMS.register("dark_prismarine_diamond_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_DIAMOND_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_PRISMARINE_BASKET_WEAVE_PAVING = ITEMS.register("dark_prismarine_basket_weave_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_BASKET_WEAVE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_PRISMARINE_SQUARE_PAVING = ITEMS.register("dark_prismarine_square_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_SQUARE_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_PRISMARINE_HONEYCOMB_PAVING = ITEMS.register("dark_prismarine_honeycomb_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_HONEYCOMB_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_PRISMARINE_CLOVER_PAVING = ITEMS.register("dark_prismarine_clover_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_CLOVER_PAVING.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_PRISMARINE_DUMBLE_PAVING = ITEMS.register("dark_prismarine_dumble_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_DUMBLE_PAVING.get(), new Item.Properties()));

}
