package Eye.De.Hydra.blocks.custom;

import net.minecraft.block.SlabBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.State;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;



public class thin_slab extends SlabBlock {
	public thin_slab(BlockState bbs, Settings st) {
		super(st);
	}
	
	/*public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		player.sendMessage(new LiteralText("__"+state.toString()), false);
		
		return ActionResult.SUCCESS;
	}*/
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {		
		if (state.toString().equals("Block{eye_de_hydra:iron_bars_slab}[type=bottom,waterlogged=false]")) {return VoxelShapes.cuboid(0f,0.4375f,0f,1f,0.5f,1f);}
		if (state.toString().equals("Block{eye_de_hydra:iron_bars_slab}[type=top,waterlogged=false]")) {return VoxelShapes.cuboid(0f,0.9375f,0f,1f,1f,1f);}
		if (state.toString().equals("Block{eye_de_hydra:iron_bars_slab}[type=double,waterlogged=false]")) {return VoxelShapes.cuboid(0f,0.4375f,0f,1f,1f,1f);}
		else return VoxelShapes.cuboid(0f,0.4375f,0f,1f,0.5f,1f);
	}
	
}