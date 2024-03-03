package codyhuh.upcompat;

import codyhuh.upcompat.registry.UPCBlocks;
import codyhuh.upcompat.registry.UPCEntities;
import codyhuh.upcompat.registry.UPCItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UPCompat.MOD_ID)
public class UPCompat {
    public static final String MOD_ID = "upcompat";

    public UPCompat() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        UPCItems.ITEMS.register(bus);
        UPCEntities.ENTITIES.register(bus);
        UPCBlocks.BLOCKS.register(bus);
    }
}
