import java.util.Scanner;


public class SelectionSort {
public static int[] selecton(int[] a)
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
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
		System.out.println("enter the size");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elemnents");
		for(int j=0;j<a.length-1;j++)
		{
			a[j] = sc.nextInt();
		}
					
			int[] b = selecton(a);
			for(int k = 0;k<b.length;k++)
			System.out.println(b[k]);

	}

}
