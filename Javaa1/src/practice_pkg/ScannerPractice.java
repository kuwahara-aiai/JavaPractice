package practice_pkg;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);	//Scannerクラスのインスタンス生成
		System.out.println("入力＞");
		String input1 = sc1.nextLine();
		System.out.println(input1);
		sc1.close();

	}

}
