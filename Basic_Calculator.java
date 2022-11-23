/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
// Task 1 question number 5
package calculator.basic_calculator;

/**
 *
 * @author Magdaline
 */
import java.util.Scanner;
public class Basic_Calculator {

    public static void main(String[] args) {
         // stores two numbers
        double num1, num2;
  
        // Take input from the user
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the numbers");
  
        // take the inputs
        num1 = sc.nextDouble();
  
        num2 = sc.nextDouble();
  
        System.out.println("Enter the operator (+,-,*,/)");
  
        char op = sc.next().charAt(0);
  
        double o = 0;
  
        switch (op) {
         // case to add two numbers
        case '+' -> o = num1 + num2;
         // case to subtract two numbers
        case '-' -> o = num1 - num2;
        // case to multiply two numbers
        case '*' -> o = num1 * num2;
        // case to divide two numbers
        case '/' -> o = num1 / num2;
  
        default -> System.out.println("You enter wrong input");
        }
  
        System.out.println("The final result:");
  
        System.out.println();
  
        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
    }
}
        
    

