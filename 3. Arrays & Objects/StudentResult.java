package array_and_objects;
import java.util.Scanner;
public class StudentResult{
	public static void main(String [] args){
		Scanner stringI = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter howmany students? ");
		int numStudent = sc.nextInt();
		
		System.out.println("Howmany subjects? (All Marks Out of 100)");
		int numSubjects = sc.nextInt();
		
		String[] studentName = new String[numStudent];
		int[][] marks = new int[numStudent][numSubjects];
		
		for(int i=0; i<studentName.length; i++){
			System.out.println("Enter student ["+(i+1)+"] name");
			studentName[i] = stringI.next();
			
			System.out.println("Enter student ["+(i+1)+"] marks (Subject wise): ");
			for(int j=0; j<marks[i].length; j++){
				System.out.println("Enter marks of Subject ["+(j+1)+"] :");
				marks[i][j] = sc.nextInt();
			}
		}
		
		displayResult(studentName, marks, numSubjects);
	}
	
	public static void displayResult(String[] name, int[][] marks, int numSubjects){
		for(int i=0; i<marks.length; i++){
			int totalMarks = 0;
			for(int j=0; j<marks[i].length; j++){
				totalMarks = totalMarks + marks[i][j];
			}
			displayResult(name[i], totalMarks, numSubjects);
		}
	}
	
	public static void displayResult(String name, int marks, int subject){
		System.out.println("\nName: "+name+"\nTotal Marks: "+marks+"\nPersentage: "+(marks/subject)+"\nPass or Fail: "+getResult(marks, subject));
	}
	
	public static String getResult(int marks, int subject){
		int gread = marks/subject;
		if(gread<35){
			return "Fail";
		}
		else{
			return "Pass";
		}
	}
	
}