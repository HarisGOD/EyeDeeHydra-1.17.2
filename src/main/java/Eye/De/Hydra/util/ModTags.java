package Eye.De.Hydra.util;


import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import Eye.De.Hydra.EyeUnDeHydra;

public class ModTags{
	
	public static class Blocks{
		public static final Tag<Block> VAL_BL = createTag("val_bl");
		
		private static Tag<Block> createTag(String name){
			return TagRegistry.block(new Identifier(EyeUnDeHydra.MOD_ID, name));
		}
		private static Tag<Block> createCommonTag(String name){
			return TagRegistry.block(new Identifier("c", name));
		}
		
	}
	public static class Items{
		
		private static final Tag<Item> beatis = createCommonTag("beatis");
		
		private static Tag<Item> createTag(String name){
			return TagRegistry.item(new Identifier(EyeUnDeHydra.MOD_ID, name));
		}
		private static Tag<Item> createCommonTag(String name){
			return TagRegistry.item(new Identifier("c", name));
		}
		
	}
	
	
}