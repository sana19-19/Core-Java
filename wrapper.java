class  wrapper
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Integer i = new Integer(100);
		System.out.println(i);
		//Integer a = new Integer("sana");-------->NumberFormatException
		Integer a = new Integer("100");
		System.out.println(a);
		byte b = 7;
		Byte b1 = new Byte(b);
		System.out.println(b1);
		Byte b2 = new Byte("77");
		System.out.println(b2);
		short s = 2;
		Short s1 = new Short(s);
		System.out.println(s1);
		Short s2 = new Short("2");
		System.out.println(s2);
		Long l1 = new Long(100l);
		System.out.println(l1);
		Long l2 = new Long("200");
		System.out.println(l2);
		Float f1 = new Float(7.7f);
		System.out.println(f1);
		Float f2 = new Float("7.7");
		System.out.println(f2);
		Float f3 = new Float(7.7d);
		System.out.println(f3);
		Double d1 = new Double(7.7d);
		System.out.println(d1);
		Double d2 = new Double("7.7");
		System.out.println(d2);
		Character c = new Character('s');
		System.out.println(c);
		Boolean b11 = new Boolean(true);
		System.out.println(b11);
		Boolean b12 = new Boolean("true");
		System.out.println(b12);
	}
}
