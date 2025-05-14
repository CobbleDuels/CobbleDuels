package net.cobbleduels.registry;

import net.cobbleduels.CobbleDuelsMod;
import net.cobbleduels.item.DuelDiskItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CobbleDuelsModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, CobbleDuelsMod.MOD_ID);

    public static final DeferredHolder<Item, DuelDiskItem> DUEL_DISK =
            ITEMS.register("duel_disk", DuelDiskItem::new);
}
