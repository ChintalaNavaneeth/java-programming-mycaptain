import java.util.*;
class task6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter number to check whether it is negative , zero or positive :");
		int x=sc.nextInt();
		if(x>0)
		{
		System.out.println(x+" is a positive number");
		}
		else if(x<0)
		{
			System.out.println(x+" is negative number");
		}
		else
		{
			System.out.println("Entered number is zero");
		}
	}
}	