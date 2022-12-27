package com.mcwpaths.kikoz.init;

import java.util.ArrayList;
import java.util.List;

import com.mcwpaths.kikoz.objects.FacingPathBlock;
import com.mcwpaths.kikoz.objects.PathBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockInit {

	
	public static final List<Block> BLOCKS = new ArrayList<Block>();


	public static final Block OAK_PLANKS_PATH = new FacingPathBlock("oak_planks_path", Material.WOOD, SoundType.WOOD, 0.5f, 2.0f, "axe", 0);
	public static final Block SPRUCE_PLANKS_PATH = new FacingPathBlock("spruce_planks_path", Material.WOOD, SoundType.WOOD, 0.5f, 2.0f, "axe", 0);
	public static final Block BIRCH_PLANKS_PATH = new FacingPathBlock("birch_planks_path", Material.WOOD, SoundType.WOOD, 0.5f, 2.0f, "axe", 0);
	public static final Block JUNGLE_PLANKS_PATH = new FacingPathBlock("jungle_planks_path", Material.WOOD, SoundType.WOOD, 0.5f, 2.0f, "axe", 0);
	public static final Block ACACIA_PLANKS_PATH = new FacingPathBlock("acacia_planks_path", Material.WOOD, SoundType.WOOD, 0.5f, 2.0f, "axe", 0);
	public static final Block DARK_OAK_PLANKS_PATH = new FacingPathBlock("dark_oak_planks_path", Material.WOOD, SoundType.WOOD, 0.5f, 2.0f, "axe", 0);

	public static final Block ANDESITE_DIAMOND_PAVING = new PathBlock("andesite_diamond_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block ANDESITE_BASKET_WEAVE_PAVING = new PathBlock("andesite_basket_weave_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block ANDESITE_SQUARE_PAVING = new PathBlock("andesite_square_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block ANDESITE_HONEYCOMB_PAVING = new PathBlock("andesite_honeycomb_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block ANDESITE_CLOVER_PAVING = new PathBlock("andesite_clover_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block ANDESITE_DUMBLE_PAVING = new FacingPathBlock("andesite_dumble_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	
	public static final Block DIORITE_DIAMOND_PAVING = new PathBlock("diorite_diamond_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block DIORITE_BASKET_WEAVE_PAVING = new PathBlock("diorite_basket_weave_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block DIORITE_SQUARE_PAVING = new PathBlock("diorite_square_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block DIORITE_HONEYCOMB_PAVING = new PathBlock("diorite_honeycomb_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block DIORITE_CLOVER_PAVING = new PathBlock("diorite_clover_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block DIORITE_DUMBLE_PAVING = new FacingPathBlock("diorite_dumble_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	
	public static final Block GRANITE_DIAMOND_PAVING = new PathBlock("granite_diamond_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block GRANITE_BASKET_WEAVE_PAVING = new PathBlock("granite_basket_weave_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block GRANITE_SQUARE_PAVING = new PathBlock("granite_square_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block GRANITE_HONEYCOMB_PAVING = new PathBlock("granite_honeycomb_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block GRANITE_CLOVER_PAVING = new PathBlock("granite_clover_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block GRANITE_DUMBLE_PAVING = new FacingPathBlock("granite_dumble_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);

	public static final Block SANDSTONE_DIAMOND_PAVING = new PathBlock("sandstone_diamond_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block SANDSTONE_BASKET_WEAVE_PAVING = new PathBlock("sandstone_basket_weave_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block SANDSTONE_SQUARE_PAVING = new PathBlock("sandstone_square_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block SANDSTONE_HONEYCOMB_PAVING = new PathBlock("sandstone_honeycomb_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block SANDSTONE_CLOVER_PAVING = new PathBlock("sandstone_clover_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block SANDSTONE_DUMBLE_PAVING = new FacingPathBlock("sandstone_dumble_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);

	public static final Block RED_SANDSTONE_DIAMOND_PAVING = new PathBlock("red_sandstone_diamond_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block RED_SANDSTONE_BASKET_WEAVE_PAVING = new PathBlock("red_sandstone_basket_weave_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block RED_SANDSTONE_SQUARE_PAVING = new PathBlock("red_sandstone_square_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block RED_SANDSTONE_HONEYCOMB_PAVING = new PathBlock("red_sandstone_honeycomb_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block RED_SANDSTONE_CLOVER_PAVING = new PathBlock("red_sandstone_clover_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block RED_SANDSTONE_DUMBLE_PAVING = new FacingPathBlock("red_sandstone_dumble_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);

	public static final Block BRICK_DIAMOND_PAVING = new PathBlock("brick_diamond_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block BRICK_BASKET_WEAVE_PAVING = new PathBlock("brick_basket_weave_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block BRICK_SQUARE_PAVING = new PathBlock("brick_square_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block BRICK_HONEYCOMB_PAVING = new PathBlock("brick_honeycomb_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block BRICK_CLOVER_PAVING = new PathBlock("brick_clover_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block BRICK_DUMBLE_PAVING = new FacingPathBlock("brick_dumble_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);

	public static final Block COBBLESTONE_DIAMOND_PAVING = new PathBlock("cobblestone_diamond_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block COBBLESTONE_BASKET_WEAVE_PAVING = new PathBlock("cobblestone_basket_weave_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block COBBLESTONE_SQUARE_PAVING = new PathBlock("cobblestone_square_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block COBBLESTONE_HONEYCOMB_PAVING = new PathBlock("cobblestone_honeycomb_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block COBBLESTONE_CLOVER_PAVING = new PathBlock("cobblestone_clover_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block COBBLESTONE_DUMBLE_PAVING = new FacingPathBlock("cobblestone_dumble_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);

	public static final Block MOSSY_COBBLESTONE_DIAMOND_PAVING = new PathBlock("mossy_cobblestone_diamond_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING = new PathBlock("mossy_cobblestone_basket_weave_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block MOSSY_COBBLESTONE_SQUARE_PAVING = new PathBlock("mossy_cobblestone_square_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block MOSSY_COBBLESTONE_HONEYCOMB_PAVING = new PathBlock("mossy_cobblestone_honeycomb_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block MOSSY_COBBLESTONE_CLOVER_PAVING = new PathBlock("mossy_cobblestone_clover_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block MOSSY_COBBLESTONE_DUMBLE_PAVING = new FacingPathBlock("mossy_cobblestone_dumble_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);

	//1.0.2 Update
	
	public static final Block BLACKSTONE_DIAMOND_PAVING = new PathBlock("blackstone_diamond_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block BLACKSTONE_BASKET_WEAVE_PAVING = new PathBlock("blackstone_basket_weave_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block BLACKSTONE_SQUARE_PAVING = new PathBlock("blackstone_square_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block BLACKSTONE_HONEYCOMB_PAVING = new PathBlock("blackstone_honeycomb_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block BLACKSTONE_CLOVER_PAVING = new PathBlock("blackstone_clover_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block BLACKSTONE_DUMBLE_PAVING = new FacingPathBlock("blackstone_dumble_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);

	public static final Block DARK_PRISMARINE_DIAMOND_PAVING = new PathBlock("dark_prismarine_diamond_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block DARK_PRISMARINE_BASKET_WEAVE_PAVING = new PathBlock("dark_prismarine_basket_weave_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block DARK_PRISMARINE_SQUARE_PAVING = new PathBlock("dark_prismarine_square_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block DARK_PRISMARINE_HONEYCOMB_PAVING = new PathBlock("dark_prismarine_honeycomb_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block DARK_PRISMARINE_CLOVER_PAVING = new PathBlock("dark_prismarine_clover_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);
	public static final Block DARK_PRISMARINE_DUMBLE_PAVING = new FacingPathBlock("dark_prismarine_dumble_paving", Material.ROCK, SoundType.STONE, 0.5f, 3.0f, "pickaxe", 0);

	
	
}
