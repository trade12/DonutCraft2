package net.donutcraft.mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.donutcraft.mod.DonutCraft;
import net.donutcraft.mod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DonutCraftBlocks {
    public static Block SprinkleOre;
    public static Block DonutOre;

    public static Block blockDonutBlock;
    public static Block blockSprinkleBlock;

    public static void init(){
        blockDonutBlock = new DonutBlock(Material.iron).setBlockName("DonutBlock").setCreativeTab(DonutCraft.DonutTab).setBlockTextureName(DonutCraft.modid + ":DonutBlock");
        DonutOre = new DonutOre(Material.iron).setCreativeTab(DonutCraft.DonutTab).setBlockName("DonutOre");
    }

    public static void register(){
        GameRegistry.registerBlock(blockDonutBlock, "DonutBlock");
        GameRegistry.registerBlock(DonutOre, "DonutOre");

    }
}
