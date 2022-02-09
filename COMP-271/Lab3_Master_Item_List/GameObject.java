
public class GameObject {
	private String name;
	private float weight;
	private int value;

	public GameObject(String name, float weight, int value) {
		
		this.name = name;
		this.weight = weight;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public int getValue() {
		return value;
	}
}
