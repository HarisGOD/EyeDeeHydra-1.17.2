package Eye.De.Hydra;

import static Eye.De.Hydra.EyeUnDeHydra.MOD_ID;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class regHelper{
	
	
	
	public static void regHelperModColoredBlocks(String name, Material mater, float MiningLevel, float MiningSpeed) {
		
		 final Block Red = new Block(FabricBlockSettings.of(mater).strength(MiningLevel, MiningSpeed));
		 	final Block Blue = new Block(FabricBlockSettings.of(mater).strength(MiningLevel,  MiningSpeed));
		 	final Block Yellow = new Block(FabricBlockSettings.of(mater).strength(MiningLevel,  MiningSpeed));
		 	final Block Green = new Block(FabricBlockSettings.of(mater).strength(MiningLevel,  MiningSpeed));
		 	final Block White = new Block(FabricBlockSettings.of(mater).strength(MiningLevel,  MiningSpeed));
		 	final Block Black = new Block(FabricBlockSettings.of(mater).strength(MiningLevel,  MiningSpeed));
		
		
		
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name + "_red"), Red);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name + "_blue"), Blue);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name + "_yellow"), Yellow);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name + "_green"), Green);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name + "_white"), White);
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name + "_black"), Black);
		
		
		
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_red_item"),new BlockItem(Red, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH)));
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_blue_item"),new BlockItem(Blue, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH)));
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_yellow_item"),new BlockItem(Yellow, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH)));
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_green_item"),new BlockItem(Green, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH)));
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_white_item"),new BlockItem(White, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH)));
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_black_item"),new BlockItem(Black, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH)));
			
		
		
		
	}
}