package com.pierceth.pierced_weaponry.item;

import com.pierceth.pierced_weaponry.Constants;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PWItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static final RegistryObject<Item> EK_ZWEIHANDER =
            registerItem("ek_zweihander", 0, 0.0F);
    public static final RegistryObject<Item> EK_LONGSWORD =
            registerItem("ek_longsword", 0, -2.8F);
    public static final RegistryObject<Item> EK_BROADSWORD =
            registerItem("ek_broadsword", 0, -2.4F);
    public static final RegistryObject<Item> EK_SPEAR =
            registerItem("ek_spear", 0, -3.12F);
    public static final RegistryObject<Item> TEST = ITEMS.register("test", () -> new Item(new Item.Properties()));

    public static RegistryObject<Item> registerItem(String name,int atkDmg, float atkSpd){
        return ITEMS.register(name, () -> new PWItem(atkDmg, atkSpd));
    }
}