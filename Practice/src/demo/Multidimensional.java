package demo;

public class Multidimensional {

	public static void main(String[] args) {
		
		//3 4 5
		//6 7 8
		
	int arr[][]= {{3,4,5},{6,7,8}};
	//System.out.println(arr[1][1]);
	for (int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println(arr[i][j]);
		}
		
	}

	}

}
