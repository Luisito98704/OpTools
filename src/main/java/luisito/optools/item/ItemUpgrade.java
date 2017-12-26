package luisito.optools.item;

import java.util.List;

import luisito.optools.Reference;
import luisito.optools.handler.EnumHandler.UpgradeTypes;
import luisito.optools.util.Utils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class ItemUpgrade extends Item {

	public ItemUpgrade(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.MODID, name));
		this.setHasSubtypes(true);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, NonNullList<ItemStack> items) {
		for (int i = 0; i < UpgradeTypes.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < UpgradeTypes.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return this.getUnlocalizedName() + "." + UpgradeTypes.values()[i].getName();
			} else {
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + UpgradeTypes.FLY.getName();
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		tooltip.add(TextFormatting.GRAY + Utils.getLang().localize("upgrade_"+ UpgradeTypes.values()[stack.getMetadata()].getName() +".tooltip"));
	}
}
