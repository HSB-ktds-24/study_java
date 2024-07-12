package sample_application;

public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 5;
		int sec = 50;
		int time =0 ;
		time = sec + min*60;
		System.out.println(time);
		
		int processT = 145;
		int min2 = 0;
		int sec2 = 0;
		
		min2 = processT/60;
		sec2 = processT%60;
		
		System.out.println(min2+""+sec2);

	}

}
