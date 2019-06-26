import java.util.*;
class task7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the matrix");
		int x=sc.nextInt();
		int a[][]=new int[x][x];
		int b[][]=new int[x][x];
		int sum[][]=new int[x][x];
		System.out.println("Enter "+x*x+" elements for first matrix");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter "+x*x+" elements for second matrix");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sum of two matrices is...");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+"\t");
			}System.out.println();
		}
	}
}
				