public class EX06
{
	public static void main(String[] args)
	{
		int score = 62; //������ �Է��ؼ� �ʱ�ȭ
		// 90���� ������ A����
		// 80�� �̻� 90�� �̸��� B����
		// 70�� �̻� 80�� �̸��� C����
		// 70�� �̸��� �����
		// ȭ�鿡 ����ϴ� �ڵ带 �ۼ��ϼ���
		// �񱳿����� >= < AND : && / OR : ||
		if( score >= 90 )
		{
			System.out.println("A�����Դϴ�.");
		}else if( score >= 80 && score < 90 )
		{
			System.out.println("B�����Դϴ�.");
		}else if( score >= 70 && score < 80 )
		{
			System.out.println("C�����Դϴ�.");
		}else
		{
			System .out.println("������ϼ���.");
		}
	}
}