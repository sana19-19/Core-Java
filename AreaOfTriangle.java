//using Interface
import java.util.Scanner;
interface AT
{
	void m1();
}
class AreaOfTriangle implements AT
{
	public void m1()
	{
		float t,h,b;
		Scanner s = new Scanner(System.in);
		h = s.nextFloat();
		b = s.nextFloat();
		t = (1*h*b)/2;
		System.out.println(t);
	}
	public static void main(String[] args)
	{
		AreaOfTriangle a= new AreaOfTriangle();
		a.m1();
	}
}






/*using inheritance
import java.util.Scanner;
class AT
{
	void m1()
	{
		Scanner sc = new Scanner(System.in);
		float h,b,t;
		h = sc.nextFloat();
		b = sc.nextFloat();
		t = (1*h*b)/2;
		//System.out.println(t);
	}
}
class AreaOfTriangle extends AT
{
	public static void main(String[] args)
	{
		AreaOfTriangle a = new AreaOfTriangle();
		a.m1();
		System.out.println(a.t);
	}
}*/





/*using constructor
import java.util.Scanner;
class AreaOfTriangle
{
	AreaOfTriangle()
	{
		Scanner sc = new Scanner(System.in);
        float height,base,Triangle;
		height = sc.nextFloat();
		base = sc.nextFloat();
        Triangle  = (1*height*base)/2;
		System.out.println(Triangle);
		
	}
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		AreaOfTriangle at = new AreaOfTriangle();
	}
}*/





/*using simple method
import java.util.Scanner;
class AreaOfTriangle 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		float heigth,base,triangle;
		heigth = sc.nextFloat();
		base = sc.nextFloat();
		triangle = (1*heigth*base)/2;
		System.out.println(triangle);
	}
}
*/