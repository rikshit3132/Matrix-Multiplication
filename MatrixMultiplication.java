import java.util.Scanner;
class MatrixMultiplication{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		int mul[][]=new int[3][3];
		System.out.println("Enter the Array1:\n");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Array2:\n");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array1:\n");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
	}
	System.out.println("Array2:\n");
	for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
	}
	for(i=0;i<3;i++){
		
		for(j=0;j<3;j++){
			mul[i][j]=0;
			for(k=0;k<3;k++){
				mul[i][j]+=arr1[i][k]*arr2[k][j];//MAin concept
			}
		}
	}
		System.out.println("Multiplied New Array is:\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			System.out.print(mul[i][j]+" ");
		}
		System.out.println();
	}

}
}