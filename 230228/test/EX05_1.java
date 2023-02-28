package test;

public class EX05_1 {

	public static void main(String[] args)
	{
		int number = (int)(Math.random() * 100);
		System.out.println(number);
		
		int dice = ((int)(number % 6) + 1);
		System.out.println(dice);
		
		if( dice == 1 )
		{
			System.out.println("주사위가 1입니다.");
		}else if ( dice == 2 )
		{
			System.out.println("주사위가 2입니다.");
		}else if ( dice == 3 )
		{
			System.out.println("주사위가 3입니다.");
		}else if ( dice == 4 )
		{
			System.out.println("주사위가 4입니다.");
		}else if ( dice == 5 )
		{
			System.out.println("주사위가 5입니다.");
		}else
		{
			System.out.println("주사위가 6입니다.");
		}
	}
}