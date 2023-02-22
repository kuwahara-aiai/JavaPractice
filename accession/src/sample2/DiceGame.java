package sample2;
import lib.Dice;
public class DiceGame extends Game{
    private Dice dealer;
    private Dice player;
    private int score;
    public DiceGame(){
      dealer = new Dice();
      player = new Dice();
    }
    @Override
    protected void init(){
      System.out.println(" サイコロゲーム ");
    }
    @Override
    protected void play(){
      player.play();
      dealer.play();
      System.out.println("親:"+dealer.getN()+" 貴方:"+player.getN());
    }
    @Override
    protected void eval(){
      score += player.getN()-dealer.getN();
      System.out.println("現在までの得点＝"+(score));
    }
}