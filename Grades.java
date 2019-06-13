
import java.util.Scanner;

public class Grades{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("Input Homework Grade 1");
		int HW1 = kin.nextInt();
		System.out.print("Input Homework Grade 2");
		int HW2 = kin.nextInt();
		System.out.print("Input Homework Grade 3");
		int HW3 = kin.nextInt();
		System.out.print("Input Quiz Grade 1");
		int Q1 = kin.nextInt();
		System.out.print("Input Quiz Grade 2");
		int Q2 = kin.nextInt();
		System.out.print("Input Test Grade");
		int Test = kin.nextInt();




		double HAV = (((HW1 + HW2 + HW3) / 3));
		double QAV = ((Q1 + Q2) / 2);
	System.out.println("Your Grade:" + ((0.2 * HAV) + (0.5 * QAV) + (0.3 * Test)));


	}
}
