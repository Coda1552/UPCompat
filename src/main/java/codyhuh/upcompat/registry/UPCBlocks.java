package codyhuh.upcompat.registry;

import coda.croodaceous.registry.CEEntities;
import codyhuh.upcompat.UPCompat;
import codyhuh.upcompat.common.entities.FangFlyEggEntity;
import com.peeko32213.unusualprehistory.common.block.BlockDinosaurLandEggs;
import com.peeko32213.unusualprehistory.core.registry.UPEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class UPCBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UPCompat.MOD_ID);

    public static final RegistryObject<Block> TURTLE_DOVE_EGG = BLOCKS.register("turtle_dove_egg", () -> new BlockDinosaurLandEggs(BlockBehaviour.Properties.of(Material.EGG, MaterialColor.COLOR_LIGHT_GREEN).strength(0.5F).sound(SoundType.BONE_BLOCK).randomTicks().noOcclusion(), CEEntities.TURTLE_DOVE, 1, Block.box(5.0, 0.0, 5.0, 11.0, 9.0, 11.0), 2400, 12000));
    public static final RegistryObject<Block> TERRACOTTA_FOSSIL = BLOCKS.register("terracotta_fossil", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
}
