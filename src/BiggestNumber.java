import java.util.Scanner;

public class BiggestNumber {
   public BiggestNumber() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter 3 Numbers: ");
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int var4 = var1.nextInt();
      if (var2 > var3 && var2 > var4) {
         System.out.println("" + var2 + " is the Biggest Number.");
      } else if (var3 > var2 && var3 > var4) {
         System.out.println("" + var3 + " is the Biggest Number.");
      } else {
         System.out.println("" + var4 + " is the Biggest Number");
      }

      var1.close();
   }
}