class nonstatic1 
{ int a=100;
	public static void main(String[] args) 
	{
		/*System.out.println(a); //direct access
		nonstatic1.java:5: error: non-static variable a cannot be referenced from a static context
                System.out.println(a);
                                   ^ */  
        /*System.out.println(nonstatic1.a);  //classname access
		nonstatic1.java:9: error: non-static variable a cannot be referenced from a static context
        System.out.println(nonstatic1.a);
                                     ^ */
        nonstatic1 obj=new nonstatic1();
		System.out.println(obj.a);
	}
}
