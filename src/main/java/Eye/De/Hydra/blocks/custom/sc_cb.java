package Eye.De.Hydra.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.inventory.Inventory;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;

public class sc_cb extends Block {
	private static final ItemStack itst = new ItemStack(Eye.De.Hydra.items.ModItems.ricinus_oil);
	private static final ItemStack itgl = new ItemStack(net.minecraft.item.Items.GLASS_BOTTLE);
	private static final IntProperty inscont = IntProperty.of("inscont", 0, 2); //states cauldron 
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(inscont);  
    }

	public sc_cb(Settings settings) {
		super(settings);
		setDefaultState(getStateManager().getDefaultState().with(inscont, 0));
	}
	
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
	     return VoxelShapes.cuboid(0.1f,0.1f,0.1f,0.9f,0.9f,0.9f);
	     
	 }
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
        }
		if (state.toString().equals("Block{eye_de_hydra:smellscauldron}[inscont=0]") ) { //we have oil that we pour into the cauldron
			if (player.isHolding(Eye.De.Hydra.items.ModItems.ricinus_oil)){ 
        world.setBlockState(pos, state.with(inscont, 1));
        player.playSound(SoundEvents.BLOCK_BELL_USE, 0.3f, 0.1f);
        world.spawnEntity(new ItemEntity(world,player.getPos().getX() ,player.getPos().getY(),player.getPos().getZ(), itgl));
        player.getInventory().removeStack(player.getInventory().selectedSlot, 1);
				}
		}
        
        if (state.toString().equals("Block{eye_de_hydra:smellscauldron}[inscont=1]")){ //we have a bottle with which we take oil from the boiler
        	if (player.isHolding(net.minecraft.item.Items.GLASS_BOTTLE)){
            world.setBlockState(pos, state.with(inscont, 0));
            player.playSound(SoundEvents.BLOCK_BELL_USE, 0.3f, 0.1f);
            world.spawnEntity(new ItemEntity(world,player.getPos().getX() ,player.getPos().getY(),player.getPos().getZ(), itst));
            player.getInventory().removeStack(player.getInventory().selectedSlot, 1);
            		}
        	}
        if (state.toString().equals("Block{eye_de_hydra:smellscauldron}[inscont=0]")) { //we have oil that we pour into the cauldron
			if (player.isHolding(Eye.De.Hydra.items.ModItems.ricinus_seed)){ 
        world.setBlockState(pos, state.with(inscont, 2));
        player.playSound(SoundEvents.BLOCK_BELL_USE, 0.3f, 0.1f);
        player.getInventory().removeStack(player.getInventory().selectedSlot, 1);
				}
		}
        if (state.toString().equals("Block{eye_de_hydra:smellscauldron}[inscont=2]")) { //we have oil that we pour into the cauldron
			if (player.isHolding(net.minecraft.item.Items.WOODEN_SHOVEL)){ 
        world.setBlockState(pos, state.with(inscont, 1));
        player.playSound(SoundEvents.BLOCK_BELL_USE, 0.3f, 0.1f);
        
				}
		}

        
        
        
        
        

    return ActionResult.SUCCESS;
	}
}