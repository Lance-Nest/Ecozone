package com.lancenest.ecozone.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class Roots extends Block {
    public static DirectionProperty FACING = DirectionProperty.create("facing");
    public static IntegerProperty SIZE = IntegerProperty.create("size", 0, 3);
    public static BooleanProperty CONNECTED = BooleanProperty.create("connected");

    public Roots(Properties properties) {
        super(properties);
    }
}
