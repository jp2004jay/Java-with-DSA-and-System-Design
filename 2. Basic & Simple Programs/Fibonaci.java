package basic_and_simple;
import java.util.Scanner;

public class Fibonaci{
	public static void main(String [] args){
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to find Fibonaci: ");
		n = sc.nextInt();
		
		System.out.println("Ans for Recursive Method: "+fibonaciRecursive(n));
		System.out.println("Ans for Iterative Method: "+fibonaciIterative(n));
		System.out.println("\nFibonaci Serize");
		printFibonaciSerize(n);
	}
	public static double fibonaciRecursive(int n){
		if(n==1 || n==0){
			return 0;
		}
		else if(n==2){
			return 1;
		}
		else{
			return fibonaciRecursive(n-1)+fibonaciRecursive(n-2);
		}
	}
	public static double fibonaciIterative(int n){
		double a = 0; 
		double b = 1;
		double ans = 0;
		if(n==2){
			return 1;
		}
		else{
			for(int i=2; i<n; i++){
				ans = a + b;
				a = b;
				b = ans;
			}
			return ans;
		}
	}
	public static void printFibonaciSerize(int n){
		for(int i=1; i<=n; i++){
			System.out.print(fibonaciIterative(i)+", ");
		}
	}
}