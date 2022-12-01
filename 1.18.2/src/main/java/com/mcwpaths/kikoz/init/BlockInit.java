package com.mcwpaths.kikoz.init;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.objects.FacingPathBlock;
import com.mcwpaths.kikoz.objects.PathBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsPaths.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS_STONE = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsPaths.MOD_ID);

	public static final RegistryObject<Block> OAK_PLANKS_PATH = BLOCKS.register("oak_planks_path", () -> new FacingPathBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5f, 2.3f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_PLANKS_PATH = BLOCKS.register("spruce_planks_path", () -> new FacingPathBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5f, 2.3f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_PLANKS_PATH = BLOCKS.register("birch_planks_path", () -> new FacingPathBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5f, 2.3f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_PLANKS_PATH = BLOCKS.register("jungle_planks_path", () -> new FacingPathBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5f, 2.3f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_PLANKS_PATH = BLOCKS.register("acacia_planks_path", () -> new FacingPathBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5f, 2.3f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_PLANKS_PATH = BLOCKS.register("dark_oak_planks_path", () -> new FacingPathBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5f, 2.3f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_PLANKS_PATH = BLOCKS.register("crimson_planks_path", () -> new FacingPathBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5f, 2.3f).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_PLANKS_PATH = BLOCKS.register("warped_planks_path", () -> new FacingPathBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.5f, 2.3f).sound(SoundType.WOOD)));
	
	//pavings
	

	public static final RegistryObject<Block> ANDESITE_DIAMOND_PAVING = BLOCKS_STONE.register("andesite_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ANDESITE_BASKET_WEAVE_PAVING = BLOCKS_STONE.register("andesite_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ANDESITE_SQUARE_PAVING = BLOCKS_STONE.register("andesite_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ANDESITE_HONEYCOMB_PAVING = BLOCKS_STONE.register("andesite_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ANDESITE_CLOVER_PAVING = BLOCKS_STONE.register("andesite_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ANDESITE_DUMBLE_PAVING = BLOCKS_STONE.register("andesite_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> DIORITE_DIAMOND_PAVING = BLOCKS_STONE.register("diorite_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DIORITE_BASKET_WEAVE_PAVING = BLOCKS_STONE.register("diorite_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DIORITE_SQUARE_PAVING = BLOCKS_STONE.register("diorite_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DIORITE_HONEYCOMB_PAVING = BLOCKS_STONE.register("diorite_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DIORITE_CLOVER_PAVING = BLOCKS_STONE.register("diorite_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DIORITE_DUMBLE_PAVING = BLOCKS_STONE.register("diorite_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> GRANITE_DIAMOND_PAVING = BLOCKS_STONE.register("granite_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> GRANITE_BASKET_WEAVE_PAVING = BLOCKS_STONE.register("granite_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> GRANITE_SQUARE_PAVING = BLOCKS_STONE.register("granite_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> GRANITE_HONEYCOMB_PAVING = BLOCKS_STONE.register("granite_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> GRANITE_CLOVER_PAVING = BLOCKS_STONE.register("granite_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> GRANITE_DUMBLE_PAVING = BLOCKS_STONE.register("granite_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));

	public static final RegistryObject<Block> SANDSTONE_DIAMOND_PAVING = BLOCKS_STONE.register("sandstone_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> SANDSTONE_BASKET_WEAVE_PAVING = BLOCKS_STONE.register("sandstone_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> SANDSTONE_SQUARE_PAVING = BLOCKS_STONE.register("sandstone_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> SANDSTONE_HONEYCOMB_PAVING = BLOCKS_STONE.register("sandstone_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> SANDSTONE_CLOVER_PAVING = BLOCKS_STONE.register("sandstone_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> SANDSTONE_DUMBLE_PAVING = BLOCKS_STONE.register("sandstone_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));

	public static final RegistryObject<Block> RED_SANDSTONE_DIAMOND_PAVING = BLOCKS_STONE.register("red_sandstone_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_BASKET_WEAVE_PAVING = BLOCKS_STONE.register("red_sandstone_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_SQUARE_PAVING = BLOCKS_STONE.register("red_sandstone_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_HONEYCOMB_PAVING = BLOCKS_STONE.register("red_sandstone_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_CLOVER_PAVING = BLOCKS_STONE.register("red_sandstone_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_DUMBLE_PAVING = BLOCKS_STONE.register("red_sandstone_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));

	public static final RegistryObject<Block> BRICK_DIAMOND_PAVING = BLOCKS_STONE.register("brick_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BRICK_BASKET_WEAVE_PAVING = BLOCKS_STONE.register("brick_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BRICK_SQUARE_PAVING = BLOCKS_STONE.register("brick_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BRICK_HONEYCOMB_PAVING = BLOCKS_STONE.register("brick_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BRICK_CLOVER_PAVING = BLOCKS_STONE.register("brick_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BRICK_DUMBLE_PAVING = BLOCKS_STONE.register("brick_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));

	public static final RegistryObject<Block> COBBLESTONE_DIAMOND_PAVING = BLOCKS_STONE.register("cobblestone_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> COBBLESTONE_BASKET_WEAVE_PAVING = BLOCKS_STONE.register("cobblestone_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> COBBLESTONE_SQUARE_PAVING = BLOCKS_STONE.register("cobblestone_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> COBBLESTONE_HONEYCOMB_PAVING = BLOCKS_STONE.register("cobblestone_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> COBBLESTONE_CLOVER_PAVING = BLOCKS_STONE.register("cobblestone_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> COBBLESTONE_DUMBLE_PAVING = BLOCKS_STONE.register("cobblestone_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));

	public static final RegistryObject<Block> MOSSY_COBBLESTONE_DIAMOND_PAVING = BLOCKS_STONE.register("mossy_cobblestone_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING = BLOCKS_STONE.register("mossy_cobblestone_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_SQUARE_PAVING = BLOCKS_STONE.register("mossy_cobblestone_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_HONEYCOMB_PAVING = BLOCKS_STONE.register("mossy_cobblestone_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_CLOVER_PAVING = BLOCKS_STONE.register("mossy_cobblestone_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_DUMBLE_PAVING = BLOCKS_STONE.register("mossy_cobblestone_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_DIAMOND_PAVING = BLOCKS_STONE.register("cobbled_deepslate_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_BASKET_WEAVE_PAVING = BLOCKS_STONE.register("cobbled_deepslate_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_SQUARE_PAVING = BLOCKS_STONE.register("cobbled_deepslate_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_HONEYCOMB_PAVING = BLOCKS_STONE.register("cobbled_deepslate_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CLOVER_PAVING = BLOCKS_STONE.register("cobbled_deepslate_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_DUMBLE_PAVING = BLOCKS_STONE.register("cobbled_deepslate_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));

	public static final RegistryObject<Block> DEEPSLATE_DIAMOND_PAVING = BLOCKS_STONE.register("deepslate_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DEEPSLATE_BASKET_WEAVE_PAVING = BLOCKS_STONE.register("deepslate_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DEEPSLATE_SQUARE_PAVING = BLOCKS_STONE.register("deepslate_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DEEPSLATE_HONEYCOMB_PAVING = BLOCKS_STONE.register("deepslate_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DEEPSLATE_CLOVER_PAVING = BLOCKS_STONE.register("deepslate_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DEEPSLATE_DUMBLE_PAVING = BLOCKS_STONE.register("deepslate_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_PINK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));

	//1.0.2 Update
	
	public static final RegistryObject<Block> BLACKSTONE_DIAMOND_PAVING = BLOCKS.register("blackstone_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BLACKSTONE_BASKET_WEAVE_PAVING = BLOCKS.register("blackstone_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BLACKSTONE_SQUARE_PAVING = BLOCKS.register("blackstone_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BLACKSTONE_HONEYCOMB_PAVING = BLOCKS.register("blackstone_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BLACKSTONE_CLOVER_PAVING = BLOCKS.register("blackstone_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BLACKSTONE_DUMBLE_PAVING = BLOCKS.register("blackstone_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));

	public static final RegistryObject<Block> DARK_PRISMARINE_DIAMOND_PAVING = BLOCKS.register("dark_prismarine_diamond_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_BASKET_WEAVE_PAVING = BLOCKS.register("dark_prismarine_basket_weave_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_SQUARE_PAVING = BLOCKS.register("dark_prismarine_square_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_HONEYCOMB_PAVING = BLOCKS.register("dark_prismarine_honeycomb_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_CLOVER_PAVING = BLOCKS.register("dark_prismarine_clover_paving", () -> new PathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_DUMBLE_PAVING = BLOCKS.register("dark_prismarine_dumble_paving", () -> new FacingPathBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).requiresCorrectToolForDrops().strength(2.0f, 3.3f).sound(SoundType.STONE)));

	
	

}
