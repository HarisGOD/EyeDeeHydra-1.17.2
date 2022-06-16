package Eye.De.Hydra;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;

public class EyeUnDeHydraClient implements ClientModInitializer{

	@Override
	public void onInitializeClient() {
		BlockEntityRendererRegistry.register(EyeUnDeHydra.easypidestal_block_entity, Eye.De.Hydra.blocks.entity.easyPidestalBlockEntityRenderer::new);
	}
	
}