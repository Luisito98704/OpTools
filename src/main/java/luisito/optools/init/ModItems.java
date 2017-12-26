package luisito.optools.init;

import luisito.optools.Reference;
import luisito.optools.handler.EnumHandler.UpgradeTypes;
import luisito.optools.item.ItemUpgrade;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item upgrade;

	public static void init() {
		 upgrade = new ItemUpgrade("upgrade");
	}
	
	public static void register() {
		registerItem(upgrade);
	}
	
	public static void registerRenders() {
		for(int i = 0; i < UpgradeTypes.values().length; i++)
			registerRender(upgrade, i, "upgrade_" + UpgradeTypes.values()[i].getName());
	}
	
	private static void registerItem(Item item) {
		GameRegistry.register(item);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
	
	private static void registerRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
	}
}
