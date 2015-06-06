package net.donutcraft.mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.donutcraft.mod.DonutCraft;
import net.donutcraft.mod.food.*;
import net.donutcraft.mod.items.NCItems;
import net.minecraft.item.Item;

public class DonutCraftFood {
    public static Item itemDonutPlainDough;
    public static Item itemDonutCocoDough;

    public static Item foodDonutGodDonut;
    public static Item foodDonutRawBacon;
    public static Item foodDonutCookedBacon;
    public static Item foodDonutPlainDonut;
    public static Item foodDonutCocoDonut;
    public static Item foodDonutSprinkles;
    public static Item foodDonutSprinkleDonut;
    public static Item foodDonutCocoSDonut;

    public static void init(){
        //Materials
        itemDonutPlainDough = new NCItems().setUnlocalizedName("PlainDough");

        itemDonutCocoDough = new NCItems().setUnlocalizedName("CocoDough");


        //Food
        foodDonutGodDonut = new FoodGodDonut(8, 0.6F, true).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("GodDonut").setTextureName(DonutCraft.modid + ":GodDonut");

        foodDonutRawBacon = new FoodRawBacon(2, 0.4F, true).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("RawBacon").setTextureName(DonutCraft.modid + ":RawBacon");

        foodDonutCookedBacon = new FoodCookedBacon(5, 0.9F, true).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("CookedBacon").setTextureName(DonutCraft.modid + ":CookedBacon");

        foodDonutPlainDonut = new foodDonutPlainDonut(3, 0.8F, true).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("PlainDonut").setTextureName(DonutCraft.modid + ":PlainDonut");

        foodDonutCocoDonut = new FoodDonutCocoDonut(3, 0.8F, true).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("CocoDonut").setTextureName(DonutCraft.modid + ":CocoDonut");

        foodDonutSprinkles = new foodDonutSprinkles(2, 0.3F, true).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("Sprinkles").setTextureName(DonutCraft.modid + ":Sprinkles");

        foodDonutSprinkleDonut = new foodDonutSprinkleDonut(5, 0.9F, true).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("SprinkleDonut").setTextureName(DonutCraft.modid + ":SprinkleDonut");

        foodDonutCocoSDonut = new foodCocoSDonut(5, 0.9F, true).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("CocoS").setTextureName(DonutCraft.modid + ":CocoS");
    }
    public static void register() {
        GameRegistry.registerItem(foodDonutGodDonut, "GodDonut");
        GameRegistry.registerItem(foodDonutCocoSDonut, "Coco Sprinkled Donut");
        GameRegistry.registerItem(foodDonutRawBacon, "RawBacon");
        GameRegistry.registerItem(foodDonutSprinkleDonut, "Sprinkled Donut");
        GameRegistry.registerItem(foodDonutSprinkles, "Sprinkles");
        GameRegistry.registerItem(foodDonutCocoDonut, "CocoDonut");
        GameRegistry.registerItem(foodDonutPlainDonut, "PlainDonut");
        GameRegistry.registerItem(foodDonutCookedBacon, "CookedBacon");
        GameRegistry.registerItem(itemDonutCocoDough, "CocoDough");
        GameRegistry.registerItem(itemDonutPlainDough, "PlainDough");
    }
}
