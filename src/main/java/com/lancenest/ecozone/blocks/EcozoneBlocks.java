package com.lancenest.ecozone.blocks;

import com.lancenest.ecozone.Ecozone;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EcozoneBlocks {
    public static final DeferredRegister.Blocks ECOZONE_BLOCKS = DeferredRegister.createBlocks(Ecozone.MODID);

    public static final DeferredBlock<Block> ROOTS = ECOZONE_BLOCKS.registerSimpleBlock("roots", BlockBehaviour.Properties.of().mapColor(MapColor.PLANT));

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ecozone.MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ECOZONE_TAB = CREATIVE_MODE_TABS.register("ecozone_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.ecozone"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> Ecozone.EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(Ecozone.EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());
}
