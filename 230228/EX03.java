public class EX03
{
	public static void main(String[] args)
	{
		/*
		 * ����(���ǽ�){���� ��쿡 ������ ����}
		 * �׷��� �ʴٸ�{���ǽ��� ������ ��쿡 ������ ����}
		if(true) {
		}else {
		}
		 */
		boolean flag = true;
		flag = false;
		if( flag )
		{
			System.out.println("flag�� ���Դϴ�.");
		}else
		{
			System.out.println("flag�� �����Դϴ�.");
		}
		int age = 19;
		if( age >= 10 && age < 20 ) {
			System.out.println("10���Դϴ�.");
		}
		if( age >= 20 && age < 30 ) {
			System.out.println("20���Դϴ�.");
		}
		if( age >= 30 && age < 40 ) {
			System.out.println("30���Դϴ�.");
		}
	}
}