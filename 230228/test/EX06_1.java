		//������ �Է��ؼ� �ʱ�ȭ
		// 90���� ������ A����
		// 80�� �̻� 90�� �̸��� B����
		// 70�� �̻� 80�� �̸��� C����
		// 70�� �̸��� �����
		// ȭ�鿡 ����ϴ� �ڵ带 �ۼ��ϼ���
		// �񱳿����� >= < AND : && / OR : ||
package test;

public class EX06_1 {

	public static void main(String[] args)
	{
		int score = 85;
		if( score >= 90)
		{
			System.out.println("A����");
		}else if ( score >= 80 && score < 90 )
		{
			System.out.println("B����");
		}else if ( score >= 70 && score < 80 )
		{
			System.out.println("C����");
		}else
		{
			System.out.println("�����");
		}
	}
}