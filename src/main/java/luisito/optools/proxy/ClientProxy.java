package luisito.optools.proxy;

import luisito.optools.init.ModArmor;
import luisito.optools.init.ModTools;

public class ClientProxy extends CommonProxy{

	@Override()
	public void registerRenders() {
		ModTools.registerRenders();
		ModArmor.registerRenders();
	}
}
