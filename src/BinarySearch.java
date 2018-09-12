import java.util.*;
public class BinarySearch {
	
	
		
	

	public static int binarySearch(int[] a,int search)
	{
		int lower=0;
		int higher=a.length-1;
		int mid=(lower+higher)/2;
		while(lower<=higher)
		{
			if(a[mid]<search)
			{
				lower=mid+1;
				//return mid;
				
			}
			else if(a[mid]==search)
			{
				return mid;
				
			}
			else
			{
				
			higher=mid-1;
		
			}
			mid=(lower+higher)/2;
		}
		
			
			return -1;
			
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	    System.out.println("enter the search element");
	    int search=sc.nextInt();
		int b= binarySearch(a,search);
		System.out.println(b);
	}

	}

