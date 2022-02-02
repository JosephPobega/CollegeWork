import java.util.Scanner;

public class World {
	private final int WORLD_WIDTH = 4;
	private final int WORLD_HEIGHT = 3;
	private Area[][] world = null;
	private Player player = null;
	
	public World() {
		world = new Area[WORLD_WIDTH][WORLD_HEIGHT];
		player = new Player();
		
		world[0][0] = new Area("A clearing in an alphine forest.");
		world[1][0] = new Area("A babbling brook with a wooden footbridge.");
		world[2][0] = new Area("A farmers field.");
		world[3][0] = new Area("A cottage and barn.");
		world[0][1] = new Area("A waterfall fedds a steams that runs off to the northeast.");
		world[1][1] = new Area("A small pond fed by a stream flowing in from the west.");
		world[2][1] = new Area("The northwest part of town.");
		world[3][1] = new Area("A dark cave hidden by thick underbursh in the heart of the forest.");
		world[0][2] = new Area("A small graveyard near the edge of town.");
		world[2][2] = new Area("The southwest part of town.");
		world[3][2] = new Area("The southeast part of town.");
	}
	public void play() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Greetings, bold adventurer. What is thy name? ");
		String s = input.nextLine();
		player.Setname(s);
		System.out.println("Welcome, " + s + ". The lands of Blackmoor lie before you.");
		
		while(!s.equals("exit")) {
			int x = player.getX();
			int y = player.getY();
			System.out.println(world[x][y].getDescription());
			System.out.print("What is thy bidding? ");
			s = input.nextLine();
			
			if(s.equals("north")) {
				if(y > 0)
					player.moveNorth();
				else
					System.out.println("You cannot go that way.");
			}
			else if(s.equals("east")) {
				if(x < WORLD_WIDTH - 1)
					player.moveEast();
				else
					System.out.println("You cannot go that way");
			}
			else if(s.equals("south")) {
				if(y < WORLD_HEIGHT - 1)
					player.moveSouth();
				else
					System.out.println("You cannot go that way");
			}
			else if(s.equals("west")) {
				if(x > 0)
					player.moveWest();
				else
					System.out.println("You cannot go that way.");
			}
			else if(!s.equals("exit"))
				System.out.println("I fear I do not understand, m'lord");
		}
		input.close();
	}
	
}
