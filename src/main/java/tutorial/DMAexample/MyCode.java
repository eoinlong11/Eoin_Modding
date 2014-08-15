package tutorial.DMAexample;

//Recipes - Very important imports for creating recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
//import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.util.EnumHelper;

//MyBlocks

import tutorial.DMAexample.MyBlocks.HardOre;
import tutorial.DMAexample.MyBlocks.BaseBlock;
import tutorial.DMAexample.MyBlocks.FishOre;
import tutorial.DMAexample.MyBlocks.MagicalOre;
import tutorial.DMAexample.MyEntities.DeathBallEntity;


//MyItems
import tutorial.DMAexample.MyItems.BaseItem;
import tutorial.DMAexample.MyItems.BowOfTeleportation;
import tutorial.DMAexample.MyItems.CustomAxe;
import tutorial.DMAexample.MyItems.CustomPickaxe;
import tutorial.DMAexample.MyItems.CustomSpade;
import tutorial.DMAexample.MyItems.CustomSword;
import tutorial.DMAexample.MyItems.MyLauncherItem;
import tutorial.DMAexample.MyItems.PowerBall;
import tutorial.DMAexample.MyItems.StaffOfDestruction;
//MyCreative Tab
import net.minecraft.creativetab.CreativeTabs;












//Blocks
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//Items
import net.minecraft.util.MathHelper;

public class MyCode {
	
	//Custom Creative Tab
	public static CreativeTabs tabMyMod = new MyCreativeTab("MyMod");
	
	//List Blocks and Items Here
	
	//Blocks
	public static Block hardOre;
	public static Block harderDirt;
	public static Block fishOre;
	public static Block magiconiumOre;
	
	//Items
	public static Item MyLauncher;
	public static Item MyFood;
	public static Item myCustomSword;
	public static Item PowerBall;
	public static Item StaffOfDestruction;
	public static Item MagicDust;
	public static Item NetherPick;
	public static Item NetherSword;
	public static Item NetherSpade;
	public static Item NetherAxe;
	public static Item EnderPick;
	public static Item EnderSword;
	public static Item EnderSpade;
	public static Item EnderAxe;
	public static Item PowerCrystal;
	public static Item Tier2NetherStar;
	public static Item BowOfTeleportation;
	
	//Tool
	//public static Item axeTutorial;
	public static Item.ToolMaterial PLA = EnumHelper.addToolMaterial("PLA", 3, 192, 5.0F, 1.5F, 12);
	public static Item.ToolMaterial Nether = EnumHelper.addToolMaterial("Nether", 7, 1700, 20.0F, 10.5F, 30);

	
	//Tool Material
	//public static Item.ToolMaterial exampleMaterial = EnumHelper.addToolMaterial("examplematerial",  2, 1000, 6.0F, 2.0F, 5);	
	//public static final ArmorMaterial CUS TOM_MATERIAL= EnumHelper.addArmorMaterial("Custom", 5, new int[] {1,3,2,1}, 5);
	
	public static void MyBlocks(){

		//MahFishOre
		fishOre = new FishOre(0, Material.iron)
		.setHardness(3.0F)
		.setStepSound(Block.soundTypeWood)
		.setBlockName("FishOre")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setBlockTextureName("yourmodsname:diamond_ore");
		
		//Magical Ore
		magiconiumOre = new MagicalOre(0, Material.iron)
		.setHardness(4.0F)
		.setStepSound(Block.soundTypeStone)
		.setBlockName("magiconiumOre")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setBlockTextureName("yourmodsname:magicalOre");
		
		
		//Harderened Dirt
		 harderDirt = new BaseBlock(Material.ground)
         .setHardness(12.0F)
         .setStepSound(Block.soundTypeGravel)
         .setBlockName("harderDirt")
         .setCreativeTab(CreativeTabs.tabBlock)
         .setBlockTextureName("ice");
		 
		 //Harden Ore
		 hardOre = new HardOre(Material.iron)
		 .setHardness(0.9F)
         .setStepSound(Block.soundTypeGravel)
         .setBlockName("hardOre")
         .setCreativeTab(CreativeTabs.tabBlock)
         .setBlockTextureName("yourmodsname:mycom_block");
		 
		 //Harvest Level
		 harderDirt.setHarvestLevel("shovel", 1);
		 hardOre.setHarvestLevel("pickaxe", 3);	
		 fishOre.setHarvestLevel("pickaxe", 1);
		 
		 //Register Items
		 GameRegistry.registerBlock(hardOre, "HardOre");
		 GameRegistry.registerBlock(harderDirt, "HarderDirt");
		 GameRegistry.registerBlock(fishOre, "Fish Ore");
		 GameRegistry.registerBlock(magiconiumOre, "MagiconiumOre");
		 
		 
		 MyOreGenerator ore_gen = new MyOreGenerator();
		 GameRegistry.registerWorldGenerator(ore_gen, 0);
		 //For Generating Ores in Game - Day 5
		
	}
	
