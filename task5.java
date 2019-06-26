import java.util.*;
class task5
{
	public static void main(String args[])
	{
		int year=0,days=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT NUMBER OF MINUTES");
		long m=sc.nextLong();
		long x=0;
		x=m;
		while(x>1440)
		{
			x=x-1440;
			days++;
		}
		while(days>=365)
		{
			days=days-365;
			year++;
		}
		System.out.println(m+" minutes is approximately "+year+" years and "+days+" days"); 
	}
}
		