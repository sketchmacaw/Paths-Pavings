package com.mcwpaths.kikoz.init;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.objects.EngravedBlock;
import com.mcwpaths.kikoz.objects.FacingPathBlock;
import com.mcwpaths.kikoz.objects.FlattenedBlock;
import com.mcwpaths.kikoz.objects.PathBlock;

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
	public static final DeferredRegister<Block> BLOCKS_STONE = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsPaths.MOD_ID);
	public static final DeferredRegister<Block> ENGRAVED_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsPaths.MOD_ID);
	public static final DeferredRegister<Block> FLATTENED_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsPaths.MOD_ID);



	public static final RegistryObject<Block> OAK_PLANKS_PATH = BLOCKS.register("oak_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> SPRUCE_PLANKS_PATH = BLOCKS.register("spruce_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
	public static final RegistryObject<Block> BIRCH_PLANKS_PATH = BLOCKS.register("birch_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> JUNGLE_PLANKS_PATH = BLOCKS.register("jungle_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
	public static final RegistryObject<Block> ACACIA_PLANKS_PATH = BLOCKS.register("acacia_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> DARK_OAK_PLANKS_PATH = BLOCKS.register("dark_oak_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
	public static final RegistryObject<Block> CRIMSON_PLANKS_PATH = BLOCKS.register("crimson_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
	public static final RegistryObject<Block> WARPED_PLANKS_PATH = BLOCKS.register("warped_planks_path", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
	
	//pavings
	

	public static final RegistryObject<Block> ANDESITE_DIAMOND_PAVING = BLOCKS.register("andesite_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_BASKET_WEAVE_PAVING = BLOCKS.register("andesite_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_SQUARE_PAVING = BLOCKS.register("andesite_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_HONEYCOMB_PAVING = BLOCKS.register("andesite_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_CLOVER_PAVING = BLOCKS.register("andesite_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_DUMBLE_PAVING = BLOCKS.register("andesite_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	
	public static final RegistryObject<Block> DIORITE_DIAMOND_PAVING = BLOCKS.register("diorite_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_BASKET_WEAVE_PAVING = BLOCKS.register("diorite_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_SQUARE_PAVING = BLOCKS.register("diorite_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_HONEYCOMB_PAVING = BLOCKS.register("diorite_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_CLOVER_PAVING = BLOCKS.register("diorite_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_DUMBLE_PAVING = BLOCKS.register("diorite_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	
	public static final RegistryObject<Block> GRANITE_DIAMOND_PAVING = BLOCKS.register("granite_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_BASKET_WEAVE_PAVING = BLOCKS.register("granite_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_SQUARE_PAVING = BLOCKS.register("granite_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_HONEYCOMB_PAVING = BLOCKS.register("granite_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_CLOVER_PAVING = BLOCKS.register("granite_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_DUMBLE_PAVING = BLOCKS.register("granite_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

	public static final RegistryObject<Block> SANDSTONE_DIAMOND_PAVING = BLOCKS.register("sandstone_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_BASKET_WEAVE_PAVING = BLOCKS.register("sandstone_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_SQUARE_PAVING = BLOCKS.register("sandstone_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_HONEYCOMB_PAVING = BLOCKS.register("sandstone_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_CLOVER_PAVING = BLOCKS.register("sandstone_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_DUMBLE_PAVING = BLOCKS.register("sandstone_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

	public static final RegistryObject<Block> RED_SANDSTONE_DIAMOND_PAVING = BLOCKS.register("red_sandstone_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_BASKET_WEAVE_PAVING = BLOCKS.register("red_sandstone_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_SQUARE_PAVING = BLOCKS.register("red_sandstone_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_HONEYCOMB_PAVING = BLOCKS.register("red_sandstone_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_CLOVER_PAVING = BLOCKS.register("red_sandstone_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_DUMBLE_PAVING = BLOCKS.register("red_sandstone_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

	public static final RegistryObject<Block> BRICK_DIAMOND_PAVING = BLOCKS.register("brick_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_BASKET_WEAVE_PAVING = BLOCKS.register("brick_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_SQUARE_PAVING = BLOCKS.register("brick_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_HONEYCOMB_PAVING = BLOCKS.register("brick_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_CLOVER_PAVING = BLOCKS.register("brick_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_DUMBLE_PAVING = BLOCKS.register("brick_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	public static final RegistryObject<Block> COBBLESTONE_DIAMOND_PAVING = BLOCKS.register("cobblestone_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> COBBLESTONE_BASKET_WEAVE_PAVING = BLOCKS.register("cobblestone_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> COBBLESTONE_SQUARE_PAVING = BLOCKS.register("cobblestone_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> COBBLESTONE_HONEYCOMB_PAVING = BLOCKS.register("cobblestone_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> COBBLESTONE_CLOVER_PAVING = BLOCKS.register("cobblestone_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> COBBLESTONE_DUMBLE_PAVING = BLOCKS.register("cobblestone_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

	public static final RegistryObject<Block> MOSSY_COBBLESTONE_DIAMOND_PAVING = BLOCKS.register("mossy_cobblestone_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING = BLOCKS.register("mossy_cobblestone_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_SQUARE_PAVING = BLOCKS.register("mossy_cobblestone_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_HONEYCOMB_PAVING = BLOCKS.register("mossy_cobblestone_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_CLOVER_PAVING = BLOCKS.register("mossy_cobblestone_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_COBBLESTONE_DUMBLE_PAVING = BLOCKS.register("mossy_cobblestone_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_DIAMOND_PAVING = BLOCKS.register("cobbled_deepslate_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_BASKET_WEAVE_PAVING = BLOCKS.register("cobbled_deepslate_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_SQUARE_PAVING = BLOCKS.register("cobbled_deepslate_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_HONEYCOMB_PAVING = BLOCKS.register("cobbled_deepslate_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CLOVER_PAVING = BLOCKS.register("cobbled_deepslate_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_DUMBLE_PAVING = BLOCKS.register("cobbled_deepslate_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));

	public static final RegistryObject<Block> DEEPSLATE_DIAMOND_PAVING = BLOCKS.register("deepslate_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_BASKET_WEAVE_PAVING = BLOCKS.register("deepslate_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_SQUARE_PAVING = BLOCKS.register("deepslate_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_HONEYCOMB_PAVING = BLOCKS.register("deepslate_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_CLOVER_PAVING = BLOCKS.register("deepslate_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_DUMBLE_PAVING = BLOCKS.register("deepslate_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

	//1.0.2 Update
	
	public static final RegistryObject<Block> BLACKSTONE_DIAMOND_PAVING = BLOCKS.register("blackstone_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_BASKET_WEAVE_PAVING = BLOCKS.register("blackstone_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_SQUARE_PAVING = BLOCKS.register("blackstone_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_HONEYCOMB_PAVING = BLOCKS.register("blackstone_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_CLOVER_PAVING = BLOCKS.register("blackstone_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_DUMBLE_PAVING = BLOCKS.register("blackstone_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));

	public static final RegistryObject<Block> DARK_PRISMARINE_DIAMOND_PAVING = BLOCKS.register("dark_prismarine_diamond_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_BASKET_WEAVE_PAVING = BLOCKS.register("dark_prismarine_basket_weave_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_SQUARE_PAVING = BLOCKS.register("dark_prismarine_square_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_HONEYCOMB_PAVING = BLOCKS.register("dark_prismarine_honeycomb_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_CLOVER_PAVING = BLOCKS.register("dark_prismarine_clover_paving", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_DUMBLE_PAVING = BLOCKS.register("dark_prismarine_dumble_paving", () -> new FacingPathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	// 1.0.3 Update
	
	public static final RegistryObject<Block> ANDESITE_RUNNING_BOND_PATH = BLOCKS.register("andesite_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> ANDESITE_RUNNING_BOND_SLAB = BLOCKS.register("andesite_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> ANDESITE_RUNNING_BOND = ENGRAVED_BLOCKS.register("andesite_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> DIORITE_RUNNING_BOND_PATH = BLOCKS.register("diorite_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DIORITE_RUNNING_BOND_SLAB = BLOCKS.register("diorite_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DIORITE_RUNNING_BOND = ENGRAVED_BLOCKS.register("diorite_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> GRANITE_RUNNING_BOND_PATH = BLOCKS.register("granite_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> GRANITE_RUNNING_BOND_SLAB = BLOCKS.register("granite_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> GRANITE_RUNNING_BOND = ENGRAVED_BLOCKS.register("granite_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> SANDSTONE_RUNNING_BOND_PATH = BLOCKS.register("sandstone_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> SANDSTONE_RUNNING_BOND_SLAB = BLOCKS.register("sandstone_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> SANDSTONE_RUNNING_BOND = ENGRAVED_BLOCKS.register("sandstone_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> RED_SANDSTONE_RUNNING_BOND_PATH = BLOCKS.register("red_sandstone_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> RED_SANDSTONE_RUNNING_BOND_SLAB = BLOCKS.register("red_sandstone_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> RED_SANDSTONE_RUNNING_BOND = ENGRAVED_BLOCKS.register("red_sandstone_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> BRICK_RUNNING_BOND_PATH = BLOCKS.register("brick_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> BRICK_RUNNING_BOND_SLAB = BLOCKS.register("brick_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> BRICK_RUNNING_BOND = ENGRAVED_BLOCKS.register("brick_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> STONE_RUNNING_BOND_PATH = BLOCKS.register("stone_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> STONE_RUNNING_BOND_SLAB = BLOCKS.register("stone_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> STONE_RUNNING_BOND = ENGRAVED_BLOCKS.register("stone_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> MOSSY_STONE_RUNNING_BOND_PATH = BLOCKS.register("mossy_stone_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> MOSSY_STONE_RUNNING_BOND_SLAB = BLOCKS.register("mossy_stone_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> MOSSY_STONE_RUNNING_BOND = ENGRAVED_BLOCKS.register("mossy_stone_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_RUNNING_BOND_PATH = BLOCKS.register("cobbled_deepslate_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_RUNNING_BOND_SLAB = BLOCKS.register("cobbled_deepslate_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_RUNNING_BOND = ENGRAVED_BLOCKS.register("cobbled_deepslate_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> DEEPSLATE_RUNNING_BOND_PATH = BLOCKS.register("deepslate_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DEEPSLATE_RUNNING_BOND_SLAB = BLOCKS.register("deepslate_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DEEPSLATE_RUNNING_BOND = ENGRAVED_BLOCKS.register("deepslate_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> BLACKSTONE_RUNNING_BOND_PATH = BLOCKS.register("blackstone_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> BLACKSTONE_RUNNING_BOND_SLAB = BLOCKS.register("blackstone_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> BLACKSTONE_RUNNING_BOND = ENGRAVED_BLOCKS.register("blackstone_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> DARK_PRISMARINE_RUNNING_BOND_PATH = BLOCKS.register("dark_prismarine_running_bond_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_RUNNING_BOND_SLAB = BLOCKS.register("dark_prismarine_running_bond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_RUNNING_BOND = ENGRAVED_BLOCKS.register("dark_prismarine_running_bond", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	// Paths 1.0.4

	public static final RegistryObject<Block> ANDESITE_STREWN_ROCKY_PATH = BLOCKS.register("andesite_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> DIORITE_STREWN_ROCKY_PATH = BLOCKS.register("diorite_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> GRANITE_STREWN_ROCKY_PATH = BLOCKS.register("granite_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> SANDSTONE_STREWN_ROCKY_PATH = BLOCKS.register("sandstone_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_STREWN_ROCKY_PATH = BLOCKS.register("red_sandstone_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> BRICK_STREWN_ROCKY_PATH = BLOCKS.register("brick_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> STONE_STREWN_ROCKY_PATH = BLOCKS.register("stone_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> MOSSY_STONE_STREWN_ROCKY_PATH = BLOCKS.register("mossy_stone_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_STREWN_ROCKY_PATH = BLOCKS.register("cobbled_deepslate_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_STREWN_ROCKY_PATH = BLOCKS.register("deepslate_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> BLACKSTONE_STREWN_ROCKY_PATH = BLOCKS.register("blackstone_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_STREWN_ROCKY_PATH = BLOCKS.register("dark_prismarine_strewn_rocky_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
		
			

	public static final RegistryObject<Block> ANDESITE_WINDMILL_WEAVE_PATH = BLOCKS.register("andesite_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_WINDMILL_WEAVE_SLAB = BLOCKS.register("andesite_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("andesite_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));

	public static final RegistryObject<Block> DIORITE_WINDMILL_WEAVE_PATH = BLOCKS.register("diorite_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_WINDMILL_WEAVE_SLAB = BLOCKS.register("diorite_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("diorite_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));

	public static final RegistryObject<Block> GRANITE_WINDMILL_WEAVE_PATH = BLOCKS.register("granite_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_WINDMILL_WEAVE_SLAB = BLOCKS.register("granite_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("granite_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

	public static final RegistryObject<Block> SANDSTONE_WINDMILL_WEAVE_PATH = BLOCKS.register("sandstone_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_WINDMILL_WEAVE_SLAB = BLOCKS.register("sandstone_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("sandstone_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

	public static final RegistryObject<Block> RED_SANDSTONE_WINDMILL_WEAVE_PATH = BLOCKS.register("red_sandstone_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_WINDMILL_WEAVE_SLAB = BLOCKS.register("red_sandstone_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("red_sandstone_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

	public static final RegistryObject<Block> BRICK_WINDMILL_WEAVE_PATH = BLOCKS.register("brick_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_WINDMILL_WEAVE_SLAB = BLOCKS.register("brick_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("brick_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	public static final RegistryObject<Block> STONE_WINDMILL_WEAVE_PATH = BLOCKS.register("stone_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> STONE_WINDMILL_WEAVE_SLAB = BLOCKS.register("stone_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> STONE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("stone_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> MOSSY_STONE_WINDMILL_WEAVE_PATH = BLOCKS.register("mossy_stone_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_STONE_WINDMILL_WEAVE_SLAB = BLOCKS.register("mossy_stone_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_STONE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("mossy_stone_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_WINDMILL_WEAVE_PATH = BLOCKS.register("cobbled_deepslate_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_WINDMILL_WEAVE_SLAB = BLOCKS.register("cobbled_deepslate_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("cobbled_deepslate_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));

	public static final RegistryObject<Block> DEEPSLATE_WINDMILL_WEAVE_PATH = BLOCKS.register("deepslate_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_WINDMILL_WEAVE_SLAB = BLOCKS.register("deepslate_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("deepslate_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

	public static final RegistryObject<Block> BLACKSTONE_WINDMILL_WEAVE_PATH = BLOCKS.register("blackstone_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_WINDMILL_WEAVE_SLAB = BLOCKS.register("blackstone_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("blackstone_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));

	public static final RegistryObject<Block> DARK_PRISMARINE_WINDMILL_WEAVE_PATH = BLOCKS.register("dark_prismarine_windmill_weave_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_WINDMILL_WEAVE_SLAB = BLOCKS.register("dark_prismarine_windmill_weave_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_WINDMILL_WEAVE = ENGRAVED_BLOCKS.register("dark_prismarine_windmill_weave", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	
	
	
	
	public static final RegistryObject<Block> ANDESITE_FLAGSTONE_PATH = BLOCKS.register("andesite_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_FLAGSTONE_SLAB = BLOCKS.register("andesite_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_FLAGSTONE = ENGRAVED_BLOCKS.register("andesite_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));

	public static final RegistryObject<Block> DIORITE_FLAGSTONE_PATH = BLOCKS.register("diorite_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_FLAGSTONE_SLAB = BLOCKS.register("diorite_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_FLAGSTONE = ENGRAVED_BLOCKS.register("diorite_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));

	public static final RegistryObject<Block> GRANITE_FLAGSTONE_PATH = BLOCKS.register("granite_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_FLAGSTONE_SLAB = BLOCKS.register("granite_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_FLAGSTONE = ENGRAVED_BLOCKS.register("granite_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

	public static final RegistryObject<Block> SANDSTONE_FLAGSTONE_PATH = BLOCKS.register("sandstone_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_FLAGSTONE_SLAB = BLOCKS.register("sandstone_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_FLAGSTONE = ENGRAVED_BLOCKS.register("sandstone_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

	public static final RegistryObject<Block> RED_SANDSTONE_FLAGSTONE_PATH = BLOCKS.register("red_sandstone_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_FLAGSTONE_SLAB = BLOCKS.register("red_sandstone_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_FLAGSTONE = ENGRAVED_BLOCKS.register("red_sandstone_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

	public static final RegistryObject<Block> BRICK_FLAGSTONE_PATH = BLOCKS.register("brick_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_FLAGSTONE_SLAB = BLOCKS.register("brick_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_FLAGSTONE = ENGRAVED_BLOCKS.register("brick_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	public static final RegistryObject<Block> STONE_FLAGSTONE_PATH = BLOCKS.register("stone_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> STONE_FLAGSTONE_SLAB = BLOCKS.register("stone_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> STONE_FLAGSTONE = ENGRAVED_BLOCKS.register("stone_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> MOSSY_STONE_FLAGSTONE_PATH = BLOCKS.register("mossy_stone_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_STONE_FLAGSTONE_SLAB = BLOCKS.register("mossy_stone_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_STONE_FLAGSTONE = ENGRAVED_BLOCKS.register("mossy_stone_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_FLAGSTONE_PATH = BLOCKS.register("cobbled_deepslate_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_FLAGSTONE_SLAB = BLOCKS.register("cobbled_deepslate_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_FLAGSTONE = ENGRAVED_BLOCKS.register("cobbled_deepslate_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));

	public static final RegistryObject<Block> DEEPSLATE_FLAGSTONE_PATH = BLOCKS.register("deepslate_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_FLAGSTONE_SLAB = BLOCKS.register("deepslate_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_FLAGSTONE = ENGRAVED_BLOCKS.register("deepslate_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

	public static final RegistryObject<Block> BLACKSTONE_FLAGSTONE_PATH = BLOCKS.register("blackstone_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_FLAGSTONE_SLAB = BLOCKS.register("blackstone_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_FLAGSTONE = ENGRAVED_BLOCKS.register("blackstone_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));

	public static final RegistryObject<Block> DARK_PRISMARINE_FLAGSTONE_PATH = BLOCKS.register("dark_prismarine_flagstone_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_FLAGSTONE_SLAB = BLOCKS.register("dark_prismarine_flagstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_FLAGSTONE = ENGRAVED_BLOCKS.register("dark_prismarine_flagstone", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	
	
	
	public static final RegistryObject<Block> ANDESITE_CRYSTAL_FLOOR_PATH = BLOCKS.register("andesite_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("andesite_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> ANDESITE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("andesite_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));

	public static final RegistryObject<Block> DIORITE_CRYSTAL_FLOOR_PATH = BLOCKS.register("diorite_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("diorite_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> DIORITE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("diorite_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));

	public static final RegistryObject<Block> GRANITE_CRYSTAL_FLOOR_PATH = BLOCKS.register("granite_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("granite_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> GRANITE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("granite_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

	public static final RegistryObject<Block> SANDSTONE_CRYSTAL_FLOOR_PATH = BLOCKS.register("sandstone_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("sandstone_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> SANDSTONE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("sandstone_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

	public static final RegistryObject<Block> RED_SANDSTONE_CRYSTAL_FLOOR_PATH = BLOCKS.register("red_sandstone_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("red_sandstone_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("red_sandstone_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

	public static final RegistryObject<Block> BRICK_CRYSTAL_FLOOR_PATH = BLOCKS.register("brick_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_CRYSTAL_FLOOR_SLAB = BLOCKS.register("brick_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> BRICK_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("brick_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	public static final RegistryObject<Block> STONE_CRYSTAL_FLOOR_PATH = BLOCKS.register("stone_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> STONE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("stone_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> STONE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("stone_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> MOSSY_STONE_CRYSTAL_FLOOR_PATH = BLOCKS.register("mossy_stone_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_STONE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("mossy_stone_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> MOSSY_STONE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("mossy_stone_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CRYSTAL_FLOOR_PATH = BLOCKS.register("cobbled_deepslate_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("cobbled_deepslate_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("cobbled_deepslate_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));

	public static final RegistryObject<Block> DEEPSLATE_CRYSTAL_FLOOR_PATH = BLOCKS.register("deepslate_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("deepslate_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("deepslate_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

	public static final RegistryObject<Block> BLACKSTONE_CRYSTAL_FLOOR_PATH = BLOCKS.register("blackstone_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("blackstone_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> BLACKSTONE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("blackstone_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));

	public static final RegistryObject<Block> DARK_PRISMARINE_CRYSTAL_FLOOR_PATH = BLOCKS.register("dark_prismarine_crystal_floor_path", () -> new PathBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_CRYSTAL_FLOOR_SLAB = BLOCKS.register("dark_prismarine_crystal_floor_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_CRYSTAL_FLOOR = ENGRAVED_BLOCKS.register("dark_prismarine_crystal_floor", () -> new EngravedBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	//1.1.0 stuff

	public static final RegistryObject<Block> PODZOL_PATH_BLOCK = FLATTENED_BLOCKS.register("podzol_path_block", () -> new FlattenedBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
	public static final RegistryObject<Block> DIRT_PATH_BLOCK = FLATTENED_BLOCKS.register("dirt_path_block", () -> new FlattenedBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
	public static final RegistryObject<Block> GRAVEL_PATH_BLOCK = FLATTENED_BLOCKS.register("gravel_path_block", () -> new FlattenedBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
	public static final RegistryObject<Block> SAND_PATH_BLOCK = FLATTENED_BLOCKS.register("sand_path_block", () -> new FlattenedBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));
	public static final RegistryObject<Block> RED_SAND_PATH_BLOCK = FLATTENED_BLOCKS.register("red_sand_path_block", () -> new FlattenedBlock(BlockBehaviour.Properties.copy(Blocks.RED_SAND)));

	public static final RegistryObject<Block> ANDESITE_RUNNING_BOND_STAIRS = BLOCKS.register("andesite_running_bond_stairs", () -> new StairBlock(Blocks.ANDESITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> DIORITE_RUNNING_BOND_STAIRS = BLOCKS.register("diorite_running_bond_stairs", () -> new StairBlock(Blocks.DIORITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> GRANITE_RUNNING_BOND_STAIRS = BLOCKS.register("granite_running_bond_stairs", () -> new StairBlock(Blocks.GRANITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> SANDSTONE_RUNNING_BOND_STAIRS = BLOCKS.register("sandstone_running_bond_stairs", () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_RUNNING_BOND_STAIRS = BLOCKS.register("red_sandstone_running_bond_stairs", () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> BRICK_RUNNING_BOND_STAIRS = BLOCKS.register("brick_running_bond_stairs", () -> new StairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> STONE_RUNNING_BOND_STAIRS = BLOCKS.register("stone_running_bond_stairs", () -> new StairBlock(Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> MOSSY_STONE_RUNNING_BOND_STAIRS = BLOCKS.register("mossy_stone_running_bond_stairs", () -> new StairBlock(Blocks.MOSSY_COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_RUNNING_BOND_STAIRS = BLOCKS.register("cobbled_deepslate_running_bond_stairs", () -> new StairBlock(Blocks.COBBLED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_RUNNING_BOND_STAIRS = BLOCKS.register("deepslate_running_bond_stairs", () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> BLACKSTONE_RUNNING_BOND_STAIRS = BLOCKS.register("blackstone_running_bond_stairs", () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_RUNNING_BOND_STAIRS = BLOCKS.register("dark_prismarine_running_bond_stairs", () -> new StairBlock(Blocks.DARK_PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> ANDESITE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("andesite_windmill_weave_stairs", () -> new StairBlock(Blocks.ANDESITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> DIORITE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("diorite_windmill_weave_stairs", () -> new StairBlock(Blocks.DIORITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> GRANITE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("granite_windmill_weave_stairs", () -> new StairBlock(Blocks.GRANITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> SANDSTONE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("sandstone_windmill_weave_stairs", () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("red_sandstone_windmill_weave_stairs", () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> BRICK_WINDMILL_WEAVE_STAIRS = BLOCKS.register("brick_windmill_weave_stairs", () -> new StairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> STONE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("stone_windmill_weave_stairs", () -> new StairBlock(Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> MOSSY_STONE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("mossy_stone_windmill_weave_stairs", () -> new StairBlock(Blocks.MOSSY_COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("cobbled_deepslate_windmill_weave_stairs", () -> new StairBlock(Blocks.COBBLED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("deepslate_windmill_weave_stairs", () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> BLACKSTONE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("blackstone_windmill_weave_stairs", () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_WINDMILL_WEAVE_STAIRS = BLOCKS.register("dark_prismarine_windmill_weave_stairs", () -> new StairBlock(Blocks.DARK_PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> ANDESITE_FLAGSTONE_STAIRS = BLOCKS.register("andesite_flagstone_stairs", () -> new StairBlock(Blocks.ANDESITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> DIORITE_FLAGSTONE_STAIRS = BLOCKS.register("diorite_flagstone_stairs", () -> new StairBlock(Blocks.DIORITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> GRANITE_FLAGSTONE_STAIRS = BLOCKS.register("granite_flagstone_stairs", () -> new StairBlock(Blocks.GRANITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> SANDSTONE_FLAGSTONE_STAIRS = BLOCKS.register("sandstone_flagstone_stairs", () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_FLAGSTONE_STAIRS = BLOCKS.register("red_sandstone_flagstone_stairs", () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> BRICK_FLAGSTONE_STAIRS = BLOCKS.register("brick_flagstone_stairs", () -> new StairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> STONE_FLAGSTONE_STAIRS = BLOCKS.register("stone_flagstone_stairs", () -> new StairBlock(Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> MOSSY_STONE_FLAGSTONE_STAIRS = BLOCKS.register("mossy_stone_flagstone_stairs", () -> new StairBlock(Blocks.MOSSY_COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_FLAGSTONE_STAIRS = BLOCKS.register("cobbled_deepslate_flagstone_stairs", () -> new StairBlock(Blocks.COBBLED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_FLAGSTONE_STAIRS = BLOCKS.register("deepslate_flagstone_stairs", () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> BLACKSTONE_FLAGSTONE_STAIRS = BLOCKS.register("blackstone_flagstone_stairs", () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_FLAGSTONE_STAIRS = BLOCKS.register("dark_prismarine_flagstone_stairs", () -> new StairBlock(Blocks.DARK_PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

	public static final RegistryObject<Block> ANDESITE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("andesite_crystal_floor_stairs", () -> new StairBlock(Blocks.ANDESITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ANDESITE)));
	public static final RegistryObject<Block> DIORITE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("diorite_crystal_floor_stairs", () -> new StairBlock(Blocks.DIORITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIORITE)));
	public static final RegistryObject<Block> GRANITE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("granite_crystal_floor_stairs", () -> new StairBlock(Blocks.GRANITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE)));
	public static final RegistryObject<Block> SANDSTONE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("sandstone_crystal_floor_stairs", () -> new StairBlock(Blocks.SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
	public static final RegistryObject<Block> RED_SANDSTONE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("red_sandstone_crystal_floor_stairs", () -> new StairBlock(Blocks.RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));
	public static final RegistryObject<Block> BRICK_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("brick_crystal_floor_stairs", () -> new StairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
	public static final RegistryObject<Block> STONE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("stone_crystal_floor_stairs", () -> new StairBlock(Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
	public static final RegistryObject<Block> MOSSY_STONE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("mossy_stone_crystal_floor_stairs", () -> new StairBlock(Blocks.MOSSY_COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("cobbled_deepslate_crystal_floor_stairs", () -> new StairBlock(Blocks.COBBLED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
	public static final RegistryObject<Block> DEEPSLATE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("deepslate_crystal_floor_stairs", () -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
	public static final RegistryObject<Block> BLACKSTONE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("blackstone_crystal_floor_stairs", () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));
	public static final RegistryObject<Block> DARK_PRISMARINE_CRYSTAL_FLOOR_STAIRS = BLOCKS.register("dark_prismarine_crystal_floor_stairs", () -> new StairBlock(Blocks.DARK_PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

}
