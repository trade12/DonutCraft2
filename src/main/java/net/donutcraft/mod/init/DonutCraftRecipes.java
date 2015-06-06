package net.donutcraft.mod.init;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;



public class DonutCraftRecipes {

    public static void DonutCraftRecipes()
    {
        //Recipes
        GameRegistry.addRecipe(new ItemStack(DonutCraftFood.foodDonutGodDonut), "GGG", "GPG", "GGG", 'G', DonutCraftItems.itemDonutGem, 'P', DonutCraftFood.foodDonutPlainDonut);
        GameRegistry.addRecipe(new ItemStack (DonutCraftFood.foodDonutPlainDonut), " C ", "C C", " C ", 'C', DonutCraftFood.itemDonutPlainDough);
        GameRegistry.addRecipe(new ItemStack (DonutCraftFood.foodDonutCocoDonut), " C ", "C C", " C ", 'C', DonutCraftFood.itemDonutCocoDough);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftFood.itemDonutPlainDough, 16), "MWM", "W W", "MWM", 'M', Items.milk_bucket, 'W', Items.wheat);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftFood.itemDonutCocoDough, 16), "MWM", "WCW", "MWM", 'M', Items.milk_bucket, 'W', Items.egg, 'C', Items.cookie);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftFood.foodDonutSprinkleDonut), "   ", " S ", " D ", 'S', DonutCraftFood.foodDonutSprinkles, 'D', DonutCraftFood.foodDonutPlainDonut);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftFood.foodDonutCocoSDonut), "   ", " S ", " D ", 'S', DonutCraftFood.foodDonutSprinkles, 'D', DonutCraftFood.foodDonutCocoDonut);

        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.DonutHelm), "XXX", "X X", 'X', DonutCraftItems.itemDonutGem);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.DonutChest), "X X", "XXX", "XXX", 'X', DonutCraftItems.itemDonutGem);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.DonutLegs), "XXX", "X X", "X X", 'X', DonutCraftItems.itemDonutGem);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.DonutBoots), "X X", "X X", 'X', DonutCraftItems.itemDonutGem);

        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.BaconHelm), "YYY", "Y Y", 'Y', DonutCraftFood.foodDonutCookedBacon);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.BaconChest), "Y Y", "YYY", "YYY", 'Y', DonutCraftFood.foodDonutCookedBacon);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.BaconLegs), "YYY", "Y Y", "Y Y", 'Y', DonutCraftFood.foodDonutCookedBacon);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.BaconBoots), "Y Y", "Y Y", 'Y', DonutCraftFood.foodDonutCookedBacon);

        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemBaconSword), " Z ", " Z ", " A ", 'Z', DonutCraftFood.foodDonutCookedBacon, 'A', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemBaconPick), "ZZZ", " A ", " A ", 'Z', DonutCraftFood.foodDonutCookedBacon, 'A', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemBaconAxe), "ZZ ", "ZZA ", " A ", 'Z', DonutCraftFood.foodDonutCookedBacon, 'A', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemBaconSpade), " Z ", " A ", " A ", 'Z', DonutCraftFood.foodDonutCookedBacon, 'A', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemBaconHoe), "ZZ ", " A ", " A ", 'Z', DonutCraftFood.foodDonutCookedBacon, 'A', Items.stick);

        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemDonutSword), " Z ", " Z ", " A ", 'Z', DonutCraftFood.foodDonutPlainDonut, 'A', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemDonutPick), "ZZZ", " A ", " A ", 'Z', DonutCraftFood.foodDonutPlainDonut, 'A', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemDonutAxe), "ZZ ", "ZZA ", " A ", 'Z', DonutCraftFood.foodDonutPlainDonut, 'A', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemDonutSpade), " Z ", " A ", " A ", 'Z', DonutCraftFood.foodDonutPlainDonut, 'A', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemDonutHoe), "ZZ ", " A ", " A ", 'Z', DonutCraftFood.foodDonutPlainDonut, 'A', Items.stick);

        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemDonutGemSword), " Z ", " Z ", " A ", 'Z', DonutCraftItems.itemDonutGem, 'A', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemDonutGemPick), "ZZZ", " A ", " A ", 'Z', DonutCraftItems.itemDonutGem, 'A', Items.stick);

        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftBlocks.blockSprinkleBlock), "ZZZ", "ZZZ", "ZZZ", 'Z', DonutCraftItems.itemSprinkleIngot);
        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftBlocks.blockDonutBlock), "ZZZ", "ZZZ", "ZZZ", 'Z', DonutCraftItems.itemDonutGem);

        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftFood.foodDonutSprinkles), "   ", " Z ", "   ", 'Z', DonutCraftItems.itemSprinkleIngot);

        GameRegistry.addShapedRecipe(new ItemStack (DonutCraftItems.itemSprinkleIngot), "ZZZ", "ZZZ", "ZZZ", 'Z', DonutCraftFood.foodDonutSprinkles);

        //Smelting
        GameRegistry.addSmelting(DonutCraftFood.foodDonutRawBacon, new ItemStack(DonutCraftFood.foodDonutCookedBacon), 23);
        GameRegistry.addSmelting(DonutCraftItems.itemDonutGemDust , new ItemStack (DonutCraftItems.itemDonutGem), 25);

    }

    public static void addRecipes() {
    }
}
