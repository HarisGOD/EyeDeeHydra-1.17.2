package Eye.De.Hydra.blocks.custom;

import Eye.De.Hydra.blocks.entity.floaterBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class floater extends Block implements BlockEntityProvider {

	public floater(Settings settings) {
		super(settings);
	}

	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new floaterBlockEntity(pos, state);
	}
	
	
}