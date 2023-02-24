package javaa6_pkg;

import java.util.HashMap;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("name","山田太郎");
		hm.put("age","20");
		
		System.out.println(hm.get("name"));
		System.out.println(hm.get("age"));

		System.out.println("----");

		//ループですべての項目を出力
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key);
			System.out.println(hm.get(key));

			}
		
	}
}