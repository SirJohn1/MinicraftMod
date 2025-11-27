package net.itgr.itgrmod.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;

public class ScurvyEffect extends MobEffect {

    public  ScurvyEffect(MobEffectCategory pCategory, int pColor){
        super(pCategory, pColor);
    }

    @Override
    public boolean applyEffectTick(ServerLevel pLevel, LivingEntity pEntity, int pAmplifier) {
        //прожоливость, урок впитывает больше урона
        return super.applyEffectTick(pLevel, pEntity, pAmplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return true;
    }
}

