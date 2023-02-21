package practice_pkg;

public class WhichOnigidi {

	public static void main(String[] args) {
		String giri=onigiri("おかか","ツナ","鮭","すじこ");
		System.out.println(giri);

	}
	public static String onigiri(String a,String b,String c,String d) {
	String nigi = ("今日のおにぎりは、"+a+"と、"+b+"と、"+c+"と、"+d+"がいいな！");
	return nigi;
	
	}

}
