package luisito.optools.proxy;

import luisito.optools.Reference;
import luisito.optools.tileentity.TileEntityUpgradeInfuser;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void init() {}

	public void registerRenders() {}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityUpgradeInfuser.class, Reference.MODID + ":upgrade_infuser");
	}

}
