/*
 * Write a program in java to print your name in right angle.
 * Example: Anjarul
 *             A
 *           n
 *         j
 *       a
 *     r
 *   u
 * l
 *              
 */

import java.util.Scanner;

public class p7_PrintNameInRightAngle {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name to print in right angle:-");

        String name=sc.nextLine();

        int size=name.length();

        for(int i=0;i<=size-1;i++){
            for(int j=1;j<size-i;j++){
                System.out.print("  ");
            }
            System.out.print(name.charAt(i));
            System.out.println();
        }
    }
    
}
