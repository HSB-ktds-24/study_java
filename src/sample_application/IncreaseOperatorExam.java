package sample_application;

public class IncreaseOperatorExam {

	public static void main(String[] args) {
		// +1 실습
		// 일반 연산자
		int a = 0;
		a = a-1;
		System.out.println(a);
		
		//짧은 연산자
		a = 0;
		a -= 1;
		System.out.println(a);
		//단항 연산자
		a = 0;
		a--;
		System.out.print(a--);
		System.out.print(a--);
		System.out.print(a--);
		System.out.println(a);
		
		int b =0;
		--b;
		System.out.println(b);
		System.out.print(--b);
		System.out.print(--b);
		System.out.print(--b);
		System.out.println(b);
	}

}
