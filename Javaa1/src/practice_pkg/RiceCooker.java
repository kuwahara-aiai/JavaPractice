package practice_pkg;

public class RiceCooker {

	public static void main(String[] args) {
		String riceCook =ricecook("あきたこまち","六甲の水");
		System.out.println(riceCook);
		System.out.println("『ごはんですよ』と一緒に召し上がれ！");
	}

	public static String ricecook(String rice,String water) {
		String cooked= ("美味しい"+rice+"と"+water+"でご飯を炊いたよ！");
		return cooked;
	}
}
