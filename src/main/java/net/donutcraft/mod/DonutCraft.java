package net.donutcraft.mod;


import net.donutcraft.mod.food.FoodRawBacon;
import net.donutcraft.mod.init.DonutCraftBlocks;
import net.donutcraft.mod.init.DonutCraftFood;
import net.donutcraft.mod.init.DonutCraftItems;
import net.donutcraft.mod.init.DonutCraftRecipes;
import net.donutcraft.mod.worldgen.DonutCraftWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@Mod(modid = DonutCraft.modid, version = DonutCraft.version)
public class DonutCraft {

	public static final String modid = "DonutCraft";
	public static final String version = "1.7.10-2.0.0";
	@Instance(modid)
	public static DonutCraft instance;

	public static CreativeTabs DonutTab = new CreativeTabs("donutcraftTab") {
		@Override
		public Item getTabIconItem() {
			return DonutCraftItems.itemDonutGem;
		}
	};

	DonutCraftWorldGen eventWorldGen = new DonutCraftWorldGen();


	@EventHandler
	public void PreIit(FMLPreInitializationEvent preEvent){


		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		DonutCraftItems.init();
		DonutCraftBlocks.init();
		DonutCraftFood.init();
		DonutCraftItems.register();
		DonutCraftBlocks.register();
		DonutCraftFood.register();
	
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		DonutCraftRecipes.addRecipes();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
	
}