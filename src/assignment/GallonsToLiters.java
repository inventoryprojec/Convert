package assignment;

import java.util.Scanner;

/*Author: Md Molla
 * Class: DA 151 Assignment 3 eclipse
 * Lesson 1: Compiling with eclipse - A First Program 
*/
/*project guide line:*/
/*
*how I have tested this program 
*described on "TestCase.txt" file under project level.
*/

/*run the project: right click on "GallonsToLiters" class then run as java application. 
 * After that pass a number  in the console that you want convert gallons to liters 
 *  expected result should be display in the console */

public class GallonsToLiters {
	

	public static void main(String[] args) {
		// calling "getTheGallonsToConvert()" method to be executed
		getTheGallonsToConvert();
		// calling "getTheGallonsToConvertAfterModify()" method to be executed
		getTheGallonsToConvertAfterModify();

	}// end main method

	// before modify code to convert gallons to liters
	public static double getTheGallonsToConvert() {
		// specific number to convert
		double gallons = 5;
		// conversion factor: 1 gallon = 3.78541 liters
		double liters = gallons * 3.78541;
		// Display output in the console gallons equals to liters
		System.out.println(" 5 gallons equal to : " + liters + " Liters.");

		return liters;//

	}// end getTheGallonsToConvert

	public static double getTheGallonsToConvertAfterModify() {

		// promt user for input

		Scanner in = new Scanner(System.in); //// *
		System.out.println("Please Enter your number to convert");
		// to read input from console
		double gallons = in.nextDouble();
		// 3.78541 will be multiplied by user input
		double liters = gallons * 3.78541;
		// Display output in the console the gallons equals to liters
		System.out.println(" Given gallons equal to : " + liters + " Liters.");

		in.close();

		return liters;
	}// end getTheGallonsToConvertAfterModify()

}
