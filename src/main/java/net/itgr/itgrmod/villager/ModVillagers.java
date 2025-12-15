package net.itgr.itgrmod.villager;

import com.google.common.collect.ImmutableSet;
import net.itgr.itgrmod.ITgrMod;
import net.itgr.itgrmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, ITgrMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, ITgrMod.MOD_ID);

    public static final RegistryObject<PoiType> ITGR_POI = POI_TYPES.register("itgr_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.MAP.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> ITGR = VILLAGER_PROFESSIONS.register("itgr",
            () -> new VillagerProfession("itgr", holder -> holder.value() == ITGR_POI.get(),
                    holder -> holder.value() == ITGR_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_CARTOGRAPHER.get()));

    public static void register(BusGroup busGroup) {
        POI_TYPES.register(busGroup);
        VILLAGER_PROFESSIONS.register(busGroup);
    }
}
