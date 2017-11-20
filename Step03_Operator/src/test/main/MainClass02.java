package test.main;
/*
 * 	[ 연산자 ]
 * 	
 * 	2. 증감 연산자
 * 
 * 	종류 : ++, --
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		num++; //1 씩 증가 시키기
		num++;
		num++;
		
		int num2 = 0;
		num2--; //1 씩 감소 시키기
		num2--;
		num2--;
		
		int num3 = 0;
		// ++ 연산자가 변수 뒤에 있으면 연산의 우선순위가
		// = 보다 늦다.
		
		int result1 = num3++;
				
		int num4 = 0;
		// -- 연산자가 변수 앞에 있으면 연산의 우선순위가
		// = 보다 빠르다
		int result2 = ++num4;
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("num3:"+num3);
		System.out.println("num4:"+num4);
	}
}
