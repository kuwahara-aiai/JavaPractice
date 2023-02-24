package javaa5;
public class Main4 {
   public static void main(String[] args) {
      int n = 1234567;
      System.out.printf("%d\n",n);
      System.out.printf("%12d\n",n);
      System.out.printf("%012d\n",n);
      System.out.printf("%+0,12d\n",n);
      double x = 1234.567;
      System.out.printf("%10.5f %n",x);
      System.out.printf("%010.3f %n",x);
      String s = "abcdefg";
      System.out.printf("%s %n",s);
      System.out.printf("%12s %n",s);
      
      System.out.printf("%.1f %n",x);

      System.out.printf("%6.1f %n",x);
      System.out.printf("%7.1f %n",x);
      System.out.printf("%8.1f %n",x);
      System.out.printf("%9.1f %n",x);
   }
}