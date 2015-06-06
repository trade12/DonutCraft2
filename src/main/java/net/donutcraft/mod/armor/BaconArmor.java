package net.donutcraft.mod.armor;

import net.donutcraft.mod.DonutCraft;
import net.donutcraft.mod.init.DonutCraftItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import java.util.List;

public class BaconArmor extends ItemArmor{

	public BaconArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);

		if(slot == 0) {
			this.setTextureName(DonutCraft.modid + ":BaconHelm");
		}
		else if (slot == 1) {
			this.setTextureName(DonutCraft.modid + ":BaconChest");
		}
		else if (slot == 2) {
			this.setTextureName(DonutCraft.modid + ":BaconLegs");
		}
		else if (slot == 3) {
			this.setTextureName(DonutCraft.modid + ":BaconBoots"); 
		}
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
		if (itemstack.getItem() == DonutCraftItems.BaconHelm || itemstack.getItem() == DonutCraftItems.BaconChest || itemstack.getItem() == DonutCraftItems.BaconBoots) {
			return DonutCraft.modid +":textures/model/armor/Bacon_layer_1.png";
		} 
		else if (itemstack.getItem() == DonutCraftItems.BaconLegs) {
			return DonutCraft.modid +":textures/model/armor/Bacon_layer_2.png";
		}
		else {
			return null;
		}
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add("Now you can be like Lady Gaga");
	}
}