import java.util.Scanner;
class S1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.out);
		String s = sc.next();
		System.out.println(s);
		//char a,e,i,o,u;
		int i=0;
		for(i=0;i<=s.length-1;i++)
		{
			if((i=='a')||(i=='i')||(i=='e')||(i=='o')||(i=='u'))
			{
				System.out.println("Vowels are present");
			}
			else
			{
				System.out.println("Not present");
			}
		}
	}
}
/*without using recursion
class fibbonaci 
{
	public static void main(String[] args) 
	{
		int a=0, b=1, c, s=100,i;
		System.out.println(a+ " " +b);
		for(i=0;i<s;i++)
		{
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;

		}
	}
}*/
