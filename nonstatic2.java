class nonstatic2 
{  int a= 10;
   float b= 7.7f;
	public static void main(String[] args) 
	{
	  nonstatic2 obj1 = new nonstatic2();
	  System.out.println(obj1.a);
	  System.out.println(obj1.b);
	  nonstatic2 obj2 = new nonstatic2();
	  System.out.println(obj2.a);
	  System.out.println(obj2.b);
	}
}
