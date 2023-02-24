package question2;

public class Main {

	public static void main(String[] args) {

		//オブジェクト（インスタンス）の生成
		Shop s1 = new Shop();
		
		s1.name="パン屋";
		s1.sale=100000;
		System.out.println(s1.name+" 売上："+s1.sale);
		
		Shop s2 = new Shop();
		
		s2.name="洋服や";
		s2.sale=150000;
		System.out.println(s2.name+" 売上："+s2.sale);
	}
}
