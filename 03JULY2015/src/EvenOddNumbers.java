import java.util.Scanner;


public class EvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int len=input.nextInt();
		int [] num=new int[len];
		System.out.println("Enter array elements");
		for (int i=0;i<len;i++)
		{
			num[i]=input.nextInt();
			
			if(num[i]%2==0)
			{
				System.out.println(num[i]+"is a even number");
			}
			else
			{
				System.out.println(num[i]+"is a odd number");
			}
		
		}
		
		
		

	}

}
