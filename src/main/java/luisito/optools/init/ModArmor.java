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
	
	public static ArmorMaterial tier1Material = EnumHelper.addArmorMaterial("tier1", Reference.MODID + ":tier1", 1650, new int[] {4, 7, 9, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	public static ItemArmor tier1_helmet;
	public static ItemArmor tier1_chestplate;
	public static ItemArmor tier1_leggings;
	public static ItemArmor tier1_boots;

	public static void init() {
		tier1_helmet = new ItemModArmor(tier1Material, 1, EntityEquipmentSlot.HEAD, "tier1_helmet");
		tier1_chestplate = new ItemModArmor(tier1Material, 1, EntityEquipmentSlot.CHEST, "tier1_helmet");
		tier1_leggings = new ItemModArmor(tier1Material, 2, EntityEquipmentSlot.LEGS, "tier1_helmet");
		tier1_boots = new ItemModArmor(tier1Material, 1, EntityEquipmentSlot.FEET, "tier1_helmet");
	}
	
	public static void register() {
		registerArmor(tier1_helmet);
		registerArmor(tier1_chestplate);
		registerArmor(tier1_leggings);
		registerArmor(tier1_boots);
	}
	
	public static void registerRenders() {
		registerRender(tier1_helmet);
		registerRender(tier1_chestplate);
		registerRender(tier1_leggings);
		registerRender(tier1_boots);
	}
	
	private static void registerArmor(Item item) {
		GameRegistry.register(item);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
