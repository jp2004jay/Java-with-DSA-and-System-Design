package basic_and_simple;
import java.util.Scanner;

public class Factorial{
	public static void main(String [] args){
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find Factorial: ");
		n = sc.nextInt();

		System.out.println("Ans for Recursive Method: "+factorialRecursive(n));
		System.out.println("Ans for Iterative Method: "+ factorialIterative(n));
		
		System.out.println("\nFactorial Serize");
		printFactorialSerize(n);
	}
	public static double factorialRecursive(int n){
		if(n==0 || n==1){
			return 1;
		}
		else{
			return n*factorialRecursive(n-1);
		}
	}
	public static double factorialIterative(int n){
		double ans = 1;
		for(int i=1; i<=n; i++){
			ans = ans*i;
		}
		return ans;
	}
	public static void printFactorialSerize(int n){
		for(int i=0; i<=n; i++){
			System.out.print(factorialIterative(i)+", ");
		}
	}
}