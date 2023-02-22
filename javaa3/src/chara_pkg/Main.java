package chara_pkg;

public class Main {
	public static void main(String[] args) {

		//オブジェクト（インスタンス）の生成
		Chara c1 = new Chara();
		//c1.setJob("魔法使い");
		c1.setJob("料理人");
		System.out.print(c1.getJob()+":");
		//System.out.println(c1);
		
		//オブジェクト（インスタンス）の生成
		Chara c2 = new Chara();
		c2.setName("クアアイナ");
		System.out.print(c2.getName());
		
		//オブジェクト（インスタンス）の生成
		Chara c3 = new Chara();
		c3.setHp(3500);
		System.out.print("のHPは");
		System.out.print(c3.getHp());
		System.out.println("！");
		//		//ランダムに１～６の整数をつくる
		//		int n = (int)(Math.random()*6+1);
		//		System.out.println(n);
		
		Enemy n1 = new Enemy();
		System.out.println(n1.getName()+"が現れた！！");
		Enemy n2 = new Enemy();
		System.out.print(n1.getName()+"のHPは");
		System.out.println(n2.getHp()+"だ！！");
		System.out.println("");
		System.out.println("戦いますか？");
		
		
	}
}
