public class Player {
	private String name;
	
	private int x, y;
	
	public Player() {
		name = "";
		x = 0;
		y = 0;	
	}
	public Player(String name) {
		this.name  = name;
		x = 0;
		y = 0;
	}
	public Player(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	public String getname() {
		return name;
	}
	public void Setname(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void moveNorth() {
		y--;
	}
	public void moveEast() {
		x++;
	}
	public void moveSouth() {
		y++;
	}
	public void moveWest() {
		x--;
	}
}
