package Eye.De.Hydra;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class hatpr implements ArmorMaterial {

	public int getDurability(EquipmentSlot slot) {
		return 1350;
	}

	public int getEnchantability() {
		return 9;
	}

	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_TURTLE;
	}

	public float getKnockbackResistance() {
		return 0;
	}

	public String getName() {
		return "allinone";
	}

	public int getProtectionAmount(EquipmentSlot slot) {
		
		return 4;
	}

	
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Eye.De.Hydra.items.ModItems.clstrubbi);
	}


	public float getToughness() {
	
		return 1;
	}

	
}