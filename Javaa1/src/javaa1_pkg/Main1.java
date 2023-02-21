package javaa1_pkg;


public class Main1 {
	public static void main(String[] args) {
//		uranai();
		String mes = uranai("桑原",9);
				System.out.println("占いの結果は..." + mes);
//		int tax_price = tax(1000);
//		System.out.println("消費税＝" + tax_price + "円");
	}
//
//	public static int tax(int a) {
//		int price = (int) (a * 0.08);
//		return price;
//	}
	
	public static String uranai(String name,int month) {
		String result = "大吉";
		return month+"月生まれの"+name+"さんの運勢は"+result+"です"; 
	}
}
