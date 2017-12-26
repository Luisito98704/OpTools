package luisito.optools.handler;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {

	public static enum UpgradeTypes implements IStringSerializable{
		FLY("fly", 0, true),
		SPEED("speed", 1, true),
		FLY_SPEED("fly_speed", 2, true),
		REGENERATION("regen", 3, true),
		NIGHT_VISION("night_vision", 4, true),
		WATER_BREATHING("water_breathing", 5, true),
		JUMP_BOOST("jump_boost", 6, true);
		
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
			return this.name();
		}
		
		@Override
		public String toString() {
			return getName();
		}
		
	}
}
