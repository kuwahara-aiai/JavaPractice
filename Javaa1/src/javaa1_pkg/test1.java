package javaa1_pkg;

import lib.Input;

public class test1 {

	public static void main(String[] args) {
		
		int a = Input.getInt();
		String name = Input.getString("あなたのお名前は？");
		
		for(int i=1; i <= a; i++) {
			System.out.println("レベルアップ！レベルが"+i+"になった");
		}
		System.out.println(name+"さん、一緒に遊びましょう");
	}

}
