package sample_application;
import java.util.*;

public class Mart {

	public static void main(String[] args) {
		int money = 2000;
		
		Random r = new Random();
		int price = r.nextInt(500)*10;
		
		
		System.out.println("지갑: "+money +"\n가격: "+price);
		System.out.println(money>=price?"구매가능":"구매불가능");
	}

}
