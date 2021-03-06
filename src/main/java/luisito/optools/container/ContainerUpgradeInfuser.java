package luisito.optools.container;

import luisito.optools.container.slot.SlotItem;
import luisito.optools.container.slot.SlotOutput;
import luisito.optools.init.ModItems;
import luisito.optools.item.armor.ItemModArmor;
import luisito.optools.item.tool.ItemModAxe;
import luisito.optools.item.tool.ItemModPickaxe;
import luisito.optools.item.tool.ItemModShovel;
import luisito.optools.item.tool.ItemModSword;
import luisito.optools.tileentity.TileEntityUpgradeInfuser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerUpgradeInfuser extends Container{
	
	private TileEntityUpgradeInfuser te;
	private IItemHandler handler;

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return !player.isSpectator();
	}
	
	public ContainerUpgradeInfuser(IInventory playerInv, TileEntityUpgradeInfuser te) {
		this.te = te;
		this.handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
		this.addSlotToContainer(new SlotItemHandler(this.handler, 0, 56, 17));
		this.addSlotToContainer(new SlotItem(this.handler, 1, 56, 53, ModItems.upgrade));
		this.addSlotToContainer(new SlotOutput(this.handler, 2, 116, 35));
		
		// Player's Inventory
		int xPos = 8;
		int yPos = 84;
		
		for (int y = 0; y < 3; ++y) {
			for (int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, xPos + x * 18, yPos + y * 18));
			}
		}

		for (int x = 0; x < 9; ++x) {
			this.addSlotToContainer(new Slot(playerInv, x, xPos + x * 18, yPos + 58));
		}
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
	    ItemStack previous = ItemStack.EMPTY;
	    Slot slot = (Slot) this.inventorySlots.get(fromSlot);

	    if (slot != null && slot.getHasStack()) {
	        ItemStack current = slot.getStack();
	        previous = current.copy();

	        if (fromSlot < this.handler.getSlots()) {
	            // To player's inventory
	            if (!this.mergeItemStack(current, handler.getSlots(), handler.getSlots() + 36, true))
	                return ItemStack.EMPTY;
	        } else {
	            // From player's inventory
		        	if(current.getItem() == ModItems.upgrade) {
		        		if(!this.mergeItemStack(current, 1, handler.getSlots(), false))
		        			return ItemStack.EMPTY;
		        	} else if(current.getItem().getClass() == ItemModArmor.class || current.getItem().getClass() == ItemModPickaxe.class || current.getItem().getClass() == ItemModShovel.class || current.getItem().getClass() == ItemModSword.class || current.getItem().getClass() == ItemModAxe.class) {
		        		if(!this.mergeItemStack(current, 0, handler.getSlots(), false))
		        			return ItemStack.EMPTY;
		        	} else {
		        		return ItemStack.EMPTY;
		        	}
	        }

	        if (current.getCount() == 0) //Use func_190916_E() instead of stackSize 1.11 only 1.11.2 use getCount()
	            slot.putStack(ItemStack.EMPTY); //Use ItemStack.field_190927_a instead of (ItemStack)null for a blank item stack. In 1.11.2 use ItemStack.EMPTY
	        else
	            slot.onSlotChanged();

	        if (current.getCount() == previous.getCount())
	            return null;
	        slot.onTake(playerIn, current);
	    }
	    return previous;
	}

}
