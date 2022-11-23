/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
// Task one question 3
package check.divisibileby5;

/**
 *
 * @author Magdaline
 */
import java.util.Scanner;
public class Divisibileby5 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        // Checking if remainder is 0 or not
        // when divided by 5
        if (num % 5 == 0)
        //Checking if remainder is 5 or not
        // when divide by 5
 
            // Print if it is divisible by 5
            System.out.println("is divisible by 5 ");
        else
 
            // Print if it is not divisible by 5
            System.out.println("is not divisible by 5 ");
    }
}
    

