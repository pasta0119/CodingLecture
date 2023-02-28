public class EX03
{
	public static void main(String[] args)
	{
		/*
		 * 만약(조건식){참일 경우에 실행할 내용}
		 * 그렇지 않다면{조건식이 거짓일 경우에 실행할 내용}
		if(true) {
		}else {
		}
		 */
		boolean flag = true;
		flag = false;
		if( flag )
		{
			System.out.println("flag가 참입니다.");
		}else
		{
			System.out.println("flag가 거짓입니다.");
		}
		int age = 19;
		if( age >= 10 && age < 20 ) {
			System.out.println("10대입니다.");
		}
		if( age >= 20 && age < 30 ) {
			System.out.println("20대입니다.");
		}
		if( age >= 30 && age < 40 ) {
			System.out.println("30대입니다.");
		}
	}
}