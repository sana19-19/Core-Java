/*Assignment3 ---> Static block--->Static and non static method access. Non static block--->Static and non static method access.
class Assignments
{
	static 
	{
		Assignments obj = new Assignments();
		obj.m1();
		m2();
	}
	{
		//Assignments obj2 = new Assignments();
		Assignments.m2();
		m1();
	} 
	public static void main(String[] args)
	{
		System.out.println("Hello Sana");
		//Assignments obj1 = new Assignments();
        //Assignments obj = new Assignments();
	}
    void m1()
	{
		System.out.println("Inside m1 method");
	}
	static void m2()
	{
		System.out.println("Inside m2 method");
	}
}
*/

/*Assignment2 ---> static block--->object creation. non static block---> object creation.
class Assignment1
{
	static
	{
		System.out.println("Inside static block");
		Assignment1 obj = new Assignment1();
	}
	void m1()
	{
		System.out.println("Inside non static block");
		Assignment1 obj1 = new Assignmnet1();
	}
	public static void main(String[] args)
	{
		
	}
}*/

/* Assignment1 ---> Static member in non static area, Non static member in static area.
class Assignment1 
{   int a= 7;
    static int b = 8;
	static
	{
		System.out.println("Inside static block");
		Assignment1 obj = new Assignment1();
		System.out.println(obj.a);
	}
	{
		System.out.println("Inside non static block"+ b);
	}
	public static void main(String[] args)
	{
		
	}
}*/
