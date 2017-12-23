package luisito.optools.init;

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
	
	public static ArmorMaterial tier1Material = EnumHelper.addArmorMaterial("tier1", Reference.MODID + ":tier1", 1650, new int[] {4, 7, 9, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static ArmorMaterial tier2Material = EnumHelper.addArmorMaterial("tier2", Reference.MODID + ":tier2", 1650, new int[] {6, 9, 11, 6}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 6.0F);
	
	public static ItemArmor tier1_helmet;
	public static ItemArmor tier1_chestplate;
	public static ItemArmor tier1_leggings;
	public static ItemArmor tier1_boots;
	
	public static ItemArmor tier2_helmet;
	public static ItemArmor tier2_chestplate;
	public static ItemArmor tier2_leggings;
	public static ItemArmor tier2_boots;

	public static void init() {
		tier1_helmet = new ItemModArmor(tier1Material, 1, EntityEquipmentSlot.HEAD, "tier1_helmet");
		tier1_chestplate = new ItemModArmor(tier1Material, 1, EntityEquipmentSlot.CHEST, "tier1_chestplate");
		tier1_leggings = new ItemModArmor(tier1Material, 2, EntityEquipmentSlot.LEGS, "tier1_leggings");
		tier1_boots = new ItemModArmor(tier1Material, 1, EntityEquipmentSlot.FEET, "tier1_boots");
		
		tier2_helmet = new ItemModArmor(tier2Material, 1, EntityEquipmentSlot.HEAD, "tier2_helmet");
		tier2_chestplate = new ItemModArmor(tier2Material, 1, EntityEquipmentSlot.CHEST, "tier2_chestplate");
		tier2_leggings = new ItemModArmor(tier2Material, 2, EntityEquipmentSlot.LEGS, "tier2_leggings");
		tier2_boots = new ItemModArmor(tier2Material, 1, EntityEquipmentSlot.FEET, "tier2_boots");
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
	}
	
	private static void registerArmor(Item item) {
		GameRegistry.register(item);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
