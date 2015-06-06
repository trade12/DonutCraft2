package net.donutcraft.mod.init;



import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.donutcraft.mod.DonutCraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

/**
 * Created by TheTrade12 on 06/06/2015.
 */
public class EventHelper {

    public static void init(){
        MinecraftForge.EVENT_BUS.register(new EventHelper());
    }


    @SubscribeEvent
    public void onDeathEvent(LivingDeathEvent event) {
        if (event.entity instanceof EntityPig) {
            if (!event.entity.worldObj.isRemote) {
                EntityItem ei = new EntityItem(event.entityLiving.worldObj);
                ei.setEntityItemStack(new ItemStack(DonutCraftFood.foodDonutRawBacon, 1));
                ei.setPosition(event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ);
                event.entityLiving.worldObj.spawnEntityInWorld(ei);
            }
        }
    }
}