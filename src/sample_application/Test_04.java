package sample_application;
import java.util.*;
public class Test_04 {

	public static void main(String[] args) {
		int money = 1_000_000;
		
		Scanner sc = new Scanner(System.in);
		
		int father = sc.nextInt();
		int mother = sc.nextInt();
		int daugther = sc.nextInt();
		
		int adultOneWayFightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int totalCoast =0;
		
		if(father>19) {
			totalCoast +=adultOneWayFightFare;
		}
		else {totalCoast +=kidOneWayFlightFare;}
		
		if(mother>19) {
			totalCoast +=adultOneWayFightFare;
		}
		else {totalCoast +=kidOneWayFlightFare;}
		
		if(daugther>19) {
			totalCoast +=adultOneWayFightFare;
		}
		else {totalCoast +=kidOneWayFlightFare;}
		
		
		
		if (totalCoast>money) {
			System.out.println("다음에 가자");
		}
		else {
			System.out.println("여행가자");
		}
	}

	
}
