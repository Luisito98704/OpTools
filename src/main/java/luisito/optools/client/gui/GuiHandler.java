package luisito.optools.client.gui;

import luisito.optools.container.ContainerUpgradeInfuser;
import luisito.optools.tileentity.TileEntityUpgradeInfuser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	
	public static final int UPGRADE_INFUSER = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == UPGRADE_INFUSER) {
			return new ContainerUpgradeInfuser(player.inventory, (TileEntityUpgradeInfuser) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == UPGRADE_INFUSER) {
			return new GuiUpgradeInfuser(player.inventory, (TileEntityUpgradeInfuser) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

}
