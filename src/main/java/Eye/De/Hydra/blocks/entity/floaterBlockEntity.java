package Eye.De.Hydra.blocks.entity;

import Eye.De.Hydra.EyeUnDeHydra;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class floaterBlockEntity extends BlockEntity {

	public floaterBlockEntity(BlockPos pos, BlockState state) {
		super( EyeUnDeHydra.Floater_Block_Entity, pos, state);
	}
	
	
}