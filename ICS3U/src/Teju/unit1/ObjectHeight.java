package Teju.unit1;

import java.util.Scanner;

public class ObjectHeight {

	/**
	 * Start of the program
	 * @author args
	 */
	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		double time;
		double height;

		System.out.println("The height of an object at any given time dropped from a starting height of 100 meters is given n by h = 100 - 2.9 * t^2");
		System.out.println("Enter a time less than 4.5 second");
		time=sc.nextDouble();

		height=100-2.9*time*time;

		System.out.println("The height of the object is");
		System.out.println(height+" meters");


	}

}
