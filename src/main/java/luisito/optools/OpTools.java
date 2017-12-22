package luisito.optools;

import luisito.optools.init.ModTools;
import luisito.optools.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class OpTools {
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.Instance(Reference.MODID)
	public static OpTools instance;

	@EventHandler()
	public void preInit(FMLPreInitializationEvent event) {
		ModTools.init();
		ModTools.register();
		
		proxy.registerRenders();
	}
	
	@EventHandler()
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler()
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
