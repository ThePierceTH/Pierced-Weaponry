package com.pierceth.pierced_weaponry.item;

import com.pierceth.pierced_weaponry.Constants;
import com.pierceth.pierced_weaponry.item.custom.EclipseKnightZweihander;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PWItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static final RegistryObject<Item> EK_ZWEIHANDER =
            ITEMS.register("ek_zweihander",() -> new PWItem(Tiers.NETHERITE, 0, 0.0F, new Item.Properties().fireResistant()));
}
