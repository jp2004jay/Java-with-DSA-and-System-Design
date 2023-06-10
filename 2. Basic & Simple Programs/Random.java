package basic_and_simple;
import java.util.Scanner;

public class Random{
	public static void main(String [] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from which you generate random number: ");
		n = sc.nextInt();
		int randomNumber = (int)(Math.random()*n+1);
		System.out.println("Your Random Number is: "+randomNumber);
	}
}