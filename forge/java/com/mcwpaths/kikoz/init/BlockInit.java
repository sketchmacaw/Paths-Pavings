package com.mcwpaths.kikoz.init;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.objects.EngravedBlock;
import com.mcwpaths.kikoz.objects.FacingPathBlock;
import com.mcwpaths.kikoz.objects.FlattenedBlock;
import com.mcwpaths.kikoz.objects.PathBlock;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsPaths.MOD_ID);


	public static ResourceKey<Block> getKeyForBlock(String path) {
		return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MacawsPaths.MOD_ID, path));
	}


	public static final RegistryObject<Block> OAK_PLANKS_PATH = BLOCKS.register("oak_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(getKeyForBlock("oak_planks_path"))));
	public static final RegistryObject<Block> SPRUCE_PLANKS_PATH = BLOCKS.register("spruce_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).setId(getKeyForBlock("spruce_planks_path"))));
	public static final RegistryObject<Block> BIRCH_PLANKS_PATH = BLOCKS.register("birch_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).setId(getKeyForBlock("birch_planks_path"))));
	public static final RegistryObject<Block> JUNGLE_PLANKS_PATH = BLOCKS.register("jungle_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).setId(getKeyForBlock("jungle_planks_path"))));
	public static final RegistryObject<Block> ACACIA_PLANKS_PATH = BLOCKS.register("acacia_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).setId(getKeyForBlock("acacia_planks_path"))));
	public static final RegistryObject<Block> DARK_OAK_PLANKS_PATH = BLOCKS.register("dark_oak_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).setId(getKeyForBlock("dark_oak_planks_path"))));
	public static final RegistryObject<Block> CRIMSON_PLANKS_PATH = BLOCKS.register("crimson_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).setId(getKeyForBlock("crimson_planks_path"))));
	public static final RegistryObject<Block> WARPED_PLANKS_PATH = BLOCKS.register("warped_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).setId(getKeyForBlock("warped_planks_path"))));
	public static final RegistryObject<Block> MANGROVE_PLANKS_PATH = BLOCKS.register("mangrove_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).setId(getKeyForBlock("mangrove_planks_path"))));

	//pavings

	public static final RegistryObject<Block> ANDESITE_DIAMOND_PAVING = BLOCKS.register("andesite_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_diamond_paving"))));
	public static final RegistryObject<Block> ANDESITE_BASKET_WEAVE_PAVING = BLOCKS.register("andesite_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_basket_weave_paving"))));
	public static final RegistryObject<Block> ANDESITE_SQUARE_PAVING = BLOCKS.register("andesite_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_square_paving"))));
	public static final RegistryObject<Block> ANDESITE_HONEYCOMB_PAVING = BLOCKS.register("andesite_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_honeycomb_paving"))));
	public static final RegistryObject<Block> ANDESITE_CLOVER_PAVING = BLOCKS.register("andesite_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_clover_paving"))));
	public static final RegistryObject<Block> ANDESITE_DUMBLE_PAVING = BLOCKS.register("andesite_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_dumble_paving"))));

	public static final RegistryObject<Block> DIORITE_DIAMOND_PAVING = BLOCKS.register("diorite_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_diamond_paving"))));
	public static final RegistryObject<Block> DIORITE_BASKET_WEAVE_PAVING = BLOCKS.register("diorite_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_basket_weave_paving"))));
	public static final RegistryObject<Block> DIORITE_SQUARE_PAVING = BLOCKS.register("diorite_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_square_paving"))));
	public static final RegistryObject<Block> DIORITE_HONEYCOMB_PAVING = BLOCKS.register("diorite_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_honeycomb_paving"))));
	public static final RegistryObject<Block> DIORITE_CLOVER_PAVING = BLOCKS.register("diorite_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_clover_paving"))));
	public static final RegistryObject<Block> DIORITE_DUMBLE_PAVING = BLOCKS.register("diorite_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_dumble_paving"))));

	public static final RegistryObject<Block> GRANITE_DIAMOND_PAVING = BLOCKS.register("granite_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_diamond_paving"))));
	public static final RegistryObject<Block> GRANITE_BASKET_WEAVE_PAVING = BLOCKS.register("granite_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_basket_weave_paving"))));
	public static final RegistryObject<Block> GRANITE_SQUARE_PAVING = BLOCKS.register("granite_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_square_paving"))));
	public static final RegistryObject<Block> GRANITE_HONEYCOMB_PAVING = BLOCKS.register("granite_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_honeycomb_paving"))));
	public static final RegistryObject<Block> GRANITE_CLOVER_PAVING = BLOCKS.register("granite_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_clover_paving"))));
	public static final RegistryObject<Block> GRANITE_DUMBLE_PAVING = BLOCKS.register("granite_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_dumble_paving"))));

	public static final RegistryObject<Block> SANDSTONE_DIAMOND_PAVING = BLOCKS.register("sandstone_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_diamond_paving"))));
	public static final RegistryObject<Block> SANDSTONE_BASKET_WEAVE_PAVING = BLOCKS.register("sandstone_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_basket_weave_paving"))));
	public static final RegistryObject<Block> SANDSTONE_SQUARE_PAVING = BLOCKS.register("sandstone_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_square_paving"))));
	public static final RegistryObject<Block> SANDSTONE_HONEYCOMB_PAVING = BLOCKS.register("sandstone_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_honeycomb_paving"))));
	public static final RegistryObject<Block> SANDSTONE_CLOVER_PAVING = BLOCKS.register("sandstone_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_clover_paving"))));
	public static final RegistryObject<Block> SANDSTONE_DUMBLE_PAVING = BLOCKS.register("sandstone_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_dumble_paving"))));

	public static final RegistryObject<Block> RED_SANDSTONE_DIAMOND_PAVING = BLOCKS.register("red_sandstone_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_diamond_paving"))));
	public static final RegistryObject<Block> RED_SANDSTONE_BASKET_WEAVE_PAVING = BLOCKS.register("red_sandstone_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_basket_weave_paving"))));
	public static final RegistryObject<Block> RED_SANDSTONE_SQUARE_PAVING = BLOCKS.register("red_sandstone_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_square_paving"))));
	public static final RegistryObject<Block> RED_SANDSTONE_HONEYCOMB_PAVING = BLOCKS.register("red_sandstone_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_honeycomb_paving"))));
	public static final RegistryObject<Block> RED_SANDSTONE_CLOVER_PAVING = BLOCKS.register("red_sandstone_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_clover_paving"))));
	public static final RegistryObject<Block> RED_SANDSTONE_DUMBLE_PAVING = BLOCKS.register("red_sandstone_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_dumble_paving"))));

	public static final RegistryObject<Block> BRICK_DIAMOND_PAVING = BLOCKS.register("brick_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_diamond_paving"))));
	public static final RegistryObject<Block> BRICK_BASKET_WEAVE_PAVING = BLOCKS.register("brick_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_basket_weave_paving"))));
	public static final RegistryObject<Block> BRICK_SQUARE_PAVING = BLOCKS.register("brick_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_square_paving"))));
	public static final RegistryObject<Block> BRICK_HONEYCOMB_PAVING = BLOCKS.register("brick_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_honeycomb_paving"))));
	public static final RegistryObject<Block> BRICK_CLOVER_PAVING = BLOCKS.register("brick_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_clover_paving"))));
	public static final RegistryObject<Block> BRICK_DUMBLE_PAVING = BLOCKS.register("brick_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_dumble_paving"))));

	public static final RegistryObject<Block> COBBLESTONE_DIAMOND_PAVING = BLOCKS.register("cobblestone_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("cobblestone_diamond_paving"))));
	public static final RegistryObject<Block> COBBLESTONE_BASKET_WEAVE_PAVING = BLOCKS.register("cobblestone_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("cobblestone_basket_weave_paving"))));
	public static final RegistryObject<Block> COBBLESTONE_SQUARE_PAVING = BLOCKS.register("cobblestone_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("cobblestone_square_paving"))));
	public static final RegistryObject<Block> COBBLESTONE_HONEYCOMB_PAVING = BLOCKS.register("cobblestone_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("cobblestone_honeycomb_paving"))));
	public static final RegistryObject<Block> COBBLESTONE_CLOVER_PAVING = BLOCKS.register("cobblestone_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("cobblestone_clover_paving"))));
	public static final RegistryObject<Block> COBBLESTONE_DUMBLE_PAVING = BLOCKS.register("cobblestone_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("cobblestone_dumble_paving"))));

	public static final RegistryObject<Block> MOSSY_COBBLESTONE_DIAMOND_PAVING = BLOCKS.register("mossy_cobblestone_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_cobblestone_diamond_paving"))));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING = BLOCKS.register("mossy_cobblestone_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_cobblestone_basket_weave_paving"))));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_SQUARE_PAVING = BLOCKS.register("mossy_cobblestone_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_cobblestone_square_paving"))));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_HONEYCOMB_PAVING = BLOCKS.register("mossy_cobblestone_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_cobblestone_honeycomb_paving"))));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_CLOVER_PAVING = BLOCKS.register("mossy_cobblestone_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_cobblestone_clover_paving"))));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_DUMBLE_PAVING = BLOCKS.register("mossy_cobblestone_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_cobblestone_dumble_paving"))));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_DIAMOND_PAVING = BLOCKS.register("cobbled_deepslate_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_diamond_paving"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_BASKET_WEAVE_PAVING = BLOCKS.register("cobbled_deepslate_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_basket_weave_paving"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_SQUARE_PAVING = BLOCKS.register("cobbled_deepslate_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_square_paving"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_HONEYCOMB_PAVING = BLOCKS.register("cobbled_deepslate_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_honeycomb_paving"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CLOVER_PAVING = BLOCKS.register("cobbled_deepslate_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_clover_paving"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_DUMBLE_PAVING = BLOCKS.register("cobbled_deepslate_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_dumble_paving"))));

	public static final RegistryObject<Block> DEEPSLATE_DIAMOND_PAVING = BLOCKS.register("deepslate_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_diamond_paving"))));
	public static final RegistryObject<Block> DEEPSLATE_BASKET_WEAVE_PAVING = BLOCKS.register("deepslate_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_basket_weave_paving"))));
	public static final RegistryObject<Block> DEEPSLATE_SQUARE_PAVING = BLOCKS.register("deepslate_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_square_paving"))));
	public static final RegistryObject<Block> DEEPSLATE_HONEYCOMB_PAVING = BLOCKS.register("deepslate_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_honeycomb_paving"))));
	public static final RegistryObject<Block> DEEPSLATE_CLOVER_PAVING = BLOCKS.register("deepslate_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_clover_paving"))));
	public static final RegistryObject<Block> DEEPSLATE_DUMBLE_PAVING = BLOCKS.register("deepslate_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_dumble_paving"))));

	public static final RegistryObject<Block> MUD_BRICK_DIAMOND_PAVING = BLOCKS.register("mud_brick_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_diamond_paving"))));
	public static final RegistryObject<Block> MUD_BRICK_BASKET_WEAVE_PAVING = BLOCKS.register("mud_brick_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_basket_weave_paving"))));
	public static final RegistryObject<Block> MUD_BRICK_SQUARE_PAVING = BLOCKS.register("mud_brick_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_square_paving"))));
	public static final RegistryObject<Block> MUD_BRICK_HONEYCOMB_PAVING = BLOCKS.register("mud_brick_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_honeycomb_paving"))));
	public static final RegistryObject<Block> MUD_BRICK_CLOVER_PAVING = BLOCKS.register("mud_brick_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_clover_paving"))));
	public static final RegistryObject<Block> MUD_BRICK_DUMBLE_PAVING = BLOCKS.register("mud_brick_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_dumble_paving"))));

	//1.0.2 Update

	public static final RegistryObject<Block> BLACKSTONE_DIAMOND_PAVING = BLOCKS.register("blackstone_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_diamond_paving"))));
	public static final RegistryObject<Block> BLACKSTONE_BASKET_WEAVE_PAVING = BLOCKS.register("blackstone_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_basket_weave_paving"))));
	public static final RegistryObject<Block> BLACKSTONE_SQUARE_PAVING = BLOCKS.register("blackstone_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_square_paving"))));
	public static final RegistryObject<Block> BLACKSTONE_HONEYCOMB_PAVING = BLOCKS.register("blackstone_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_honeycomb_paving"))));
	public static final RegistryObject<Block> BLACKSTONE_CLOVER_PAVING = BLOCKS.register("blackstone_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_clover_paving"))));
	public static final RegistryObject<Block> BLACKSTONE_DUMBLE_PAVING = BLOCKS.register("blackstone_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_dumble_paving"))));

	public static final RegistryObject<Block> DARK_PRISMARINE_DIAMOND_PAVING = BLOCKS.register("dark_prismarine_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_diamond_paving"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_BASKET_WEAVE_PAVING = BLOCKS.register("dark_prismarine_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_basket_weave_paving"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_SQUARE_PAVING = BLOCKS.register("dark_prismarine_square_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_square_paving"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_HONEYCOMB_PAVING = BLOCKS.register("dark_prismarine_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_honeycomb_paving"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_CLOVER_PAVING = BLOCKS.register("dark_prismarine_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_clover_paving"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_DUMBLE_PAVING = BLOCKS.register("dark_prismarine_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_dumble_paving"))));

	//1.0.3 Update

	public static final RegistryObject<Block> ANDESITE_RUNNING_BOND_PATH = BLOCKS.register("andesite_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("andesite_running_bond_path"))));
	public static final RegistryObject<Block> ANDESITE_RUNNING_BOND_SLAB = BLOCKS.register("andesite_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("andesite_running_bond_slab"))));
	public static final RegistryObject<Block> ANDESITE_RUNNING_BOND = BLOCKS.register("andesite_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("andesite_running_bond"))));

	public static final RegistryObject<Block> DIORITE_RUNNING_BOND_PATH = BLOCKS.register("diorite_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("diorite_running_bond_path"))));
	public static final RegistryObject<Block> DIORITE_RUNNING_BOND_SLAB = BLOCKS.register("diorite_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("diorite_running_bond_slab"))));
	public static final RegistryObject<Block> DIORITE_RUNNING_BOND = BLOCKS.register("diorite_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("diorite_running_bond"))));

	public static final RegistryObject<Block> GRANITE_RUNNING_BOND_PATH = BLOCKS.register("granite_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("granite_running_bond_path"))));
	public static final RegistryObject<Block> GRANITE_RUNNING_BOND_SLAB = BLOCKS.register("granite_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("granite_running_bond_slab"))));
	public static final RegistryObject<Block> GRANITE_RUNNING_BOND = BLOCKS.register("granite_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("granite_running_bond"))));

	public static final RegistryObject<Block> SANDSTONE_RUNNING_BOND_PATH = BLOCKS.register("sandstone_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("sandstone_running_bond_path"))));
	public static final RegistryObject<Block> SANDSTONE_RUNNING_BOND_SLAB = BLOCKS.register("sandstone_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("sandstone_running_bond_slab"))));
	public static final RegistryObject<Block> SANDSTONE_RUNNING_BOND = BLOCKS.register("sandstone_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("sandstone_running_bond"))));

	public static final RegistryObject<Block> RED_SANDSTONE_RUNNING_BOND_PATH = BLOCKS.register("red_sandstone_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("red_sandstone_running_bond_path"))));
	public static final RegistryObject<Block> RED_SANDSTONE_RUNNING_BOND_SLAB = BLOCKS.register("red_sandstone_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("red_sandstone_running_bond_slab"))));
	public static final RegistryObject<Block> RED_SANDSTONE_RUNNING_BOND = BLOCKS.register("red_sandstone_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("red_sandstone_running_bond"))));

	public static final RegistryObject<Block> BRICK_RUNNING_BOND_PATH = BLOCKS.register("brick_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("brick_running_bond_path"))));
	public static final RegistryObject<Block> BRICK_RUNNING_BOND_SLAB = BLOCKS.register("brick_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("brick_running_bond_slab"))));
	public static final RegistryObject<Block> BRICK_RUNNING_BOND = BLOCKS.register("brick_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("brick_running_bond"))));

	public static final RegistryObject<Block> STONE_RUNNING_BOND_PATH = BLOCKS.register("stone_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("stone_running_bond_path"))));
	public static final RegistryObject<Block> STONE_RUNNING_BOND_SLAB = BLOCKS.register("stone_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("stone_running_bond_slab"))));
	public static final RegistryObject<Block> STONE_RUNNING_BOND = BLOCKS.register("stone_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("stone_running_bond"))));

	public static final RegistryObject<Block> MOSSY_STONE_RUNNING_BOND_PATH = BLOCKS.register("mossy_stone_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("mossy_stone_running_bond_path"))));
	public static final RegistryObject<Block> MOSSY_STONE_RUNNING_BOND_SLAB = BLOCKS.register("mossy_stone_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("mossy_stone_running_bond_slab"))));
	public static final RegistryObject<Block> MOSSY_STONE_RUNNING_BOND = BLOCKS.register("mossy_stone_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("mossy_stone_running_bond"))));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_RUNNING_BOND_PATH = BLOCKS.register("cobbled_deepslate_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("cobbled_deepslate_running_bond_path"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_RUNNING_BOND_SLAB = BLOCKS.register("cobbled_deepslate_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("cobbled_deepslate_running_bond_slab"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_RUNNING_BOND = BLOCKS.register("cobbled_deepslate_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("cobbled_deepslate_running_bond"))));

	public static final RegistryObject<Block> DEEPSLATE_RUNNING_BOND_PATH = BLOCKS.register("deepslate_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("deepslate_running_bond_path"))));
	public static final RegistryObject<Block> DEEPSLATE_RUNNING_BOND_SLAB = BLOCKS.register("deepslate_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("deepslate_running_bond_slab"))));
	public static final RegistryObject<Block> DEEPSLATE_RUNNING_BOND = BLOCKS.register("deepslate_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("deepslate_running_bond"))));

	public static final RegistryObject<Block> MUD_BRICK_RUNNING_BOND_PATH = BLOCKS.register("mud_brick_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("mud_brick_running_bond_path"))));
	public static final RegistryObject<Block> MUD_BRICK_RUNNING_BOND_SLAB = BLOCKS.register("mud_brick_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("mud_brick_running_bond_slab"))));
	public static final RegistryObject<Block> MUD_BRICK_RUNNING_BOND = BLOCKS.register("mud_brick_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("mud_brick_running_bond"))));

	public static final RegistryObject<Block> BLACKSTONE_RUNNING_BOND_PATH = BLOCKS.register("blackstone_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("blackstone_running_bond_path"))));
	public static final RegistryObject<Block> BLACKSTONE_RUNNING_BOND_SLAB = BLOCKS.register("blackstone_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("blackstone_running_bond_slab"))));
	public static final RegistryObject<Block> BLACKSTONE_RUNNING_BOND = BLOCKS.register("blackstone_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("blackstone_running_bond"))));

	public static final RegistryObject<Block> DARK_PRISMARINE_RUNNING_BOND_PATH = BLOCKS.register("dark_prismarine_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_running_bond_path"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_RUNNING_BOND_SLAB = BLOCKS.register("dark_prismarine_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_running_bond_slab"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_RUNNING_BOND = BLOCKS.register("dark_prismarine_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_running_bond"))));

	public static final RegistryObject<Block> CHERRY_PLANKS_PATH = BLOCKS.register("cherry_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).setId(getKeyForBlock("cherry_planks_path"))));
	public static final RegistryObject<Block> BAMBOO_PLANKS_PATH = BLOCKS.register("bamboo_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(getKeyForBlock("bamboo_planks_path"))));

	// Paths 1.1.0

	public static final RegistryObject<Block> ANDESITE_STREWN_ROCKY_PATH = BLOCKS.register("andesite_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_strewn_rocky_path"))));
	public static final RegistryObject<Block> DIORITE_STREWN_ROCKY_PATH = BLOCKS.register("diorite_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_strewn_rocky_path"))));
	public static final RegistryObject<Block> GRANITE_STREWN_ROCKY_PATH = BLOCKS.register("granite_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_strewn_rocky_path"))));
	public static final RegistryObject<Block> SANDSTONE_STREWN_ROCKY_PATH = BLOCKS.register("sandstone_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_strewn_rocky_path"))));
	public static final RegistryObject<Block> RED_SANDSTONE_STREWN_ROCKY_PATH = BLOCKS.register("red_sandstone_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_strewn_rocky_path"))));
	public static final RegistryObject<Block> BRICK_STREWN_ROCKY_PATH = BLOCKS.register("brick_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_strewn_rocky_path"))));
	public static final RegistryObject<Block> STONE_STREWN_ROCKY_PATH = BLOCKS.register("stone_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_strewn_rocky_path"))));
	public static final RegistryObject<Block> MOSSY_STONE_STREWN_ROCKY_PATH = BLOCKS.register("mossy_stone_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_strewn_rocky_path"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_STREWN_ROCKY_PATH = BLOCKS.register("cobbled_deepslate_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_strewn_rocky_path"))));
	public static final RegistryObject<Block> DEEPSLATE_STREWN_ROCKY_PATH = BLOCKS.register("deepslate_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_strewn_rocky_path"))));
	public static final RegistryObject<Block> MUD_BRICK_STREWN_ROCKY_PATH = BLOCKS.register("mud_brick_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_strewn_rocky_path"))));
	public static final RegistryObject<Block> BLACKSTONE_STREWN_ROCKY_PATH = BLOCKS.register("blackstone_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_strewn_rocky_path"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_STREWN_ROCKY_PATH = BLOCKS.register("dark_prismarine_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_strewn_rocky_path"))));


	public static final RegistryObject<Block> ANDESITE_WINDMILL_WEAVE_PATH = BLOCKS.register("andesite_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_windmill_weave_path"))));
	public static final RegistryObject<Block> ANDESITE_WINDMILL_WEAVE_SLAB = BLOCKS.register("andesite_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_windmill_weave_slab"))));
	public static final RegistryObject<Block> ANDESITE_WINDMILL_WEAVE = BLOCKS.register("andesite_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_windmill_weave"))));

	public static final RegistryObject<Block> DIORITE_WINDMILL_WEAVE_PATH = BLOCKS.register("diorite_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_windmill_weave_path"))));
	public static final RegistryObject<Block> DIORITE_WINDMILL_WEAVE_SLAB = BLOCKS.register("diorite_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_windmill_weave_slab"))));
	public static final RegistryObject<Block> DIORITE_WINDMILL_WEAVE = BLOCKS.register("diorite_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_windmill_weave"))));

	public static final RegistryObject<Block> GRANITE_WINDMILL_WEAVE_PATH = BLOCKS.register("granite_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_windmill_weave_path"))));
	public static final RegistryObject<Block> GRANITE_WINDMILL_WEAVE_SLAB = BLOCKS.register("granite_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_windmill_weave_slab"))));
	public static final RegistryObject<Block> GRANITE_WINDMILL_WEAVE = BLOCKS.register("granite_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_windmill_weave"))));

	public static final RegistryObject<Block> SANDSTONE_WINDMILL_WEAVE_PATH = BLOCKS.register("sandstone_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_windmill_weave_path"))));
	public static final RegistryObject<Block> SANDSTONE_WINDMILL_WEAVE_SLAB = BLOCKS.register("sandstone_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_windmill_weave_slab"))));
	public static final RegistryObject<Block> SANDSTONE_WINDMILL_WEAVE = BLOCKS.register("sandstone_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_windmill_weave"))));

	public static final RegistryObject<Block> RED_SANDSTONE_WINDMILL_WEAVE_PATH = BLOCKS.register("red_sandstone_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_windmill_weave_path"))));
	public static final RegistryObject<Block> RED_SANDSTONE_WINDMILL_WEAVE_SLAB = BLOCKS.register("red_sandstone_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_windmill_weave_slab"))));
	public static final RegistryObject<Block> RED_SANDSTONE_WINDMILL_WEAVE = BLOCKS.register("red_sandstone_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_windmill_weave"))));

	public static final RegistryObject<Block> BRICK_WINDMILL_WEAVE_PATH = BLOCKS.register("brick_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_windmill_weave_path"))));
	public static final RegistryObject<Block> BRICK_WINDMILL_WEAVE_SLAB = BLOCKS.register("brick_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_windmill_weave_slab"))));
	public static final RegistryObject<Block> BRICK_WINDMILL_WEAVE = BLOCKS.register("brick_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_windmill_weave"))));

	public static final RegistryObject<Block> STONE_WINDMILL_WEAVE_PATH = BLOCKS.register("stone_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_windmill_weave_path"))));
	public static final RegistryObject<Block> STONE_WINDMILL_WEAVE_SLAB = BLOCKS.register("stone_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_windmill_weave_slab"))));
	public static final RegistryObject<Block> STONE_WINDMILL_WEAVE = BLOCKS.register("stone_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_windmill_weave"))));

	public static final RegistryObject<Block> MOSSY_STONE_WINDMILL_WEAVE_PATH = BLOCKS.register("mossy_stone_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_windmill_weave_path"))));
	public static final RegistryObject<Block> MOSSY_STONE_WINDMILL_WEAVE_SLAB = BLOCKS.register("mossy_stone_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_windmill_weave_slab"))));
	public static final RegistryObject<Block> MOSSY_STONE_WINDMILL_WEAVE = BLOCKS.register("mossy_stone_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_windmill_weave"))));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_WINDMILL_WEAVE_PATH = BLOCKS.register("cobbled_deepslate_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_windmill_weave_path"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_WINDMILL_WEAVE_SLAB = BLOCKS.register("cobbled_deepslate_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_windmill_weave_slab"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_WINDMILL_WEAVE = BLOCKS.register("cobbled_deepslate_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_windmill_weave"))));

	public static final RegistryObject<Block> DEEPSLATE_WINDMILL_WEAVE_PATH = BLOCKS.register("deepslate_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_windmill_weave_path"))));
	public static final RegistryObject<Block> DEEPSLATE_WINDMILL_WEAVE_SLAB = BLOCKS.register("deepslate_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_windmill_weave_slab"))));
	public static final RegistryObject<Block> DEEPSLATE_WINDMILL_WEAVE = BLOCKS.register("deepslate_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_windmill_weave"))));

	public static final RegistryObject<Block> MUD_BRICK_WINDMILL_WEAVE_PATH = BLOCKS.register("mud_brick_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_windmill_weave_path"))));
	public static final RegistryObject<Block> MUD_BRICK_WINDMILL_WEAVE_SLAB = BLOCKS.register("mud_brick_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_windmill_weave_slab"))));
	public static final RegistryObject<Block> MUD_BRICK_WINDMILL_WEAVE = BLOCKS.register("mud_brick_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_windmill_weave"))));

	public static final RegistryObject<Block> BLACKSTONE_WINDMILL_WEAVE_PATH = BLOCKS.register("blackstone_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_windmill_weave_path"))));
	public static final RegistryObject<Block> BLACKSTONE_WINDMILL_WEAVE_SLAB = BLOCKS.register("blackstone_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_windmill_weave_slab"))));
	public static final RegistryObject<Block> BLACKSTONE_WINDMILL_WEAVE = BLOCKS.register("blackstone_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_windmill_weave"))));

	public static final RegistryObject<Block> DARK_PRISMARINE_WINDMILL_WEAVE_PATH = BLOCKS.register("dark_prismarine_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_windmill_weave_path"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_WINDMILL_WEAVE_SLAB = BLOCKS.register("dark_prismarine_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_windmill_weave_slab"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_WINDMILL_WEAVE = BLOCKS.register("dark_prismarine_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_windmill_weave"))));





	public static final RegistryObject<Block> ANDESITE_FLAGSTONE_PATH = BLOCKS.register("andesite_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_flagstone_path"))));
	public static final RegistryObject<Block> ANDESITE_FLAGSTONE_SLAB = BLOCKS.register("andesite_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_flagstone_slab"))));
	public static final RegistryObject<Block> ANDESITE_FLAGSTONE = BLOCKS.register("andesite_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_flagstone"))));

	public static final RegistryObject<Block> DIORITE_FLAGSTONE_PATH = BLOCKS.register("diorite_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_flagstone_path"))));
	public static final RegistryObject<Block> DIORITE_FLAGSTONE_SLAB = BLOCKS.register("diorite_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_flagstone_slab"))));
	public static final RegistryObject<Block> DIORITE_FLAGSTONE = BLOCKS.register("diorite_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_flagstone"))));

	public static final RegistryObject<Block> GRANITE_FLAGSTONE_PATH = BLOCKS.register("granite_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_flagstone_path"))));
	public static final RegistryObject<Block> GRANITE_FLAGSTONE_SLAB = BLOCKS.register("granite_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_flagstone_slab"))));
	public static final RegistryObject<Block> GRANITE_FLAGSTONE = BLOCKS.register("granite_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_flagstone"))));

	public static final RegistryObject<Block> SANDSTONE_FLAGSTONE_PATH = BLOCKS.register("sandstone_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_flagstone_path"))));
	public static final RegistryObject<Block> SANDSTONE_FLAGSTONE_SLAB = BLOCKS.register("sandstone_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_flagstone_slab"))));
	public static final RegistryObject<Block> SANDSTONE_FLAGSTONE = BLOCKS.register("sandstone_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_flagstone"))));

	public static final RegistryObject<Block> RED_SANDSTONE_FLAGSTONE_PATH = BLOCKS.register("red_sandstone_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_flagstone_path"))));
	public static final RegistryObject<Block> RED_SANDSTONE_FLAGSTONE_SLAB = BLOCKS.register("red_sandstone_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_flagstone_slab"))));
	public static final RegistryObject<Block> RED_SANDSTONE_FLAGSTONE = BLOCKS.register("red_sandstone_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_flagstone"))));

	public static final RegistryObject<Block> BRICK_FLAGSTONE_PATH = BLOCKS.register("brick_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_flagstone_path"))));
	public static final RegistryObject<Block> BRICK_FLAGSTONE_SLAB = BLOCKS.register("brick_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_flagstone_slab"))));
	public static final RegistryObject<Block> BRICK_FLAGSTONE = BLOCKS.register("brick_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_flagstone"))));

	public static final RegistryObject<Block> STONE_FLAGSTONE_PATH = BLOCKS.register("stone_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_flagstone_path"))));
	public static final RegistryObject<Block> STONE_FLAGSTONE_SLAB = BLOCKS.register("stone_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_flagstone_slab"))));
	public static final RegistryObject<Block> STONE_FLAGSTONE = BLOCKS.register("stone_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_flagstone"))));

	public static final RegistryObject<Block> MOSSY_STONE_FLAGSTONE_PATH = BLOCKS.register("mossy_stone_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_flagstone_path"))));
	public static final RegistryObject<Block> MOSSY_STONE_FLAGSTONE_SLAB = BLOCKS.register("mossy_stone_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_flagstone_slab"))));
	public static final RegistryObject<Block> MOSSY_STONE_FLAGSTONE = BLOCKS.register("mossy_stone_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_flagstone"))));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_FLAGSTONE_PATH = BLOCKS.register("cobbled_deepslate_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_flagstone_path"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_FLAGSTONE_SLAB = BLOCKS.register("cobbled_deepslate_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_flagstone_slab"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_FLAGSTONE = BLOCKS.register("cobbled_deepslate_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_flagstone"))));

	public static final RegistryObject<Block> DEEPSLATE_FLAGSTONE_PATH = BLOCKS.register("deepslate_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_flagstone_path"))));
	public static final RegistryObject<Block> DEEPSLATE_FLAGSTONE_SLAB = BLOCKS.register("deepslate_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_flagstone_slab"))));
	public static final RegistryObject<Block> DEEPSLATE_FLAGSTONE = BLOCKS.register("deepslate_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_flagstone"))));

	public static final RegistryObject<Block> MUD_BRICK_FLAGSTONE_PATH = BLOCKS.register("mud_brick_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_flagstone_path"))));
	public static final RegistryObject<Block> MUD_BRICK_FLAGSTONE_SLAB = BLOCKS.register("mud_brick_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_flagstone_slab"))));
	public static final RegistryObject<Block> MUD_BRICK_FLAGSTONE = BLOCKS.register("mud_brick_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_flagstone"))));

	public static final RegistryObject<Block> BLACKSTONE_FLAGSTONE_PATH = BLOCKS.register("blackstone_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_flagstone_path"))));
	public static final RegistryObject<Block> BLACKSTONE_FLAGSTONE_SLAB = BLOCKS.register("blackstone_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_flagstone_slab"))));
	public static final RegistryObject<Block> BLACKSTONE_FLAGSTONE = BLOCKS.register("blackstone_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_flagstone"))));

	public static final RegistryObject<Block> DARK_PRISMARINE_FLAGSTONE_PATH = BLOCKS.register("dark_prismarine_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_flagstone_path"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_FLAGSTONE_SLAB = BLOCKS.register("dark_prismarine_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_flagstone_slab"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_FLAGSTONE = BLOCKS.register("dark_prismarine_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_flagstone"))));




	public static final RegistryObject<Block> ANDESITE_CRYSTAL_FLOOR_PATH = BLOCKS.register("andesite_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_crystal_floor_path"))));
	public static final RegistryObject<Block> ANDESITE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("andesite_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_crystal_floor_slab"))));
	public static final RegistryObject<Block> ANDESITE_CRYSTAL_FLOOR = BLOCKS.register("andesite_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_crystal_floor"))));

	public static final RegistryObject<Block> DIORITE_CRYSTAL_FLOOR_PATH = BLOCKS.register("diorite_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_crystal_floor_path"))));
	public static final RegistryObject<Block> DIORITE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("diorite_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_crystal_floor_slab"))));
	public static final RegistryObject<Block> DIORITE_CRYSTAL_FLOOR = BLOCKS.register("diorite_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_crystal_floor"))));

	public static final RegistryObject<Block> GRANITE_CRYSTAL_FLOOR_PATH = BLOCKS.register("granite_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_crystal_floor_path"))));
	public static final RegistryObject<Block> GRANITE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("granite_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_crystal_floor_slab"))));
	public static final RegistryObject<Block> GRANITE_CRYSTAL_FLOOR = BLOCKS.register("granite_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_crystal_floor"))));

	public static final RegistryObject<Block> SANDSTONE_CRYSTAL_FLOOR_PATH = BLOCKS.register("sandstone_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_crystal_floor_path"))));
	public static final RegistryObject<Block> SANDSTONE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("sandstone_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_crystal_floor_slab"))));
	public static final RegistryObject<Block> SANDSTONE_CRYSTAL_FLOOR = BLOCKS.register("sandstone_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_crystal_floor"))));

	public static final RegistryObject<Block> RED_SANDSTONE_CRYSTAL_FLOOR_PATH = BLOCKS.register("red_sandstone_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_crystal_floor_path"))));
	public static final RegistryObject<Block> RED_SANDSTONE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("red_sandstone_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_crystal_floor_slab"))));
	public static final RegistryObject<Block> RED_SANDSTONE_CRYSTAL_FLOOR = BLOCKS.register("red_sandstone_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_crystal_floor"))));

	public static final RegistryObject<Block> BRICK_CRYSTAL_FLOOR_PATH = BLOCKS.register("brick_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_crystal_floor_path"))));
	public static final RegistryObject<Block> BRICK_CRYSTAL_FLOOR_SLAB = BLOCKS.register("brick_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_crystal_floor_slab"))));
	public static final RegistryObject<Block> BRICK_CRYSTAL_FLOOR = BLOCKS.register("brick_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_crystal_floor"))));

	public static final RegistryObject<Block> STONE_CRYSTAL_FLOOR_PATH = BLOCKS.register("stone_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_crystal_floor_path"))));
	public static final RegistryObject<Block> STONE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("stone_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_crystal_floor_slab"))));
	public static final RegistryObject<Block> STONE_CRYSTAL_FLOOR = BLOCKS.register("stone_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_crystal_floor"))));

	public static final RegistryObject<Block> MOSSY_STONE_CRYSTAL_FLOOR_PATH = BLOCKS.register("mossy_stone_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_crystal_floor_path"))));
	public static final RegistryObject<Block> MOSSY_STONE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("mossy_stone_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_crystal_floor_slab"))));
	public static final RegistryObject<Block> MOSSY_STONE_CRYSTAL_FLOOR = BLOCKS.register("mossy_stone_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_crystal_floor"))));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CRYSTAL_FLOOR_PATH = BLOCKS.register("cobbled_deepslate_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_crystal_floor_path"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("cobbled_deepslate_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_crystal_floor_slab"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CRYSTAL_FLOOR = BLOCKS.register("cobbled_deepslate_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_crystal_floor"))));

	public static final RegistryObject<Block> DEEPSLATE_CRYSTAL_FLOOR_PATH = BLOCKS.register("deepslate_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_crystal_floor_path"))));
	public static final RegistryObject<Block> DEEPSLATE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("deepslate_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_crystal_floor_slab"))));
	public static final RegistryObject<Block> DEEPSLATE_CRYSTAL_FLOOR = BLOCKS.register("deepslate_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_crystal_floor"))));

	public static final RegistryObject<Block> MUD_BRICK_CRYSTAL_FLOOR_PATH = BLOCKS.register("mud_brick_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_crystal_floor_path"))));
	public static final RegistryObject<Block> MUD_BRICK_CRYSTAL_FLOOR_SLAB = BLOCKS.register("mud_brick_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_crystal_floor_slab"))));
	public static final RegistryObject<Block> MUD_BRICK_CRYSTAL_FLOOR = BLOCKS.register("mud_brick_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_crystal_floor"))));

	public static final RegistryObject<Block> BLACKSTONE_CRYSTAL_FLOOR_PATH = BLOCKS.register("blackstone_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_crystal_floor_path"))));
	public static final RegistryObject<Block> BLACKSTONE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("blackstone_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_crystal_floor_slab"))));
	public static final RegistryObject<Block> BLACKSTONE_CRYSTAL_FLOOR = BLOCKS.register("blackstone_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_crystal_floor"))));

	public static final RegistryObject<Block> DARK_PRISMARINE_CRYSTAL_FLOOR_PATH = BLOCKS.register("dark_prismarine_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_crystal_floor_path"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("dark_prismarine_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_crystal_floor_slab"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_CRYSTAL_FLOOR = BLOCKS.register("dark_prismarine_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_crystal_floor"))));

	//1.1.0 stuff

	public static final RegistryObject<Block> PODZOL_PATH_BLOCK = BLOCKS.register("podzol_path_block", () -> new FlattenedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).setId(getKeyForBlock("podzol_path_block"))));
	public static final RegistryObject<Block> DIRT_PATH_BLOCK = BLOCKS.register("dirt_path_block", () -> new FlattenedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).setId(getKeyForBlock("dirt_path_block"))));
	public static final RegistryObject<Block> GRAVEL_PATH_BLOCK = BLOCKS.register("gravel_path_block", () -> new FlattenedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL).setId(getKeyForBlock("gravel_path_block"))));
	public static final RegistryObject<Block> SAND_PATH_BLOCK = BLOCKS.register("sand_path_block", () -> new FlattenedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).setId(getKeyForBlock("sand_path_block"))));
	public static final RegistryObject<Block> RED_SAND_PATH_BLOCK = BLOCKS.register("red_sand_path_block", () -> new FlattenedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SAND).setId(getKeyForBlock("red_sand_path_block"))));

	public static final RegistryObject<Block> ANDESITE_RUNNING_BOND_STAIRS = BLOCKS.register("andesite_running_bond_stairs", () -> new StairBlock(Blocks.ANDESITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_running_bond_stairs"))));
	public static final RegistryObject<Block> DIORITE_RUNNING_BOND_STAIRS = BLOCKS.register("diorite_running_bond_stairs", () -> new StairBlock(Blocks.DIORITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_running_bond_stairs"))));
	public static final RegistryObject<Block> GRANITE_RUNNING_BOND_STAIRS = BLOCKS.register("granite_running_bond_stairs", () -> new StairBlock(Blocks.GRANITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_running_bond_stairs"))));
	public static final RegistryObject<Block> SANDSTONE_RUNNING_BOND_STAIRS = BLOCKS.register("sandstone_running_bond_stairs", () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_running_bond_stairs"))));
	public static final RegistryObject<Block> RED_SANDSTONE_RUNNING_BOND_STAIRS = BLOCKS.register("red_sandstone_running_bond_stairs", () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_running_bond_stairs"))));
	public static final RegistryObject<Block> BRICK_RUNNING_BOND_STAIRS = BLOCKS.register("brick_running_bond_stairs", () -> new StairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_running_bond_stairs"))));
	public static final RegistryObject<Block> STONE_RUNNING_BOND_STAIRS = BLOCKS.register("stone_running_bond_stairs", () -> new StairBlock(Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_running_bond_stairs"))));
	public static final RegistryObject<Block> MOSSY_STONE_RUNNING_BOND_STAIRS = BLOCKS.register("mossy_stone_running_bond_stairs", () -> new StairBlock(Blocks.MOSSY_COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_running_bond_stairs"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_RUNNING_BOND_STAIRS = BLOCKS.register("cobbled_deepslate_running_bond_stairs", () -> new StairBlock(Blocks.COBBLED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_running_bond_stairs"))));
	public static final RegistryObject<Block> DEEPSLATE_RUNNING_BOND_STAIRS = BLOCKS.register("deepslate_running_bond_stairs", () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_running_bond_stairs"))));
	public static final RegistryObject<Block> MUD_BRICK_RUNNING_BOND_STAIRS = BLOCKS.register("mud_brick_running_bond_stairs", () -> new StairBlock(Blocks.MUD_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_running_bond_stairs"))));
	public static final RegistryObject<Block> BLACKSTONE_RUNNING_BOND_STAIRS = BLOCKS.register("blackstone_running_bond_stairs", () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_running_bond_stairs"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_RUNNING_BOND_STAIRS = BLOCKS.register("dark_prismarine_running_bond_stairs", () -> new StairBlock(Blocks.DARK_PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_running_bond_stairs"))));

	public static final RegistryObject<Block> ANDESITE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("andesite_windmill_weave_stairs", () -> new StairBlock(Blocks.ANDESITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_windmill_weave_stairs"))));
	public static final RegistryObject<Block> DIORITE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("diorite_windmill_weave_stairs", () -> new StairBlock(Blocks.DIORITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_windmill_weave_stairs"))));
	public static final RegistryObject<Block> GRANITE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("granite_windmill_weave_stairs", () -> new StairBlock(Blocks.GRANITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_windmill_weave_stairs"))));
	public static final RegistryObject<Block> SANDSTONE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("sandstone_windmill_weave_stairs", () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_windmill_weave_stairs"))));
	public static final RegistryObject<Block> RED_SANDSTONE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("red_sandstone_windmill_weave_stairs", () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_windmill_weave_stairs"))));
	public static final RegistryObject<Block> BRICK_WINDMILL_WEAVE_STAIRS = BLOCKS.register("brick_windmill_weave_stairs", () -> new StairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_windmill_weave_stairs"))));
	public static final RegistryObject<Block> STONE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("stone_windmill_weave_stairs", () -> new StairBlock(Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_windmill_weave_stairs"))));
	public static final RegistryObject<Block> MOSSY_STONE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("mossy_stone_windmill_weave_stairs", () -> new StairBlock(Blocks.MOSSY_COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_windmill_weave_stairs"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("cobbled_deepslate_windmill_weave_stairs", () -> new StairBlock(Blocks.COBBLED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_windmill_weave_stairs"))));
	public static final RegistryObject<Block> DEEPSLATE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("deepslate_windmill_weave_stairs", () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_windmill_weave_stairs"))));
	public static final RegistryObject<Block> MUD_BRICK_WINDMILL_WEAVE_STAIRS = BLOCKS.register("mud_brick_windmill_weave_stairs", () -> new StairBlock(Blocks.MUD_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_windmill_weave_stairs"))));
	public static final RegistryObject<Block> BLACKSTONE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("blackstone_windmill_weave_stairs", () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_windmill_weave_stairs"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("dark_prismarine_windmill_weave_stairs", () -> new StairBlock(Blocks.DARK_PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_windmill_weave_stairs"))));

	public static final RegistryObject<Block> ANDESITE_FLAGSTONE_STAIRS = BLOCKS.register("andesite_flagstone_stairs", () -> new StairBlock(Blocks.ANDESITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_flagstone_stairs"))));
	public static final RegistryObject<Block> DIORITE_FLAGSTONE_STAIRS = BLOCKS.register("diorite_flagstone_stairs", () -> new StairBlock(Blocks.DIORITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_flagstone_stairs"))));
	public static final RegistryObject<Block> GRANITE_FLAGSTONE_STAIRS = BLOCKS.register("granite_flagstone_stairs", () -> new StairBlock(Blocks.GRANITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_flagstone_stairs"))));
	public static final RegistryObject<Block> SANDSTONE_FLAGSTONE_STAIRS = BLOCKS.register("sandstone_flagstone_stairs", () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_flagstone_stairs"))));
	public static final RegistryObject<Block> RED_SANDSTONE_FLAGSTONE_STAIRS = BLOCKS.register("red_sandstone_flagstone_stairs", () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_flagstone_stairs"))));
	public static final RegistryObject<Block> BRICK_FLAGSTONE_STAIRS = BLOCKS.register("brick_flagstone_stairs", () -> new StairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_flagstone_stairs"))));
	public static final RegistryObject<Block> STONE_FLAGSTONE_STAIRS = BLOCKS.register("stone_flagstone_stairs", () -> new StairBlock(Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_flagstone_stairs"))));
	public static final RegistryObject<Block> MOSSY_STONE_FLAGSTONE_STAIRS = BLOCKS.register("mossy_stone_flagstone_stairs", () -> new StairBlock(Blocks.MOSSY_COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_flagstone_stairs"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_FLAGSTONE_STAIRS = BLOCKS.register("cobbled_deepslate_flagstone_stairs", () -> new StairBlock(Blocks.COBBLED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_flagstone_stairs"))));
	public static final RegistryObject<Block> DEEPSLATE_FLAGSTONE_STAIRS = BLOCKS.register("deepslate_flagstone_stairs", () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_flagstone_stairs"))));
	public static final RegistryObject<Block> MUD_BRICK_FLAGSTONE_STAIRS = BLOCKS.register("mud_brick_flagstone_stairs", () -> new StairBlock(Blocks.MUD_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_flagstone_stairs"))));
	public static final RegistryObject<Block> BLACKSTONE_FLAGSTONE_STAIRS = BLOCKS.register("blackstone_flagstone_stairs", () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_flagstone_stairs"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_FLAGSTONE_STAIRS = BLOCKS.register("dark_prismarine_flagstone_stairs", () -> new StairBlock(Blocks.DARK_PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_flagstone_stairs"))));

	public static final RegistryObject<Block> ANDESITE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("andesite_crystal_floor_stairs", () -> new StairBlock(Blocks.ANDESITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(getKeyForBlock("andesite_crystal_floor_stairs"))));
	public static final RegistryObject<Block> DIORITE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("diorite_crystal_floor_stairs", () -> new StairBlock(Blocks.DIORITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).setId(getKeyForBlock("diorite_crystal_floor_stairs"))));
	public static final RegistryObject<Block> GRANITE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("granite_crystal_floor_stairs", () -> new StairBlock(Blocks.GRANITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).setId(getKeyForBlock("granite_crystal_floor_stairs"))));
	public static final RegistryObject<Block> SANDSTONE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("sandstone_crystal_floor_stairs", () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).setId(getKeyForBlock("sandstone_crystal_floor_stairs"))));
	public static final RegistryObject<Block> RED_SANDSTONE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("red_sandstone_crystal_floor_stairs", () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE).setId(getKeyForBlock("red_sandstone_crystal_floor_stairs"))));
	public static final RegistryObject<Block> BRICK_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("brick_crystal_floor_stairs", () -> new StairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).setId(getKeyForBlock("brick_crystal_floor_stairs"))));
	public static final RegistryObject<Block> STONE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("stone_crystal_floor_stairs", () -> new StairBlock(Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).setId(getKeyForBlock("stone_crystal_floor_stairs"))));
	public static final RegistryObject<Block> MOSSY_STONE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("mossy_stone_crystal_floor_stairs", () -> new StairBlock(Blocks.MOSSY_COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE).setId(getKeyForBlock("mossy_stone_crystal_floor_stairs"))));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("cobbled_deepslate_crystal_floor_stairs", () -> new StairBlock(Blocks.COBBLED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).setId(getKeyForBlock("cobbled_deepslate_crystal_floor_stairs"))));
	public static final RegistryObject<Block> DEEPSLATE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("deepslate_crystal_floor_stairs", () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).setId(getKeyForBlock("deepslate_crystal_floor_stairs"))));
	public static final RegistryObject<Block> MUD_BRICK_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("mud_brick_crystal_floor_stairs", () -> new StairBlock(Blocks.MUD_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).setId(getKeyForBlock("mud_brick_crystal_floor_stairs"))));
	public static final RegistryObject<Block> BLACKSTONE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("blackstone_crystal_floor_stairs", () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).setId(getKeyForBlock("blackstone_crystal_floor_stairs"))));
	public static final RegistryObject<Block> DARK_PRISMARINE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("dark_prismarine_crystal_floor_stairs", () -> new StairBlock(Blocks.DARK_PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).setId(getKeyForBlock("dark_prismarine_crystal_floor_stairs"))));

	public static final RegistryObject<Block> PALE_OAK_PLANKS_PATH = BLOCKS.register("pale_oak_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS).setId(getKeyForBlock("pale_oak_planks_path"))));

}
