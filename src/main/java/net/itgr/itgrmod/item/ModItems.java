package net.itgr.itgrmod.item;



import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.itgr.itgrmod.ITgrMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ITgrMod.MOD_ID);

    public static final RegistryObject<Item> SCURVYPOTION = ITEMS.register("scurvypotion",
            () -> new  Item(new Item.Properties().setId(ITEMS.key("scurvypotion"))));


    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            () -> new  Item(new Item.Properties().setId(ITEMS.key("steel"))));

    public static final RegistryObject<Item> GUN = ITEMS.register("gun",
            () -> new BowItem(new Item.Properties().durability(500).setId(ITEMS.key("gun"))));

    public static final RegistryObject<Item> BULLET = ITEMS.register("bullet",
            () -> new ArrowItem(new Item.Properties().setId(ITEMS.key("bullet"))));


    public static final RegistryObject<Item> SABER = ITEMS.register("saber",
            () -> new  Item(new Item.Properties().setId(ITEMS.key("saber"))));



    //public static final RegistryObject<Item> STEEL_BLOCK = ITEMS.register("steel_block_item",
    //        () -> new  Item(new Item.Properties().setId(ITEMS.key("steel_block_item"))));



    public  static void register(BusGroup busGroup)
    {
        ITEMS.register(busGroup);
    }




}
