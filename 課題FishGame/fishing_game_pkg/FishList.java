package fishing_game_pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FishList {
	private static List<Fish> box = new ArrayList<>();
	private Random rnd = new Random();

	
	//コンストラクタ（Fishクラスのリストを作る）
	public static void FishList(){
		
	}
	//boxの中から1つFishをランダムに選び返す
	public static List<Fish> RandomFish(){
		return box;
		
	}

}
