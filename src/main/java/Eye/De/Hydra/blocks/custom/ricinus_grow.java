package Eye.De.Hydra.blocks.custom;

import Eye.De.Hydra.items.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class ricinus_grow extends CropBlock{

	public ricinus_grow(Settings settings) {
		super(settings);
	}
	
	protected ItemConvertible getSeedItems( ) {
		return ModItems.ricinus_seed;
	}
}