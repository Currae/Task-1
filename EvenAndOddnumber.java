/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package even.and.oddnumber;

/**
 *
 * @author Magdaline
 */
import java.util.Scanner;
public class EvenAndOddnumber { 
      static int sirName,age,sirNameLength;
    public static void main(String[] args) {
        Scanner getinput = new Scanner(System.in);
        System.out.println("Enter your sir name:");
         sirName = getinput.nextInt();
        System.out.println("Enter your age:");
         age = getinput.nextInt();
        //input the number of characters 
        
        
        //Getting age if it is an even or odd number
        String EvenOdd;
         if(age % 2 == 0)
           EvenOdd = "Even";
         else{
             EvenOdd = "Odd"; 
         } 
   //output
   System.out.println("The number of letters in your sir name is:" +sirNameLength);
   System.out.println("Your current age is an:");
    }
    
}
    

