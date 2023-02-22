package accetion_pkg;

public class Main {

	public static void main(String[] args) {

		Chara c1 = new Chara();
		c1.name = "アイ";
		c1.hp = 1000;
		System.out.println(c1.name);
		System.out.println(c1.hp);
		c1.attack();
		System.out.println(c1);

		System.out.println("-------------------");

		Magic m1 = new Magic();
		m1.name = "魔法使い";
		m1.hp = 5000;
		System.out.println(m1.name);
		System.out.println(m1.hp);
		m1.attack();

		m1.mp = 300;
		System.out.println("残りのMPは：" + m1.mp);
		System.out.println(m1);
		
		System.out.println("-------------------");
		
		Chara m2 = new Magic();
		m2.name = "魔法使い２";
		m2.hp = 4000;
		System.out.println(m2);
		
		System.out.println("-------------------");
		
		//expはインターフェースから取得
		Chara c4 = new Chara();
		c4.exp = 5000;
		c4.name = "ヤンマー";
		c4.hp = 200;
		System.out.println(c4.name);
		System.out.println("残りHP："+c4.hp);
		System.out.println("経験値GET!!：" + c4.exp);
		System.out.println(c4);
		

	}

}
