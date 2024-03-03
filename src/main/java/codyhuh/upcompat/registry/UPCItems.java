package codyhuh.upcompat.registry;

import coda.croodaceous.registry.CEEntities;
import codyhuh.upcompat.UPCompat;
import codyhuh.upcompat.common.items.FangFlyEggItem;
import com.peeko32213.unusualprehistory.common.item.AnimalAttacherItem;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class UPCItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UPCompat.MOD_ID);

    public static final RegistryObject<Item> CROODACEOUS_FOSSIL = ITEMS.register("croodaceous_fossil", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TERRACOTTA_FOSSIL = ITEMS.register("terracotta_fossil", () -> new BlockItem(UPCBlocks.TERRACOTTA_FOSSIL.get(), new Item.Properties()));

    public static final RegistryObject<Item> FANG_FLY_FLASK = ITEMS.register("fang_fly_flask", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEAROWL_FLASK = ITEMS.register("bearowl_flask", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEAR_PEAR_FLASK = ITEMS.register("bear_pear_flask", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TURTLE_DOVE_FLASK = ITEMS.register("turtle_dove_flask", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JACKROBAT_FLASK = ITEMS.register("jackrobat_flask", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIYOTE_FLASK = ITEMS.register("liyote_flask", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAMU_FLASK = ITEMS.register("ramu_flask", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRY_BUSH_FLASK = ITEMS.register("dry_bush_flask", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESERT_BAOBAB_FLASK = ITEMS.register("desert_baobab_flask", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FANG_FLY_EGG = ITEMS.register("fang_fly_egg", () -> new FangFlyEggItem(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BEAROWL_EMBRYO = ITEMS.register("bearowl_embryo", () -> new AnimalAttacherItem(new Item.Properties().stacksTo(16), UPCTags.BEAROWL_EMBRYO_ATTACH_TO, CEEntities.BEAROWL, 5000));
    public static final RegistryObject<Item> BEAR_PEAR_EMBRYO = ITEMS.register("bear_pear_embryo", () -> new AnimalAttacherItem(new Item.Properties().stacksTo(16), UPCTags.BEAR_PEAR_EMBRYO_ATTACH_TO, CEEntities.BEAROWL, 5000));
    public static final RegistryObject<Item> TURTLE_DOVE_EGG = ITEMS.register("turtle_dove_egg", () -> new BlockItem(UPCBlocks.TURTLE_DOVE_EGG.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> JACKROBAT_EMBRYO = ITEMS.register("jackrobat_embryo", () -> new AnimalAttacherItem(new Item.Properties().stacksTo(16), UPCTags.JACKROBAT_EMBRYO_ATTACH_TO, CEEntities.BEAROWL, 5000));
    public static final RegistryObject<Item> LIYOTE_EMBRYO = ITEMS.register("liyote_embryo", () -> new AnimalAttacherItem(new Item.Properties().stacksTo(16), UPCTags.LIYOTE_EMBRYO_ATTACH_TO, CEEntities.BEAROWL, 5000));
}
