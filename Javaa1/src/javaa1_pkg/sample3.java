package javaa1_pkg;

import lib.Input;

public class sample3 {

	public static void main(String[] args) {
		int a = Input.getInt("行は？");
		int b = Input.getInt("列は？");
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i%2==1) {
					System.out.print("□");
				} else {
					System.out.print("■");
				}
			}
			System.out.println("");
		}
	}
}
