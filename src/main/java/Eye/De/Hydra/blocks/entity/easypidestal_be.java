package Eye.De.Hydra.blocks.entity;

import Eye.De.Hydra.EyeUnDeHydra;
import Eye.De.Hydra.blocks.custom.easypidestal_block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

public class easypidestal_be extends BlockEntity{

	public easypidestal_be(BlockPos pos, BlockState state) {
		super(EyeUnDeHydra.easypidestal_block_entity, pos, state);
	}
	
	private String using = easypidestal_block.iteminhand.toString();
	
	@Override
    public NbtCompound writeNbt(NbtCompound tag) {
        super.writeNbt(tag);
 
        // Save the current value of the number to the tag
        tag.putString("number", using);
        
 
        return tag;
    }
	@Override
	public void readNbt(NbtCompound tag) {
	    super.readNbt(tag);
	 
	    using = tag.getString("number");
	}
	
}