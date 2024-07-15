package sample_application;

import java.util.Scanner;

public class Test_06 {

	public static void main(String[] args) {
		int money = 1_000_000;
		
		Scanner sc = new Scanner(System.in);
		
		int father = sc.nextInt();
		int mother = sc.nextInt();
		int daugther = sc.nextInt();
		
		int adultOneWayFightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int a=0 ;
		int b=0;
		
		a = father>19?a+1:a;
		a = mother>19?a+1:a;
		a = daugther>19?a+1:a;
		
		b= 3-a;
		
		int total= a*adultOneWayFightFare + b*kidOneWayFlightFare ;

	}

}
