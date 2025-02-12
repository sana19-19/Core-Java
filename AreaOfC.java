// using non-static method
import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[] args)
	{
		System.out.println("hello ji");
		AreaOfCircle a = new AreaOfCircle();
		a.m1();
	}
	void m1()
	{
		Scanner s = new Scanner(System.in);
		double c, r;
		r = s.nextDouble();
		c = (22*r*r)/7;
		System.out.println(c);
	}
}




/*using Constructor
import java.util.Scanner;
class AreaOfCircle
{
	double c,r;
	AreaOfCircle()
	{
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		c = (22*r*r)/7;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		System.out.println("hello ji");
		AreaOfCircle a = new AreaOfCircle();
	}
}*/





/* using Inheritace
import java.util.Scanner;
class AreaOfCircle
{
	void m1()
	{
		Scanner sc = new Scanner(System.in);
		double n ,c;
		n = sc.nextDouble();
		c = (22*n*n)/7;
		System.out.println(c);
	}
}
class ac extends AreaOfCircle
{
	public static void main(String[] args)
	{
		ac a = new ac();
		a.m1();
	}
}*/




/*Area of circle using interface
import java.util.Scanner;
interface AreaOfCircle
{
	void m1();
}
class ac implements AreaOfCircle
{
	public void m1()
	{
		Scanner sc = new Scanner(System.in);
		double n,c;
		n=sc.nextDouble();
		c = (22*n*n)/7;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		ac a = new ac();
		a.m1();
		//System.out.println(a.c);
	}
}*/





/*Area of circle using static method
import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double circle, radius;
		radius = sc.nextDouble();
		circle = (22*radius*radius)/7;
		System.out.println(circle);
	}
}*/
