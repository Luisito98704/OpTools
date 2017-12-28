package luisito.optools.client.gui;

import java.util.ArrayList;
import java.util.List;

import luisito.optools.Reference;
import luisito.optools.container.ContainerUpgradeInfuser;
import luisito.optools.tileentity.TileEntityUpgradeInfuser;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.items.CapabilityItemHandler;

public class GuiUpgradeInfuser extends GuiContainer{
	
	private TileEntityUpgradeInfuser te;
	private IInventory playerInv;
	
	public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID, "textures/gui/container/upgrade_infuser.png");

	public GuiUpgradeInfuser(IInventory playerInv, TileEntityUpgradeInfuser te) {
		super(new ContainerUpgradeInfuser(playerInv, te));
		
		this.xSize = 176; //Texture xSize
		this.ySize = 166; //Texture ySize
		
		this.te = te;
		this.playerInv = playerInv;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(TEXTURE);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
	

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = I18n.format("container.upgrade_infuser"); //Gets the formatted name for the block breaker from the language file
		this.mc.fontRendererObj.drawString(s, this.xSize / 2 - this.mc.fontRendererObj.getStringWidth(s) / 2, 6, 4210752); //Draws the block breaker name in the center on the top of the gui
		this.mc.fontRendererObj.drawString(this.playerInv.getDisplayName().getFormattedText(), 8, 72, 4210752); //The player's inventory name
		int actualMouseX = mouseX - ((this.width - this.xSize) / 2);
		int actualMouseY = mouseY - ((this.height - this.ySize) / 2);
		if(actualMouseX >= 56 && actualMouseX <= 71 && actualMouseY >= 17 && actualMouseY <= 32 && te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).getStackInSlot(0) == ItemStack.EMPTY) {
			List<String> text = new ArrayList<String>();
			text.add(TextFormatting.WHITE + I18n.format("gui.armor/tool.tooltip"));
			this.drawHoveringText(text, actualMouseX, actualMouseY);
		} else if(actualMouseX >= 56 && actualMouseX <= 71 && actualMouseY >= 53 && actualMouseY <= 68 && te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).getStackInSlot(0) == ItemStack.EMPTY) {
			List<String> text = new ArrayList<String>();
			text.add(TextFormatting.WHITE + I18n.format("gui.upgrade.tooltip"));
			this.drawHoveringText(text, actualMouseX, actualMouseY);
		}
	}

}
