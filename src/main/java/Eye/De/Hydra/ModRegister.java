package Eye.De.Hydra;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import static Eye.De.Hydra.EyeUnDeHydra.MOD_ID;
import static Eye.De.Hydra.items.ModItems.*;

import Eye.De.Hydra.sounds.ModSounds;

import static Eye.De.Hydra.blocks.ModBlocks.*;

public class ModRegister {
	public static void registerItems() {
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rubbi"), rubyin);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sappi"), sapfire);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pencil"), pencil);
	    
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "silvernugget"), sil_nug);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pomade"), pomade);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ricinus_oil"), ricinus_oil);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "clrubbi"), clrubbi);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "clstrubbi"), clstrubbi);	    
	    
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crashed_rubbi"), crashed_rubyin);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acetic_acid"), acetic_acid);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "good_vine"), good_vine);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "grape_juice"), grape_juice);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_egg"), netherite_egg);
	    
	    
	    
	    

	    
	    
	    
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "daohydra"), hydraDao);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hydra_s_hat"), hydrahat);

	    
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "meatbread"), belyash);
	    
	    
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wcott"), wcotton); 
	}
	public static void registerBlockItems() {
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "smcauldi"), ismcauld);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_bars_slab_item"), ib_s);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_block_item"), foxe_item);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "easypidestal_item"),easypidestal_item);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ricinus_seed"),ricinus_seed);
	    
	    Registry.register(Registry.ITEM , new Identifier(MOD_ID, "silver_ore"), silveore);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rubbinore"), rubbiore);
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sappinore"), sappiore);
	   
	}

	
	
	public static void registerBlocks() {
	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "puk"), puk);
	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sapfireore"), oresappi);
	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rubbiore"), orerubbi);
	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "silverore"), oresilver);
	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "smellscauldron"), smcauld);
	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "amethyst_fox"), foxe);
	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ricinus_grow"), ricinus_grow);
	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "easypidestal"), easypidestal_);
	
	
	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "iron_bars_slab"), ironbars_s);
	Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "iron_bars_stairs"), ironbars_st);

	
	}
	public static void registerModFuels(){
		System.out.println("Now registring fuels for "+MOD_ID);
		FuelRegistry.INSTANCE.add(wcotton, 100);
	}
	public static void registerModSounds() {
		Registry.register(Registry.SOUND_EVENT, new Identifier(MOD_ID, "brownnoise"), ModSounds.testnoise);
	}
	public static void registerMuchBlocks() {
		regHelper.regHelperModColoredBlocks("what", Material.STONE, 3, 2.5f);
	}
	
}