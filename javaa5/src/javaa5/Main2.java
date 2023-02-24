package javaa5;

import java.io.FileReader;
import java.io.IOException;

public class Main2 {
	
	public static void main(String[] args) {
		//リソース付きのトライ
		//読み込みをするFileInputStream
		try (FileReader in = new FileReader("src/javaa5/abc.txt")){
				//FileOutputStream out = new FileOutputStream("src/sample7/destination.txt");) {
			//小さな箱、ｃ
			int c;
			//ｃにInの中身を読み込ませて、ｃの中身が-1(空っぽ)になるまで繰り返す
			while ((c = in.read()) != -1) {
				System.out.println(c);
				System.out.println("------------------");
				//out.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}