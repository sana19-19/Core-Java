import java.util.StringTokenizer;
class String1
{
	public static void main(String[] args)
	{
		StringTokenizer s = new StringTokenizer("Yache ji aap bohat intelligent ho!" , " ");
		while(s.hasMoreElements())
		{
			System.out.println(s.nextElement());
		}
	}
}
/*class String1
{
	public static void main(String[] args)
	{
		String str = " Sana ";
		String str1 = "Yache Shubham is my super senior";
		String[] str2 = str1.split(" ");
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.contains("an"));
		System.out.println(str.indexOf("n"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.isEmpty()); 
		System.out.println(str.substring(2));
		System.out.println(str.substring(1,4));
		System.out.println(str.trim());
		for (int i=0;i<str2.length;i++)
		{
			System.out.println(str2[i]);
		}
		System.out.println(str2);
	}
}*/

/*
class String1
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		StringBuffer s = new StringBuffer("Sana");
		StringBuffer s1 = new StringBuffer("Sana");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
	}
}*/

/*class String1
{
	public static void main(String[]args)
	{
		String s1 = "Sana";
		String s2 = "Sana";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
	}
}*/

/*class String1
{
	public static void main(String[] args)
	{
		String s = "Sana";
	    System.out.println(s);
		StringBuffer b = new StringBuffer(s);
		System.out.println(b);
		b.append("Sana");
		System.out.println(b);
	}
}*/


/*class String1
{
	public static void main(String[] args)
	{
		String1 r1 = new String1();
		String1 r2 = new String1();
		String1 r3 = r2;
		System.out.println(r1.equals(r2));
		System.out.println(r2.equals(r3));
		StringBuffer s1 = new StringBuffer("Sana");
		StringBuffer s2 = new StringBuffer("San");
		StringBuffer s3 = s2;
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}
}*/

/*class Strign1
{
	public static void main(String[] args)
	{
		String str1 = new String("Sana");
		String str2 = new String("SANA");
		String str3 = new String("Sana");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));
		StringBuffer s1 = new StringBuffer("Cat");
		StringBuffer s2 = new StringBuffer("Bat");
		StringBuffer s3 = new StringBuffer("Cat");
        System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
	}
}*/
/*class String1
{
	public static void main(String[] args)
	{
		String s = "Sana";
		System.out.println(s);
		s = s.concat("Sana");
		System.out.println(s);
		StringBuffer b = new StringBuffer("Sana");
		System.out.println(b);
		b.append("Sana");
		System.out.println(b);
	}
}*/

/*toString method if called from the object class will always be responsible to print the address ,
however if the same toString method called from the string class,buffer class or any other child 
class then it will not responsible to print the address but it will print the some other value.
class String1
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Sana");
		System.out.println(s);
		System.out.println(s.toString());
	}
}
/*A class which does not allow it's object data will be change such a behaviour by nature is called as immutable.
String classes by nature are also called as immutable.
StringBuffer is also predefined class which is present in java.lang.package
We cannot create StringBuffer object directly without new keyword.
We can create StringBuffer object only with new keyword.
class String1
{
	public static void main(String[] args)
	{
		String str = "Sana";
		System.out.println(str);
		str = str.concat("Sana");
		System.out.println(str);
		StringBuilder b = new StringBuilder("Sana");
		System.out.println(b);
		System.out.println(b.toString());
		//StringBuilder c = "SANA"; -----> Error
	}
}*/

/*class String1 extends Object
{
	String str;
	String1(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return str;
	}
}
class exam
{
	public static void main(String[] args)
	{
		exam ref1 = new exam();
		System.out.println(ref1);//Implicit call to toString
		String s1 = new String("Sana");
		System.out.println(s1);//Explicit call to toString
		String s2 = new String("Shubham");
		System.out.println(s2.toString());
	}
}*/

/*class object
{
	String toString()
	{
		return "address";
	}
}
`public java.lang.Strign.toString();
*/

/*class String1//extends object class
{
	public String toString()
	{
		return "Hello Sana";
	}
	public static void main(String[] args)
	{
		String1 ref = new String1();
		System.out.println(ref);//Implicit call to toString()
		System.out.println(ref.toString());//Explicit call to toString()
	}
}*/

/*class String1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Shubh!");
		String str1 = "Sana";
		String str2 = "Shubham";
		String str3 = "Sana";
		System.out.println(str1==str2);//false
        System.out.println(str2==str3);//false
		System.out.println(str3==str1);//true
        String s1 = new String("Sana");
		String s2 = new String("Shubham");
	    String s3 = new String("Sana");
        System.out.println(s1==s2);//false
		System.out.println(s2==s3);//false
		System.out.println(s3==s1);//false
		String s11 = "Sana";
		String s22 = "Sana";
		System.out.println(s11==s22); //true                              
	}
}*/

/*class String1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Shubh!");
		String str1 = "Sana";
		String str2 = "Shubham";
		String str3 = "Sana";
		System.out.println(str1);
        System.out.println(str2);
		System.out.println(str3);
		String s1 = new String("Sana");
		String s2 = new String("Shubham");
	    String s3 = new String("Sana");
        System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}*/
