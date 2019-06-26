import java.util.*;
class task10
{
	public static void main(String args[])
	{       
		int c=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input number of terms : ");
		int x=sc.nextInt();
		while(c<=x)
		{
			System.out.println("Number is:"+c+" and cube of "+c+" is : "+c*c*c);
			c++;
		}
	}
} 