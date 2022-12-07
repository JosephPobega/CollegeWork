ackage assignment10;
import java.io.*;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws IOException{

		try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Assignment10.dat"))){
			for(int i = 0; i < 100; i ++) {
				output.writeInt((int)(Math.random()*100));
			}
		}
		ArrayList<Integer> Assignment10Data = new ArrayList<>();
		try (DataInputStream input = new DataInputStream(new FileInputStream("Assignment10.dat"))){
			while(input.available()>0) {
				Assignment10Data.add(input.readInt());
			}
	}
		System.out.println("Assignment 10 Data " + Assignment10Data);
		int Assignment10Total = 0;
		for(int x = 0; x < Assignment10Data.size(); ++x){
			Assignment10Total += Assignment10Data.get(x);
		}
		
		System.out.println("Total " + Assignment10Total);
		System.out.println("Numbr of integers " + Assignment10Data.size());


}
}
	
