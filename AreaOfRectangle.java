//using interface
import java.util.Scanner;
interface AT
{
	void m1();
}
class AreaOfRectangle implements AT
{
	public void m1()
	{
		Scanner s = new Scanner(System.in);
		float l,b,r;
		l = s.nextFloat();
		b = s.nextFloat();
		r = l*b;
		System.out.println(r);
	}
	public static void main(String[] args)
	{
		AreaOfRectangle a = new AreaOfRectangle();
		a.m1();
	}
}





/*using inheritance
import java.util.Scanner;
class AR
{
	void m1()
	{
		Scanner s = new Scanner(System.in);
		float l,b,r;
		l = s.nextFloat();
		b = s.nextFloat();
		r = l*b;
		System.out.println(r);
	}
}
class AreaOfRectangle extends AR
{
	public static void main(String[] args)
	{
		System.out.println("Hello Ji");
		AreaOfRectangle a = new AreaOfRectangle();
		a.m1();
	}
}*/





/*using non-static method
import java.util.Scanner;
class AreaOfRectangle
{
	public static void main(String[] args)
	{
		AreaOfRectangle a = new AreaOfRectangle();
		a.m1();
	}
	void m1()
	{
		Scanner s = new Scanner(System.in);
		float b,l,r;
		b = s.nextFloat();
		l = s.nextFloat();
		r = b*l;
		System.out.println(r);
	}

}*/






/*using simple method
import java.util.Scanner;
class AreaOfRectangle 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner s = new Scanner(System.in);
		float b,l,r;
		b = s.nextFloat();
		l = s.nextFloat();
		r = b*l;
		System.out.println(r);
	}
}*/
