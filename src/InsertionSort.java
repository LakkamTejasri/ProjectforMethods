import java.util.Scanner;


public class InsertionSort {

	public static int[] inser(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter th size");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elemnets");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] b=inser( a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		

	}

}
