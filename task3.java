import java.util.*;
class task3
{
	public static void main(String args[])
	{	
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER TO FIND SUM OF DIGITS");
		long x=sc.nextLong();
		while(x>0)
		{
			int y=(int)(x%10);
			sum=sum+y;
			x=x/10;a
		}
	System.out.println("SUM OF INTEGERS IS "+sum);
	}
} 