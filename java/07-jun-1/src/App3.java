import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		int max=arr[1];
		for(int i=0;i<n;i++)
		{
			if(arr[0]<min)
			{
				min=arr[0];
			}
			if(arr[0]>max)
			{
				max=arr[0];
			}
		}
		
		System.out.println("Result:");
		System.out.println(min);
		System.out.println(max);
	}

}
