package Eye.De.Hydra;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item.Settings;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

public class dhmater implements ToolMaterial {
	public int getDurability() {
	    return 500;
	}
	public float getAttackDamage() {
	    return 18.5F;
	}
	public int getEnchantability() {
	    return 9;
	}
	public int getMiningLevel() {
		return 1;
	}
	public float getMiningSpeedMultiplier() {
		return 1.0f;
	}
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.IRON_BLOCK);
	}
	public static final dhmater INSTANCE = new dhmater();
	
}