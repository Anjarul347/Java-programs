package Besic_program;


import java.util.Scanner;

public class p1_LeapYearOrNot {
 public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a year to check the year is leap year or not");
    int year =sc.nextInt();
    sc.close();

    if(year % 400==0 || (year % 4==0 && year% 100 !=0))
        System.out.println("The year leap year");
   
    else
        System.out.println("The year is not leap year");
 }
}
