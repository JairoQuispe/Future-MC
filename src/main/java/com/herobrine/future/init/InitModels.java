package com.herobrine.future.init;

import com.herobrine.future.client.Modeled;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class InitModels {
    public static void initModel() {
        for(Modeled modeled : InitElements.MODELED) {
            if(modeled instanceof Item) {
                if(ForgeRegistries.ITEMS.getValue(((Item) modeled).getRegistryName()) != null) {
                    modeled.model();
                }
            } else {
                if(ForgeRegistries.BLOCKS.getValue(((Block) modeled).getRegistryName()) != null) {
                    modeled.model();
                }
            }
        }/*
        if(general.lantern) LANTERN.model(); // Blocks
        if(general.barrel) BARREL.model();
        if(general.stonecutter) STONECUTTER.model();
        if(general.blastFurnace) BLAST_FURNACE.model();
        if(general.smoker) SMOKER.model();
        if(general.loom) LOOM.model();
        if(general.fletchingTable) FLETCHING_TABLE.model();
        if(general.smithingTable) SMITHING_TABLE.model();
        if(general.grindstone) GRINDSTONE.model();
        //if(general.lectern) LECTERN.model();
        if(general.composter) COMPOSTER.model();

        if(modFlowers.lily) LILY_OF_VALLEY.model();
        if(modFlowers.cornflower) CORNFLOWER.model();
        if(modFlowers.witherRose) WITHER_ROSE.model();
        if(general.berryBush) SWEET_BERRY.model();
        if(general.bamboo) BAMBOO_ITEM.model();
        if(general.campfire) CAMPFIRE.model();

        if(general.strippedLogs) {
            STRIPPED_ACACIA_LOG.model();
            STRIPPED_JUNGLE_LOG.model();
            STRIPPED_BIRCH_LOG.model();
            STRIPPED_OAK_LOG.model();
            STRIPPED_SPRUCE_LOG.model();
            STRIPPED_DARK_OAK_LOG.model();
        }
        if(general.newWallVariants) {
            BRICK_WALL.model();
            GRANITE_WALL.model();
            ANDESITE_WALL.model();
            DIORITE_WALL.model();
            SANDSTONE_WALL.model();
            RED_SANDSTONE_WALL.model();
            STONE_BRICK_WALL.model();
            MOSSY_STONE_WALL.model();
            NETHER_BRICK_WALL.model();
            RED_NETHER_BRICK_WALL.model();
            END_STONE_WALL.model();
            PRISMARINE_WALL.model();
        }
        //if(general.newSlabVariants) {
        // for (ItemNewSlab slab : ItemNewSlab.Slabs.SLAB_ITEMS) {
        //      slab.model();
        //   }
        //}

        if(general.smoothStone) SMOOTH_STONE.model();
        if(general.smoothQuartz) SMOOTH_QUARTZ.model();

        if(modFlowers.dyes) DYES.model();    // Items
        if(general.trident) TRIDENT.model();
        if(general.loom) PATTERNS.model();
        //if(general.crossbow) CROSSBOW.model();
        if(modFlowers.suspiciousStew) SUSPICIOUS_STEW.model();*/
    }
}