import java.util.Scanner;


public class LargestSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int len=input.nextInt();
		int [] num=new int[len];
		System.out.println("Enter array elements");
		int smallest = num[0];
        int largest = num[0];
		
		
		for (int i=1;i<len;i++)
		{
			num[i]=input.nextInt();
			
			if(num[i] > largest)
		largest=num[i];
			
		else if(num[i] < smallest)
				smallest=num[i];
						
		
		}
		System.out.println("Largest number: "+largest+"\n Smallest number: "+smallest);
		
		}
	}

