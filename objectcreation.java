class objectcreation 
{   int a=7;
	public static void main(String[] args) 
	{
		//named object creation
		objectcreation obj = new objectcreation();
		System.out.println(obj.a);

		//nameless object creation
		System.out.println(new objectcreation().a);
	}
}
