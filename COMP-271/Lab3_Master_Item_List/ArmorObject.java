
public class ArmorObject extends GameObject{
	private int armorBonus;
	
	public ArmorObject(String name, float weight, int value, int armorBonus) {
		super(name, weight, value);
		this.armorBonus = armorBonus;
	}
	public int getArmorBonus() {
		return armorBonus;
	}

}
