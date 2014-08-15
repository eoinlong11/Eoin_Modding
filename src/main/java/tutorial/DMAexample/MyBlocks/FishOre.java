package tutorial.DMAexample.MyBlocks;

import java.util.Random;

import tutorial.DMAexample.MyCode;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;


public class FishOre extends Block
{
         public FishOre(int id, Material material) 
     {
             super(material);}
                
               
       //If the block's drop is a vanilla item.
         @Override
         public Item getItemDropped(int metadata, Random random, int fortune) {
             return Item.getItemById(349
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 );
         }
        
        
}