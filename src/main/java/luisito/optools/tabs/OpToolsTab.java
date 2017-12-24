package luisito.optools.tabs;

import luisito.optools.init.ModTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OpToolsTab extends CreativeTabs{

	public OpToolsTab() {
		super("optoolstab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModTools.tier1_pickaxe);
	}

}
