package basic_and_simple;
import java.util.Scanner;

public class LinerSearch{
	public static void main(String [] args){
		int a[], n, search;
		boolean isIN = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("How many element do you want to add in array?");
		n = sc.nextInt();
		a = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter element["+i+"]: ");
			a[i] = sc.nextInt();
		}

		System.out.println("Which element do you want to search in array?");
		search = sc.nextInt();

		for(int i=0; i<a.length; i++){
			if(a[i] == search){
				isIN = true;
			}		
		}
		if(isIN){
			System.out.println(search+" Found!");
		}
		else{
			System.out.println(search+" Not Found!");
		}
	}
}