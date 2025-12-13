package net.itgr.itgrmod.potion;

import net.itgr.itgrmod.ITgrMod;
import net.itgr.itgrmod.effect.ModEffects;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public  static  final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, ITgrMod.MOD_ID);

    public static final RegistryObject<Potion> SCURVY_POTION =
            POTIONS.register("scurvy_potion", () -> new Potion("scurvy_potion",
                    new MobEffectInstance(ModEffects.SCURVY_EFFECT.getHolder().orElseThrow(), 1000, 0)));

    public  static void register(BusGroup busGroup){
        POTIONS.register(busGroup);
    }
}
