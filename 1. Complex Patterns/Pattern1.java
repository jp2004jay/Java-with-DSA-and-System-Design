package pattern;
import java.util.Scanner;

public class Pattern1{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter only odd number \nIf you enter even number, automatically convert in after odd number.");
		int n = sc.nextInt();
		
		if(n%2 == 0){
			n++;
		}
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=n; j++){
				if(i==1 || j==1 || i==n || j==n || i==j || i+j==n+1 || 
					i+j==(n/2)+3 || j-i==(n/2)-1 || i-j==(n/2)-1 || i+j==n+(n/2)){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			for(int j=1; j<=n; j++){
				if(i==1 || j==1 || i==n || j==n ||
					i+j>=(n/2)+3 && j-i<=(n/2)-1  && i-j<=(n/2)-1 && i+j<=n+(n/2)){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			
			System.out.print("  ");
			for(int j=1; j<=n; j++){
				if(i==1 || j==1 || i==n || j==n ||
					i+j<=(n/2)+3 || j-i>=(n/2)-1 || i-j>=(n/2)-1 || i+j>=n+(n/2)){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}
}