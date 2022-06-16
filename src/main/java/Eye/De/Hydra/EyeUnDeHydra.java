package Eye.De.Hydra;
 

import Eye.De.Hydra.blocks.ModBlocks;
import Eye.De.Hydra.blocks.entity.easypidestal_be;
import Eye.De.Hydra.blocks.entity.floaterBlockEntity;
import Eye.De.Hydra.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EyeUnDeHydra implements ModInitializer {
	public static final ItemGroup EDH = FabricItemGroupBuilder.build(new Identifier("edhydra"), ()-> new ItemStack(ModItems.rubyin));
	public static String MOD_ID = "eye_de_hydra";
	
	public static BlockEntityType<floaterBlockEntity> Floater_Block_Entity;
	public static BlockEntityType<easypidestal_be> easypidestal_block_entity;
    @Override
    public void onInitialize() {
    	
    
    	
    	
     ModRegister.registerItems();
     ModRegister.registerBlockItems();
     ModRegister.registerBlocks();
     ModRegister.registerModFuels();
     ModRegister.registerModSounds();
     ModRegister.registerMuchBlocks();
     
     easypidestal_block_entity = Registry.register(Registry.BLOCK_ENTITY_TYPE, "eye_de_hydra:easypidestal_be", FabricBlockEntityTypeBuilder.create(easypidestal_be::new, ModBlocks.easypidestal_).build());
     
     Floater_Block_Entity = Registry.register(Registry.BLOCK_ENTITY_TYPE, "eye_de_hydra:floater_be", FabricBlockEntityTypeBuilder.create(floaterBlockEntity::new, ModBlocks.floater_).build());
     
     
     BlockRenderLayerMap.INSTANCE.putBlock(Eye.De.Hydra.blocks.ModBlocks.ironbars_s, RenderLayer.getCutout());
     BlockRenderLayerMap.INSTANCE.putBlock(Eye.De.Hydra.blocks.ModBlocks.ricinus_grow, RenderLayer.getCutout());
     BlockRenderLayerMap.INSTANCE.putBlock(Eye.De.Hydra.blocks.ModBlocks.smcauld, RenderLayer.getCutout());
     
     
    }    
}