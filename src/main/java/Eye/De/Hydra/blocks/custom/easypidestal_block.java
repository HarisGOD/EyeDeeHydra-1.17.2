package Eye.De.Hydra.blocks.custom;


import Eye.De.Hydra.blocks.entity.easypidestal_be;
import Eye.De.Hydra.sounds.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class easypidestal_block extends Block implements BlockEntityProvider{
	
	private static final IntProperty isiteminside = IntProperty.of("isiteminside", 0, 1); //states cauldron 
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(isiteminside);  
    }
	
	public easypidestal_block(Settings settings) {
		super(settings);
		setDefaultState(getStateManager().getDefaultState().with(isiteminside, 0));
	}
	public static Item iteminhand = Items.STONE;
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
	     return VoxelShapes.cuboid(0.125f,0f,0.125f,0.875f,0.805f,0.875f);
	}
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		
		if(state.toString().equals("Block{eye_de_hydra:easypidestal}[isiteminside=0]")) {
			world.setBlockState(pos, state.with(isiteminside, 1));
			iteminhand = player.getMainHandStack().getItem() ;
			player.getInventory().removeStack(player.getInventory().selectedSlot, 1);
			
		}
		if(state.toString().equals("Block{eye_de_hydra:easypidestal}[isiteminside=1]")) {
			world.setBlockState(pos, state.with(isiteminside, 0));
			player.sendMessage(new LiteralText("_"+iteminhand.toString()+"_"), false);
			world.spawnEntity(new ItemEntity(world,player.getPos().getX() ,player.getPos().getY(),player.getPos().getZ(), new ItemStack(iteminhand)));
			world.playSound(player, pos, ModSounds.testnoise, SoundCategory.AMBIENT, resistance, jumpVelocityMultiplier);
			
		}
		
		
		
		
		return ActionResult.SUCCESS;
		
	}

	@Override
	public BlockEntity createBlockEntity(BlockPos arg0, BlockState arg1) {
		
		
		
		return new easypidestal_be(arg0,arg1);
	}

	
	

	
	
}