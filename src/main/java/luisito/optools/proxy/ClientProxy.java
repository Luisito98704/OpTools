package luisito.optools.proxy;

import luisito.optools.OpTools;
import luisito.optools.client.gui.GuiHandler;
import luisito.optools.init.ModArmor;
import luisito.optools.init.ModBlocks;
import luisito.optools.init.ModItems;
import luisito.optools.init.ModTools;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy{

	@Override()
	public void registerRenders() {
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModArmor.registerRenders();
		ModBlocks.registerRenders();
	}
	
	@Override
	public void init() {
		NetworkRegistry.INSTANCE.registerGuiHandler(OpTools.instance, new GuiHandler());
	}
}
