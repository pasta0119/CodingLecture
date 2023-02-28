public class EX02
{
	public static void main(String[] args)
	{
		int x;
		x = 0;
		int y = 0;
		// 1
		x = x + 1;
		// 2
		x += 1;
		// 3
		x++;
		// 4
		++x;
		// x:4 -> y = 4 / x++ x =5
		y = (x++);
		
		// x:5 -> x:6 / y = 6
		y = (++x);
		
		// ++x -> x : 7 /  y = 7 + 7 / x++ x: 8
		
		y = (++x) + (x++);
		// y = 14 / x = 8
		System.out.println( "x : " + x );
		System.out.println( "y : " + y );
		String str = "";
		str = "hello, ";
		str = str + "JAVA";
		str += "!!!";
		System.out.println(str);
	}
}