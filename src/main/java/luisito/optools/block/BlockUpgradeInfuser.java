package luisito.optools.block;

import luisito.optools.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockUpgradeInfuser extends Block{

	public BlockUpgradeInfuser(String name) {
		super(Material.ANVIL);
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.MODID, name));
		this.setHardness(5F);
		this.setResistance(6000F);
	}
}
