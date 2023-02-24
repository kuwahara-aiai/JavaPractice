package question1;

public class Main {

	public static void main(String[] args) {

		//オブジェクト（インスタンス）の生成
		Item apple = new Item();
		apple.name="リンゴ";
		apple.price=150;
		
		System.out.println(apple.name);
		System.out.println(apple.price);
		
		Item banana = new Item();
		banana.name="バナナ";
		banana.price=100;
		
		System.out.println(banana.name);
		System.out.println(banana.price);
	}

}
