package javaa6_pkg;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		
		//Charaクラスの確認
		Chara c1 = new Chara("山田太郎",100);
		System.out.println(c1);
		
		ArrayList<Chara> ls = new ArrayList<Chara>();
		
		ls.add(new Chara("イチロー",150));
		ls.add(new Chara("ジロー",200));
		ls.add(new Chara("サブロー",300));
		
		System.out.println("-----------------");
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		System.out.println(ls.get(2));
		System.out.println("-----------------");
		//サブローの「300」という数字だけ出力したい
		System.out.println("サブローのHP！");
		System.out.println(ls.get(2).hp);
		System.out.println("山田太郎のHP”");
		System.out.println(c1.hp);
		System.out.println("-----------------");
		
		//↓拡張For文
		//ループで１つずつすべて取り出したい
		for(Chara c :ls) {
			System.out.println(c);
		}
		System.out.println("-----------------");
		
		
		//要素数の確認＝部屋数
		System.out.println("要素数がいくつあるか");
		System.out.println(ls.size());
		
	}
}