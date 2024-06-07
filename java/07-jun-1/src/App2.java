
public class App2 {

	public static void main(String[] args) {
		int arr[]=new int[10];	//array of size 10
		int arr1[]= {};			//array of size 0
		int arr2[]= {1,5,4,8,9,2,45};	//size is 7
		int arr3[];				//arr3 is null
//		arr3.length			NullPointerException
		arr3=new int[8];			//size is 8
		
		//arrays cannot be resized
		//arr3 is sized as 8
		arr3=new int[80];
			//it looks like arr3 is resized.
		//but actually, arr3 now refers to new location
		
		
	}

}
