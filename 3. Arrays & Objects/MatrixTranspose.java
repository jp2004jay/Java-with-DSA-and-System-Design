package array_and_objects;
public class MatrixTranspose{
	public static void main(String[] args){
		int matrix[][] = {{3,0,9},{2,1,5},{7,8,2}};
		
		System.out.println("\nSimple Matrix: ");
		for(int tempArray[] : matrix){
			for(int temp : tempArray){
				System.out.print(temp+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nTranspose Matrix: ");
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}