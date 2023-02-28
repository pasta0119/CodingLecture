public class EX04
{
	public static void main(String[] args)
	{
		// 주어진 숫자가 , 홀수인지 짝수인지 출력하는 내용
		int x = 14;
		// 짝수인지 홀수인지 판별하기 위해서는,
		// 숫자를 2로 나누어서 나머지가 0이면 짝수
		// 나머지가 1이면 홀수
		// (x % 2)이 0이면 짝수
		// = (대입연산)
		// 비교연산 ==
		// (x % 2) == 0 
		if((x % 2) == 0)
		{
			// 조건식 결과가 짝수이면 화면에 짝수라고 표시
			System.out.println("짝수입니다");
		}else
		{
			System.out.println("홀수입니다");
		}
	}
}