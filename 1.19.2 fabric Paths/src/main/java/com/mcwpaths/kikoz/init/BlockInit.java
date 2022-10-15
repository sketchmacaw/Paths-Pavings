package com.mcwpaths.kikoz.init;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.objects.FacingPathBlock;
import com.mcwpaths.kikoz.objects.PathBlock;
import com.mcwpaths.kikoz.util.PathGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BlockInit {

	public static final Block OAK_PLANKS_PATH = registerBlock("oak_planks_path", new FacingPathBlock(Block.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(1.5f, 2.3f).sounds(BlockSoundGroup.WOOD)), PathGroup.PATHGROUP);
	public static final Block SPRUCE_PLANKS_PATH = registerBlock("spruce_planks_path", new FacingPathBlock(Block.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(1.5f, 2.3f).sounds(BlockSoundGroup.WOOD)), PathGroup.PATHGROUP);
	public static final Block BIRCH_PLANKS_PATH = registerBlock("birch_planks_path", new FacingPathBlock(Block.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(1.5f, 2.3f).sounds(BlockSoundGroup.WOOD)), PathGroup.PATHGROUP);
	public static final Block JUNGLE_PLANKS_PATH = registerBlock("jungle_planks_path", new FacingPathBlock(Block.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(1.5f, 2.3f).sounds(BlockSoundGroup.WOOD)), PathGroup.PATHGROUP);
	public static final Block ACACIA_PLANKS_PATH = registerBlock("acacia_planks_path", new FacingPathBlock(Block.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(1.5f, 2.3f).sounds(BlockSoundGroup.WOOD)), PathGroup.PATHGROUP);
	public static final Block DARK_OAK_PLANKS_PATH = registerBlock("dark_oak_planks_path", new FacingPathBlock(Block.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(1.5f, 2.3f).sounds(BlockSoundGroup.WOOD)), PathGroup.PATHGROUP);
	public static final Block CRIMSON_PLANKS_PATH = registerBlock("crimson_planks_path", new FacingPathBlock(Block.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(1.5f, 2.3f).sounds(BlockSoundGroup.WOOD)), PathGroup.PATHGROUP);
	public static final Block WARPED_PLANKS_PATH = registerBlock("warped_planks_path", new FacingPathBlock(Block.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(1.5f, 2.3f).sounds(BlockSoundGroup.WOOD)), PathGroup.PATHGROUP);
	public static final Block MANGROVE_PLANKS_PATH = registerBlock("mangrove_planks_path", new FacingPathBlock(Block.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(1.5f, 2.3f).sounds(BlockSoundGroup.WOOD)), PathGroup.PATHGROUP);

	//pavings
	

	public static final Block ANDESITE_DIAMOND_PAVING = registerBlock("andesite_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_BASKET_WEAVE_PAVING = registerBlock("andesite_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_SQUARE_PAVING = registerBlock("andesite_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_HONEYCOMB_PAVING = registerBlock("andesite_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_CLOVER_PAVING = registerBlock("andesite_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_DUMBLE_PAVING = registerBlock("andesite_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	
	public static final Block DIORITE_DIAMOND_PAVING = registerBlock("diorite_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_BASKET_WEAVE_PAVING = registerBlock("diorite_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_SQUARE_PAVING = registerBlock("diorite_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_HONEYCOMB_PAVING = registerBlock("diorite_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_CLOVER_PAVING = registerBlock("diorite_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_DUMBLE_PAVING = registerBlock("diorite_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	
	public static final Block GRANITE_DIAMOND_PAVING = registerBlock("granite_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_BASKET_WEAVE_PAVING = registerBlock("granite_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_SQUARE_PAVING = registerBlock("granite_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_HONEYCOMB_PAVING = registerBlock("granite_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_CLOVER_PAVING = registerBlock("granite_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_DUMBLE_PAVING = registerBlock("granite_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);

	public static final Block SANDSTONE_DIAMOND_PAVING = registerBlock("sandstone_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_BASKET_WEAVE_PAVING = registerBlock("sandstone_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_SQUARE_PAVING = registerBlock("sandstone_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_HONEYCOMB_PAVING = registerBlock("sandstone_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_CLOVER_PAVING = registerBlock("sandstone_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_DUMBLE_PAVING = registerBlock("sandstone_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);

	public static final Block RED_SANDSTONE_DIAMOND_PAVING = registerBlock("red_sandstone_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_BASKET_WEAVE_PAVING = registerBlock("red_sandstone_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_SQUARE_PAVING = registerBlock("red_sandstone_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_HONEYCOMB_PAVING = registerBlock("red_sandstone_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_CLOVER_PAVING = registerBlock("red_sandstone_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_DUMBLE_PAVING = registerBlock("red_sandstone_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);

	public static final Block BRICK_DIAMOND_PAVING = registerBlock("brick_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block BRICK_BASKET_WEAVE_PAVING = registerBlock("brick_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block BRICK_SQUARE_PAVING = registerBlock("brick_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block BRICK_HONEYCOMB_PAVING = registerBlock("brick_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block BRICK_CLOVER_PAVING = registerBlock("brick_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block BRICK_DUMBLE_PAVING = registerBlock("brick_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);

	public static final Block COBBLESTONE_DIAMOND_PAVING = registerBlock("cobblestone_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block COBBLESTONE_BASKET_WEAVE_PAVING = registerBlock("cobblestone_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block COBBLESTONE_SQUARE_PAVING = registerBlock("cobblestone_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block COBBLESTONE_HONEYCOMB_PAVING = registerBlock("cobblestone_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block COBBLESTONE_CLOVER_PAVING = registerBlock("cobblestone_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block COBBLESTONE_DUMBLE_PAVING = registerBlock("cobblestone_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);

	public static final Block MOSSY_COBBLESTONE_DIAMOND_PAVING = registerBlock("mossy_cobblestone_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING = registerBlock("mossy_cobblestone_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_COBBLESTONE_SQUARE_PAVING = registerBlock("mossy_cobblestone_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_COBBLESTONE_HONEYCOMB_PAVING = registerBlock("mossy_cobblestone_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_COBBLESTONE_CLOVER_PAVING = registerBlock("mossy_cobblestone_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_COBBLESTONE_DUMBLE_PAVING = registerBlock("mossy_cobblestone_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);

	public static final Block COBBLED_DEEPSLATE_DIAMOND_PAVING = registerBlock("cobbled_deepslate_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_BASKET_WEAVE_PAVING = registerBlock("cobbled_deepslate_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_SQUARE_PAVING = registerBlock("cobbled_deepslate_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_HONEYCOMB_PAVING = registerBlock("cobbled_deepslate_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_CLOVER_PAVING = registerBlock("cobbled_deepslate_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_DUMBLE_PAVING = registerBlock("cobbled_deepslate_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);

	public static final Block DEEPSLATE_DIAMOND_PAVING = registerBlock("deepslate_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_BASKET_WEAVE_PAVING = registerBlock("deepslate_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_SQUARE_PAVING = registerBlock("deepslate_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_HONEYCOMB_PAVING = registerBlock("deepslate_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_CLOVER_PAVING = registerBlock("deepslate_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_DUMBLE_PAVING = registerBlock("deepslate_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);

	public static final Block MUD_BRICK_DIAMOND_PAVING = registerBlock("mud_brick_diamond_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.BROWN).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_BASKET_WEAVE_PAVING = registerBlock("mud_brick_basket_weave_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.BROWN).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_SQUARE_PAVING = registerBlock("mud_brick_square_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.BROWN).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_HONEYCOMB_PAVING = registerBlock("mud_brick_honeycomb_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.BROWN).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_CLOVER_PAVING = registerBlock("mud_brick_clover_paving", new PathBlock(Block.Settings.of(Material.STONE, MapColor.BROWN).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_DUMBLE_PAVING = registerBlock("mud_brick_dumble_paving", new FacingPathBlock(Block.Settings.of(Material.STONE, MapColor.BROWN).requiresTool().strength(2.0f, 3.3f).sounds(BlockSoundGroup.STONE)), PathGroup.PATHGROUP);



	private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
		registerBlockItem(name, block, group, tooltipKey);
		return Registry.register(Registry.BLOCK, new Identifier(MacawsPaths.MOD_ID, name), block);
	}
	private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
		return Registry.register(Registry.ITEM, new Identifier(MacawsPaths.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings().group(group)) {
					@Override
					public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
						tooltip.add(Text.translatable(tooltipKey).formatted(Formatting.GRAY));
					}
				});
	}




	private static Block registerBlock(String name, Block block, ItemGroup group) {
		registerBlockItem(name, block, group);
		return Registry.register(Registry.BLOCK, new Identifier(MacawsPaths.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup group) {
		return Registry.register(Registry.ITEM, new Identifier(MacawsPaths.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings().group(group)));
	}

	public static void registerModBlocks() {
		MacawsPaths.LOGGER.info("Registering ModBlocks for " + MacawsPaths.MOD_ID);
	}
}