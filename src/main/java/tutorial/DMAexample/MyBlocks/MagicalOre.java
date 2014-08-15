package tutorial.DMAexample.MyBlocks;

import java.util.Random;

import tutorial.DMAexample.MyCode;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class MagicalOre extends Block
{
         public MagicalOre(int id, Material material) 
     {
             super(material);}
                
               
        
         //If the block's drop is an item.
         @Override
         public Item getItemDropped(int metadata, Random random, int fortune) {
             return MyCode.MagicDust;
         }
        
        
}