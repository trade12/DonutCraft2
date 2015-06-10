package net.donutcraft.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.donutcraft.mod.DonutCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class DonutHammer extends Item {

    public DonutHammer() {
        super();
        this.maxStackSize = 1;
        this.setMaxDamage(64);
        this.setNoRepair();
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}
