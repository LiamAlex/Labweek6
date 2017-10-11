/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek6;

import java.util.Scanner;

/**
 *
 * @author daley
 */
public class Labweek6 {
    public static void main(String[] args)
    {        
        /**
         * 1.  Using a while loop, display the numbers 1-100 on the screen - 1 # on each line
         */
        int count=1;
        while(count<=100){
            System.out.printf("%d#%n", count);
            count++;
        }
        
        /**
         * 2.  Using a while loop, display the numbers 2-100 on the screen
         *     going up in units of 2.  For example 2, 4, 6, 8 ... 96, 98, 100
         */
        int i=2;
        while (i<=100){
            System.out.printf("%d%n", i);
            i+=2;
        }
                

        
        /**
         * 3.  Using a while loop, display the numbers 100-1 on the screen
         *     going down in units of 5.  For example 100, 95, 90, 85...10, 5
         */
        int y=100;
        while(y>=1){
            System.out.printf("%d%n", y);
            y--;
        }

        /**
         * 4.  Using a while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 10
         */
        int x=1;
        Scanner keyboard = new Scanner(System.in);
        while(x !=10){
            System.out.printf("plese enter a nuymber: ");
            x=keyboard.nextInt();
        }
        
        /**
         * 5.  Using a do...while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 15
         */
        
        
        /**
         * 6.  Using a for loop, display the numbers 1-100 on the screen
         */
        

        /**
         * 7.  Using a for loop, display the numbers 2-100 on the screen, going up in steps of 2
         */
        
        
        /**
         * 8.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 1
         */

        
        /**
         * 9.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 5
         */
        
        
        /**
         * 10. Using the loop style of your choice, write a program that will display the numbers 1-100, where each
         *     number is on it's own line.  
         *      
         *     ->If the number displayed is divisible by 4, write your first name after the number.
         *     ->If the number displayed is divisible by 9, write your last name
         *     ->If the number displayed is divisble by both 4 & 9, write your first name a space and then your last name.
         */
    }
    
}