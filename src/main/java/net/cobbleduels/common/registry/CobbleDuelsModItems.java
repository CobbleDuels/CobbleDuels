package net.cobbleduels.common.registry;

import net.cobbleduels.CobbleDuelsMod;
import net.cobbleduels.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CobbleDuelsModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobbleDuelsMod.MOD_ID);
    public static final DeferredItem<Item> DUEL_DISK = ITEMS.register("duel_disk", () -> new Item(new Item.Properties()));
}
