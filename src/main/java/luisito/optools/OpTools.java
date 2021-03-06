package luisito.optools;

import luisito.optools.init.ModArmor;
import luisito.optools.init.ModBlocks;
import luisito.optools.init.ModItems;
import luisito.optools.init.ModTools;
import luisito.optools.proxy.CommonProxy;
import luisito.optools.tabs.OpToolsTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class OpTools {
	
	public static final CreativeTabs modTab = new OpToolsTab();
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.Instance(Reference.MODID)
	public static OpTools instance;

	@EventHandler()
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModTools.init();
		ModArmor.init();
		ModBlocks.init();
		ModItems.register();
		ModTools.register();
		ModArmor.register();
		ModBlocks.register();
		
		proxy.registerRenders();
	}
	
	@EventHandler()
	public void init(FMLInitializationEvent event) {
		proxy.init();
		proxy.registerTileEntities();
	}
	
	@EventHandler()
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
