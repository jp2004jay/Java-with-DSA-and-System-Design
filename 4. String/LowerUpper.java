package string;
import java.util.Scanner;
public class LowerUpper{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name to convert Lower Cases and Upper Cases");
		String name = sc.nextLine();

		System.out.println("Lower: "+lowerCase(name));
		System.out.println("Upper: "+upperCase(name));
	}
	
	public static String upperCase(String name){
		String upper = "";
		for(int i=0; i<name.length(); i++){
			if(((int)name.charAt(i)) >= 65 && ((int)name.charAt(i)) <= 90 || name.charAt(i) == ' ') {
				upper+=name.charAt(i);
			}
			else{
				upper+=(char)(name.charAt(i)-32);
			}
		}
		return upper;
	}
	
	public static String lowerCase(String name){
		String lower = "";
		for(int i=0; i<name.length(); i++){
			if(((int)name.charAt(i)) >= 97 && ((int)name.charAt(i)) <= 122 || name.charAt(i) == ' ') {
				lower+=name.charAt(i);
			}
			else{
				lower+=(char)(name.charAt(i)+32);
			}
		}
		return lower;
	}
}