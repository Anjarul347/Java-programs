package Besic_program;



import java.util.Scanner;

public class p4_HCF_LCM {
    public static void main(String[] args) {
         System.out.println("Ente Two number to find its HCF And LCM:-");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int HCF=0,LCM;
        
        for(int i=1;i<=num1;i++){
            if((num1%i== 0 && num2 % i == 0)){
              HCF = i;
            }
        }

        LCM = (num1*num2)/HCF;
        System.out.printf("%d is the HCF of both numbers\n",HCF );
        System.out.printf("\n%d is the LCM of both numbers\n",LCM );
    }
    
}
