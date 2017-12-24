package luisito.optools.init;

import luisito.optools.OpTools;
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
	
	public static final ToolMaterial tier1Material = EnumHelper.addToolMaterial(Reference.MODID + 	":tier1", 3, 2000, 10.0F, 10.0F, 15);
	public static final ToolMaterial tier2Material = EnumHelper.addToolMaterial(Reference.MODID + ":tier2", 4, 3000, 20.0F, 20.0F, 30);
	public static final ToolMaterial tier3Material = EnumHelper.addToolMaterial(Reference.MODID + ":tier3", 5, 6000, 40.0F, 40.0F, 45);
	public static final ToolMaterial tier4Material = EnumHelper.addToolMaterial(Reference.MODID + ":tier4", 6, 6000, 100.0F, 100.0F, 80);
	
	public static ItemPickaxe tier1_pickaxe;
	public static ItemModAxe tier1_axe;
	public static ItemSpade tier1_shovel;
	public static ItemSword tier1_sword;
	
	public static ItemPickaxe tier2_pickaxe;
	public static ItemModAxe tier2_axe;
	public static ItemSpade tier2_shovel;
	public static ItemSword tier2_sword;
	
	public static ItemPickaxe tier3_pickaxe;
	public static ItemModAxe tier3_axe;
	public static ItemSpade tier3_shovel;
	public static ItemSword tier3_sword;
	
	public static ItemPickaxe tier4_pickaxe;
	public static ItemModAxe tier4_axe;
	public static ItemSpade tier4_shovel;
	public static ItemSword tier4_sword;

	public static void init() {
		tier1_pickaxe = new ItemModPickaxe(tier1Material, "tier1_pickaxe");
		tier1_axe = new ItemModAxe(tier1Material, "tier1_axe");
		tier1_shovel = new ItemModShovel(tier1Material, "tier1_shovel");
		tier1_sword = new ItemModSword(tier1Material, "tier1_sword");
		
		tier2_pickaxe = new ItemModPickaxe(tier2Material, "tier2_pickaxe");
		tier2_axe = new ItemModAxe(tier2Material, "tier2_axe");
		tier2_shovel = new ItemModShovel(tier2Material, "tier2_shovel");
		tier2_sword = new ItemModSword(tier2Material, "tier2_sword");
		
		tier3_pickaxe = new ItemModPickaxe(tier3Material, "tier3_pickaxe");
		tier3_axe = new ItemModAxe(tier3Material, "tier3_axe");
		tier3_shovel = new ItemModShovel(tier3Material, "tier3_shovel");
		tier3_sword = new ItemModSword(tier3Material, "tier3_sword");
		
		tier4_pickaxe = new ItemModPickaxe(tier4Material, "tier4_pickaxe");
		tier4_axe = new ItemModAxe(tier4Material, "tier4_axe");
		tier4_shovel = new ItemModShovel(tier4Material, "tier4_shovel");
		tier4_sword = new ItemModSword(tier4Material, "tier4_sword");
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
		
		registerTool(tier3_pickaxe);
		registerTool(tier3_axe);
		registerTool(tier3_shovel);
		registerTool(tier3_sword);
		
		registerTool(tier4_pickaxe);
		registerTool(tier4_axe);
		registerTool(tier4_shovel);
		registerTool(tier4_sword);
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
		
		registerRender(tier3_pickaxe);
		registerRender(tier3_axe);
		registerRender(tier3_shovel);
		registerRender(tier3_sword);
		
		registerRender(tier4_pickaxe);
		registerRender(tier4_axe);
		registerRender(tier4_shovel);
		registerRender(tier4_sword);
	}
	
	private static void registerTool(Item item) {
		item.setCreativeTab(OpTools.modTab);
		GameRegistry.register(item);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
