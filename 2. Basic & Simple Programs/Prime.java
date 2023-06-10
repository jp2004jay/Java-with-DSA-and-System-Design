package basic_and_simple;
import java.util.Scanner;

public class Prime{
	public static void main(String [] args){
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to cheke Prime or Not: ");
		n = sc.nextInt();
		
		if(toChekePrime(n)){
			System.out.println("Yes, number is Prime");
		}
		else{
			System.out.println("No, number is Not Prime");
		}

		System.out.println("\nPrime Number Serize");
		printPrimeSerize(n);
	}
	public static boolean toChekePrime(int n){
		boolean isPrime = true;
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n%i == 0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	public static void printPrimeSerize(int n){
		for(int i=1; i<=n; i++){
			if(toChekePrime(i)){
				System.out.print(i+", ");
			}
		}
	}
}