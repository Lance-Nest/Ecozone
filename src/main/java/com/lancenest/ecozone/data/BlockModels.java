package com.lancenest.ecozone.data;

import com.lancenest.ecozone.Ecozone;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlockModels extends BlockStateProvider {

	public BlockModels(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, Ecozone.MODID, exFileHelper);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void registerStatesAndModels() {
		
	}
}
