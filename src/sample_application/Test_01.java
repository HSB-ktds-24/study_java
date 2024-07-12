package sample_application;
import java.util.*;
/**
 * <pre>
 *다큐먼트 주석
 * <pre>
 */
public class Test_01 {

	/**
	 * 형변환 예제 실습
	 * 
	 */
	
	public static void main(String[] args) {
		int a = 100;
		int b = 87;
		int c = 92;
		int d = 96;
		
		double div = ((double)a +b +c +d)/4;
		
		System.out.println(div);
		
		int k = 9725;
		System.out.println((double)k/100);
		
		double i = 93.167;
		
	
		double i2 = i * 100;
		
		i2 = Math.round(i2);
	
		double i3 = i2 / 100;
		System.out.println(i3);
		
		// 주석 : 한줄만
		/* 여러줄
		 * 
		 */
	


	}
	public static double round(double value, int point) {
		double result = value*Math.pow(10, point);
		result = Math.round(result);
		result =Math.pow(10, point);
		return result;
	}
}
