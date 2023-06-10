package basic_and_simple;
import java.util.Scanner;

public class Palingdrom{
	public static void main(String [] args){
		int number, revNumber=0, digit=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to cheke Palingdrom or Not: ");
		number = sc.nextInt();
		int n = number;

		while(n!=0){
			digit = n%10;
			n = n/10;
			revNumber = (revNumber * 10) + digit;
		}
		if(number == revNumber){
			System.out.println("Yes, number is Palingdrom");
		}
		else{
			System.out.println("No, number is Not Palingdrom");
		}
	}
}