package lab02;

import java.util.Random;
import java.util.Scanner;

public class randomGrades {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		System.out.print("How many letter gradese: ");
		int numletters =input.nextInt();
		printNRandomLetterGrades(numletters);
		
	}
	public static void printNRandomLetterGrades(int n) {
		
		for(int i=0;i<n;i++) {
			Random random1 = new Random();
			int randomNumber = random1.nextInt(9)+1;
			//System.out.println(randomNumber);
			switch(randomNumber) {
			case 1 : System.out.println("A+"); break; 
			case 2 : System.out.println( "A" );break;
			case 3 : System.out.println( "B+" );break;
			case 4 : System.out.println("B") ;break;
			case 5 :System.out.println("C+") ;break;
			case 6 : System.out.println("C" );break;
			case 7 : System.out.println("D+");break;
			case 8 : System.out.println("D" );break;
			case 9 : System.out.println("F" ); 	break;	
			}
	}
	
	}

}
