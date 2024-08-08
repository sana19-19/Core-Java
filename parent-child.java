class parent
{
	static void homekeys()
	{
		System.out.println("Homekeys-parent");
	}
}
class child extends parent
{
	static void homekeys()
	{
		System.out.println("Homekeys-child");
	}
}
class parentchild
{
	public static void main(String[] args)
	{
		parent p = new child();
		p.homekeys();
	}
}
/*class parent
{
	void homekeys()
	{
		System.out.println("Homekeys-parent");
	}
}
class child extends parent
{
	void homekeys()
	{
		System.out.println("Homekeys-child");
	}
}
class parentchild
{
	public static void main(String[] args)
	{
		System.out.println("Sana");
		parent p =new child();
		p.homekeys();
	}
}*/

/*class parent
{
	void carkeys()
	{
		System.out.println("Carkeys");
	}
}
class child extends parent 
{
	void bikekeys()
	{
		System.out.println("Bikekeys");
	}
}
class parentchild
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		parent p = new child();
		p.carkeys();
	}
}*/
