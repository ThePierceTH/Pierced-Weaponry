package com.pierceth.pierced_weaponry;

import com.pierceth.pierced_weaponry.item.PWItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PWCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PIERCED_WEAPONRY = TABS.register("items",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".items"))
                    .icon(() -> new ItemStack(Items.ACACIA_FENCE.asItem()))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .displayItems((params, output) -> {
                        PWItems.ITEMS.getEntries().forEach(it -> {
                            output.accept(it.get());
                        });
                            })
                    .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
