import java.util.Scanner;

public class App4_Longest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		///we have got all inputs
		int count=0;
		int maxCount=0;
		int startIndex=-1;
		int maxStartIndex=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				count++;
				if(count==1)
				{
					startIndex=i;
				}
				if(count>maxCount)
				{
					maxCount=count;
					maxStartIndex=startIndex;
				}
//				System.out.println("Count="+count);
//				System.out.println("MaxCount="+maxCount);
//				System.out.println("St.Index="+startIndex);
//				System.out.println("MaxSt.Index="+maxStartIndex);
			}else
			{
				//odd number found so count=0
				count=0;
			}
			
		}
		System.out.println();
		System.out.println(maxCount);
		System.out.println(maxStartIndex);
	}

}
