package net.itgr.itgrmod.effect;

import net.itgr.itgrmod.ITgrMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModEffects {

    public static  final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ITgrMod.MOD_ID);

    public static final RegistryObject<MobEffect> SCURVY_EFFECT = MOB_EFFECTS.register("scurvy",
            () -> new ScurvyEffect(MobEffectCategory.NEUTRAL, 0xdedb2b)
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(ITgrMod.MOD_ID, "scurvy"),
                            -0.25f, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static void register(BusGroup busGroup){
        MOB_EFFECTS.register(busGroup);
    }
}
