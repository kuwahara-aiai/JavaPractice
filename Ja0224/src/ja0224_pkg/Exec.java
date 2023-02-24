package ja0224_pkg;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Exec {
   public static void main(String[] args) {
     int c;
     FileReader in;
     try {
         in = new FileReader("src/ja0224_pkg/abc.txt");
         while ((c = in.read()) != -1) {
             System.out.print((char) c);
         }
         in.close();
     } catch (FileNotFoundException e) {
         System.err.println("指定されたファイルがありません");
     } catch (IOException e) {
         System.err.println("入出力エラーが発生しました");
     }
   }
}