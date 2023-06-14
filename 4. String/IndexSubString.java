package string;
import java.util.Scanner;
public class IndexSubString{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String name = sc.nextLine();
		
		System.out.println("Enter sub string which you can find: ");
		String subString = sc.nextLine();
		
		int i = name.indexOf(subString);
		
		if(i == -1){
			System.out.println("Not Found");
		}
		else {
	         System.out.println("Found at index " + i);
		}
	}
}