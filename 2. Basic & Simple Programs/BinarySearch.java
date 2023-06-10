package basic_and_simple;
import java.util.Scanner;

public class BinarySearch{
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

		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Which element do you want to search in array?");
		search = sc.nextInt();

		int low = 0;
		int high = a.length-1;
 
		while(high>=low){
			int mid = (high+low)/2;
			if(search < a[mid]){
				high = mid-1;
			}
			else if(search == a[mid]){
				isIN = true;
				System.out.println(search + " is Found! at "+mid+" index \nAfter Shorting Array In Assending Order");
				break;
			}
			else{
				low = mid+1;
			}
		}
		
		if(!isIN){
			System.out.println(search+" Not Found!");
		}
	}
}