import java.lang.Math;
import java.util.Scanner;

class Dice {
  public static void main(String[] args) {
Scanner kin = new Scanner(System.in);
	
int rand, randTwo, sum;
String answer;

	do {
		
        	rand = (int)(Math.random() * 6) + 1; 
		randTwo = (int)(Math.random() * 6) + 1; 
		sum = (rand + randTwo);

        	System.out.print("Die 1:" + rand + ", "); 
		System.out.print("Die 2:" + randTwo + ", ");
		System.out.print("sum of two dice:" + sum + " ");

		System.out.print("Would you like to roll again? (y/n) ");
		ajavajnswer = kin.nextLine();
		} while (answer.equals("y"));
        } 
    } 
