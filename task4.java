import java.util.*;
class task4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("INCHES --> METERS");
		double x=sc.nextFloat();
		float y=(float)(x*0.0254);
		System.out.println(x+" Inches = "+y+" Meters");
	}
}