package sample_application;

public class ShortCutOperatorExam {

	public static void main(String[] args) {
		//일반 산술 연산자 실습
		int num1 = 10;
		num1 = num1 + 2;
		System.out.println(num1);
		
		int num3 =30;
		num3 = num3+6;
		//num3+=6
		int num4 = 40;
		num4 = num4-10;
		//num4-=10
		int num6=60;
		num6 = num6/14;
		//num6/=14
		int num7 = 70;
		num7 = num7%16;
		//num7%=16
		System.out.println(num3 +" "+num4+" "+num6+" "+num7);
		
		//짧은 표현식 실습
		//-귀찮아서 생겨남
		
		int num2 = 20;
		num2 += 4;
		
		System.out.println(num2);
		
	}

}