	public static void MyRecipes()
	{
		
	//Shapeless - First Shapeless Recipe (CommandBlock from Red Stone Torch)
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.command_block), new Object[] { new ItemStack(Blocks.redstone_torch) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.deadbush), new Object[] {new ItemStack(Blocks.dirt) });
		
				
		
	//Shaped 
		
		//Comment Every Recipe!!!!!!!!!!!!!!!!!!! Hard Ore from cactus, gold, cocoa beans.
		//This recipe is so expensive for no good reason
		 GameRegistry.addRecipe(new ItemStack(hardOre, 10), new Object[] 
					{
				    "AAA", "BBB", "C C",
					'A', Blocks.gold_block,
					'B', new ItemStack(Items.dye, 1, 3),
				    'C', Blocks.cactus,
					});
		 
		 ItemStack sharpLauncher = new ItemStack(MyLauncher);
		 sharpLauncher.addEnchantment(Enchantment.sharpness, 300);
		 //sharpSteak.addEnchantment(Enchantment.sharpness, 3);
		 
		 //Make Pumpkin Pie - Really messed up pumpkin pie recipe 
		 GameRegistry.addRecipe(sharpLauncher, new Object[] 
					{
				    " A", "AB",
					'A', Blocks.gold_block,
				    'B', Blocks.dirt,
					});

		  
		 
		 ItemStack theRawFish = new ItemStack(Items.fish,1);
		 theRawFish.addEnchantment(Enchantment.sharpness, 50);
		 theRawFish.addEnchantment(Enchantment.knockback,50);
		 theRawFish.setStackDisplayName("The Raw Fish");
		 GameRegistry.addRecipe(theRawFish, new Object[]{
			 "CAC", "ABA", "CAC",
			 'A', new ItemStack(Items.golden_apple, 0, 1),
			 'B', Items.fish,
			 'C', Blocks.diamond_block,
		 });
		 
		 GameRegistry.addRecipe(new ItemStack(Tier2NetherStar), new Object[]{
			"ABA","ACA","ADA",
			'A',MagicDust,
			'B',Blocks.glowstone,
			'C',Blocks.emerald_block,
			'D',Blocks.diamond_block,
		 });
		 GameRegistry.addRecipe(new ItemStack(NetherPick), new Object[]{
				"ABA"," C "," C ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(NetherAxe), new Object[]{
				"BA ","AC "," C ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(NetherAxe), new Object[]{
				" AB"," CA"," C ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(NetherSpade), new Object[]{
				" A "," B "," C ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(NetherSpade), new Object[]{
				"  A","  B","  C",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(NetherSpade), new Object[]{
				"A  ","B  ","C  ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(NetherSword), new Object[]{
				" A ","BAB"," C ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
		 });
		 GameRegistry.addRecipe(new ItemStack(PowerCrystal), new Object[]{
			 "ABA","BCB","ABA",
			 'A',MagicDust,
			 'B',Blocks.glowstone,
			 'C',Items.emerald,
		 });
		 GameRegistry.addRecipe(new ItemStack(StaffOfDestruction), new Object[]{
			"ABA","BCB","ABA",
			'A',Blocks.tnt,
			'B',Items.diamond,
			'C',Items.bow,
		 });
		 GameRegistry.addRecipe(new ItemStack(EnderPick), new Object[]{
				"ABA"," C "," C ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(EnderAxe), new Object[]{
				"BA ","AC "," C ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(EnderAxe), new Object[]{
				" AB"," CA"," C ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(EnderSpade), new Object[]{
				" A "," B "," C ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(EnderSpade), new Object[]{
				"  A","  B","  C",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(EnderSpade), new Object[]{
				"A  ","B  ","C  ",
				'A',Items.nether_star,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
				
			 });
		 GameRegistry.addRecipe(new ItemStack(EnderSword), new Object[]{
				" A ","BAB"," C ",
				'A',Tier2NetherStar,
				'B',PowerCrystal,
				'C',Items.blaze_rod,
		 });
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 ItemStack theCookedFish = new ItemStack(Items.cooked_fished,1);
		 theCookedFish.addEnchantment(Enchantment.sharpness,100);
		 theCookedFish.addEnchantment(Enchantment.knockback,100);
		 theCookedFish.setStackDisplayName("The Cooked Fish");
		 GameRegistry.addSmelting(theRawFish,(theCookedFish), 1.0F);
		 
	//Smelting
		
		//Cookie Cooked Steak
			GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 3), new ItemStack(hardOre, 8), 1.0F);
			GameRegistry.addSmelting(new ItemStack(Items.diamond_sword), new ItemStack(Blocks.dirt, 8), 0.5F);
		
			
		
		
	}
	
	public static void MyItems()
	{
		
		MyLauncher = new MyLauncherItem()
		.setMaxStackSize(1)
		.setUnlocalizedName("launcher_item");
		
		 MyFood = new ItemFood(6, 0.6F, false)
		 .setUnlocalizedName("potatoBaked")
		 .setTextureName("potato_baked");
		 
		 PowerBall = new PowerBall()
         .setUnlocalizedName("PowerBall")
         .setTextureName("yourmodsname:powerBall")
         .setMaxStackSize(8);
		 
		 StaffOfDestruction = new StaffOfDestruction()
		 .setUnlocalizedName("StaffOfDestruction")
		 .setTextureName("yourmodsname:staffOfDestruction")
		 .setMaxStackSize(1);
		 
		 MagicDust = new BaseItem()
		 .setUnlocalizedName("MagicDust")
		 .setTextureName("yourmodsname:magicDust")
		 .setMaxStackSize(64);
		 
		 NetherPick = new CustomPickaxe(Nether)
		 .setUnlocalizedName("NetherPickaxe")
		 .setTextureName("yourmodsname:netherPick")
		 .setMaxStackSize(1);
		 
		 NetherSword = new CustomSword(Nether)
		 .setUnlocalizedName("NetherSword")
		 .setTextureName("yourmodsname:netherSword")
		 .setMaxStackSize(1);
		 
		 NetherSpade = new CustomSpade(Nether)
		 .setUnlocalizedName("NetherSpade")
		 .setTextureName("yourmodsname:netherShovel")
		 .setMaxStackSize(1);
		 
		 NetherAxe = new CustomAxe(Nether)
		 .setUnlocalizedName("NetherAxe")
		 .setTextureName("yourmodsname:netherAxe")
		 .setMaxStackSize(1);
		 
		 PowerCrystal = new BaseItem()
		 .setUnlocalizedName("PowerCrystal")
		 .setTextureName("yourmodsname:powerCrystal")
		 .setMaxStackSize(1);
		 
		 Tier2NetherStar = new BaseItem()
		 .setUnlocalizedName("NetherStar2")
		 .setTextureName("NetherStar")
		 .setMaxStackSize(64);
		 
		 BowOfTeleportation = new BowOfTeleportation()
		 .setUnlocalizedName("BowOfTeleportation")
		 .setTextureName("yourmodsname:bowOfTeleportation")
		 .setMaxStackSize(1);
		 
		 NetherPick = new CustomPickaxe(Nether)
		 .setUnlocalizedName("NetherPickaxe")
		 .setTextureName("yourmodsname:netherPick")
		 .setMaxStackSize(1);
		 
		 NetherSword = new CustomSword(Nether)
		 .setUnlocalizedName("NetherSword")
		 .setTextureName("yourmodsname:netherSword")
		 .setMaxStackSize(1);
		 
		 NetherSpade = new CustomSpade(Nether)
		 .setUnlocalizedName("NetherSpade")
		 .setTextureName("yourmodsname:netherShovel")
		 .setMaxStackSize(1);
		 
		 NetherAxe = new CustomAxe(Nether)
		 .setUnlocalizedName("NetherAxe")
		 .setTextureName("yourmodsname:netherAxe")
		 .setMaxStackSize(1);
        	
		 GameRegistry.registerItem(MyLauncher, "MyLauncher");
         GameRegistry.registerItem(MyFood, "MyFood");
         GameRegistry.registerItem(PowerBall, "PowerBall");
         GameRegistry.registerItem(StaffOfDestruction, "StaffOfDestruction");
         GameRegistry.registerItem(MagicDust, "MagicDust");
         GameRegistry.registerItem(NetherPick, "NetherPick");
         GameRegistry.registerItem(NetherSword, "NetherSword");
         GameRegistry.registerItem(NetherSpade, "NetherSpade");
         GameRegistry.registerItem(NetherAxe, "NetherAxe");
         GameRegistry.registerItem(BowOfTeleportation, "BowOfTeleportation");
         GameRegistry.registerItem(PowerCrystal, "PowerCrystal");
         GameRegistry.registerItem(Tier2NetherStar, "NetherStar2");
		
         
		 
		 
		 
         //Custom Sword
         myCustomSword = new CustomSword(PLA)
         .setMaxStackSize(1)
         .setTextureName("yourmodsname:mybow_standby")
         .setUnlocalizedName("CustomSword");
		GameRegistry.registerItem(myCustomSword, "CustomSword");
         
		 //Custom Axe
         // myCustomAxe = new CustomAxe(PLA)
         // 	.setUnlocalizedName("mycustomaxe");
		//GameRegistry.registerItem(myCustomAxe, "CustomAxe");
         
         
        
         
         
         
         
         
         
         CreativeTabs tabCustom = new CreativeTabs("tabName") {
        	    @Override
        	    @SideOnly(Side.CLIENT)
        	    public Item getTabIconItem() {
        	    	
        	        return Items.ender_eye;
        	    }
        	};
         
         
       
         
         // GameRegistry.registerItem(axeTutorial, "axeTutorial");
   
		
	}
	
 

}