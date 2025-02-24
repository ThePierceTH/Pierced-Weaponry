package com.pierceth.pierced_weaponry;

import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.pierceth.pierced_weaponry.item.PWItems;

@Mod(Constants.MOD_ID)
public class PiercedWeaponry {

    public PiercedWeaponry() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CommonClass.init(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::commonSetup);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Future setup logic
    }
}