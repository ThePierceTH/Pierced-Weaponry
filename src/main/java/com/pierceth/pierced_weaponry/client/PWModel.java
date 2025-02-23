package com.pierceth.pierced_weaponry.client;

import com.pierceth.pierced_weaponry.item.PWItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib.model.GeoModel;

import java.util.Objects;

public class PWModel extends GeoModel<PWItem> {

    @Override
    public ResourceLocation getModelResource(PWItem value) {
        return new ResourceLocation("geo/" + grabbyTheName(value) + "geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PWItem value) {
        return new ResourceLocation("texture/item/" + grabbyTheName(value) + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(PWItem pwItem) {
        return null;
    }
        private String grabbyTheName(PWItem name) {
            ResourceLocation theLiteralName = Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(name));
            return theLiteralName.getPath();
        }
    }
