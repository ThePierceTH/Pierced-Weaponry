package com.pierceth.pierced_weaponry.item;

import com.pierceth.pierced_weaponry.Constants;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PWItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static final RegistryObject<Item> EK_ZWEIHANDER =
            registerItem("ek_zweihander", 0, -3.0F);
    public static final RegistryObject<Item> EK_LONGSWORD =
            registerItem("ek_longsword", 0, -2.8F);
    public static final RegistryObject<Item> EK_BROADSWORD =
            registerItem("ek_broadsword", 0, -2.4F);
    public static final RegistryObject<Item> EK_SPEAR =
            registerItem("ek_spear", 0, -3.12F);
    public static final RegistryObject<Item> EK_DAGGER =
            registerItem("ek_dagger", 0, -1.6F);

    public static RegistryObject<Item> registerItem(String name,int atkDmg, float atkSpd){
        return ITEMS.register(name, () -> new PWItem(atkDmg, atkSpd));
    }
}