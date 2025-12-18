package net.itgr.itgrmod.block;

import net.itgr.itgrmod.ITgrMod;
import net.itgr.itgrmod.block.custom.MapBlock;
import net.itgr.itgrmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ITgrMod.MOD_ID);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .setId(BLOCKS.key("steel_block")) // Этот вызов уже есть
                    .strength(5f)
                    .requiresCorrectToolForDrops()
            ));
    //ручная регистрация блока как предмет
    //public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ModItems.ITEMS.register("steel_block",
    //        () -> new BlockItem(STEEL_BLOCK.get(), new Item.Properties().setId(ModItems.ITEMS.key("steel_block"))));


    public static final RegistryObject<Block> MAP = registerBlock("map",
            () -> new MapBlock(BlockBehaviour.Properties.of()
                    .strength(2.0f)
                    .noOcclusion()
                    .dynamicShape()
                    .setId(BLOCKS.key("map")) // ДОБАВЬТЕ ЭТУ СТРОКУ
            ));

    //регистрация блока как предмет
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().setId(ModItems.ITEMS.key(block.getId()))));
    }




    public  static void register(BusGroup busGroup)
    {
        BLOCKS.register(busGroup);
    }
}
