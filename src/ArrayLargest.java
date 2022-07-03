
public class ArrayLargest {
public static void main(String[] args) {
	int arr[]= {3,14,2,17,9};
	int temp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>=
					
					
					arr[j])
			{
				temp=arr[i];
			}else
			{
				temp=arr[j];
			}
		}
	}
	
	System.out.println("Largest element is:"+temp);
}
}
