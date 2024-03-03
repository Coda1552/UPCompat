package codyhuh.upcompat.registry;

import codyhuh.upcompat.UPCompat;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class UPCTags {
    public static final TagKey<EntityType<?>> BEAROWL_EMBRYO_ATTACH_TO = registerEntityTag("bearowl_embryo_attach_to");
    public static final TagKey<EntityType<?>> LIYOTE_EMBRYO_ATTACH_TO = registerEntityTag("liyote_embryo_attach_to");
    public static final TagKey<EntityType<?>> BEAR_PEAR_EMBRYO_ATTACH_TO = registerEntityTag("bear_pear_embryo_attach_to");
    public static final TagKey<EntityType<?>> JACKROBAT_EMBRYO_ATTACH_TO = registerEntityTag("jackrobat_embryo_attach_to");

    private static TagKey<EntityType<?>> registerEntityTag(String name) {
        return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(UPCompat.MOD_ID, name));
    }
}
