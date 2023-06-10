package basic_and_simple;

public class CommandLineArguments{
	public static void main(String [] args){
		int n = Integer.parseInt(args[0]);
		if(n%2 == 0){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
	}
}