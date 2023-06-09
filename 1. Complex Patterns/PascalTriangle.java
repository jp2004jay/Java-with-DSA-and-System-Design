package pattern;
import java.util.Scanner;

public class PascalTriangle{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to 9 numbers \nIf you enter any big number than we have consider only last digit. \nFor better pattern designing.");
		int n = sc.nextInt();
		
		if(n>9){
			n = n%10;
		}
		
		for(int i=0; i<=n; i++){
			for(int k=1; k<=n-i; k++){
				System.out.print("   ");
			}
			for(int j=i; j>=0; j--){
				double value = factorial(i) / ( factorial(i-j) * factorial(j) );
				System.out.print(value+"   ");
			}
			System.out.println();
		}
	}
	
	public static double factorial(int n){
		int ans = 1;
		for(int i=1; i<=n; i++){
			ans = ans*i;
		}
		return ans;
	}
}