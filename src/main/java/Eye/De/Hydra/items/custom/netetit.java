package Eye.De.Hydra.items.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class netetit extends Item{
	public netetit(Settings settings) {
        super(settings);
    }
	
	public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.ENTITY_EGG_THROW, 1.0F, 1.0F);
        playerEntity.getInventory().removeStack(playerEntity.getInventory().selectedSlot, 1);
       
        
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
    
	
	
	
}