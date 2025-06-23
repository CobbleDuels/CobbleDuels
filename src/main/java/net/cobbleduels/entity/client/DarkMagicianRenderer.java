package net.cobbleduels.entity.client;

import net.cobbleduels.CobbleDuelsMod;
import net.cobbleduels.entity.custom.DarkMagicianEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DarkMagicianRenderer
        extends MobRenderer<DarkMagicianEntity, DarkMagicianModel<DarkMagicianEntity>> {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(
                    CobbleDuelsMod.MOD_ID,
                    "textures/entity/dm_texture.png"
            );

    public DarkMagicianRenderer(EntityRendererProvider.Context ctx) {
        super(
                ctx,
                new DarkMagicianModel<>(ctx.bakeLayer(DarkMagicianModel.LAYER_LOCATION)),
                0.5f  // tamanho da sombra
        );
    }

    @Override
    public ResourceLocation getTextureLocation(DarkMagicianEntity entity) {
        return TEXTURE;
    }
}
