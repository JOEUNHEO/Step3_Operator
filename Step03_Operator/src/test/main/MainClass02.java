package test.main;
/*
 * 	[ ������ ]
 * 	
 * 	2. ���� ������
 * 
 * 	���� : ++, --
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		num++; //1 �� ���� ��Ű��
		num++;
		num++;
		
		int num2 = 0;
		num2--; //1 �� ���� ��Ű��
		num2--;
		num2--;
		
		int num3 = 0;
		// ++ �����ڰ� ���� �ڿ� ������ ������ �켱������
		// = ���� �ʴ�.
		
		int result1 = num3++;
				
		int num4 = 0;
		// -- �����ڰ� ���� �տ� ������ ������ �켱������
		// = ���� ������
		int result2 = ++num4;
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("num3:"+num3);
		System.out.println("num4:"+num4);
	}
}
