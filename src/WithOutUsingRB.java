import java.util.*;
public class WithOutUsingRB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.println("enter the size");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	int l=0,h=a.length-1,c=0;
	int mid=(l+(h))/2;
	System.out.println("enter the elemnets");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	//c=0;
   System.out.println("enter the search elemnet");
   int s=sc.nextInt();
   while(l<=h)
   {
	   if(a[mid]<s)
	   {
		   l=mid+1;
	   }
	   else if(a[mid]==s)
	   {
		   
		  System.out.println(mid);
		  break;
	   }
	   else
	   {
		  h=mid-1;
	   }
   mid=(l+(h))/2;
 
   }

   if(l<=h)
   {
	   System.out.println("given key is found "+mid);
   }
   else
   {
	   System.out.println("given key not is found ");
   }
}}