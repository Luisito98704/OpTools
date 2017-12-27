package luisito.optools.handler;

import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IStringSerializable;

public class EnumHandler {

	public static enum UpgradeTypes implements IStringSerializable{
		BASE("base", 0, false),
		FLY("fly", 1, true),
		SPEED("speed", 2, true),
		FLY_SPEED("fly_speed", 3, true),
		REGENERATION("regeneration", 4, true	),
		NIGHT_VISION("night_vision", 5, true),
		WATER_BREATHING("water_breathing", 6, true),
		JUMP_BOOST("jump_boost", 7, true);
		
		private String name;
		private int ID;
		private boolean armorUpgrade;
		
		private UpgradeTypes(String name, int ID, boolean armorUpgrade) {
			this.name = name;
			this.ID = ID;
			this.armorUpgrade = armorUpgrade;
		}
	
		public int getID() {
			return ID;
		}
		
		public boolean isArmorUpgrade() {
			return armorUpgrade;
		}

		@Override
		public String getName() {
			return this.name;
		}
		
		@Override
		public String toString() {
			return getName();
		}
		
	}
}
