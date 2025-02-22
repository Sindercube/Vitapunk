package com.sindercube.aristotlesComedy.content.block;

import com.mojang.serialization.MapCodec;
import com.sindercube.aristotlesComedy.content.block.entity.AlembicBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class AlembicBlock extends BlockWithEntity {

	public AlembicBlock(Settings settings) {
		super(settings);
	}

	@Override
	protected MapCodec<? extends BlockWithEntity> getCodec() {
		return null;
	}

	@Override
	public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new AlembicBlockEntity(pos, state);
	}

}
