package net.donutcraft.mod.food;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.donutcraft.mod.DonutCraft;
import net.donutcraft.mod.init.DonutCraftFood;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class FoodRawBacon extends ItemFood {

	public FoodRawBacon(int heal, float saturation, boolean wolfmeat) {
		super(3, 4, wolfmeat);
		this.setPotionEffect(9, 30, 0, 1F);
		this.setTextureName(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}

	@SubscribeEvent
	public void onDeathEvent(LivingDeathEvent event) {
		if (event.entity instanceof EntityPig) {
			if (!event.entity.worldObj.isRemote) {
				EntityItem ei = new EntityItem(event.entityLiving.worldObj);
				ei.setEntityItemStack(new ItemStack(DonutCraftFood.foodDonutRawBacon, 100));
				ei.setPosition(event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ);
				event.entityLiving.worldObj.spawnEntityInWorld(ei);
			}
		}
	}
}