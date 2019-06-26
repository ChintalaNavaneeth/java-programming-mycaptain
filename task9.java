import java.util.*;
class task9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b && b!=c)
		{
			large(a,c);
		}
		else if(a==c && b!=c)
		{
			large(a,b);
		}
		else if(b==c && a!=b)
		{
			large(a,b);
		}
		else if(a==b && b==c)
		{
		System.out.println("All numbers entered are equal \nLargest number can't be deternmined");
		}
		else
		{
		largest(a,b,c);
		} 
	}

	public static void largest(int a,int b,int c)            // method when three numbers entered are different
	{
		if(a>b && a>c)
		{
			System.out.println(a+" is largest among three.");
		}
		else if(a<b && b>c)
		{
			System.out.println(b+" is largest among three.");
		}
		else
		{
			System.out.println(c+" is largest among three.");
		}
	}
	public static void large(int a, int b)      // method when any two numbers entered are same
		{
			if(a>b)
			{
				System.out.println(a+" larger among all the three");
			}
			else
			{
				System.out.println(b+" larger among all the three");
			}
		}
}