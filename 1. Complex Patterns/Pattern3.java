package pattern;
import java.util.Scanner;

public class Pattern3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number \nRemember, your number we will convert in multiply by 3. \nFor better designing.");
		int n = sc.nextInt();
		
		if(n<6){
				n = 6;
		}
		while(n%3 != 0){
			n++;
		}
		
		for(int i=0; i<=n; i++){
			for(int j=0; j<=n; j++){
				if(i%3 == 0 || j%3 == 0 || i==j || i==j+1 || i==j-1){
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