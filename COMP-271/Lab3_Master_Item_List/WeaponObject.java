
public class WeaponObject  extends GameObject{
	private int attackBonus;
	private int damageBonus;
	
	public WeaponObject(String name, float weight, int value, int attackBonus, int damageBonus) {
		super(name, weight, value);
		this.attackBonus = attackBonus;
		this.damageBonus = damageBonus;
}
	public int getAttackBonus() {
		return attackBonus;
	}
	public int getDamageBonus() {
		return damageBonus;
	}
}
