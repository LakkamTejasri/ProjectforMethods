
public class HalfArray {

	public static int[] half(int[] a,int s)
	{
		
			
       int temp;
		for(int i=0;i<s-1;i++)
		{
			for(int j=0;j<s/2;j++)
			{
				if(a[j]>a[j+1])
				{
				 temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				//c++;
			}
			}
			for(int j=s/2;j<s-1;j++)
			{
				if(a[j]>a[j+1])
				{
				 temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				//c++;
			}
		}
		}
		return a;
	}
	public static void main(String[] args) {
		int[] a={3,2,6,4,7};
		int s=a.length;
		
		
		  int[] b=half(a,s);
		  for(int i=0;i<b.length;i++)
		  {
		System.out.println(b[i]);
		
	}
		}
}
