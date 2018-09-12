import java.util.Scanner;


public class Merge {

	public static int[] merg(int[] a,int[] b)
	{
		int[] d=new int[a.length+b.length];
		int e=0;
		for(int i=0;i<a.length;i++)
			
		{
			
			d[i]=a[i];
			e++;
		}
		for(int i=0;i<b.length;i++)
		{
			d[e++]=b[i];
		}
		return d;
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		int[] b={6,7,8};
		int[] d=new int[a.length+b.length];
		{
			for(int i=0;i<d.length;i++)
			{
				d=merg( a, b);
				System.out.println(d[i]);
			}
		}

	}

}
