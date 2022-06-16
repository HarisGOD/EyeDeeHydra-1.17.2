package Eye.De.Hydra.items.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.sound.Sound;
import net.minecraft.command.argument.EntityAnchorArgumentType.EntityAnchor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import Eye.De.Hydra.dhmater;

public class dhs_se extends SwordItem {
 
    public dhs_se(Settings settings) {
        super(dhmater.INSTANCE, 0, -3.5f , settings);
    }

    
    
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
        playerEntity.playSound(SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, 0.5F, 1.0F);
        playerEntity.playSound(SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, 0.5F, 1.0F);
        
        playerEntity.getStackInHand(hand).setNbt(new NbtCompound());
        
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
    
    
    
    public void appendTooltip(ItemStack is, @Nullable World wrd, List<Text> tooltip, TooltipContext ttcxt) {
    		tooltip.add(new LiteralText("a"));
    }
}