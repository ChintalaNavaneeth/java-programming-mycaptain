import java.util.*;
class task1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE RADIUS OF THE CIRCLE");
	float r=sc.nextFloat();
	double area=r*r*3.147;	//area of circle(pi*r^2)
	double peri=2*3.147*r;
	System.out.println("Area of circle is "+area);
	System.out.println("Perimeter of circle is "+peri);
	}
}