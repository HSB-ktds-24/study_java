package sample_application;
import java.util.*;

public class Test_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int meth = sc.nextInt();
		int prog = sc.nextInt();
	
		int sum = (kor+eng+meth+prog);
		int average = sum/4;
		String result = null;
		
		if(average >=95) {result = "A+";}
		else if (average >=90) {result = "A";}
		else if (average>=85) {result = "B+";}
		else if (average>=80) {result = "B";}
		else if (average>=70) {result = "C";}
		else {result = "F";}
		System.out.print(result);
	}

}
