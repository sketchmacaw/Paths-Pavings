package com.mcwpaths.kikoz.init;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.objects.EngravedBlock;
import com.mcwpaths.kikoz.objects.FacingPathBlock;
import com.mcwpaths.kikoz.objects.FlattenedBlock;
import com.mcwpaths.kikoz.objects.PathBlock;
import com.mcwpaths.kikoz.util.EngravedBlockTooltip;
import com.mcwpaths.kikoz.util.FlattenedBlockTooltip;
import com.mcwpaths.kikoz.util.PathGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.List;

public class BlockInit {

	public static final Block OAK_PLANKS_PATH = registerBlock("oak_planks_path", new FacingPathBlock(Block.Settings.copy(Blocks.OAK_PLANKS)), PathGroup.PATHGROUP);
	public static final Block SPRUCE_PLANKS_PATH = registerBlock("spruce_planks_path", new FacingPathBlock(Block.Settings.copy(Blocks.SPRUCE_PLANKS)), PathGroup.PATHGROUP);
	public static final Block BIRCH_PLANKS_PATH = registerBlock("birch_planks_path", new FacingPathBlock(Block.Settings.copy(Blocks.BIRCH_PLANKS)), PathGroup.PATHGROUP);
	public static final Block JUNGLE_PLANKS_PATH = registerBlock("jungle_planks_path", new FacingPathBlock(Block.Settings.copy(Blocks.JUNGLE_PLANKS)), PathGroup.PATHGROUP);
	public static final Block ACACIA_PLANKS_PATH = registerBlock("acacia_planks_path", new FacingPathBlock(Block.Settings.copy(Blocks.ACACIA_PLANKS)), PathGroup.PATHGROUP);
	public static final Block DARK_OAK_PLANKS_PATH = registerBlock("dark_oak_planks_path", new FacingPathBlock(Block.Settings.copy(Blocks.DARK_OAK_PLANKS)), PathGroup.PATHGROUP);
	public static final Block CRIMSON_PLANKS_PATH = registerBlock("crimson_planks_path", new FacingPathBlock(Block.Settings.copy(Blocks.CRIMSON_PLANKS)), PathGroup.PATHGROUP);
	public static final Block WARPED_PLANKS_PATH = registerBlock("warped_planks_path", new FacingPathBlock(Block.Settings.copy(Blocks.WARPED_PLANKS)), PathGroup.PATHGROUP);
	public static final Block MANGROVE_PLANKS_PATH = registerBlock("mangrove_planks_path", new FacingPathBlock(Block.Settings.copy(Blocks.MANGROVE_PLANKS)), PathGroup.PATHGROUP);

	//pavings

