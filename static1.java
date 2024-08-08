class static1 
{ 
	static int i;
	static float j;
	static short k;
	static long l;
	static char o;
	static boolean m;
	static double n;
	static byte p;

	public static void main(String[] args) 
	{
		System.out.println(i); 
		System.out.println(j);
		System.out.println(k); 
		System.out.println(l);
		System.out.println(o);
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
		System.out.println(i);//direct access
		System.out.println(static1.i);  //classname
	}
}
/* the variables which are declared outside the method,constructor and blocks are called as static but the variable must be in class and it is wiht the prefix.
'.' operator is also called as access operator. To access static variable witin the class area we use '.' or access operator.
How many ways are there to access static members,variables,methods?-There are three ways to access the static member a.directly b.classname c.object
Can we print static variable without initialiaing?  - Yes
What is the value printed? - Default value should printed.
Who will set the default value? - Compiler.
When will the compiler set a default value? During compilation process.
Default values of primitve data types : int- 0
                                        float - 0.0
										short - 0
										long - 0
										char - blank 
										boolean - false
										double - 0 
										byte - 0*/

