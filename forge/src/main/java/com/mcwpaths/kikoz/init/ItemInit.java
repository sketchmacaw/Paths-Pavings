package com.mcwpaths.kikoz.init;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.util.EngravedBlockTooltip;
import com.mcwpaths.kikoz.util.FlattenedBlockTooltip;
import com.mcwpaths.kikoz.util.FuelItemBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsPaths.MOD_ID);

    public static final RegistryObject<Item> OAK_PLANKS_PATH = ITEMS.register("oak_planks_path",() -> new FuelItemBlock(BlockInit.OAK_PLANKS_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BIRCH_PLANKS_PATH = ITEMS.register("birch_planks_path",() -> new FuelItemBlock(BlockInit.BIRCH_PLANKS_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SPRUCE_PLANKS_PATH = ITEMS.register("spruce_planks_path",() -> new FuelItemBlock(BlockInit.SPRUCE_PLANKS_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> JUNGLE_PLANKS_PATH = ITEMS.register("jungle_planks_path",() -> new FuelItemBlock(BlockInit.JUNGLE_PLANKS_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ACACIA_PLANKS_PATH = ITEMS.register("acacia_planks_path",() -> new FuelItemBlock(BlockInit.ACACIA_PLANKS_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_PATH = ITEMS.register("dark_oak_planks_path",() -> new FuelItemBlock(BlockInit.DARK_OAK_PLANKS_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> CRIMSON_PLANKS_PATH = ITEMS.register("crimson_planks_path",() -> new FuelItemBlock(BlockInit.CRIMSON_PLANKS_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> WARPED_PLANKS_PATH = ITEMS.register("warped_planks_path",() -> new FuelItemBlock(BlockInit.WARPED_PLANKS_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));


    public static final RegistryObject<Item> ANDESITE_DIAMOND_PAVING = ITEMS.register("andesite_diamond_paving",() -> new BlockItem(BlockInit.ANDESITE_DIAMOND_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_BASKET_WEAVE_PAVING = ITEMS.register("andesite_basket_weave_paving",() -> new BlockItem(BlockInit.ANDESITE_BASKET_WEAVE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_SQUARE_PAVING = ITEMS.register("andesite_square_paving",() -> new BlockItem(BlockInit.ANDESITE_SQUARE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_HONEYCOMB_PAVING = ITEMS.register("andesite_honeycomb_paving",() -> new BlockItem(BlockInit.ANDESITE_HONEYCOMB_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_CLOVER_PAVING = ITEMS.register("andesite_clover_paving",() -> new BlockItem(BlockInit.ANDESITE_CLOVER_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_DUMBLE_PAVING = ITEMS.register("andesite_dumble_paving",() -> new BlockItem(BlockInit.ANDESITE_DUMBLE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> DIORITE_DIAMOND_PAVING = ITEMS.register("diorite_diamond_paving",() -> new BlockItem(BlockInit.DIORITE_DIAMOND_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_BASKET_WEAVE_PAVING = ITEMS.register("diorite_basket_weave_paving",() -> new BlockItem(BlockInit.DIORITE_BASKET_WEAVE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_SQUARE_PAVING = ITEMS.register("diorite_square_paving",() -> new BlockItem(BlockInit.DIORITE_SQUARE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_HONEYCOMB_PAVING = ITEMS.register("diorite_honeycomb_paving",() -> new BlockItem(BlockInit.DIORITE_HONEYCOMB_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_CLOVER_PAVING = ITEMS.register("diorite_clover_paving",() -> new BlockItem(BlockInit.DIORITE_CLOVER_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_DUMBLE_PAVING = ITEMS.register("diorite_dumble_paving",() -> new BlockItem(BlockInit.DIORITE_DUMBLE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> GRANITE_DIAMOND_PAVING = ITEMS.register("granite_diamond_paving",() -> new BlockItem(BlockInit.GRANITE_DIAMOND_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_BASKET_WEAVE_PAVING = ITEMS.register("granite_basket_weave_paving",() -> new BlockItem(BlockInit.GRANITE_BASKET_WEAVE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_SQUARE_PAVING = ITEMS.register("granite_square_paving",() -> new BlockItem(BlockInit.GRANITE_SQUARE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_HONEYCOMB_PAVING = ITEMS.register("granite_honeycomb_paving",() -> new BlockItem(BlockInit.GRANITE_HONEYCOMB_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_CLOVER_PAVING = ITEMS.register("granite_clover_paving",() -> new BlockItem(BlockInit.GRANITE_CLOVER_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_DUMBLE_PAVING = ITEMS.register("granite_dumble_paving",() -> new BlockItem(BlockInit.GRANITE_DUMBLE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> SANDSTONE_DIAMOND_PAVING = ITEMS.register("sandstone_diamond_paving",() -> new BlockItem(BlockInit.SANDSTONE_DIAMOND_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_BASKET_WEAVE_PAVING = ITEMS.register("sandstone_basket_weave_paving",() -> new BlockItem(BlockInit.SANDSTONE_BASKET_WEAVE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_SQUARE_PAVING = ITEMS.register("sandstone_square_paving",() -> new BlockItem(BlockInit.SANDSTONE_SQUARE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_HONEYCOMB_PAVING = ITEMS.register("sandstone_honeycomb_paving",() -> new BlockItem(BlockInit.SANDSTONE_HONEYCOMB_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_CLOVER_PAVING = ITEMS.register("sandstone_clover_paving",() -> new BlockItem(BlockInit.SANDSTONE_CLOVER_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_DUMBLE_PAVING = ITEMS.register("sandstone_dumble_paving",() -> new BlockItem(BlockInit.SANDSTONE_DUMBLE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> RED_SANDSTONE_DIAMOND_PAVING = ITEMS.register("red_sandstone_diamond_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_DIAMOND_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_BASKET_WEAVE_PAVING = ITEMS.register("red_sandstone_basket_weave_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_BASKET_WEAVE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_SQUARE_PAVING = ITEMS.register("red_sandstone_square_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_SQUARE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_HONEYCOMB_PAVING = ITEMS.register("red_sandstone_honeycomb_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_HONEYCOMB_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_CLOVER_PAVING = ITEMS.register("red_sandstone_clover_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_CLOVER_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_DUMBLE_PAVING = ITEMS.register("red_sandstone_dumble_paving",() -> new BlockItem(BlockInit.RED_SANDSTONE_DUMBLE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> BRICK_DIAMOND_PAVING = ITEMS.register("brick_diamond_paving",() -> new BlockItem(BlockInit.BRICK_DIAMOND_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_BASKET_WEAVE_PAVING = ITEMS.register("brick_basket_weave_paving",() -> new BlockItem(BlockInit.BRICK_BASKET_WEAVE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_SQUARE_PAVING = ITEMS.register("brick_square_paving",() -> new BlockItem(BlockInit.BRICK_SQUARE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_HONEYCOMB_PAVING = ITEMS.register("brick_honeycomb_paving",() -> new BlockItem(BlockInit.BRICK_HONEYCOMB_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_CLOVER_PAVING = ITEMS.register("brick_clover_paving",() -> new BlockItem(BlockInit.BRICK_CLOVER_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_DUMBLE_PAVING = ITEMS.register("brick_dumble_paving",() -> new BlockItem(BlockInit.BRICK_DUMBLE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> COBBLESTONE_DIAMOND_PAVING = ITEMS.register("cobblestone_diamond_paving",() -> new BlockItem(BlockInit.COBBLESTONE_DIAMOND_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> COBBLESTONE_BASKET_WEAVE_PAVING = ITEMS.register("cobblestone_basket_weave_paving",() -> new BlockItem(BlockInit.COBBLESTONE_BASKET_WEAVE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> COBBLESTONE_SQUARE_PAVING = ITEMS.register("cobblestone_square_paving",() -> new BlockItem(BlockInit.COBBLESTONE_SQUARE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> COBBLESTONE_HONEYCOMB_PAVING = ITEMS.register("cobblestone_honeycomb_paving",() -> new BlockItem(BlockInit.COBBLESTONE_HONEYCOMB_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> COBBLESTONE_CLOVER_PAVING = ITEMS.register("cobblestone_clover_paving",() -> new BlockItem(BlockInit.COBBLESTONE_CLOVER_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> COBBLESTONE_DUMBLE_PAVING = ITEMS.register("cobblestone_dumble_paving",() -> new BlockItem(BlockInit.COBBLESTONE_DUMBLE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> MOSSY_COBBLESTONE_DIAMOND_PAVING = ITEMS.register("mossy_cobblestone_diamond_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_DIAMOND_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING = ITEMS.register("mossy_cobblestone_basket_weave_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_SQUARE_PAVING = ITEMS.register("mossy_cobblestone_square_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_SQUARE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_HONEYCOMB_PAVING = ITEMS.register("mossy_cobblestone_honeycomb_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_HONEYCOMB_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_CLOVER_PAVING = ITEMS.register("mossy_cobblestone_clover_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_CLOVER_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_DUMBLE_PAVING = ITEMS.register("mossy_cobblestone_dumble_paving",() -> new BlockItem(BlockInit.MOSSY_COBBLESTONE_DUMBLE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    //1.0.2 Update

    public static final RegistryObject<Item> BLACKSTONE_DIAMOND_PAVING = ITEMS.register("blackstone_diamond_paving",() -> new BlockItem(BlockInit.BLACKSTONE_DIAMOND_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_BASKET_WEAVE_PAVING = ITEMS.register("blackstone_basket_weave_paving",() -> new BlockItem(BlockInit.BLACKSTONE_BASKET_WEAVE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_SQUARE_PAVING = ITEMS.register("blackstone_square_paving",() -> new BlockItem(BlockInit.BLACKSTONE_SQUARE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_HONEYCOMB_PAVING = ITEMS.register("blackstone_honeycomb_paving",() -> new BlockItem(BlockInit.BLACKSTONE_HONEYCOMB_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_CLOVER_PAVING = ITEMS.register("blackstone_clover_paving",() -> new BlockItem(BlockInit.BLACKSTONE_CLOVER_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_DUMBLE_PAVING = ITEMS.register("blackstone_dumble_paving",() -> new BlockItem(BlockInit.BLACKSTONE_DUMBLE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> DARK_PRISMARINE_DIAMOND_PAVING = ITEMS.register("dark_prismarine_diamond_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_DIAMOND_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_BASKET_WEAVE_PAVING = ITEMS.register("dark_prismarine_basket_weave_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_BASKET_WEAVE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_SQUARE_PAVING = ITEMS.register("dark_prismarine_square_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_SQUARE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_HONEYCOMB_PAVING = ITEMS.register("dark_prismarine_honeycomb_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_HONEYCOMB_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_CLOVER_PAVING = ITEMS.register("dark_prismarine_clover_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_CLOVER_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_DUMBLE_PAVING = ITEMS.register("dark_prismarine_dumble_paving",() -> new BlockItem(BlockInit.DARK_PRISMARINE_DUMBLE_PAVING.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    //1.0.3 Update

    public static final RegistryObject<Item> ANDESITE_RUNNING_BOND_PATH = ITEMS.register("andesite_running_bond_path", () -> new BlockItem(BlockInit.ANDESITE_RUNNING_BOND_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_RUNNING_BOND_SLAB = ITEMS.register("andesite_running_bond_slab", () -> new BlockItem(BlockInit.ANDESITE_RUNNING_BOND_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_RUNNING_BOND = ITEMS.register("andesite_running_bond", () -> new EngravedBlockTooltip(BlockInit.ANDESITE_RUNNING_BOND.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> DIORITE_RUNNING_BOND_PATH = ITEMS.register("diorite_running_bond_path", () -> new BlockItem(BlockInit.DIORITE_RUNNING_BOND_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_RUNNING_BOND_SLAB = ITEMS.register("diorite_running_bond_slab", () -> new BlockItem(BlockInit.DIORITE_RUNNING_BOND_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_RUNNING_BOND = ITEMS.register("diorite_running_bond", () -> new EngravedBlockTooltip(BlockInit.DIORITE_RUNNING_BOND.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> GRANITE_RUNNING_BOND_PATH = ITEMS.register("granite_running_bond_path", () -> new BlockItem(BlockInit.GRANITE_RUNNING_BOND_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_RUNNING_BOND_SLAB = ITEMS.register("granite_running_bond_slab", () -> new BlockItem(BlockInit.GRANITE_RUNNING_BOND_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_RUNNING_BOND = ITEMS.register("granite_running_bond", () -> new EngravedBlockTooltip(BlockInit.GRANITE_RUNNING_BOND.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> SANDSTONE_RUNNING_BOND_PATH = ITEMS.register("sandstone_running_bond_path", () -> new BlockItem(BlockInit.SANDSTONE_RUNNING_BOND_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_RUNNING_BOND_SLAB = ITEMS.register("sandstone_running_bond_slab", () -> new BlockItem(BlockInit.SANDSTONE_RUNNING_BOND_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_RUNNING_BOND = ITEMS.register("sandstone_running_bond", () -> new EngravedBlockTooltip(BlockInit.SANDSTONE_RUNNING_BOND.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> RED_SANDSTONE_RUNNING_BOND_PATH = ITEMS.register("red_sandstone_running_bond_path", () -> new BlockItem(BlockInit.RED_SANDSTONE_RUNNING_BOND_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_RUNNING_BOND_SLAB = ITEMS.register("red_sandstone_running_bond_slab", () -> new BlockItem(BlockInit.RED_SANDSTONE_RUNNING_BOND_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_RUNNING_BOND = ITEMS.register("red_sandstone_running_bond", () -> new EngravedBlockTooltip(BlockInit.RED_SANDSTONE_RUNNING_BOND.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> BRICK_RUNNING_BOND_PATH = ITEMS.register("brick_running_bond_path", () -> new BlockItem(BlockInit.BRICK_RUNNING_BOND_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_RUNNING_BOND_SLAB = ITEMS.register("brick_running_bond_slab", () -> new BlockItem(BlockInit.BRICK_RUNNING_BOND_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_RUNNING_BOND = ITEMS.register("brick_running_bond", () -> new EngravedBlockTooltip(BlockInit.BRICK_RUNNING_BOND.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> STONE_RUNNING_BOND_PATH = ITEMS.register("stone_running_bond_path", () -> new BlockItem(BlockInit.STONE_RUNNING_BOND_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_RUNNING_BOND_SLAB = ITEMS.register("stone_running_bond_slab", () -> new BlockItem(BlockInit.STONE_RUNNING_BOND_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_RUNNING_BOND = ITEMS.register("stone_running_bond", () -> new EngravedBlockTooltip(BlockInit.STONE_RUNNING_BOND.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> MOSSY_STONE_RUNNING_BOND_PATH = ITEMS.register("mossy_stone_running_bond_path", () -> new BlockItem(BlockInit.MOSSY_STONE_RUNNING_BOND_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_RUNNING_BOND_SLAB = ITEMS.register("mossy_stone_running_bond_slab", () -> new BlockItem(BlockInit.MOSSY_STONE_RUNNING_BOND_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_RUNNING_BOND = ITEMS.register("mossy_stone_running_bond", () -> new EngravedBlockTooltip(BlockInit.MOSSY_STONE_RUNNING_BOND.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> BLACKSTONE_RUNNING_BOND_PATH = ITEMS.register("blackstone_running_bond_path", () -> new BlockItem(BlockInit.BLACKSTONE_RUNNING_BOND_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_RUNNING_BOND_SLAB = ITEMS.register("blackstone_running_bond_slab", () -> new BlockItem(BlockInit.BLACKSTONE_RUNNING_BOND_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_RUNNING_BOND = ITEMS.register("blackstone_running_bond", () -> new EngravedBlockTooltip(BlockInit.BLACKSTONE_RUNNING_BOND.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> DARK_PRISMARINE_RUNNING_BOND_PATH = ITEMS.register("dark_prismarine_running_bond_path", () -> new BlockItem(BlockInit.DARK_PRISMARINE_RUNNING_BOND_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_RUNNING_BOND_SLAB = ITEMS.register("dark_prismarine_running_bond_slab", () -> new BlockItem(BlockInit.DARK_PRISMARINE_RUNNING_BOND_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_RUNNING_BOND = ITEMS.register("dark_prismarine_running_bond", () -> new EngravedBlockTooltip(BlockInit.DARK_PRISMARINE_RUNNING_BOND.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    //1.0.5

    public static final RegistryObject<Item> ANDESITE_STREWN_ROCKY_PATH = ITEMS.register("andesite_strewn_rocky_path", () -> new BlockItem(BlockInit.ANDESITE_STREWN_ROCKY_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_STREWN_ROCKY_PATH = ITEMS.register("diorite_strewn_rocky_path", () -> new BlockItem(BlockInit.DIORITE_STREWN_ROCKY_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_STREWN_ROCKY_PATH = ITEMS.register("granite_strewn_rocky_path", () -> new BlockItem(BlockInit.GRANITE_STREWN_ROCKY_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_STREWN_ROCKY_PATH = ITEMS.register("sandstone_strewn_rocky_path", () -> new BlockItem(BlockInit.SANDSTONE_STREWN_ROCKY_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_STREWN_ROCKY_PATH = ITEMS.register("red_sandstone_strewn_rocky_path", () -> new BlockItem(BlockInit.RED_SANDSTONE_STREWN_ROCKY_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_STREWN_ROCKY_PATH = ITEMS.register("brick_strewn_rocky_path", () -> new BlockItem(BlockInit.BRICK_STREWN_ROCKY_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_STREWN_ROCKY_PATH = ITEMS.register("stone_strewn_rocky_path", () -> new BlockItem(BlockInit.STONE_STREWN_ROCKY_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_STREWN_ROCKY_PATH = ITEMS.register("mossy_stone_strewn_rocky_path", () -> new BlockItem(BlockInit.MOSSY_STONE_STREWN_ROCKY_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_STREWN_ROCKY_PATH = ITEMS.register("blackstone_strewn_rocky_path", () -> new BlockItem(BlockInit.BLACKSTONE_STREWN_ROCKY_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_STREWN_ROCKY_PATH = ITEMS.register("dark_prismarine_strewn_rocky_path", () -> new BlockItem(BlockInit.DARK_PRISMARINE_STREWN_ROCKY_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> ANDESITE_WINDMILL_WEAVE_PATH = ITEMS.register("andesite_windmill_weave_path", () -> new BlockItem(BlockInit.ANDESITE_WINDMILL_WEAVE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_WINDMILL_WEAVE_SLAB = ITEMS.register("andesite_windmill_weave_slab", () -> new BlockItem(BlockInit.ANDESITE_WINDMILL_WEAVE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_WINDMILL_WEAVE = ITEMS.register("andesite_windmill_weave", () -> new EngravedBlockTooltip(BlockInit.ANDESITE_WINDMILL_WEAVE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_WINDMILL_WEAVE_PATH = ITEMS.register("diorite_windmill_weave_path", () -> new BlockItem(BlockInit.DIORITE_WINDMILL_WEAVE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_WINDMILL_WEAVE_SLAB = ITEMS.register("diorite_windmill_weave_slab", () -> new BlockItem(BlockInit.DIORITE_WINDMILL_WEAVE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_WINDMILL_WEAVE = ITEMS.register("diorite_windmill_weave", () -> new EngravedBlockTooltip(BlockInit.DIORITE_WINDMILL_WEAVE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_WINDMILL_WEAVE_PATH = ITEMS.register("granite_windmill_weave_path", () -> new BlockItem(BlockInit.GRANITE_WINDMILL_WEAVE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_WINDMILL_WEAVE_SLAB = ITEMS.register("granite_windmill_weave_slab", () -> new BlockItem(BlockInit.GRANITE_WINDMILL_WEAVE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_WINDMILL_WEAVE = ITEMS.register("granite_windmill_weave", () -> new EngravedBlockTooltip(BlockInit.GRANITE_WINDMILL_WEAVE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_WINDMILL_WEAVE_PATH = ITEMS.register("sandstone_windmill_weave_path", () -> new BlockItem(BlockInit.SANDSTONE_WINDMILL_WEAVE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_WINDMILL_WEAVE_SLAB = ITEMS.register("sandstone_windmill_weave_slab", () -> new BlockItem(BlockInit.SANDSTONE_WINDMILL_WEAVE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_WINDMILL_WEAVE = ITEMS.register("sandstone_windmill_weave", () -> new EngravedBlockTooltip(BlockInit.SANDSTONE_WINDMILL_WEAVE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_WINDMILL_WEAVE_PATH = ITEMS.register("red_sandstone_windmill_weave_path", () -> new BlockItem(BlockInit.RED_SANDSTONE_WINDMILL_WEAVE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_WINDMILL_WEAVE_SLAB = ITEMS.register("red_sandstone_windmill_weave_slab", () -> new BlockItem(BlockInit.RED_SANDSTONE_WINDMILL_WEAVE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_WINDMILL_WEAVE = ITEMS.register("red_sandstone_windmill_weave", () -> new EngravedBlockTooltip(BlockInit.RED_SANDSTONE_WINDMILL_WEAVE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_WINDMILL_WEAVE_PATH = ITEMS.register("brick_windmill_weave_path", () -> new BlockItem(BlockInit.BRICK_WINDMILL_WEAVE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_WINDMILL_WEAVE_SLAB = ITEMS.register("brick_windmill_weave_slab", () -> new BlockItem(BlockInit.BRICK_WINDMILL_WEAVE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_WINDMILL_WEAVE = ITEMS.register("brick_windmill_weave", () -> new EngravedBlockTooltip(BlockInit.BRICK_WINDMILL_WEAVE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_WINDMILL_WEAVE_PATH = ITEMS.register("stone_windmill_weave_path", () -> new BlockItem(BlockInit.STONE_WINDMILL_WEAVE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_WINDMILL_WEAVE_SLAB = ITEMS.register("stone_windmill_weave_slab", () -> new BlockItem(BlockInit.STONE_WINDMILL_WEAVE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_WINDMILL_WEAVE = ITEMS.register("stone_windmill_weave", () -> new EngravedBlockTooltip(BlockInit.STONE_WINDMILL_WEAVE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_WINDMILL_WEAVE_PATH = ITEMS.register("mossy_stone_windmill_weave_path", () -> new BlockItem(BlockInit.MOSSY_STONE_WINDMILL_WEAVE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_WINDMILL_WEAVE_SLAB = ITEMS.register("mossy_stone_windmill_weave_slab", () -> new BlockItem(BlockInit.MOSSY_STONE_WINDMILL_WEAVE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_WINDMILL_WEAVE = ITEMS.register("mossy_stone_windmill_weave", () -> new EngravedBlockTooltip(BlockInit.MOSSY_STONE_WINDMILL_WEAVE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_WINDMILL_WEAVE_PATH = ITEMS.register("blackstone_windmill_weave_path", () -> new BlockItem(BlockInit.BLACKSTONE_WINDMILL_WEAVE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_WINDMILL_WEAVE_SLAB = ITEMS.register("blackstone_windmill_weave_slab", () -> new BlockItem(BlockInit.BLACKSTONE_WINDMILL_WEAVE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_WINDMILL_WEAVE = ITEMS.register("blackstone_windmill_weave", () -> new EngravedBlockTooltip(BlockInit.BLACKSTONE_WINDMILL_WEAVE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_WINDMILL_WEAVE_PATH = ITEMS.register("dark_prismarine_windmill_weave_path", () -> new BlockItem(BlockInit.DARK_PRISMARINE_WINDMILL_WEAVE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_WINDMILL_WEAVE_SLAB = ITEMS.register("dark_prismarine_windmill_weave_slab", () -> new BlockItem(BlockInit.DARK_PRISMARINE_WINDMILL_WEAVE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_WINDMILL_WEAVE = ITEMS.register("dark_prismarine_windmill_weave", () -> new EngravedBlockTooltip(BlockInit.DARK_PRISMARINE_WINDMILL_WEAVE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> ANDESITE_FLAGSTONE_PATH = ITEMS.register("andesite_flagstone_path", () -> new BlockItem(BlockInit.ANDESITE_FLAGSTONE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_FLAGSTONE_SLAB = ITEMS.register("andesite_flagstone_slab", () -> new BlockItem(BlockInit.ANDESITE_FLAGSTONE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_FLAGSTONE = ITEMS.register("andesite_flagstone", () -> new EngravedBlockTooltip(BlockInit.ANDESITE_FLAGSTONE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_FLAGSTONE_PATH = ITEMS.register("diorite_flagstone_path", () -> new BlockItem(BlockInit.DIORITE_FLAGSTONE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_FLAGSTONE_SLAB = ITEMS.register("diorite_flagstone_slab", () -> new BlockItem(BlockInit.DIORITE_FLAGSTONE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_FLAGSTONE = ITEMS.register("diorite_flagstone", () -> new EngravedBlockTooltip(BlockInit.DIORITE_FLAGSTONE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_FLAGSTONE_PATH = ITEMS.register("granite_flagstone_path", () -> new BlockItem(BlockInit.GRANITE_FLAGSTONE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_FLAGSTONE_SLAB = ITEMS.register("granite_flagstone_slab", () -> new BlockItem(BlockInit.GRANITE_FLAGSTONE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_FLAGSTONE = ITEMS.register("granite_flagstone", () -> new EngravedBlockTooltip(BlockInit.GRANITE_FLAGSTONE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_FLAGSTONE_PATH = ITEMS.register("sandstone_flagstone_path", () -> new BlockItem(BlockInit.SANDSTONE_FLAGSTONE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_FLAGSTONE_SLAB = ITEMS.register("sandstone_flagstone_slab", () -> new BlockItem(BlockInit.SANDSTONE_FLAGSTONE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_FLAGSTONE = ITEMS.register("sandstone_flagstone", () -> new EngravedBlockTooltip(BlockInit.SANDSTONE_FLAGSTONE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_FLAGSTONE_PATH = ITEMS.register("red_sandstone_flagstone_path", () -> new BlockItem(BlockInit.RED_SANDSTONE_FLAGSTONE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_FLAGSTONE_SLAB = ITEMS.register("red_sandstone_flagstone_slab", () -> new BlockItem(BlockInit.RED_SANDSTONE_FLAGSTONE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_FLAGSTONE = ITEMS.register("red_sandstone_flagstone", () -> new EngravedBlockTooltip(BlockInit.RED_SANDSTONE_FLAGSTONE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_FLAGSTONE_PATH = ITEMS.register("brick_flagstone_path", () -> new BlockItem(BlockInit.BRICK_FLAGSTONE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_FLAGSTONE_SLAB = ITEMS.register("brick_flagstone_slab", () -> new BlockItem(BlockInit.BRICK_FLAGSTONE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_FLAGSTONE = ITEMS.register("brick_flagstone", () -> new EngravedBlockTooltip(BlockInit.BRICK_FLAGSTONE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_FLAGSTONE_PATH = ITEMS.register("stone_flagstone_path", () -> new BlockItem(BlockInit.STONE_FLAGSTONE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_FLAGSTONE_SLAB = ITEMS.register("stone_flagstone_slab", () -> new BlockItem(BlockInit.STONE_FLAGSTONE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_FLAGSTONE = ITEMS.register("stone_flagstone", () -> new EngravedBlockTooltip(BlockInit.STONE_FLAGSTONE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_FLAGSTONE_PATH = ITEMS.register("mossy_stone_flagstone_path", () -> new BlockItem(BlockInit.MOSSY_STONE_FLAGSTONE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_FLAGSTONE_SLAB = ITEMS.register("mossy_stone_flagstone_slab", () -> new BlockItem(BlockInit.MOSSY_STONE_FLAGSTONE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_FLAGSTONE = ITEMS.register("mossy_stone_flagstone", () -> new EngravedBlockTooltip(BlockInit.MOSSY_STONE_FLAGSTONE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_FLAGSTONE_PATH = ITEMS.register("blackstone_flagstone_path", () -> new BlockItem(BlockInit.BLACKSTONE_FLAGSTONE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_FLAGSTONE_SLAB = ITEMS.register("blackstone_flagstone_slab", () -> new BlockItem(BlockInit.BLACKSTONE_FLAGSTONE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_FLAGSTONE = ITEMS.register("blackstone_flagstone", () -> new EngravedBlockTooltip(BlockInit.BLACKSTONE_FLAGSTONE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_FLAGSTONE_PATH = ITEMS.register("dark_prismarine_flagstone_path", () -> new BlockItem(BlockInit.DARK_PRISMARINE_FLAGSTONE_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_FLAGSTONE_SLAB = ITEMS.register("dark_prismarine_flagstone_slab", () -> new BlockItem(BlockInit.DARK_PRISMARINE_FLAGSTONE_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_FLAGSTONE = ITEMS.register("dark_prismarine_flagstone", () -> new EngravedBlockTooltip(BlockInit.DARK_PRISMARINE_FLAGSTONE.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> ANDESITE_CRYSTAL_FLOOR_PATH = ITEMS.register("andesite_crystal_floor_path", () -> new BlockItem(BlockInit.ANDESITE_CRYSTAL_FLOOR_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_CRYSTAL_FLOOR_SLAB = ITEMS.register("andesite_crystal_floor_slab", () -> new BlockItem(BlockInit.ANDESITE_CRYSTAL_FLOOR_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> ANDESITE_CRYSTAL_FLOOR = ITEMS.register("andesite_crystal_floor", () -> new EngravedBlockTooltip(BlockInit.ANDESITE_CRYSTAL_FLOOR.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_CRYSTAL_FLOOR_PATH = ITEMS.register("diorite_crystal_floor_path", () -> new BlockItem(BlockInit.DIORITE_CRYSTAL_FLOOR_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_CRYSTAL_FLOOR_SLAB = ITEMS.register("diorite_crystal_floor_slab", () -> new BlockItem(BlockInit.DIORITE_CRYSTAL_FLOOR_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_CRYSTAL_FLOOR = ITEMS.register("diorite_crystal_floor", () -> new EngravedBlockTooltip(BlockInit.DIORITE_CRYSTAL_FLOOR.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_CRYSTAL_FLOOR_PATH = ITEMS.register("granite_crystal_floor_path", () -> new BlockItem(BlockInit.GRANITE_CRYSTAL_FLOOR_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_CRYSTAL_FLOOR_SLAB = ITEMS.register("granite_crystal_floor_slab", () -> new BlockItem(BlockInit.GRANITE_CRYSTAL_FLOOR_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_CRYSTAL_FLOOR = ITEMS.register("granite_crystal_floor", () -> new EngravedBlockTooltip(BlockInit.GRANITE_CRYSTAL_FLOOR.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_CRYSTAL_FLOOR_PATH = ITEMS.register("sandstone_crystal_floor_path", () -> new BlockItem(BlockInit.SANDSTONE_CRYSTAL_FLOOR_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_CRYSTAL_FLOOR_SLAB = ITEMS.register("sandstone_crystal_floor_slab", () -> new BlockItem(BlockInit.SANDSTONE_CRYSTAL_FLOOR_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_CRYSTAL_FLOOR = ITEMS.register("sandstone_crystal_floor", () -> new EngravedBlockTooltip(BlockInit.SANDSTONE_CRYSTAL_FLOOR.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_CRYSTAL_FLOOR_PATH = ITEMS.register("red_sandstone_crystal_floor_path", () -> new BlockItem(BlockInit.RED_SANDSTONE_CRYSTAL_FLOOR_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_CRYSTAL_FLOOR_SLAB = ITEMS.register("red_sandstone_crystal_floor_slab", () -> new BlockItem(BlockInit.RED_SANDSTONE_CRYSTAL_FLOOR_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_CRYSTAL_FLOOR = ITEMS.register("red_sandstone_crystal_floor", () -> new EngravedBlockTooltip(BlockInit.RED_SANDSTONE_CRYSTAL_FLOOR.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_CRYSTAL_FLOOR_PATH = ITEMS.register("brick_crystal_floor_path", () -> new BlockItem(BlockInit.BRICK_CRYSTAL_FLOOR_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_CRYSTAL_FLOOR_SLAB = ITEMS.register("brick_crystal_floor_slab", () -> new BlockItem(BlockInit.BRICK_CRYSTAL_FLOOR_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_CRYSTAL_FLOOR = ITEMS.register("brick_crystal_floor", () -> new EngravedBlockTooltip(BlockInit.BRICK_CRYSTAL_FLOOR.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_CRYSTAL_FLOOR_PATH = ITEMS.register("stone_crystal_floor_path", () -> new BlockItem(BlockInit.STONE_CRYSTAL_FLOOR_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_CRYSTAL_FLOOR_SLAB = ITEMS.register("stone_crystal_floor_slab", () -> new BlockItem(BlockInit.STONE_CRYSTAL_FLOOR_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_CRYSTAL_FLOOR = ITEMS.register("stone_crystal_floor", () -> new EngravedBlockTooltip(BlockInit.STONE_CRYSTAL_FLOOR.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_CRYSTAL_FLOOR_PATH = ITEMS.register("mossy_stone_crystal_floor_path", () -> new BlockItem(BlockInit.MOSSY_STONE_CRYSTAL_FLOOR_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_CRYSTAL_FLOOR_SLAB = ITEMS.register("mossy_stone_crystal_floor_slab", () -> new BlockItem(BlockInit.MOSSY_STONE_CRYSTAL_FLOOR_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_CRYSTAL_FLOOR = ITEMS.register("mossy_stone_crystal_floor", () -> new EngravedBlockTooltip(BlockInit.MOSSY_STONE_CRYSTAL_FLOOR.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_CRYSTAL_FLOOR_PATH = ITEMS.register("blackstone_crystal_floor_path", () -> new BlockItem(BlockInit.BLACKSTONE_CRYSTAL_FLOOR_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_CRYSTAL_FLOOR_SLAB = ITEMS.register("blackstone_crystal_floor_slab", () -> new BlockItem(BlockInit.BLACKSTONE_CRYSTAL_FLOOR_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_CRYSTAL_FLOOR = ITEMS.register("blackstone_crystal_floor", () -> new EngravedBlockTooltip(BlockInit.BLACKSTONE_CRYSTAL_FLOOR.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_CRYSTAL_FLOOR_PATH = ITEMS.register("dark_prismarine_crystal_floor_path", () -> new BlockItem(BlockInit.DARK_PRISMARINE_CRYSTAL_FLOOR_PATH.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_CRYSTAL_FLOOR_SLAB = ITEMS.register("dark_prismarine_crystal_floor_slab", () -> new BlockItem(BlockInit.DARK_PRISMARINE_CRYSTAL_FLOOR_SLAB.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_CRYSTAL_FLOOR = ITEMS.register("dark_prismarine_crystal_floor", () -> new EngravedBlockTooltip(BlockInit.DARK_PRISMARINE_CRYSTAL_FLOOR.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

//1.1.0 stuff

    public static final RegistryObject<Item> PODZOL_PATH_BLOCK = ITEMS.register("podzol_path_block", () -> new FlattenedBlockTooltip(BlockInit.PODZOL_PATH_BLOCK.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIRT_PATH_BLOCK = ITEMS.register("dirt_path_block", () -> new FlattenedBlockTooltip(BlockInit.DIRT_PATH_BLOCK.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRAVEL_PATH_BLOCK = ITEMS.register("gravel_path_block", () -> new FlattenedBlockTooltip(BlockInit.GRAVEL_PATH_BLOCK.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SAND_PATH_BLOCK = ITEMS.register("sand_path_block", () -> new FlattenedBlockTooltip(BlockInit.SAND_PATH_BLOCK.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SAND_PATH_BLOCK = ITEMS.register("red_sand_path_block", () -> new FlattenedBlockTooltip(BlockInit.RED_SAND_PATH_BLOCK.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> ANDESITE_RUNNING_BOND_STAIRS = ITEMS.register("andesite_running_bond_stairs", () -> new BlockItem(BlockInit.ANDESITE_RUNNING_BOND_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_RUNNING_BOND_STAIRS = ITEMS.register("diorite_running_bond_stairs", () -> new BlockItem(BlockInit.DIORITE_RUNNING_BOND_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_RUNNING_BOND_STAIRS = ITEMS.register("granite_running_bond_stairs", () -> new BlockItem(BlockInit.GRANITE_RUNNING_BOND_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_RUNNING_BOND_STAIRS = ITEMS.register("sandstone_running_bond_stairs", () -> new BlockItem(BlockInit.SANDSTONE_RUNNING_BOND_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_RUNNING_BOND_STAIRS = ITEMS.register("red_sandstone_running_bond_stairs", () -> new BlockItem(BlockInit.RED_SANDSTONE_RUNNING_BOND_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_RUNNING_BOND_STAIRS = ITEMS.register("brick_running_bond_stairs", () -> new BlockItem(BlockInit.BRICK_RUNNING_BOND_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_RUNNING_BOND_STAIRS = ITEMS.register("stone_running_bond_stairs", () -> new BlockItem(BlockInit.STONE_RUNNING_BOND_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_RUNNING_BOND_STAIRS = ITEMS.register("mossy_stone_running_bond_stairs", () -> new BlockItem(BlockInit.MOSSY_STONE_RUNNING_BOND_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_RUNNING_BOND_STAIRS = ITEMS.register("blackstone_running_bond_stairs", () -> new BlockItem(BlockInit.BLACKSTONE_RUNNING_BOND_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_RUNNING_BOND_STAIRS = ITEMS.register("dark_prismarine_running_bond_stairs", () -> new BlockItem(BlockInit.DARK_PRISMARINE_RUNNING_BOND_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> ANDESITE_WINDMILL_WEAVE_STAIRS = ITEMS.register("andesite_windmill_weave_stairs", () -> new BlockItem(BlockInit.ANDESITE_WINDMILL_WEAVE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_WINDMILL_WEAVE_STAIRS = ITEMS.register("diorite_windmill_weave_stairs", () -> new BlockItem(BlockInit.DIORITE_WINDMILL_WEAVE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_WINDMILL_WEAVE_STAIRS = ITEMS.register("granite_windmill_weave_stairs", () -> new BlockItem(BlockInit.GRANITE_WINDMILL_WEAVE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_WINDMILL_WEAVE_STAIRS = ITEMS.register("sandstone_windmill_weave_stairs", () -> new BlockItem(BlockInit.SANDSTONE_WINDMILL_WEAVE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_WINDMILL_WEAVE_STAIRS = ITEMS.register("red_sandstone_windmill_weave_stairs", () -> new BlockItem(BlockInit.RED_SANDSTONE_WINDMILL_WEAVE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_WINDMILL_WEAVE_STAIRS = ITEMS.register("brick_windmill_weave_stairs", () -> new BlockItem(BlockInit.BRICK_WINDMILL_WEAVE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_WINDMILL_WEAVE_STAIRS = ITEMS.register("stone_windmill_weave_stairs", () -> new BlockItem(BlockInit.STONE_WINDMILL_WEAVE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_WINDMILL_WEAVE_STAIRS = ITEMS.register("mossy_stone_windmill_weave_stairs", () -> new BlockItem(BlockInit.MOSSY_STONE_WINDMILL_WEAVE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_WINDMILL_WEAVE_STAIRS = ITEMS.register("blackstone_windmill_weave_stairs", () -> new BlockItem(BlockInit.BLACKSTONE_WINDMILL_WEAVE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_WINDMILL_WEAVE_STAIRS = ITEMS.register("dark_prismarine_windmill_weave_stairs", () -> new BlockItem(BlockInit.DARK_PRISMARINE_WINDMILL_WEAVE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> ANDESITE_FLAGSTONE_STAIRS = ITEMS.register("andesite_flagstone_stairs", () -> new BlockItem(BlockInit.ANDESITE_FLAGSTONE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_FLAGSTONE_STAIRS = ITEMS.register("diorite_flagstone_stairs", () -> new BlockItem(BlockInit.DIORITE_FLAGSTONE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_FLAGSTONE_STAIRS = ITEMS.register("granite_flagstone_stairs", () -> new BlockItem(BlockInit.GRANITE_FLAGSTONE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_FLAGSTONE_STAIRS = ITEMS.register("sandstone_flagstone_stairs", () -> new BlockItem(BlockInit.SANDSTONE_FLAGSTONE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_FLAGSTONE_STAIRS = ITEMS.register("red_sandstone_flagstone_stairs", () -> new BlockItem(BlockInit.RED_SANDSTONE_FLAGSTONE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_FLAGSTONE_STAIRS = ITEMS.register("brick_flagstone_stairs", () -> new BlockItem(BlockInit.BRICK_FLAGSTONE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_FLAGSTONE_STAIRS = ITEMS.register("stone_flagstone_stairs", () -> new BlockItem(BlockInit.STONE_FLAGSTONE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_FLAGSTONE_STAIRS = ITEMS.register("mossy_stone_flagstone_stairs", () -> new BlockItem(BlockInit.MOSSY_STONE_FLAGSTONE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_FLAGSTONE_STAIRS = ITEMS.register("blackstone_flagstone_stairs", () -> new BlockItem(BlockInit.BLACKSTONE_FLAGSTONE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_FLAGSTONE_STAIRS = ITEMS.register("dark_prismarine_flagstone_stairs", () -> new BlockItem(BlockInit.DARK_PRISMARINE_FLAGSTONE_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));

    public static final RegistryObject<Item> ANDESITE_CRYSTAL_FLOOR_STAIRS = ITEMS.register("andesite_crystal_floor_stairs", () -> new BlockItem(BlockInit.ANDESITE_CRYSTAL_FLOOR_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DIORITE_CRYSTAL_FLOOR_STAIRS = ITEMS.register("diorite_crystal_floor_stairs", () -> new BlockItem(BlockInit.DIORITE_CRYSTAL_FLOOR_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> GRANITE_CRYSTAL_FLOOR_STAIRS = ITEMS.register("granite_crystal_floor_stairs", () -> new BlockItem(BlockInit.GRANITE_CRYSTAL_FLOOR_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> SANDSTONE_CRYSTAL_FLOOR_STAIRS = ITEMS.register("sandstone_crystal_floor_stairs", () -> new BlockItem(BlockInit.SANDSTONE_CRYSTAL_FLOOR_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> RED_SANDSTONE_CRYSTAL_FLOOR_STAIRS = ITEMS.register("red_sandstone_crystal_floor_stairs", () -> new BlockItem(BlockInit.RED_SANDSTONE_CRYSTAL_FLOOR_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BRICK_CRYSTAL_FLOOR_STAIRS = ITEMS.register("brick_crystal_floor_stairs", () -> new BlockItem(BlockInit.BRICK_CRYSTAL_FLOOR_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> STONE_CRYSTAL_FLOOR_STAIRS = ITEMS.register("stone_crystal_floor_stairs", () -> new BlockItem(BlockInit.STONE_CRYSTAL_FLOOR_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> MOSSY_STONE_CRYSTAL_FLOOR_STAIRS = ITEMS.register("mossy_stone_crystal_floor_stairs", () -> new BlockItem(BlockInit.MOSSY_STONE_CRYSTAL_FLOOR_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> BLACKSTONE_CRYSTAL_FLOOR_STAIRS = ITEMS.register("blackstone_crystal_floor_stairs", () -> new BlockItem(BlockInit.BLACKSTONE_CRYSTAL_FLOOR_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));
    public static final RegistryObject<Item> DARK_PRISMARINE_CRYSTAL_FLOOR_STAIRS = ITEMS.register("dark_prismarine_crystal_floor_stairs", () -> new BlockItem(BlockInit.DARK_PRISMARINE_CRYSTAL_FLOOR_STAIRS.get(), new Item.Properties().tab(MacawsPaths.PathsItemGroup)));


}