	public static final Block ANDESITE_DIAMOND_PAVING = registerBlock("andesite_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_BASKET_WEAVE_PAVING = registerBlock("andesite_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_SQUARE_PAVING = registerBlock("andesite_square_paving", new PathBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_HONEYCOMB_PAVING = registerBlock("andesite_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_CLOVER_PAVING = registerBlock("andesite_clover_paving", new PathBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_DUMBLE_PAVING = registerBlock("andesite_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);

	public static final Block DIORITE_DIAMOND_PAVING = registerBlock("diorite_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_BASKET_WEAVE_PAVING = registerBlock("diorite_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_SQUARE_PAVING = registerBlock("diorite_square_paving", new PathBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_HONEYCOMB_PAVING = registerBlock("diorite_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_CLOVER_PAVING = registerBlock("diorite_clover_paving", new PathBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_DUMBLE_PAVING = registerBlock("diorite_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);

	public static final Block GRANITE_DIAMOND_PAVING = registerBlock("granite_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_BASKET_WEAVE_PAVING = registerBlock("granite_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_SQUARE_PAVING = registerBlock("granite_square_paving", new PathBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_HONEYCOMB_PAVING = registerBlock("granite_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_CLOVER_PAVING = registerBlock("granite_clover_paving", new PathBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_DUMBLE_PAVING = registerBlock("granite_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);

	public static final Block SANDSTONE_DIAMOND_PAVING = registerBlock("sandstone_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_BASKET_WEAVE_PAVING = registerBlock("sandstone_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_SQUARE_PAVING = registerBlock("sandstone_square_paving", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_HONEYCOMB_PAVING = registerBlock("sandstone_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_CLOVER_PAVING = registerBlock("sandstone_clover_paving", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_DUMBLE_PAVING = registerBlock("sandstone_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);

	public static final Block RED_SANDSTONE_DIAMOND_PAVING = registerBlock("red_sandstone_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_BASKET_WEAVE_PAVING = registerBlock("red_sandstone_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_SQUARE_PAVING = registerBlock("red_sandstone_square_paving", new PathBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_HONEYCOMB_PAVING = registerBlock("red_sandstone_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_CLOVER_PAVING = registerBlock("red_sandstone_clover_paving", new PathBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_DUMBLE_PAVING = registerBlock("red_sandstone_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);

	public static final Block BRICK_DIAMOND_PAVING = registerBlock("brick_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_BASKET_WEAVE_PAVING = registerBlock("brick_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_SQUARE_PAVING = registerBlock("brick_square_paving", new PathBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_HONEYCOMB_PAVING = registerBlock("brick_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_CLOVER_PAVING = registerBlock("brick_clover_paving", new PathBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_DUMBLE_PAVING = registerBlock("brick_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);

	public static final Block COBBLESTONE_DIAMOND_PAVING = registerBlock("cobblestone_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block COBBLESTONE_BASKET_WEAVE_PAVING = registerBlock("cobblestone_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block COBBLESTONE_SQUARE_PAVING = registerBlock("cobblestone_square_paving", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block COBBLESTONE_HONEYCOMB_PAVING = registerBlock("cobblestone_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block COBBLESTONE_CLOVER_PAVING = registerBlock("cobblestone_clover_paving", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block COBBLESTONE_DUMBLE_PAVING = registerBlock("cobblestone_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);

	public static final Block MOSSY_COBBLESTONE_DIAMOND_PAVING = registerBlock("mossy_cobblestone_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_COBBLESTONE_BASKET_WEAVE_PAVING = registerBlock("mossy_cobblestone_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_COBBLESTONE_SQUARE_PAVING = registerBlock("mossy_cobblestone_square_paving", new PathBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_COBBLESTONE_HONEYCOMB_PAVING = registerBlock("mossy_cobblestone_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_COBBLESTONE_CLOVER_PAVING = registerBlock("mossy_cobblestone_clover_paving", new PathBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_COBBLESTONE_DUMBLE_PAVING = registerBlock("mossy_cobblestone_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);

	public static final Block COBBLED_DEEPSLATE_DIAMOND_PAVING = registerBlock("cobbled_deepslate_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_BASKET_WEAVE_PAVING = registerBlock("cobbled_deepslate_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_SQUARE_PAVING = registerBlock("cobbled_deepslate_square_paving", new PathBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_HONEYCOMB_PAVING = registerBlock("cobbled_deepslate_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_CLOVER_PAVING = registerBlock("cobbled_deepslate_clover_paving", new PathBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_DUMBLE_PAVING = registerBlock("cobbled_deepslate_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);

	public static final Block DEEPSLATE_DIAMOND_PAVING = registerBlock("deepslate_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_BASKET_WEAVE_PAVING = registerBlock("deepslate_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_SQUARE_PAVING = registerBlock("deepslate_square_paving", new PathBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_HONEYCOMB_PAVING = registerBlock("deepslate_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_CLOVER_PAVING = registerBlock("deepslate_clover_paving", new PathBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_DUMBLE_PAVING = registerBlock("deepslate_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);

	public static final Block MUD_BRICK_DIAMOND_PAVING = registerBlock("mud_brick_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_BASKET_WEAVE_PAVING = registerBlock("mud_brick_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_SQUARE_PAVING = registerBlock("mud_brick_square_paving", new PathBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_HONEYCOMB_PAVING = registerBlock("mud_brick_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_CLOVER_PAVING = registerBlock("mud_brick_clover_paving", new PathBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_DUMBLE_PAVING = registerBlock("mud_brick_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);

	//1.0.2 Update

	public static final Block BLACKSTONE_DIAMOND_PAVING = registerBlock("blackstone_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_BASKET_WEAVE_PAVING = registerBlock("blackstone_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_SQUARE_PAVING = registerBlock("blackstone_square_paving", new PathBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_HONEYCOMB_PAVING = registerBlock("blackstone_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_CLOVER_PAVING = registerBlock("blackstone_clover_paving", new PathBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_DUMBLE_PAVING = registerBlock("blackstone_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);

	public static final Block DARK_PRISMARINE_DIAMOND_PAVING = registerBlock("dark_prismarine_diamond_paving", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_BASKET_WEAVE_PAVING = registerBlock("dark_prismarine_basket_weave_paving", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_SQUARE_PAVING = registerBlock("dark_prismarine_square_paving", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_HONEYCOMB_PAVING = registerBlock("dark_prismarine_honeycomb_paving", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_CLOVER_PAVING = registerBlock("dark_prismarine_clover_paving", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_DUMBLE_PAVING = registerBlock("dark_prismarine_dumble_paving", new FacingPathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	//1.0.3 Update

	public static final Block ANDESITE_RUNNING_BOND_PATH = registerBlock("andesite_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_RUNNING_BOND_SLAB = registerBlock("andesite_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_RUNNING_BOND = registerEngravedBlock("andesite_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block DIORITE_RUNNING_BOND_PATH = registerBlock("diorite_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_RUNNING_BOND_SLAB = registerBlock("diorite_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_RUNNING_BOND = registerEngravedBlock("diorite_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block GRANITE_RUNNING_BOND_PATH = registerBlock("granite_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_RUNNING_BOND_SLAB = registerBlock("granite_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_RUNNING_BOND = registerEngravedBlock("granite_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block SANDSTONE_RUNNING_BOND_PATH = registerBlock("sandstone_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_RUNNING_BOND_SLAB = registerBlock("sandstone_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_RUNNING_BOND = registerEngravedBlock("sandstone_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block RED_SANDSTONE_RUNNING_BOND_PATH = registerBlock("red_sandstone_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_RUNNING_BOND_SLAB = registerBlock("red_sandstone_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_RUNNING_BOND = registerEngravedBlock("red_sandstone_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block BRICK_RUNNING_BOND_PATH = registerBlock("brick_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block BRICK_RUNNING_BOND_SLAB = registerBlock("brick_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block BRICK_RUNNING_BOND = registerEngravedBlock("brick_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block STONE_RUNNING_BOND_PATH = registerBlock("stone_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block STONE_RUNNING_BOND_SLAB = registerBlock("stone_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block STONE_RUNNING_BOND = registerEngravedBlock("stone_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block MOSSY_STONE_RUNNING_BOND_PATH = registerBlock("mossy_stone_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_RUNNING_BOND_SLAB = registerBlock("mossy_stone_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_RUNNING_BOND = registerEngravedBlock("mossy_stone_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block COBBLED_DEEPSLATE_RUNNING_BOND_PATH = registerBlock("cobbled_deepslate_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_RUNNING_BOND_SLAB = registerBlock("cobbled_deepslate_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_RUNNING_BOND = registerEngravedBlock("cobbled_deepslate_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block DEEPSLATE_RUNNING_BOND_PATH = registerBlock("deepslate_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_RUNNING_BOND_SLAB = registerBlock("deepslate_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_RUNNING_BOND = registerEngravedBlock("deepslate_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block MUD_BRICK_RUNNING_BOND_PATH = registerBlock("mud_brick_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_RUNNING_BOND_SLAB = registerBlock("mud_brick_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_RUNNING_BOND = registerEngravedBlock("mud_brick_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block BLACKSTONE_RUNNING_BOND_PATH = registerBlock("blackstone_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_RUNNING_BOND_SLAB = registerBlock("blackstone_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_RUNNING_BOND = registerEngravedBlock("blackstone_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block DARK_PRISMARINE_RUNNING_BOND_PATH = registerBlock("dark_prismarine_running_bond_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_RUNNING_BOND_SLAB = registerBlock("dark_prismarine_running_bond_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_RUNNING_BOND = registerEngravedBlock("dark_prismarine_running_bond", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	// Paths 1.1.0

	public static final Block ANDESITE_STREWN_ROCKY_PATH = registerBlock("andesite_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_STREWN_ROCKY_PATH = registerBlock("diorite_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_STREWN_ROCKY_PATH = registerBlock("granite_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_STREWN_ROCKY_PATH = registerBlock("sandstone_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_STREWN_ROCKY_PATH = registerBlock("red_sandstone_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block BRICK_STREWN_ROCKY_PATH = registerBlock("brick_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block STONE_STREWN_ROCKY_PATH = registerBlock("stone_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_STREWN_ROCKY_PATH = registerBlock("mossy_stone_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_STREWN_ROCKY_PATH = registerBlock("cobbled_deepslate_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_STREWN_ROCKY_PATH = registerBlock("deepslate_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_STREWN_ROCKY_PATH = registerBlock("mud_brick_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_STREWN_ROCKY_PATH = registerBlock("blackstone_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_STREWN_ROCKY_PATH = registerBlock("dark_prismarine_strewn_rocky_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);



	public static final Block ANDESITE_WINDMILL_WEAVE_PATH = registerBlock("andesite_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_WINDMILL_WEAVE_SLAB = registerBlock("andesite_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_WINDMILL_WEAVE = registerEngravedBlock("andesite_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);

	public static final Block DIORITE_WINDMILL_WEAVE_PATH = registerBlock("diorite_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_WINDMILL_WEAVE_SLAB = registerBlock("diorite_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_WINDMILL_WEAVE = registerEngravedBlock("diorite_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);

	public static final Block GRANITE_WINDMILL_WEAVE_PATH = registerBlock("granite_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_WINDMILL_WEAVE_SLAB = registerBlock("granite_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_WINDMILL_WEAVE = registerEngravedBlock("granite_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);

	public static final Block SANDSTONE_WINDMILL_WEAVE_PATH = registerBlock("sandstone_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_WINDMILL_WEAVE_SLAB = registerBlock("sandstone_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_WINDMILL_WEAVE = registerEngravedBlock("sandstone_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);

	public static final Block RED_SANDSTONE_WINDMILL_WEAVE_PATH = registerBlock("red_sandstone_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_WINDMILL_WEAVE_SLAB = registerBlock("red_sandstone_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_WINDMILL_WEAVE = registerEngravedBlock("red_sandstone_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);

	public static final Block BRICK_WINDMILL_WEAVE_PATH = registerBlock("brick_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_WINDMILL_WEAVE_SLAB = registerBlock("brick_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_WINDMILL_WEAVE = registerEngravedBlock("brick_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);

	public static final Block STONE_WINDMILL_WEAVE_PATH = registerBlock("stone_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block STONE_WINDMILL_WEAVE_SLAB = registerBlock("stone_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block STONE_WINDMILL_WEAVE = registerEngravedBlock("stone_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);

	public static final Block MOSSY_STONE_WINDMILL_WEAVE_PATH = registerBlock("mossy_stone_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_WINDMILL_WEAVE_SLAB = registerBlock("mossy_stone_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_WINDMILL_WEAVE = registerEngravedBlock("mossy_stone_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);

	public static final Block COBBLED_DEEPSLATE_WINDMILL_WEAVE_PATH = registerBlock("cobbled_deepslate_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_WINDMILL_WEAVE_SLAB = registerBlock("cobbled_deepslate_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_WINDMILL_WEAVE = registerEngravedBlock("cobbled_deepslate_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);

	public static final Block DEEPSLATE_WINDMILL_WEAVE_PATH = registerBlock("deepslate_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_WINDMILL_WEAVE_SLAB = registerBlock("deepslate_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_WINDMILL_WEAVE = registerEngravedBlock("deepslate_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);

	public static final Block MUD_BRICK_WINDMILL_WEAVE_PATH = registerBlock("mud_brick_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_WINDMILL_WEAVE_SLAB = registerBlock("mud_brick_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_WINDMILL_WEAVE = registerEngravedBlock("mud_brick_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);

	public static final Block BLACKSTONE_WINDMILL_WEAVE_PATH = registerBlock("blackstone_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_WINDMILL_WEAVE_SLAB = registerBlock("blackstone_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_WINDMILL_WEAVE = registerEngravedBlock("blackstone_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);

	public static final Block DARK_PRISMARINE_WINDMILL_WEAVE_PATH = registerBlock("dark_prismarine_windmill_weave_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_WINDMILL_WEAVE_SLAB = registerBlock("dark_prismarine_windmill_weave_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_WINDMILL_WEAVE = registerEngravedBlock("dark_prismarine_windmill_weave", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);





	public static final Block ANDESITE_FLAGSTONE_PATH = registerBlock("andesite_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_FLAGSTONE_SLAB = registerBlock("andesite_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_FLAGSTONE = registerEngravedBlock("andesite_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);

	public static final Block DIORITE_FLAGSTONE_PATH = registerBlock("diorite_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_FLAGSTONE_SLAB = registerBlock("diorite_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_FLAGSTONE = registerEngravedBlock("diorite_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);

	public static final Block GRANITE_FLAGSTONE_PATH = registerBlock("granite_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_FLAGSTONE_SLAB = registerBlock("granite_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_FLAGSTONE = registerEngravedBlock("granite_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);

	public static final Block SANDSTONE_FLAGSTONE_PATH = registerBlock("sandstone_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_FLAGSTONE_SLAB = registerBlock("sandstone_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_FLAGSTONE = registerEngravedBlock("sandstone_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);

	public static final Block RED_SANDSTONE_FLAGSTONE_PATH = registerBlock("red_sandstone_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_FLAGSTONE_SLAB = registerBlock("red_sandstone_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_FLAGSTONE = registerEngravedBlock("red_sandstone_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);

	public static final Block BRICK_FLAGSTONE_PATH = registerBlock("brick_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_FLAGSTONE_SLAB = registerBlock("brick_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_FLAGSTONE = registerEngravedBlock("brick_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);

	public static final Block STONE_FLAGSTONE_PATH = registerBlock("stone_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block STONE_FLAGSTONE_SLAB = registerBlock("stone_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block STONE_FLAGSTONE = registerEngravedBlock("stone_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);

	public static final Block MOSSY_STONE_FLAGSTONE_PATH = registerBlock("mossy_stone_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_FLAGSTONE_SLAB = registerBlock("mossy_stone_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_FLAGSTONE = registerEngravedBlock("mossy_stone_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);

	public static final Block COBBLED_DEEPSLATE_FLAGSTONE_PATH = registerBlock("cobbled_deepslate_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_FLAGSTONE_SLAB = registerBlock("cobbled_deepslate_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_FLAGSTONE = registerEngravedBlock("cobbled_deepslate_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);

	public static final Block DEEPSLATE_FLAGSTONE_PATH = registerBlock("deepslate_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_FLAGSTONE_SLAB = registerBlock("deepslate_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_FLAGSTONE = registerEngravedBlock("deepslate_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);

	public static final Block MUD_BRICK_FLAGSTONE_PATH = registerBlock("mud_brick_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_FLAGSTONE_SLAB = registerBlock("mud_brick_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_FLAGSTONE = registerEngravedBlock("mud_brick_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);

	public static final Block BLACKSTONE_FLAGSTONE_PATH = registerBlock("blackstone_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_FLAGSTONE_SLAB = registerBlock("blackstone_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_FLAGSTONE = registerEngravedBlock("blackstone_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);

	public static final Block DARK_PRISMARINE_FLAGSTONE_PATH = registerBlock("dark_prismarine_flagstone_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_FLAGSTONE_SLAB = registerBlock("dark_prismarine_flagstone_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_FLAGSTONE = registerEngravedBlock("dark_prismarine_flagstone", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);




	public static final Block ANDESITE_CRYSTAL_FLOOR_PATH = registerBlock("andesite_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_CRYSTAL_FLOOR_SLAB = registerBlock("andesite_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block ANDESITE_CRYSTAL_FLOOR = registerEngravedBlock("andesite_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);

	public static final Block DIORITE_CRYSTAL_FLOOR_PATH = registerBlock("diorite_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_CRYSTAL_FLOOR_SLAB = registerBlock("diorite_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_CRYSTAL_FLOOR = registerEngravedBlock("diorite_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);

	public static final Block GRANITE_CRYSTAL_FLOOR_PATH = registerBlock("granite_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_CRYSTAL_FLOOR_SLAB = registerBlock("granite_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_CRYSTAL_FLOOR = registerEngravedBlock("granite_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);

	public static final Block SANDSTONE_CRYSTAL_FLOOR_PATH = registerBlock("sandstone_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_CRYSTAL_FLOOR_SLAB = registerBlock("sandstone_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_CRYSTAL_FLOOR = registerEngravedBlock("sandstone_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);

	public static final Block RED_SANDSTONE_CRYSTAL_FLOOR_PATH = registerBlock("red_sandstone_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_CRYSTAL_FLOOR_SLAB = registerBlock("red_sandstone_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_CRYSTAL_FLOOR = registerEngravedBlock("red_sandstone_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);

	public static final Block BRICK_CRYSTAL_FLOOR_PATH = registerBlock("brick_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_CRYSTAL_FLOOR_SLAB = registerBlock("brick_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block BRICK_CRYSTAL_FLOOR = registerEngravedBlock("brick_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);

	public static final Block STONE_CRYSTAL_FLOOR_PATH = registerBlock("stone_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block STONE_CRYSTAL_FLOOR_SLAB = registerBlock("stone_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block STONE_CRYSTAL_FLOOR = registerEngravedBlock("stone_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);

	public static final Block MOSSY_STONE_CRYSTAL_FLOOR_PATH = registerBlock("mossy_stone_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_CRYSTAL_FLOOR_SLAB = registerBlock("mossy_stone_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_CRYSTAL_FLOOR = registerEngravedBlock("mossy_stone_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);

	public static final Block COBBLED_DEEPSLATE_CRYSTAL_FLOOR_PATH = registerBlock("cobbled_deepslate_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_CRYSTAL_FLOOR_SLAB = registerBlock("cobbled_deepslate_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_CRYSTAL_FLOOR = registerEngravedBlock("cobbled_deepslate_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);

	public static final Block DEEPSLATE_CRYSTAL_FLOOR_PATH = registerBlock("deepslate_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_CRYSTAL_FLOOR_SLAB = registerBlock("deepslate_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_CRYSTAL_FLOOR = registerEngravedBlock("deepslate_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);

	public static final Block MUD_BRICK_CRYSTAL_FLOOR_PATH = registerBlock("mud_brick_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_CRYSTAL_FLOOR_SLAB = registerBlock("mud_brick_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_CRYSTAL_FLOOR = registerEngravedBlock("mud_brick_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);

	public static final Block BLACKSTONE_CRYSTAL_FLOOR_PATH = registerBlock("blackstone_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_CRYSTAL_FLOOR_SLAB = registerBlock("blackstone_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_CRYSTAL_FLOOR = registerEngravedBlock("blackstone_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);

	public static final Block DARK_PRISMARINE_CRYSTAL_FLOOR_PATH = registerBlock("dark_prismarine_crystal_floor_path", new PathBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_CRYSTAL_FLOOR_SLAB = registerBlock("dark_prismarine_crystal_floor_slab", new SlabBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_CRYSTAL_FLOOR = registerEngravedBlock("dark_prismarine_crystal_floor", new EngravedBlock(Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	//1.1.0 stuff

	public static final Block PODZOL_PATH_BLOCK = registerFlattenedBlock("podzol_path_block", new FlattenedBlock(Block.Settings.copy(Blocks.DIRT)), PathGroup.PATHGROUP);
	public static final Block DIRT_PATH_BLOCK = registerFlattenedBlock("dirt_path_block", new FlattenedBlock(Block.Settings.copy(Blocks.DIRT)), PathGroup.PATHGROUP);
	public static final Block GRAVEL_PATH_BLOCK = registerFlattenedBlock("gravel_path_block", new FlattenedBlock(Block.Settings.copy(Blocks.GRAVEL)), PathGroup.PATHGROUP);
	public static final Block SAND_PATH_BLOCK = registerFlattenedBlock("sand_path_block", new FlattenedBlock(Block.Settings.copy(Blocks.SAND)), PathGroup.PATHGROUP);
	public static final Block RED_SAND_PATH_BLOCK = registerFlattenedBlock("red_sand_path_block", new FlattenedBlock(Block.Settings.copy(Blocks.RED_SAND)), PathGroup.PATHGROUP);

	public static final Block ANDESITE_RUNNING_BOND_STAIRS = registerBlock("andesite_running_bond_stairs", new StairsBlock(Blocks.ANDESITE.getDefaultState(), Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_RUNNING_BOND_STAIRS = registerBlock("diorite_running_bond_stairs", new StairsBlock(Blocks.DIORITE.getDefaultState(), Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_RUNNING_BOND_STAIRS = registerBlock("granite_running_bond_stairs", new StairsBlock(Blocks.GRANITE.getDefaultState(), Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_RUNNING_BOND_STAIRS = registerBlock("sandstone_running_bond_stairs", new StairsBlock(Blocks.SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_RUNNING_BOND_STAIRS = registerBlock("red_sandstone_running_bond_stairs", new StairsBlock(Blocks.RED_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block BRICK_RUNNING_BOND_STAIRS = registerBlock("brick_running_bond_stairs", new StairsBlock(Blocks.BRICKS.getDefaultState(), Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block STONE_RUNNING_BOND_STAIRS = registerBlock("stone_running_bond_stairs", new StairsBlock(Blocks.STONE.getDefaultState(), Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_RUNNING_BOND_STAIRS = registerBlock("mossy_stone_running_bond_stairs", new StairsBlock(Blocks.MOSSY_COBBLESTONE.getDefaultState(), Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_RUNNING_BOND_STAIRS = registerBlock("cobbled_deepslate_running_bond_stairs", new StairsBlock(Blocks.COBBLED_DEEPSLATE.getDefaultState(), Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_RUNNING_BOND_STAIRS = registerBlock("deepslate_running_bond_stairs", new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_RUNNING_BOND_STAIRS = registerBlock("mud_brick_running_bond_stairs", new StairsBlock(Blocks.MUD_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_RUNNING_BOND_STAIRS = registerBlock("blackstone_running_bond_stairs", new StairsBlock(Blocks.BLACKSTONE.getDefaultState(), Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_RUNNING_BOND_STAIRS = registerBlock("dark_prismarine_running_bond_stairs", new StairsBlock(Blocks.DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block ANDESITE_WINDMILL_WEAVE_STAIRS = registerBlock("andesite_windmill_weave_stairs", new StairsBlock(Blocks.ANDESITE.getDefaultState(), Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_WINDMILL_WEAVE_STAIRS = registerBlock("diorite_windmill_weave_stairs", new StairsBlock(Blocks.DIORITE.getDefaultState(), Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_WINDMILL_WEAVE_STAIRS = registerBlock("granite_windmill_weave_stairs", new StairsBlock(Blocks.GRANITE.getDefaultState(), Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_WINDMILL_WEAVE_STAIRS = registerBlock("sandstone_windmill_weave_stairs", new StairsBlock(Blocks.SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_WINDMILL_WEAVE_STAIRS = registerBlock("red_sandstone_windmill_weave_stairs", new StairsBlock(Blocks.RED_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block BRICK_WINDMILL_WEAVE_STAIRS = registerBlock("brick_windmill_weave_stairs", new StairsBlock(Blocks.BRICKS.getDefaultState(), Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block STONE_WINDMILL_WEAVE_STAIRS = registerBlock("stone_windmill_weave_stairs", new StairsBlock(Blocks.STONE.getDefaultState(), Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_WINDMILL_WEAVE_STAIRS = registerBlock("mossy_stone_windmill_weave_stairs", new StairsBlock(Blocks.MOSSY_COBBLESTONE.getDefaultState(), Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_WINDMILL_WEAVE_STAIRS = registerBlock("cobbled_deepslate_windmill_weave_stairs", new StairsBlock(Blocks.COBBLED_DEEPSLATE.getDefaultState(), Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_WINDMILL_WEAVE_STAIRS = registerBlock("deepslate_windmill_weave_stairs", new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_WINDMILL_WEAVE_STAIRS = registerBlock("mud_brick_windmill_weave_stairs", new StairsBlock(Blocks.MUD_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_WINDMILL_WEAVE_STAIRS = registerBlock("blackstone_windmill_weave_stairs", new StairsBlock(Blocks.BLACKSTONE.getDefaultState(), Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_WINDMILL_WEAVE_STAIRS = registerBlock("dark_prismarine_windmill_weave_stairs", new StairsBlock(Blocks.DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block ANDESITE_FLAGSTONE_STAIRS = registerBlock("andesite_flagstone_stairs", new StairsBlock(Blocks.ANDESITE.getDefaultState(), Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_FLAGSTONE_STAIRS = registerBlock("diorite_flagstone_stairs", new StairsBlock(Blocks.DIORITE.getDefaultState(), Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_FLAGSTONE_STAIRS = registerBlock("granite_flagstone_stairs", new StairsBlock(Blocks.GRANITE.getDefaultState(), Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_FLAGSTONE_STAIRS = registerBlock("sandstone_flagstone_stairs", new StairsBlock(Blocks.SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_FLAGSTONE_STAIRS = registerBlock("red_sandstone_flagstone_stairs", new StairsBlock(Blocks.RED_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block BRICK_FLAGSTONE_STAIRS = registerBlock("brick_flagstone_stairs", new StairsBlock(Blocks.BRICKS.getDefaultState(), Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block STONE_FLAGSTONE_STAIRS = registerBlock("stone_flagstone_stairs", new StairsBlock(Blocks.STONE.getDefaultState(), Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_FLAGSTONE_STAIRS = registerBlock("mossy_stone_flagstone_stairs", new StairsBlock(Blocks.MOSSY_COBBLESTONE.getDefaultState(), Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_FLAGSTONE_STAIRS = registerBlock("cobbled_deepslate_flagstone_stairs", new StairsBlock(Blocks.COBBLED_DEEPSLATE.getDefaultState(), Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_FLAGSTONE_STAIRS = registerBlock("deepslate_flagstone_stairs", new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_FLAGSTONE_STAIRS = registerBlock("mud_brick_flagstone_stairs", new StairsBlock(Blocks.MUD_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_FLAGSTONE_STAIRS = registerBlock("blackstone_flagstone_stairs", new StairsBlock(Blocks.BLACKSTONE.getDefaultState(), Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_FLAGSTONE_STAIRS = registerBlock("dark_prismarine_flagstone_stairs", new StairsBlock(Blocks.DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);

	public static final Block ANDESITE_CRYSTAL_FLOOR_STAIRS = registerBlock("andesite_crystal_floor_stairs", new StairsBlock(Blocks.ANDESITE.getDefaultState(), Block.Settings.copy(Blocks.ANDESITE)), PathGroup.PATHGROUP);
	public static final Block DIORITE_CRYSTAL_FLOOR_STAIRS = registerBlock("diorite_crystal_floor_stairs", new StairsBlock(Blocks.DIORITE.getDefaultState(), Block.Settings.copy(Blocks.DIORITE)), PathGroup.PATHGROUP);
	public static final Block GRANITE_CRYSTAL_FLOOR_STAIRS = registerBlock("granite_crystal_floor_stairs", new StairsBlock(Blocks.GRANITE.getDefaultState(), Block.Settings.copy(Blocks.GRANITE)), PathGroup.PATHGROUP);
	public static final Block SANDSTONE_CRYSTAL_FLOOR_STAIRS = registerBlock("sandstone_crystal_floor_stairs", new StairsBlock(Blocks.SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block RED_SANDSTONE_CRYSTAL_FLOOR_STAIRS = registerBlock("red_sandstone_crystal_floor_stairs", new StairsBlock(Blocks.RED_SANDSTONE.getDefaultState(), Block.Settings.copy(Blocks.RED_SANDSTONE)), PathGroup.PATHGROUP);
	public static final Block BRICK_CRYSTAL_FLOOR_STAIRS = registerBlock("brick_crystal_floor_stairs", new StairsBlock(Blocks.BRICKS.getDefaultState(), Block.Settings.copy(Blocks.BRICKS)), PathGroup.PATHGROUP);
	public static final Block STONE_CRYSTAL_FLOOR_STAIRS = registerBlock("stone_crystal_floor_stairs", new StairsBlock(Blocks.STONE.getDefaultState(), Block.Settings.copy(Blocks.STONE)), PathGroup.PATHGROUP);
	public static final Block MOSSY_STONE_CRYSTAL_FLOOR_STAIRS = registerBlock("mossy_stone_crystal_floor_stairs", new StairsBlock(Blocks.MOSSY_COBBLESTONE.getDefaultState(), Block.Settings.copy(Blocks.MOSSY_COBBLESTONE)), PathGroup.PATHGROUP);
	public static final Block COBBLED_DEEPSLATE_CRYSTAL_FLOOR_STAIRS = registerBlock("cobbled_deepslate_crystal_floor_stairs", new StairsBlock(Blocks.COBBLED_DEEPSLATE.getDefaultState(), Block.Settings.copy(Blocks.COBBLED_DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block DEEPSLATE_CRYSTAL_FLOOR_STAIRS = registerBlock("deepslate_crystal_floor_stairs", new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), Block.Settings.copy(Blocks.DEEPSLATE)), PathGroup.PATHGROUP);
	public static final Block MUD_BRICK_CRYSTAL_FLOOR_STAIRS = registerBlock("mud_brick_crystal_floor_stairs", new StairsBlock(Blocks.MUD_BRICKS.getDefaultState(), Block.Settings.copy(Blocks.MUD_BRICKS)), PathGroup.PATHGROUP);
	public static final Block BLACKSTONE_CRYSTAL_FLOOR_STAIRS = registerBlock("blackstone_crystal_floor_stairs", new StairsBlock(Blocks.BLACKSTONE.getDefaultState(), Block.Settings.copy(Blocks.BLACKSTONE)), PathGroup.PATHGROUP);
	public static final Block DARK_PRISMARINE_CRYSTAL_FLOOR_STAIRS = registerBlock("dark_prismarine_crystal_floor_stairs", new StairsBlock(Blocks.DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(Blocks.DARK_PRISMARINE)), PathGroup.PATHGROUP);


	private static Block registerBlock(String name, Block block, ItemGroup group) {
		registerBlockItem(name, block, group);
		return Registry.register(Registries.BLOCK, new Identifier(MacawsPaths.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup group) {
		Item item = Registry.register(Registries.ITEM, new Identifier(MacawsPaths.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
		return item;
	}

	private static Block registerEngravedBlock(String name, Block block, ItemGroup group) {
		registerEngravedBlockItem(name, block, group);
		return Registry.register(Registries.BLOCK, new Identifier(MacawsPaths.MOD_ID, name), block);
	}

	private static Item registerEngravedBlockItem(String name, Block block, ItemGroup group) {
		Item item = Registry.register(Registries.ITEM, new Identifier(MacawsPaths.MOD_ID, name),
				new EngravedBlockTooltip(block, new FabricItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
		return item;
	}


	private static Block registerFlattenedBlock(String name, Block block, ItemGroup group) {
		registerFlattenedBlockItem(name, block, group);
		return Registry.register(Registries.BLOCK, new Identifier(MacawsPaths.MOD_ID, name), block);
	}

	private static Item registerFlattenedBlockItem(String name, Block block, ItemGroup group) {
		Item item = Registry.register(Registries.ITEM, new Identifier(MacawsPaths.MOD_ID, name),
				new FlattenedBlockTooltip(block, new FabricItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
		return item;
	}









	public static void registerModBlocks() {
	}
}