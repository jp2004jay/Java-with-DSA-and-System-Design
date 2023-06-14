package string;
import java.util.Scanner;
public class Reverse{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();
		
		String reverseName = "";
		
		for(int i=name.length()-1; i>=0 ; i--){
			reverseName += name.charAt(i);
		}
		System.out.println(reverseName);
	}
}