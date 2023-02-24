package javaa5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		//リソース付きのトライ
		//読み込みをするFileInputStream
		try (BufferedReader in = new BufferedReader(new FileReader("src/javaa5/abc.txt"))) {
			//FileOutputStream out = new FileOutputStream("src/sample7/destination.txt");) {
			//小さな箱、ｃ
			String s;
			//ｃにInの中身を読み込ませて、ｃの中身が-1(空っぽ)になるまで繰り返す
			while ((s = in.readLine()) != null) {
				System.out.println(s);
				System.out.println("-------------");
				//out.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}