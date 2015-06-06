package net.donutcraft.mod.blocks;

import net.donutcraft.mod.DonutCraft;
import net.donutcraft.mod.init.DonutCraftFood;
import net.donutcraft.mod.init.DonutCraftItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;

import java.util.Random;

public class OreBlock extends Block {

	public OreBlock(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeStone);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}