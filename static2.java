class static2 
{ static float a=100.5f;
  static float b=200.5f;
  public static void main(String[]args)
	{ float result;
      result=a+b;  //direct access
      result=static2.a+static2.b;   //className access
      System.out.println(result);
      System.out.println(result);
	}
}
/* Can we print a static variable without initializng?
-->Yes, we can print the var without initializing.
   what value is printed?
-->Default value will be printed.
   Who will set the default value?
-->The compiler will set the default value.
   When will the compiler will set the default value?
-->During compilatiion time.
    
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(a);  //Direct Access
		System.out.println(static2.a);  //ClassName Access
	}

	 static int a;
	public static void main(String[] args) 
	{
		int b=200;
		static2.a=b;
		System.out.println(static2.a);
	}
	
	static float a=100.5f;
     static float b=200.5f;
     public static void main(String[]args)
	{ float result;
      result=a+b;  //direct access
      result=static2.a+static2.b;   //className access
      System.out.println(result);
      System.out.println(result);
	}
	*/