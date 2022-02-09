
public class MIL_Test {

	public static void main(String[] args) {
		MasteritemList mil = new MasteritemList();
		mil.addGameObject(new WeaponObject("Sword", 5.0f, 15, 1, 10));
		mil.addGameObject(new WeaponObject("Dagger", 1.0f, 5, 2, 4));
		mil.addGameObject(new ArmorObject("Chain Armor", 12.0f, 25, 5));
		mil.addGameObject(new GameObject("Lantern", 2.0f, 2));
		mil.addGameObject(new GameObject("Rope", 2.0f, 1));
	
		for(int i = 0; i < mil.getItemCount(); ++i) {
			GameObject go = mil.getObject(i);
			System.out.println("Item type: " + go.getName());
			System.out.println("Item weight: " + go.getWeight());
			System.out.println("Item value: " + go.getValue());
			if(go instanceof WeaponObject) {
				System.out.println("item Attack Bonus: " + ((WeaponObject)go).getAttackBonus());
				System.out.println("Item Damage Bonus: " + ((WeaponObject)go).getDamageBonus());
			}
			else if(go instanceof ArmorObject) {
				System.out.println("Item Armor Bonus: " + ((ArmorObject)go).getArmorBonus());
			}
			System.out.println();
		}
	}

}
