package net.donutcraft.mod.blocks;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.donutcraft.mod.DonutCraft;
import net.donutcraft.mod.init.DonutCraftFood;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public class SprinkleOre extends Block {
    public SprinkleOre(Material material) {
        super(material);
        this.setHardness(8F);
        this.setResistance(6.7F);
        this.setStepSound(soundTypeStone);
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune){
        return DonutCraftFood.foodDonutSprinkles;
    }
    @Override
    public int quantityDropped(Random rand){
        return 1 + rand.nextInt(3);
    }
}
