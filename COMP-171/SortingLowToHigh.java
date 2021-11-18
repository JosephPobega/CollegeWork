//Joseph Pobega
//COMP 171

import java.util.Scanner;
public class SortingLowToHigh {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] list = {58, 49, 36, 12, 17, 20};
		System.out.println("Before sort");
		for(int x = 0; x < list.length;++x) {
			System.out.println(list[x]);
		}
		
		sort(list);
		System.out.println("After sort");
		for(int x = 0; x < list.length;++x) {
			System.out.println(list[x]);
		}
	}
	
	public static void sort(int[]list) {
		int temp;
		boolean madeswap;
		int lastIndex = list.length-1;
		madeswap = true;
		while (madeswap){
			madeswap = false;
			for(int x = 0; x < lastIndex;++x) {
				if(list[x] > list[x+1]) {
					temp = list[x];
					list[x] = list[x+1];
					list[x+1] = temp;
					madeswap = true;
				}//if
			}//for
		}//while
	}//sort method
}//class

