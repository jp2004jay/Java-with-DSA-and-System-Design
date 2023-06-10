package basic_and_simple;
import java.util.Scanner;

public class Aramstrong{
	public static void main(String [] args){
		int number;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to cheke Aramstrong or Not");
		number = sc.nextInt();
		
		int nOfDigits = 0, nOfDigitsNumber = number;
		int n = number, digit=0, aramNumber=0;

		while(nOfDigitsNumber != 0){
			nOfDigitsNumber = nOfDigitsNumber / 10;
			nOfDigits++;
		}
		while(n!=0){
			digit = n%10;
			n = n/10;
			aramNumber = aramNumber + power(digit, nOfDigits);
		}
		if(number == aramNumber){
			System.out.println("Yes, number is Aramstrong");
		}
		else{
			System.out.println("No, number is Not Aramstrong");
		}
	}
	public static int power(int b, int e){
		int ans = 1;
		for(int i=1; i<=e; i++){
			ans = ans * b;
		}
		return ans;
	}
}