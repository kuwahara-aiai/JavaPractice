package sample2;
import lib.Input;

//抽象クラスGame
public abstract class Game{
   public void playGame() {
     init();
     do {
         play();
         eval();
     } while (next());
   }
   public boolean next() {
     int n = Input.getInt("続けますか？");
     if (n==0) return true;
     else return false;
   }
 
   //継承先でこういうメソッド持ってておくれよ
   protected abstract void init();
   protected abstract void play();
   protected abstract void eval();
}