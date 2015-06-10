package net.donutcraft.mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.donutcraft.mod.DonutCraft;
import net.donutcraft.mod.armor.BaconArmor;
import net.donutcraft.mod.armor.DonutArmor;
import net.donutcraft.mod.items.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class DonutCraftItems {
    public static Item itemBaconSword;
    public static Item itemBaconPick;
    public static Item itemBaconSpade;
    public static Item itemBaconAxe;
    public static Item itemBaconHoe;
    public static Item itemDonutGemPick;
    public static Item itemDonutGemSword;
    public static Item.ToolMaterial BaconMaterial = EnumHelper.addToolMaterial("BaconMaterial", 3, 1550, 6.5F, 3.0F, 14);
    public static Item.ToolMaterial DonutMaterial = EnumHelper.addToolMaterial("DonutMaterial", 4, 2620, 9.0F, 4.0F, 15);


    public static Item.ToolMaterial DonutGemMaterial = EnumHelper.addToolMaterial("DonutGemMaterial", 5, 3620, 12.0F, 6.0F, 25);

    public static Item itemDonutSword;
    public static Item itemDonutPick;
    public static Item itemDonutSpade;
    public static Item itemDonutAxe;
    public static Item itemDonutHoe;

    public static ItemArmor.ArmorMaterial BaconArmourMaterial = EnumHelper.addArmorMaterial("BaconArmour", 45, new int[]{6, 12, 10, 4}, 10);
    public static ItemArmor.ArmorMaterial DonutArmourMaterial = EnumHelper.addArmorMaterial("DonutArmour", 45, new int[]{8, 18, 25, 8}, 12);

    public static int armorBaconHelmID;
    public static int armorBaconChestID;
    public static int armorBaconLegsID;
    public static int armorBaconBootsID;
    public static Item BaconHelm;
    public static Item BaconChest;
    public static Item BaconLegs;
    public static Item BaconBoots;

    public static int armorDonutHelmID;
    public static int armorDonutChestID;
    public static int armorDonutLegsID;
    public static int armorDonutBootsID;
    public static Item DonutHelm;
    public static Item DonutChest;
    public static Item DonutLegs;
    public static Item DonutBoots;

    public static Item itemDonutGem;
    public static Item itemDonutGemDust;
    public static Item DonutHammer;

    public static void init(){
        // Tools
        itemBaconSword = new BaconSword(BaconMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("BaconSword").setTextureName(DonutCraft.modid + ":BaconSword");
        itemBaconAxe = new BaconAxe(BaconMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("BaconAxe").setTextureName(DonutCraft.modid + ":BaconAxe");
        itemBaconPick = new BaconPick(BaconMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("BaconPick").setTextureName(DonutCraft.modid + ":BaconPick");
        itemBaconSpade = new BaconSpade(BaconMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("BaconSpade").setTextureName(DonutCraft.modid + ":BaconSpade");
        itemBaconHoe = new BaconHoe(BaconMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("BaconHoe").setTextureName(DonutCraft.modid + ":BaconHoe");
        itemDonutSword = new DonutSword(DonutMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutSword").setTextureName(DonutCraft.modid + ":DonutSword");
        itemDonutAxe = new DonutAxe(DonutMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutAxe").setTextureName(DonutCraft.modid + ":DonutAxe");
        itemDonutPick = new DonutPick(DonutMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutPick").setTextureName(DonutCraft.modid + ":DonutPick");
        itemDonutSpade = new DonutSpade(DonutMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutSpade").setTextureName(DonutCraft.modid + ":DonutSpade");
        itemDonutHoe = new DonutHoe(DonutMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutHoe").setTextureName(DonutCraft.modid + ":DonutHoe");
        itemDonutGemSword = new DonutGemSword(DonutGemMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutGemSword").setTextureName(DonutCraft.modid + ":DonutGemSword");
        itemDonutGemPick = new DonutGemPick(DonutGemMaterial).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutGemPick").setTextureName(DonutCraft.modid + ":DonutGemPick");
        DonutHammer = new DonutHammer().setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutHammer").setTextureName(DonutCraft.modid + ":DonutHammer");

        //Ingots

        itemDonutGem = new NCItems().setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutGem");

        itemDonutGemDust = new NCItems().setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutGemDust");

        //Armour

        BaconHelm = new BaconArmor(BaconArmourMaterial,armorBaconHelmID, 0).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("BaconHelm");
        BaconChest = new BaconArmor(BaconArmourMaterial, armorBaconChestID, 1).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("BaconChest");
        BaconLegs = new BaconArmor(BaconArmourMaterial, armorBaconLegsID, 2).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("BaconLegs");
        BaconBoots = new BaconArmor(BaconArmourMaterial, armorBaconBootsID, 3).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("BaconBoots");

        DonutHelm = new DonutArmor(DonutArmourMaterial, armorDonutHelmID, 0).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutHelm");
        DonutChest = new DonutArmor(DonutArmourMaterial, armorDonutChestID, 1).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutChest");
        DonutLegs = new DonutArmor(DonutArmourMaterial, armorDonutLegsID, 2).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutLegs");
        DonutBoots = new DonutArmor(DonutArmourMaterial, armorDonutBootsID, 3).setCreativeTab(DonutCraft.DonutTab).setUnlocalizedName("DonutBoots");


    }

    public static void register(){
        GameRegistry.registerItem(itemBaconSword, "BaconSword");
        GameRegistry.registerItem(itemBaconAxe, "BaconAxe");
        GameRegistry.registerItem(itemBaconPick, "BaconPick");
        GameRegistry.registerItem(itemBaconSpade, "BaconSpade");
        GameRegistry.registerItem(itemBaconHoe, "BaconHoe");
        GameRegistry.registerItem(itemDonutSword, "DonutSword");
        GameRegistry.registerItem(itemDonutAxe, "DonutAxe");
        GameRegistry.registerItem(itemDonutPick, "DonutPick");
        GameRegistry.registerItem(itemDonutSpade, "DonutSpade");
        GameRegistry.registerItem(itemDonutHoe, "DonutHoe");
        GameRegistry.registerItem(itemDonutGemSword, "DonutGemSword");
        GameRegistry.registerItem(itemDonutGemPick, "DonutGemPick");
        GameRegistry.registerItem(BaconHelm, "BaconHelm");
        GameRegistry.registerItem(BaconChest, "BaconChest");
        GameRegistry.registerItem(BaconLegs, "BaconLeg");
        GameRegistry.registerItem(BaconBoots, "BaconBoots");
        GameRegistry.registerItem(DonutHelm, "DonutHelm");
        GameRegistry.registerItem(DonutChest, "DonutChest");
        GameRegistry.registerItem(DonutLegs, "DonutLeg");
        GameRegistry.registerItem(DonutBoots, "DonutBoots");
        GameRegistry.registerItem(itemDonutGem, "DonutGem");
        GameRegistry.registerItem(itemDonutGemDust, "DonutGemDust");
        GameRegistry.registerItem(DonutHammer, "DonutHammer");
    }

}
