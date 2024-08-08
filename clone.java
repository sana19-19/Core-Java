class subclone implements Cloneable
{
	int studId;
	String studname;
	subclone(int studId,String studname)
	{
		this.studId = studId;
		this.studname = studname;
	}
	void studInfo()
	{
		System.out.println(studId +" "+ studname);
	}
	protected Object clone()
	{
		try
		{
			return super.clone();
		}
		catch (CloneNotSupportedException cn)
		{return this;
		}
	}
}
class clone  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		subclone obj1 = new subclone(101,"Sana");
		//obj1.studInfo();
		Object obj2 = obj1.clone();
		System.out.println(obj1);
		System.out.println(obj2);

	}
}
