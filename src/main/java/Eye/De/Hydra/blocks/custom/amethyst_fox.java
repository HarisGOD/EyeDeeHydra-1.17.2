package Eye.De.Hydra.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class amethyst_fox extends HorizontalFacingBlock{

	public amethyst_fox(Settings settings) {
		super(settings);
		setDefaultState(getStateManager().getDefaultState().with(summoned, 0).with(Properties.HORIZONTAL_FACING, Direction.NORTH));

		
	}
	public static final IntProperty summoned = IntProperty.of("summoned", 0, 1);
	
	
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(summoned);
        stateManager.add(Properties.HORIZONTAL_FACING);
    }
	
	
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		player.sendMessage(new LiteralText(state.toString()), false);
		if (player.isHolding(Eye.De.Hydra.items.ModItems.crashed_rubyin)) {	
		if (state.toString().equalsIgnoreCase("Block{eye_de_hydra:amethyst_fox}[facing=east,summoned=0]")) {
		world.setBlockState(pos, state.with(summoned, 1).with(Properties.HORIZONTAL_FACING, Direction.EAST));
		}
		if (state.toString().equalsIgnoreCase("Block{eye_de_hydra:amethyst_fox}[facing=south,summoned=0]")) {
			world.setBlockState(pos, state.with(summoned, 1).with(Properties.HORIZONTAL_FACING, Direction.SOUTH));
		}
		if (state.toString().equalsIgnoreCase("Block{eye_de_hydra:amethyst_fox}[facing=west,summoned=0]")) {
			world.setBlockState(pos, state.with(summoned, 1).with(Properties.HORIZONTAL_FACING, Direction.WEST));
		}
		if (state.toString().equalsIgnoreCase("Block{eye_de_hydra:amethyst_fox}[facing=north,summoned=0]")) {
			world.setBlockState(pos, state.with(summoned, 1).with(Properties.HORIZONTAL_FACING, Direction.NORTH));
		}
		}
		if (player.isHolding(net.minecraft.item.Items.GLISTERING_MELON_SLICE)) {
			
			if (state.toString().equalsIgnoreCase("Block{eye_de_hydra:amethyst_fox}[facing=east,summoned=1]") ) {
				world.removeBlock(pos, false);}
			if (state.toString().equalsIgnoreCase("Block{eye_de_hydra:amethyst_fox}[facing=north,summoned=1]") ) {
				world.removeBlock(pos, false);}
			if (state.toString().equalsIgnoreCase("Block{eye_de_hydra:amethyst_fox}[facing=west,summoned=1]") ) {
				world.removeBlock(pos, false);}
			if (state.toString().equalsIgnoreCase("Block{eye_de_hydra:amethyst_fox}[facing=south,summoned=1]") ) {
				world.removeBlock(pos, false);}
		}
			
		return ActionResult.SUCCESS;
		}
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
		Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return VoxelShapes.cuboid(0.0625f, 0.0f, 0.125f, 0.9375f, 1.0f, 0.875f);
			case SOUTH:
				return VoxelShapes.cuboid(0.0625f, 0.0f, 0.125f, 0.9375f, 1.0f, 0.875f);
			case EAST:
				return VoxelShapes.cuboid(0.0125f, 0.0f,0.0625f,0.875f , 1.0f, 0.9375f);
			case WEST:
				return VoxelShapes.cuboid(0.0125f, 0.0f,0.0625f, 0.875f, 1.0f, 0.9375f);
			default:
				return VoxelShapes.fullCube();
		}
		
	    
 }
	public BlockState getPlacementState(ItemPlacementContext ctx) {
			return (BlockState)this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
		}
}