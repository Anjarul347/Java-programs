package Besic_program;



import java.util.Scanner;

public class p3_MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Ente a number to generate multiplication Table:-");
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            sc.close();
            System.out.printf("The multiplication table of %d is given below:-\n",n);
            for(int i=1;i<=10;i++){
                System.out.printf("%d X %d = %d\n",n,i,(n*i));
            }
        }
    }
    
}
