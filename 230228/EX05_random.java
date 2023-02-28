public class EX05_random
{
	public static void main(String[] args)
	{
		// 소수점의 랜덤한 숫자값을 생성한다. 
		double rnd = Math.random() * 100;
		System.out.println(rnd);

		// 정수형으로 변환한다.
		int dice = (int)rnd;
		System.out.println(dice);
		
		// 6으로 나눈 나머지를 구하고, 1을 더한다. ( 1 ~ 6 값이 얻어짐)
		dice = (dice % 6) + 1;
		System.out.println(dice);

		// 1 ~ 6 사이의 정수만 계산됨
//		dice = (((int)(Math.random() * 100)) % 6) + 1;
//		System.out.println(dice);
		/*
		 * if(조건식){
		 * }else if(조건식){
		 * }else if(조건식){
		 * }else{
		 * }
		 * 
		 * dice == 1 / "주사위가 1입니다"
		 * dice == 2 / "주사위가 2입니다"
		 */
		if( dice == 1 )
		{
			System.out.println("주사위가 1입니다.");
		}else if( dice == 2)
		{
			System.out.println("주사위가 2입니다.");
		}else if( dice == 3)
		{
			System.out.println("주사위가 3입니다.");
		}else if( dice == 4)
		{
			System.out.println("주사위가 4입니다.");
		}else if( dice == 5)
		{
			System.out.println("주사위가 5입니다.");
		}else
		{
			System.out.println("주사위가 6입니다.");
		}
	}
}