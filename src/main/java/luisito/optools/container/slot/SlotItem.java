package luisito.optools.container.slot;

import org.apache.commons.lang3.ArrayUtils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotItem extends SlotItemHandler{
	
	private Item[] items;

	public SlotItem(IItemHandler itemHandler, int index, int xPosition, int yPosition, Item... items) {
		super(itemHandler, index, xPosition, yPosition);
		this.items = items;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return ArrayUtils.contains(items, stack.getItem());
	}

}
