import java.util.Scanner;


public class AreaofRadius {
	static double radius;

	double calculate(int b){
		
		radius=Math.PI*b*b;
		return radius;
	}
	
	public static void main(String[] args) {
		
		Scanner temp=new Scanner(System.in);
		
		System.out.println("Please enter the radius value");
		System.out.println("Ho ");
		System.out.println("jkj");
		int a=temp.nextInt();
		
		AreaofRadius obj=new AreaofRadius();
		obj.calculate(a);
		
		System.out.println("Area of radius is "+radius);
		

	}

}
