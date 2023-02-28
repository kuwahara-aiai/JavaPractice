package fishing_game_pkg;


public class Fish {
	//魚の名前
	private String name;
	//魚の得点
	private int point;
	
	
	//コンストラクタ（引数の値を魚のフィールドの魚の名前・得点として設定する）
	public static void Fish(String name,int point) {
		
	}
	//魚の名前・得点の文字列取得(override)
	public String toString() {
		return null;
	}
	//謎のプロパティ//取得専用らしい
	public int Point() {
		return point;
		
	}
}
