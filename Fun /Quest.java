
import java.util.Scanner;

public class Quest{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = kin.nextLine();
		System.out.print("What is your quest? ");
		String quest = kin.nextLine();
		System.out.print("What is your favorite color? ");
		String color = kin.nextLine();

		System.out.println("Right, off you go.");
		
	}
}
