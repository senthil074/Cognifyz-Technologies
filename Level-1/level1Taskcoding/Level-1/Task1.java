package level1;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) { 
		double Fahrenheit, Celsius;  
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the temperature in degrees Celsius:  "); 
		Celsius = scn.nextDouble();
	    Fahrenheit =((Celsius*9)/5)+32;
	    System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
	    scn.close();
	    }
	}


