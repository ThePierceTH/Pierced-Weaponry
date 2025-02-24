package com.pierceth.pierced_weaponry.item;

import com.pierceth.pierced_weaponry.client.PWRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public class PWItem extends SwordItem implements GeoItem {

    private AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public PWItem(int attackDmg, float attackSpd) {
        super(Tiers.NETHERITE, attackDmg, attackSpd, new Item.Properties().fireResistant());
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() { return this.cache; }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {

            private PWRenderer itrenders;
            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                this.itrenders = new PWRenderer();
                return this.itrenders;
            }
        });
    }
}