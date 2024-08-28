package Besic_program;

// Take two numbers and print the sum of both.



import java.util.Scanner;

public class p2_sum {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    
     System.out.println("Enter any two number to add them:- \n");
     int a =sc.nextInt();
     int b =sc.nextInt();
      sc.close();
     int c=a+b;
     System.out.print("\nThe Sum is: " +c);
   }

    
}
