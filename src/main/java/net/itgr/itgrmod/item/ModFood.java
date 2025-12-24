package net.itgr.itgrmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties LEMON = new FoodProperties.Builder().nutrition(4)
    .saturationModifier(0.25f).build();
    //.effect(new MobEffectInstance(MobEffects.INVISIBILITY, 400), 0.20f)
}
