package string;
import java.util.Scanner;
public class Palingdrom{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string to cheak palingdrom or not! ");
		String name = sc.nextLine();
		
		String nameTrim = "";
		String reverse = "";
		boolean isPalingdrom = true;
		
		for(int i=0; i<name.length(); i++){
			char temp;
			if(name.charAt(i) != ' '){
				if(((int)name.charAt(i)) >=65 && ((int)name.charAt(i))<=90){
					temp = (char)(name.charAt(i) + 32) ;
				}
				else{
					temp = name.charAt(i);
				}
			}
			else{
				continue;
			}
			nameTrim += temp;
		}
		
		for(int i=nameTrim.length()-1; i>=0; i--){
			reverse += nameTrim.charAt(i);
		}
		
		for(int i=0; i<nameTrim.length(); i++){
			if(nameTrim.charAt(i) != reverse.charAt(i)){
				isPalingdrom = false;
				break;
			}
		}
		
		if(isPalingdrom){
			System.out.println("Yes, It is palingdrom!");
		}
		else{
			System.out.println("No, It is not palingdrom!");
		}
		
	}
}