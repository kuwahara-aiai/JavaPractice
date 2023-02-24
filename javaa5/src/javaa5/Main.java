package javaa5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
 public static void main(String[] args){
     try(FileInputStream in = new FileInputStream("src/javaa5/abc.txt");
     FileOutputStream out = new FileOutputStream("src/javaa5/outText.txt");){
         int c;
         while ((c=in.read()) != -1) {
        	 System.out.println(c);
             out.write(c);
         }
     }catch(IOException e){
         e.printStackTrace();
     }
   }
}