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
			System.out.println("�ֻ����� 1�Դϴ�.");
		}else if ( dice == 2 )
		{
			System.out.println("�ֻ����� 2�Դϴ�.");
		}else if ( dice == 3 )
		{
			System.out.println("�ֻ����� 3�Դϴ�.");
		}else if ( dice == 4 )
		{
			System.out.println("�ֻ����� 4�Դϴ�.");
		}else if ( dice == 5 )
		{
			System.out.println("�ֻ����� 5�Դϴ�.");
		}else
		{
			System.out.println("�ֻ����� 6�Դϴ�.");
		}
	}
}