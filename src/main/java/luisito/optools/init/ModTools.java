package luisito.optools.init;

import luisito.optools.Reference;
import luisito.optools.item.tool.ItemModAxe;
import luisito.optools.item.tool.ItemModPickaxe;
import luisito.optools.item.tool.ItemModShovel;
import luisito.optools.item.tool.ItemModSword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	
	public static final ToolMaterial tier1Material = EnumHelper.addToolMaterial(Reference.MODID + 	":tier1", 3, 1650, 12.0F, 4.0F, 15);
	public static final ToolMaterial tier2Material = EnumHelper.addToolMaterial(Reference.MODID + ":tier2", 4, 2000, 24.0F, 8.0F, 24);
	
	public static ItemPickaxe tier1_pickaxe;
	public static ItemModAxe tier1_axe;
	public static ItemSpade tier1_shovel;
	public static ItemSword tier1_sword;
	
	public static ItemPickaxe tier2_pickaxe;
	public static ItemModAxe tier2_axe;
	public static ItemSpade tier2_shovel;
	public static ItemSword tier2_sword;

	public static void init() {
		tier1_pickaxe = new ItemModPickaxe(tier1Material, "tier1_pickaxe");
		tier1_axe = new ItemModAxe(tier1Material, "tier1_axe");
		tier1_shovel = new ItemModShovel(tier1Material, "tier1_shovel");
		tier1_sword = new ItemModSword(tier1Material, "tier1_sword");
		
		tier2_pickaxe = new ItemModPickaxe(tier2Material, "tier2_pickaxe");
		tier2_axe = new ItemModAxe(tier2Material, "tier2_axe");
		tier2_shovel = new ItemModShovel(tier2Material, "tier2_shovel");
		tier2_sword = new ItemModSword(tier2Material, "tier2_sword");
	}
	
	public static void register() {
		registerTool(tier1_pickaxe);
		registerTool(tier1_axe);
		registerTool(tier1_shovel);
		registerTool(tier1_sword);
		
		registerTool(tier2_pickaxe);
		registerTool(tier2_axe);
		registerTool(tier2_shovel);
		registerTool(tier2_sword);
	}
	
	public static void registerRenders() {
		registerRender(tier1_pickaxe);
		registerRender(tier1_axe);
		registerRender(tier1_shovel);
		registerRender(tier1_sword);
		
		registerRender(tier2_pickaxe);
		registerRender(tier2_axe);
		registerRender(tier2_shovel);
		registerRender(tier2_sword);
	}
	
	private static void registerTool(Item item) {
		GameRegistry.register(item);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
