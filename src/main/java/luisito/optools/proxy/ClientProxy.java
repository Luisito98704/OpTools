package luisito.optools.proxy;

import luisito.optools.init.ModArmor;
import luisito.optools.init.ModBlocks;
import luisito.optools.init.ModItems;
import luisito.optools.init.ModTools;

public class ClientProxy extends CommonProxy{

	@Override()
	public void registerRenders() {
		ModItems.registerRenders();
		ModTools.registerRenders();
		ModArmor.registerRenders();
		ModBlocks.registerRenders();
	}
}
