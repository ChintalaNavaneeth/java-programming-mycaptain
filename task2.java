import java.util.*;
class task2
{
	public static void main(String args[])
	{	
		int i=0,c=0;
		Scanner sc=new Scanner(System.in);
		int add[]=new int[10];
		System.out.println("Enter first binary number");
		long x=sc.nextLong();
		System.out.println("Enter second binary number");
		long y=sc.nextLong();
		while(x!=0 || y!=0)
		{	
			add[i++]=(int)((x%10 + y%10+c) % 2);
			c=(int)((x%10 + y%10 + c )/2);
			x=x/10;
			y=y/10; 
			
		}
	if(c!=0)
	{
		add[i++]=c;
	}
	--i;
	System.out.println(" Sum of two given binary numbers is : ");
	while(i>=0)
	{
		System.out.print(add[i--]);
	}
	System.out.print("\n");
	}
}