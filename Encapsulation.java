class PvrMovies
{
	private static PvrMovies mTicket;
	private static boolean ticketStatus=false;
	private PvrMovies()
	{
		System.out.println("Welcome to PVR Movies");
	}
	public static PvrMovies bookTickets()
	{
		System.out.println("Tickets Booking in Progress");
		if (ticketStatus ==false)
		{mTicket=new PvrMovies();
		 ticketStatus=true;
		}
		return mTicket;
	}
}
class BookMyshow
{ public static void main(String[] args)
	{
		System.out.println("Welcome ");
		PvrMovies CT1 = PvrMovies.bookTickets();
		System.out.println(CT1);
        PvrMovies CT2 = PvrMovies.bookTickets();
		System.out.println(CT2);
	}
}
/*
class emp
{
	private int empId;
	private String empName;
	emp(int empId,String empName)
	{
		this.empId=empId;
		this.empName= empName;
		System.out.println("Inside 2 arg const");
	}
	// public get service -->getter methods
	public int getEmpId() 
	{
		return empId; // copy of original value ---> int
	}
	// public get service -->getter methods
	public String getEmpName()
	{
		return empName; // copy of original value --->string
	}
}
class Encapsulation 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		emp e = new emp(101,"Shubham");
        int eid=e.getEmpId();
		String ename = e.getEmpName();
		System.out.println("Emp Id "+eid+" Emp Name "+ename);
		emp e1 = new emp(102,"Sana");
		eid = e1.getEmpId();
		ename=e1.getEmpName();
        System.out.println("Emp Id "+eid+" Emp Name "+ename);
		 
	}
}*/
