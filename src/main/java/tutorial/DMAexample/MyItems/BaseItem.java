package tutorial.DMAexample.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

//Import Snowball 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.world.World;


import java.util.List;
import tutorial.DMAexample.yourmodsname;



public class BaseItem extends Item 
{
	public BaseItem() 
	{
		super();
		this.setHasSubtypes(true);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}




}


