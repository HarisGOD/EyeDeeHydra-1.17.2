package Eye.De.Hydra.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import Eye.De.Hydra.dhmater;
import Eye.De.Hydra.hatpr;
import Eye.De.Hydra.items.custom.dhs_se;
import Eye.De.Hydra.items.custom.netetit;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import Eye.De.Hydra.blocks.ModBlocks;

public class ModItems {
	
	public static final ArmorMaterial hatpr_m = new hatpr();

	public static Item rubyin = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item sapfire = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item pencil = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item sil_nug = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item pomade = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item clrubbi = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item clstrubbi = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item ricinus_oil = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));	
	public static Item wcotton = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item crashed_rubyin = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item acetic_acid = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item grape_juice = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static Item good_vine = new Item(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));	
	

	
	public static SwordItem hydraDao = new dhs_se(new dhs_se.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	
	public static ArmorItem hydrahat = new ArmorItem(Eye.De.Hydra.items.ModItems.hatpr_m, EquipmentSlot.HEAD, new FabricItemSettings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	
	public static Item belyash = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).build()).group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	
	public static Item netherite_egg = new netetit(new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	
	public static BlockItem rubbiore = new BlockItem(Eye.De.Hydra.blocks.ModBlocks.orerubbi, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static BlockItem sappiore = new BlockItem(Eye.De.Hydra.blocks.ModBlocks.oresappi, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static BlockItem silveore = new BlockItem(Eye.De.Hydra.blocks.ModBlocks.oresilver, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	
	public static BlockItem ismcauld = new BlockItem(Eye.De.Hydra.blocks.ModBlocks.smcauld, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static BlockItem ib_s = new BlockItem(Eye.De.Hydra.blocks.ModBlocks.ironbars_s, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static BlockItem foxe_item = new BlockItem(Eye.De.Hydra.blocks.ModBlocks.foxe, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static BlockItem ricinus_seed = new BlockItem(Eye.De.Hydra.blocks.ModBlocks.ricinus_grow, new Item.Settings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));
	public static BlockItem easypidestal_item = new BlockItem(Eye.De.Hydra.blocks.ModBlocks.easypidestal_ , new FabricItemSettings().group(Eye.De.Hydra.EyeUnDeHydra.EDH));

	
}
