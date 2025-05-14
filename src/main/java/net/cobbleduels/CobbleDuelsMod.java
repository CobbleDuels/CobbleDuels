package net.cobbleduels;

import net.cobbleduels.registry.CobbleDuelsModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(CobbleDuelsMod.MOD_ID)
public class CobbleDuelsMod {
    public static final String MOD_ID = "cobbleduels";

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public CobbleDuelsMod(IEventBus modEventBus, ModContainer modContainer) {
        CobbleDuelsModItems.ITEMS.register(modEventBus); //
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }
}
