		//점수를 입력해서 초기화
		// 90점이 넘으면 A학점
		// 80점 이상 90점 미만은 B학점
		// 70점 이상 80점 미만은 C학점
		// 70점 미만은 재수강
		// 화면에 출력하는 코드를 작성하세요
		// 비교연산자 >= < AND : && / OR : ||
package test;

public class EX06_1 {

	public static void main(String[] args)
	{
		int score = 85;
		if( score >= 90)
		{
			System.out.println("A학점");
		}else if ( score >= 80 && score < 90 )
		{
			System.out.println("B학점");
		}else if ( score >= 70 && score < 80 )
		{
			System.out.println("C학점");
		}else
		{
			System.out.println("재수강");
		}
	}
}