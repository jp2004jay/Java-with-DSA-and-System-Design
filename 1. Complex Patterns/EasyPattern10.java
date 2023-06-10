package pattern;
import java.util.Scanner;

public class EasyPattern10{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		
		if(n%2 == 0){
			n++;
		}
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i+j == n/2+2 || j-i == n/2 || i-j ==n/2 || i+j == n+n/2+1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}