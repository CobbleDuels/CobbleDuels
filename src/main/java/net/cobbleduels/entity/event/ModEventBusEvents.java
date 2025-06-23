package net.cobbleduels.entity.event;

import net.cobbleduels.CobbleDuelsMod;
import net.cobbleduels.entity.ModEntities;
import net.cobbleduels.entity.client.DarkMagicianModel;
import net.cobbleduels.entity.custom.DarkMagicianEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = CobbleDuelsMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(DarkMagicianModel.LAYER_LOCATION, DarkMagicianModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.DarkMagician.get(), DarkMagicianEntity.createMobAttributes().build());
    }
}
