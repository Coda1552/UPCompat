package codyhuh.upcompat.registry;

import codyhuh.upcompat.UPCompat;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class UPCTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UPCompat.MOD_ID);

    public static final RegistryObject<CreativeModeTab> UPC_TAB = TABS.register("upc_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + UPCompat.MOD_ID))
                    .icon(UPCItems.FANG_FLY_EGG.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        for (var item : UPCItems.ITEMS.getEntries()) {
                            output.accept(item.get());
                        }
                    })
                    .build()
    );
}