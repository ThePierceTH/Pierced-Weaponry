package com.pierceth.pierced_weaponry;

import com.pierceth.pierced_weaponry.item.PWItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.loading.FMLLoader;

public class CommonClass {

    public static void init(IEventBus modEventBus) {
        PWCreativeTabs.register(modEventBus);
        PWItems.ITEMS.register(modEventBus);
    }

    public static boolean isDevEnv() {
        return !FMLLoader.isProduction();
    }

    public static ResourceLocation customLocation(String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }
}
