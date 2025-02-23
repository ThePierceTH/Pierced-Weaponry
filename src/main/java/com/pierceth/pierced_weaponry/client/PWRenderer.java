package com.pierceth.pierced_weaponry.client;

import com.pierceth.pierced_weaponry.item.PWItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class PWRenderer extends GeoItemRenderer<PWItem> {
    public PWRenderer() {
        super(new PWModel());
    }
}
