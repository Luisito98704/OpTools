 package luisito.optools.init;

import luisito.optools.OpTools;
import luisito.optools.Reference;
import luisito.optools.item.armor.ItemModArmor;
import net.minecraft.client.audio.Sound;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmor {
	
	public static ArmorMaterial tier1Material = EnumHelper.addArmorMaterial("tier1", Reference.MODID + ":tier1", 2000, new int[] {200, 200, 200, 200}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 200.0F);
	public static ArmorMaterial tier2Material = EnumHelper.addArmorMaterial("tier2", Reference.MODID + ":tier2", 4000, new int[] {280, 300, 300, 280}, 24, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 300.0F);
	public static ArmorMaterial tier3Material = EnumHelper.addArmorMaterial("tier3", Reference.MODID + ":tier3", 600, new int[] {450, 500, 500, 450}, 36, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 500.0F);
	public static ArmorMaterial tier4Material = EnumHelper.addArmorMaterial("tier4", Reference.MODID + ":tier4", 12000, new int[] {800, 1000, 1000, 800}, 70, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1000.0F);
	public static ArmorMaterial tier5Material = EnumHelper.addArmorMaterial("tier5", Reference.MODID + ":tier5", 40000, new int[] {4000, 4200, 4200, 4000}, 300, SoundEvents.BLOCK_END_GATEWAY_SPAWN, 4000.0F);
	
	public static ItemArmor tier1_helmet;
	public static ItemArmor tier1_chestplate;
	public static ItemArmor tier1_leggings;
	public static ItemArmor tier1_boots;
	
	public static ItemArmor tier2_helmet;
	public static ItemArmor tier2_chestplate;
	public static ItemArmor tier2_leggings;
	public static ItemArmor tier2_boots;
	
	public static ItemArmor tier3_helmet;
	public static ItemArmor tier3_chestplate;
	public static ItemArmor tier3_leggings;
	public static ItemArmor tier3_boots;
	
	public static ItemArmor tier4_helmet;
	public static ItemArmor tier4_chestplate;
	public static ItemArmor tier4_leggings;
	public static ItemArmor tier4_boots;
	
	public static ItemArmor tier5_helmet;
	public static ItemArmor tier5_chestplate;
	public static ItemArmor tier5_leggings;
	public static ItemArmor tier5_boots;

	public static void init() {
		tier1_helmet = new ItemModArmor(tier1Material, 1, EntityEquipmentSlot.HEAD, "tier1_helmet");
		tier1_chestplate = new ItemModArmor(tier1Material, 1, EntityEquipmentSlot.CHEST, "tier1_chestplate");
		tier1_leggings = new ItemModArmor(tier1Material, 2, EntityEquipmentSlot.LEGS, "tier1_leggings");
		tier1_boots = new ItemModArmor(tier1Material, 1, EntityEquipmentSlot.FEET, "tier1_boots");
		
		tier2_helmet = new ItemModArmor(tier2Material, 1, EntityEquipmentSlot.HEAD, "tier2_helmet", 0.1F);
		tier2_chestplate = new ItemModArmor(tier2Material, 1, EntityEquipmentSlot.CHEST, "tier2_chestplate", 0.1F);
		tier2_leggings = new ItemModArmor(tier2Material, 2, EntityEquipmentSlot.LEGS, "tier2_leggings", 0.1F);
		tier2_boots = new ItemModArmor(tier2Material, 1, EntityEquipmentSlot.FEET, "tier2_boots", 0.1F);
		
		tier3_helmet = new ItemModArmor(tier3Material, 1, EntityEquipmentSlot.HEAD, "tier3_helmet", 0.1F);
		tier3_chestplate = new ItemModArmor(tier3Material, 1, EntityEquipmentSlot.CHEST, "tier3_chestplate", 0.1F);
		tier3_leggings = new ItemModArmor(tier3Material, 2, EntityEquipmentSlot.LEGS, "tier3_leggings", 0.1F);
		tier3_boots = new ItemModArmor(tier3Material, 1, EntityEquipmentSlot.FEET, "tier3_boots", 0.1F);
		
		tier4_helmet = new ItemModArmor(tier4Material, 1, EntityEquipmentSlot.HEAD, "tier4_helmet", 0.1F);
		tier4_chestplate = new ItemModArmor(tier4Material, 1, EntityEquipmentSlot.CHEST, "tier4_chestplate", 0.1F);
		tier4_leggings = new ItemModArmor(tier4Material, 2, EntityEquipmentSlot.LEGS, "tier4_leggings", 0.1F);
		tier4_boots = new ItemModArmor(tier4Material, 1, EntityEquipmentSlot.FEET, "tier4_boots", 0.1F);
		
		tier5_helmet = new ItemModArmor(tier5Material, 1, EntityEquipmentSlot.HEAD, "tier5_helmet", 0.1F);
		tier5_chestplate = new ItemModArmor(tier5Material, 1, EntityEquipmentSlot.CHEST, "tier5_chestplate", 0.1F);
		tier5_leggings = new ItemModArmor(tier5Material, 2, EntityEquipmentSlot.LEGS, "tier5_leggings", 0.1F);
		tier5_boots = new ItemModArmor(tier5Material, 1, EntityEquipmentSlot.FEET, "tier5_boots", 0.1F);
	}
	
	public static void register() {
		registerArmor(tier1_helmet);
		registerArmor(tier1_chestplate);
		registerArmor(tier1_leggings);
		registerArmor(tier1_boots);
		
		registerArmor(tier2_helmet);
		registerArmor(tier2_chestplate);
		registerArmor(tier2_leggings);
		registerArmor(tier2_boots);
		
		registerArmor(tier3_helmet);
		registerArmor(tier3_chestplate);
		registerArmor(tier3_leggings);
		registerArmor(tier3_boots);
		
		registerArmor(tier4_helmet);
		registerArmor(tier4_chestplate);
		registerArmor(tier4_leggings);
		registerArmor(tier4_boots);
		
		registerArmor(tier5_helmet);
		registerArmor(tier5_chestplate);
		registerArmor(tier5_leggings);
		registerArmor(tier5_boots);
	}
	
	public static void registerRenders() {
		registerRender(tier1_helmet);
		registerRender(tier1_chestplate);
		registerRender(tier1_leggings);
		registerRender(tier1_boots);
		
		registerRender(tier2_helmet);
		registerRender(tier2_chestplate);
		registerRender(tier2_leggings);
		registerRender(tier2_boots);
		
		registerRender(tier3_helmet);
		registerRender(tier3_chestplate);
		registerRender(tier3_leggings);
		registerRender(tier3_boots);
		
		registerRender(tier4_helmet);
		registerRender(tier4_chestplate);
		registerRender(tier4_leggings);
		registerRender(tier4_boots);
		
		registerRender(tier5_helmet);
		registerRender(tier5_chestplate);
		registerRender(tier5_leggings);
		registerRender(tier5_boots);
	}
	
	private static void registerArmor(Item item) {
		item.setCreativeTab(OpTools.modTab);
		GameRegistry.register(item);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
