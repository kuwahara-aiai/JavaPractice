package lib;
public class Dice {
   private int n;
   private String size;
   private int max;
   public Dice(int n, String size, int max){
     this.n = n;
     this.size = size;
     this.max = max;
   }
   public Dice(int max){
     this(1, "M", max);
   }
   public Dice(){
     this(1, "M", 6);
   }
   public void   play(){
     n = (int)(Math.random()*max) + 1;
   }
   public String toString(){
     return "目数="+n+"¥tサイズ="+size+"¥t最大値="+max;
   }
   public int getN(){ return n; }
   public String getSize(){ return size; }
   public int getMax(){ return max; }
}
