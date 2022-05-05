import java.util.*;
class InsertionSortDemo
{
	public void insertionSort(int a1 [], int n)
	{
		int length=a1.length;
		int InsertingElement = a1[length-1];
		for(int i=length-2;i>=0;i--)
		{
			if(a1[i]>InsertingElement)
			{
				a1[i+1]=a1[i];
			}
			else
			{
				a1[i+1]=InsertingElement;
				display(a1);
			}
			//if((i=0) && (a1[i])>InsertingElement)
			a1[i]=InsertingElement;
			display(a1);
		}
	}
	
	public void display(int a1[])
	{
		for(int n : a1)
		{
			System.out.print(n+" ");		
		}
		System.out.println("");
	}
	
	
	public static void main(String args[])
	{
		InsertionSortDemo q = new InsertionSortDemo();
		int[] a1= {2,4,6,8,3};
		q.insertionSort(a1,5);
	}

}