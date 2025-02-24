package com.pierceth.pierced_weaponry.client;

import com.pierceth.pierced_weaponry.item.PWItem;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class PWRenderer extends GeoItemRenderer<PWItem> {
    public PWRenderer() {
        super(new PWModel());
    }
    @Override
    public RenderType getRenderType(PWItem animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return RenderType.itemEntityTranslucentCull(texture);
    }
}
