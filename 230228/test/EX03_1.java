package test;
	/*
		 * ����(���ǽ�){���� ��쿡 ������ ����}
		 * �׷��� �ʴٸ�{���ǽ��� ������ ��쿡 ������ ����}
		if(true) {
		}else {
		}
		 */
public class EX03_1 {
	
	public static void main(String[] args) 
	{
		boolean flag = true;
		flag = true;
		if(flag)
		{
			System.out.println("flag�� ���Դϴ�.");
		}else
		{
			System.out.println("flag�� �����Դϴ�.");
		}
		
		int age = 18;
		if( age >= 10 && age < 20)
		{
			System.out.println("10���Դϴ�.");
		}if ( age >= 20 && age < 30 )
		{
			System.out.println("20���Դϴ�.");
		}if ( age >= 30 && age < 40 )
		{
			System.out.println("30���Դϴ�.");
		}
	}
}