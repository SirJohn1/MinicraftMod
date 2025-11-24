package net.test.testmods.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.test.testmods.TestMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> MOD_ITEMS = CREATIVE_MODE_TABS.register("mods_items_tab",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.STEEL.get()))//создание вкладки
                    //.withTabsBefore(MOD_ITEMS.getId()) получает id указаной вкладки и она будет после указаной
                    .title(Component.translatable("creativetab.testmod.mod_item"))
                    .displayItems((itemDisplayParameters, output) -> { //метод дя вывода предметов
                      output.accept(ModItems.STEEL.get());//вывод предметов на вкладку
                    }).build());


    public  static void register(BusGroup busGroup)
    {
        CREATIVE_MODE_TABS.register(busGroup);
    }


}
