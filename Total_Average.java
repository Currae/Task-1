/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
// Task one question number 2
package average.total_average;

/**
 *
 * @author Magdahlyne
 */
import java.util.Scanner;
public class Total_Average {

    public static void main(String[] args) {
        int unit;
    //ask user to enter the number of units
    System.out.println("Enter number of units");
 
    Scanner sc=new Scanner(System.in);
 
    int num=sc.nextInt();
 
    int[] a=new int[num];
 
    double avg=0;
 // ask user to enter the marks for each unit
    System.out.println("Enter marks");
 
    for( unit=0;unit<num;unit++)
    {
       a[unit]=sc.nextInt();
    }
 
    for( unit=0;unit<num;unit++)
    {
      avg=avg+a[unit];
    }
 //getting the average for total marks
    System.out.print("Average of (");
 
    for(unit=0;unit<num-1;unit++)
    {
      System.out.print(a[unit]+",");
    }
    System.out.println(a[unit]+") ="+avg/num);
  }
}
    