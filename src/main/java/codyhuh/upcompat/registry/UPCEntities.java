package codyhuh.upcompat.registry;

import codyhuh.upcompat.UPCompat;
import codyhuh.upcompat.common.entities.FangFlyEggEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class UPCEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, UPCompat.MOD_ID);

    public static final RegistryObject<EntityType<FangFlyEggEntity>> FANG_FLY_EGG = ENTITIES.register("fang_fly_egg", () -> EntityType.Builder.<FangFlyEggEntity>of(FangFlyEggEntity::new, MobCategory.MISC).sized(0.25F, 0.25F).build("fang_fly_egg"));
}
