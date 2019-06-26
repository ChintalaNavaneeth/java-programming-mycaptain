import java.util.*;
class task8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		vowel(s);
	}
public static void vowel (String s)
	{
		char ch;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='O'||ch=='I'||ch=='E'||ch=='U')
			{		
				count++;
			}
		}System.out.println("number of vowels present in the string are: "+count);
	}
}