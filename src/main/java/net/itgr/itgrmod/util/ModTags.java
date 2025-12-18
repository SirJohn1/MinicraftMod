package net.itgr.itgrmod.util;

import net.itgr.itgrmod.ITgrMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_STEEL_TOOL = create("needs_steel_tool");

        private static TagKey<Block> create(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ITgrMod.MOD_ID,name));
        }

    }

    public static class Items{

        private static TagKey<Item> create(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ITgrMod.MOD_ID,name));
        }

    }
}
