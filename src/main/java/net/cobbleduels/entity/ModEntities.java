package net.cobbleduels.entity;

import net.cobbleduels.CobbleDuelsMod;
import net.cobbleduels.entity.custom.DarkMagicianEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
           DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, CobbleDuelsMod.MOD_ID);

    public static final Supplier<EntityType<DarkMagicianEntity>> DarkMagician =
            ENTITY_TYPES.register("darkmagician",() -> EntityType.Builder.of(DarkMagicianEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 1.8f).build("darkmagician"));

    public static void register (IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
