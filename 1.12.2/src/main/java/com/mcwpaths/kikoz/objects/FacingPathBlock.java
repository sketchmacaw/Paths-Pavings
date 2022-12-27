package com.mcwpaths.kikoz.objects;

import com.mcwpaths.kikoz.MacawsPaths;
import com.mcwpaths.kikoz.init.BlockInit;
import com.mcwpaths.kikoz.init.ItemInit;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FacingPathBlock extends BlockDirectional {

	public static final AxisAlignedBB PATH = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);

		{
		    this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)); 
		}
	
	public FacingPathBlock(String name, Material material, SoundType sound, float hardness, float resistance, String tool, int level) 
		{
		    super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(MacawsPaths.MACAWSTPATHSTAB);
			
			setHardness(hardness);		
			setHarvestLevel(tool, level);	
			setResistance(resistance);
			setSoundType(sound);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	//Facing
		@Override
		public IBlockState getStateFromMeta(int ints) 
	    {
			EnumFacing facing = EnumFacing.getFront(ints);

			if(facing.getAxis()==EnumFacing.Axis.Y) 
			{
				facing=EnumFacing.NORTH;
			}
			return getDefaultState().withProperty(FACING, facing);
	    }
		
		//Facing
		@Override
		public int getMetaFromState(IBlockState state) 
	    {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
	    }
		    
		//Facing
	    @Override
		protected BlockStateContainer createBlockState() 
	    {
	    	return new BlockStateContainer(this, new IProperty[]{FACING});
	    }
	    
	    //Facing
	    @Override
	    public IBlockState getStateForPlacement(World world, BlockPos pos,EnumFacing facing, float x, float y, float z, int ints, EntityLivingBase player) 
	    {
		  return getDefaultState().withProperty(FACING, player.getHorizontalFacing().getOpposite());
	    }

	    @Deprecated
	    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	    {
	        return PATH;
	    }
		   
		@Override
		public BlockRenderLayer getBlockLayer() 
		{
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean isFullBlock(IBlockState state) 
		{
			return false;
		}
		
		@Override
		public boolean isFullCube(IBlockState state) 
		{
			return false;
		}
		
		@Override
		public boolean isOpaqueCube(IBlockState state) 
		{
			return false;
		}


}