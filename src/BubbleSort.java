import java.util.*;
public class BubbleSort {

	public static  int[] sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		
		
		return a;
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elemnents");
		for(int j=0;j<=a.length-1;j++)
		{
			a[j] = sc.nextInt();
		}
					
			BubbleSort bs = new BubbleSort();
			int[] b = bs.sort(a);
			for(int k = 0;k<a.length;k++)
			System.out.println(b[k]);

}
	}

		