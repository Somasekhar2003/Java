import java.util.*;
class IntegertoBinary or Binarytodecimal {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String h=String.valueOf(n);
       //System.out.println(Integer.parseInt(h,2)); //For Binary To Integer
       System.out.println(Integer.toBinaryString(n));//For Decimal to Binary
    }
}
