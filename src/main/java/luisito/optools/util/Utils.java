package luisito.optools.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import luisito.optools.Reference;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.oredict.OreDictionary;

public class Utils {

	private static Logger logger;
	private static Lang lang;

	public static Logger getLogger() {
		if (logger == null) {
			logger = LogManager.getFormatterLogger(Reference.MODID);
		}
		return logger;
	}

	public static Lang getLang() {
		if (lang == null) {
			// Change Reference.MODID to whatever you feel necessary notice that
			// when in the language file it will be what ever you put in . what
			// you asked it for
			lang = new Lang(Reference.MODID);
		}
		return lang;
	}

	public static int calculateRedstone(ItemStackHandler handler) {
		int i = 0;
		float f = 0.0F;
		for (int j = 0; j < handler.getSlots(); j++) {
			ItemStack stack = handler.getStackInSlot(j);
			if (!stack.isEmpty()) {
				f += (float) stack.getCount() / (float) Math.min(handler.getSlotLimit(j), stack.getMaxStackSize());
				i++;
			}
		}
		f = f / (float) handler.getSlots();
		return MathHelper.floor(f * 14.0F) + (i > 0 ? 1 : 0);
	}

	public static ItemStack addStackToInventory(IItemHandler handler, ItemStack stack, boolean simulate) {
		ItemStack remainder = stack;
		for (int slot = 0; slot < handler.getSlots(); slot++) {
			remainder = handler.insertItem(slot, stack, simulate);
			if (remainder == ItemStack.EMPTY)
				break;
		}
		return remainder;
	}

	public static ItemStack addStackToInventory(IItemHandler handler, int maxSlot, ItemStack stack, boolean simulate) {
		ItemStack remainder = stack;
		for (int slot = 0; slot < maxSlot; slot++) {
			remainder = handler.insertItem(slot, stack, simulate);
			if (remainder == ItemStack.EMPTY)
				break;
		}
		return remainder;
	}

	public static boolean isInventoryFull(IItemHandler handler) {
		int filledSlots = 0;
		for (int slot = 0; slot < handler.getSlots(); slot++) {
			if (handler.getStackInSlot(slot).getCount() == handler.getSlotLimit(slot))
				filledSlots++;
		}
		return filledSlots == handler.getSlots();
	}

	public static boolean isInventoryFull(IItemHandler handler, int maxSlot) {
		int filledSlots = 0;
		for (int slot = 0; slot < maxSlot; slot++) {
			if (handler.getStackInSlot(slot).getCount() == handler.getSlotLimit(slot))
				filledSlots++;
		}
		return filledSlots == maxSlot;
	}

	public static EnumDyeColor getColourFromDye(ItemStack stack) {
		for (int id : OreDictionary.getOreIDs(stack)) {
			if (id == OreDictionary.getOreID("dyeBlack"))
				return EnumDyeColor.BLACK;
			if (id == OreDictionary.getOreID("dyeRed"))
				return EnumDyeColor.RED;
			if (id == OreDictionary.getOreID("dyeGreen"))
				return EnumDyeColor.GREEN;
			if (id == OreDictionary.getOreID("dyeBrown"))
				return EnumDyeColor.BROWN;
			if (id == OreDictionary.getOreID("dyeBlue"))
				return EnumDyeColor.BLUE;
			if (id == OreDictionary.getOreID("dyePurple"))
				return EnumDyeColor.PURPLE;
			if (id == OreDictionary.getOreID("dyeCyan"))
				return EnumDyeColor.CYAN;
			if (id == OreDictionary.getOreID("dyeLightGray"))
				return EnumDyeColor.SILVER;
			if (id == OreDictionary.getOreID("dyeGray"))
				return EnumDyeColor.GRAY;
			if (id == OreDictionary.getOreID("dyePink"))
				return EnumDyeColor.PINK;
			if (id == OreDictionary.getOreID("dyeLime"))
				return EnumDyeColor.LIME;
			if (id == OreDictionary.getOreID("dyeYellow"))
				return EnumDyeColor.YELLOW;
			if (id == OreDictionary.getOreID("dyeLightBlue"))
				return EnumDyeColor.LIGHT_BLUE;
			if (id == OreDictionary.getOreID("dyeMagenta"))
				return EnumDyeColor.MAGENTA;
			if (id == OreDictionary.getOreID("dyeOrange"))
				return EnumDyeColor.ORANGE;
			if (id == OreDictionary.getOreID("dyeWhite"))
				return EnumDyeColor.WHITE;
		}
		return EnumDyeColor.WHITE;
	}

}