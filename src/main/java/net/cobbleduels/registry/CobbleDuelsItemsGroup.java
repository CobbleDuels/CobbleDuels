package net.cobbleduels.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.cobbleduels.CobbleDuelsMod.MOD_ID;

public class CobbleDuelsItemsGroup {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COBBLE_TAB = TABS.register("cobbleduels",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cobbleduels"))
                    .icon(() -> new ItemStack(CobbleDuelsModItems.DUEL_DISK.get()))
                    .displayItems((ctx, output) -> {
                        output.accept(CobbleDuelsModItems.DUEL_DISK.get());
                    })
                    .build()
    );
}
