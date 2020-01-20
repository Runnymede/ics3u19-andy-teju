package Teju.culminating;

import java.util.Scanner;

public class FinalProject {

	public FinalProject() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *January 13, 2019
	 *@author Andy Teju
	 */	

	public static void main(String [] arg) {

		Scanner sc = new Scanner (System.in);

		int pointcounter=0;

		System.out.println("Try to anwser the following qustions correctly");
		System.out.println("If you enter the write answer, you get a point");
		System.out.println(""); 

		String[] question= {"What is 25*25?","What is 7^2", "what is (4*9+4^3)/2-10"};
		String[] correctanswer = {"C", "B", "A"};
		String[][]	choices= {{"A.650","B.550","C.625","D.525"}, {"A.42","B.49","C.56","D.36"}, {"A.40","B.50","C.14","D.NONE OF ABOVE"}	};




		for(int i=0; i< question.length;i++) { 
			System.out.println(question [i]);

			String[] currentChoices = choices[i];

			for(int j=0; j < currentChoices.length; j++) {
				System.out.println(currentChoices[j]); 
			}

			String input = sc.nextLine();
			
			if (input.equals(correctanswser[i]))
			{
				pointcounter=pointcounter+1;
				System.out.println("that is correct");
			}
			else
			{
				System.out.print("That is incorrect, The correct answer is ");
				System.out.println(correctanswer[i]);
			}

		}// end of all the questions
		
		System.out.println (pointcounter);
		
		
	}


}
