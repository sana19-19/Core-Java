class nonstaticmethod2 
{
	public static void main(String[] args) 
	{   int a = 7;
	    nonstaticmethod2 obj = new nonstaticmethod2();
		int result = obj.test(a);
		System.out.println(result);
	}
	int test(int aa)
	{
		System.out.println("Inside Test");
		int result = aa+200;
		return result;
	}
}
