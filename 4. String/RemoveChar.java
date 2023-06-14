package string;
import java.util.Scanner;
public class RemoveChar{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string you should want: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the charactor you want to delete: ");
		char remove = sc.next().charAt(0);
		
		String removeChar = "";
		
		for(int i=0; i<name.length(); i++){
			if(name.charAt(i) != remove){
				removeChar += name.charAt(i);
			}
			else{
				continue;
			}
		}
		
		System.out.println(removeChar);
	}
}