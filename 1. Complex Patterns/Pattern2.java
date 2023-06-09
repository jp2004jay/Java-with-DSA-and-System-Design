package pattern;
import java.util.Scanner;

public class Pattern2{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to 9 number for get better pattern \nRemember that, if you enter any big number, we have consider only last digit of your number.");
		int n = sc.nextInt();
		
		if(n>9){
			n = n%10;
		}
		
		for(int i=n; i>0; i--){
			for(int j=n; j>0; j--){
				if(i<=j){
					System.out.print(j+" ");
				}
				else{
					System.out.print(i+" ");
				}
			}
			for(int j=2; j<=n; j++){
				if(i<=j){
					System.out.print(j+" ");
				}
				else{
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
		
		for(int i=2; i<=n; i++){
			for(int j=n; j>0; j--){
				if(i<=j){
					System.out.print(j+" ");
				}
				else{
					System.out.print(i+" ");
				}
			}
			for(int j=2; j<=n; j++){
				if(i<=j){
					System.out.print(j+" ");
				}
				else{
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}