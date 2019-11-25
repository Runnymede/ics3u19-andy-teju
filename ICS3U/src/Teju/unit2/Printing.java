package Teju.unit2;

import java.util.Scanner;

public class Printing {

	/**
	*October 3, 2019
	*@author Andy Teju
	*/
	
	public static void main(String [] arg) {
		
		Scanner sc = new Scanner (System.in);
		
		int numberOfCopies;
		double pricePerCopy;
		double total;
		
		//input
		System.out.println("select the number of copies to print");
		
		//give price based number of copies
		if (numberOfCopies >0) {
			pricePerCopy=(0.30);
		}
		else if (numberOfCopies>99) {
			pricePerCopy=(0.28);
		}
		else if (numberOfCopies>499) {
			pricePerCopy=(0.27);
		}
		else if (numberOfCopies>749) {
			pricePerCopy=(0.26);
		}
		else if (numberOfCopies>999) {
			pricePerCopy=(0.25);
		}
		System.out.println("The price per each copy is"+ (pricePerCopy));
		
		//calculate total cost
		total=pricePerCopy*(numberOfCopies);
			
		Object decimal;
		System.out.println("Your total is:"+decimal.format(total));		
	}
	
	
}
