package pattern;
import java.util.Scanner;

public class EasyPattern2{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
			
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			for(int j=i; j<=n; j++){
				System.out.print(" ");
			}
			
			System.out.print(" ");
			for(int j=1; j<=i; j++){
				System.out.print(i);
			}
			for(int j=i; j<=n; j++){
				System.out.print(" ");
			}
			
			System.out.print(" ");
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}