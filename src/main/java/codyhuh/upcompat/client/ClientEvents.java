package codyhuh.upcompat.client;

import codyhuh.upcompat.UPCompat;
import codyhuh.upcompat.registry.UPCEntities;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UPCompat.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void registerRenders(EntityRenderersEvent.RegisterRenderers e) {
        e.registerEntityRenderer(UPCEntities.FANG_FLY_EGG.get(), ThrownItemRenderer::new);
    }
}
