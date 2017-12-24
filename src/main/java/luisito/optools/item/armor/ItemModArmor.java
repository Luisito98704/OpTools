package luisito.optools.item.armor;

import luisito.optools.Reference;
import luisito.optools.init.ModArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemModArmor extends ItemArmor {
	
	private boolean canFly = false;
	private float flySpeed = 0.0F;
	
	public ItemModArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,
			String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	
	public ItemModArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,
			String unlocalizedName, float flySpeed) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
		this.canFly = true;
		this.flySpeed = flySpeed;
	}
	
	@Override()
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		Iterable<ItemStack> armor = player.getArmorInventoryList();
		
		int armorPieces = 0;
		int chestplateLevel = 0;
		
		for(ItemStack stack : armor) {
			if(stack.getItem().getClass().equals(this.getClass()) && (stack.getItem() != ModArmor.tier1_helmet || stack.getItem() != ModArmor.tier1_chestplate || stack.getItem() != ModArmor.tier1_leggings || stack.getItem() != ModArmor.tier1_boots))
				armorPieces++;
			if(stack.getItem().getClass().equals(this.getClass()) && stack.getItem() == ModArmor.tier3_chestplate)
				chestplateLevel = 3;
			else if(stack.getItem().getClass().equals(this.getClass()) && stack.getItem() == ModArmor.tier4_chestplate)
				chestplateLevel = 4;
		}
		
		if(armorPieces == 4) {
			player.capabilities.allowFlying = this.canFly;

			player.capabilities.setFlySpeed(this.flySpeed);
		} else {
			if(!player.isCreative()) {
				player.capabilities.allowFlying = false;
				player.capabilities.isFlying = false;
			}
		}
	}

}