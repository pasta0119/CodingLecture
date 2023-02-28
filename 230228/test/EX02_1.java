package test;
public class EX02_1 {

	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
		
		x = x + 1;
		x += 1;
		x++;
		++x;
		
		y = (x++);
		y = (++x);
		y = (x++) + (++x);
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		String str = "";
		str = "Hello, ";
		str = str + "JAVA";
		str += "!!!";
		
		System.out.println(str);
	}
}