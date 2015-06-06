package net.donutcraft.mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.donutcraft.mod.DonutCraft;
import net.donutcraft.mod.blocks.DonutBlock;
import net.donutcraft.mod.blocks.OreBlock;
import net.donutcraft.mod.blocks.SprinkleBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DonutCraftBlocks {
    public static Block oreSprinkleOre;
    public static Block oreDonutOre;

    public static Block blockDonutBlock;
    public static Block blockSprinkleBlock;

    public static void init(){
        blockSprinkleBlock = new SprinkleBlock(Material.iron).setBlockName("SprinkleBlock").setCreativeTab(DonutCraft.DonutTab).setBlockTextureName(DonutCraft.modid + ":SprinkleBlock");
        blockDonutBlock = new DonutBlock(Material.iron).setBlockName("DonutBlock").setCreativeTab(DonutCraft.DonutTab).setBlockTextureName(DonutCraft.modid + ":DonutBlock");
        oreDonutOre = new OreBlock(Material.iron).setCreativeTab(DonutCraft.DonutTab).setBlockName("DonutOre");
        oreSprinkleOre = new OreBlock(Material.iron).setCreativeTab(DonutCraft.DonutTab).setBlockName("SprinkleOre");
    }

    public static void register(){
        GameRegistry.registerBlock(blockSprinkleBlock, "SprinkleBlock");
        GameRegistry.registerBlock(blockDonutBlock, "DonutBlock");
        GameRegistry.registerBlock(oreSprinkleOre, "SprinkleOre");
        GameRegistry.registerBlock(oreDonutOre, "DonutOre");

    }
}
