class nonprinonstatic1 
{
	boolean status = true;
	nonprinonstatic1 refvar;
	public static void main(String[] args) 
	{
		nonprinonstatic1 obj = new nonprinonstatic1();
		obj.refvar= new nonprinonstatic1();
		System.out.println(obj.refvar.status);
	}
}
