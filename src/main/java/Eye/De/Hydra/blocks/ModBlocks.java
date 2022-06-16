package Eye.De.Hydra.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import Eye.De.Hydra.blocks.custom.EDHstairsBlock;
import Eye.De.Hydra.blocks.custom.amethyst_fox;
import Eye.De.Hydra.blocks.custom.easypidestal_block;
import Eye.De.Hydra.blocks.custom.floater;
import Eye.De.Hydra.blocks.custom.ricinus_grow;
import Eye.De.Hydra.blocks.custom.sc_cb;
import Eye.De.Hydra.blocks.custom.thin_slab;

public class ModBlocks {
	public  static  final Block puk =new Block (FabricBlockSettings.of(Material.METAL).strength(4.0f,7.0f));
	public  static  final Block oresappi =new Block (FabricBlockSettings.of(Material.METAL).strength(2.5f,1.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
	public  static  final Block orerubbi =new Block (FabricBlockSettings.of(Material.METAL).strength(2.5f,1.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
	public  static  final Block oresilver =new Block (FabricBlockSettings.of(Material.METAL).strength(2.0f,1.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
	
	public  static  final sc_cb smcauld =new sc_cb (FabricBlockSettings.of(Material.METAL).strength(2.0f,1.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
	
	public  static  final thin_slab ironbars_s =new thin_slab (net.minecraft.block.Blocks.IRON_BLOCK.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(2.0f,1.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
	public  static  final Block ironbars_st =new EDHstairsBlock (net.minecraft.block.Blocks.IRON_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL).strength(2.0f,1.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
	public  static  final amethyst_fox foxe =new amethyst_fox (FabricBlockSettings.of(Material.METAL).strength(3f,2.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
	public  static  final ricinus_grow ricinus_grow =new ricinus_grow (FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision());
	public  static  final easypidestal_block easypidestal_ =new easypidestal_block (FabricBlockSettings.of(Material.METAL).strength(2.0f,1.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
	
	public  static  final floater floater_ =new floater (FabricBlockSettings.of(Material.METAL).strength(2.0f,1.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
	
	
	
	
	
	
}