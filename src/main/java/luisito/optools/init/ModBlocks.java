package luisito.optools.init;

import luisito.optools.OpTools;
import luisito.optools.Reference;
import luisito.optools.block.BlockUpgradeInfuser;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block upgrade_infuser;

	public static void init() {
		upgrade_infuser = new BlockUpgradeInfuser("upgrade_infuser");
	}
	
	public static void register() {
		registerBlock(upgrade_infuser);
	}
	
	public static void registerRenders() {
		registerRender(upgrade_infuser);
	}
	
	private static void registerBlock(Block block) {
		block.setCreativeTab(OpTools.modTab);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	private static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
}
