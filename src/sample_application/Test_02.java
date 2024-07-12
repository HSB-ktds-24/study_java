package sample_application;

public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 5;
		int sec = 50;
		int time =0 ;
		final int F = 60;
		time = sec + min*F;
		
		System.out.println(time);
		
		int processT = 145;
		int min2 = 0;
		int sec2 = 0;
		
		min2 = processT/F;
		sec2 = processT%F;
		
		System.out.println(min2+""+sec2);
		
		int cel = 30;
		int fah = 0;
		fah =cel*9/5 +32;
		System.out.println(fah);

	}

}
