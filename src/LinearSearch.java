import java.util.*;
public class LinearSearch {
	public static int linear(int[] a,int n,int k)
	{
		//int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				return i;
                
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
	      int n=sc.nextInt();
	      int[] a=new int[n];
	      System.out.println("enter the elemnets");
	      for(int i=0;i<a.length;i++)
	      {
	    	  a[i]=sc.nextInt();
	      }
		System.out.println("enter search key");
		int k=sc.nextInt();
		System.out.println(linear(a,k, k));
		

		
	}

}
