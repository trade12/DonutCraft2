package net.donutcraft.mod.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.donutcraft.mod.init.DonutCraftItems;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class CraftingHandler {

    @SubscribeEvent
    public void onCrafting(PlayerEvent.ItemCraftedEvent event) {

        final IInventory craftMatrix = null;
        for (int i = 0; i < event.craftMatrix.getSizeInventory(); i++)
            if (event.craftMatrix.getStackInSlot(1) != null) {


                ItemStack item0 = event.craftMatrix.getStackInSlot(i);
                if (item0 != null && item0.getItem() == DonutCraftItems.DonutHammer) {
                    ItemStack k = new ItemStack(DonutCraftItems.DonutHammer, 2, (item0.getItemDamage() + 1));

                    if (k.getItemDamage() >= k.getMaxDamage()) {
                        k.stackSize--;
                    }
                    {
                        event.craftMatrix.setInventorySlotContents(i, k);
                    }
                    ItemStack item1 = event.craftMatrix.getStackInSlot(i);
                    if (item1 != null && item1.getItem() == DonutCraftItems.DonutHammer) {
                        k = new ItemStack(DonutCraftItems.DonutHammer, 2, (item1.getItemDamage() + 1));

                        if (k.getItemDamage() >= k.getMaxDamage()) {
                            k.stackSize--;
                        }
                        {
                            event.craftMatrix.setInventorySlotContents(i, k);
                        }
                    }
                }
            }
    }
}
