package sample_application;

import java.util.Scanner;

public class Test_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x>=y?x+"는"+y +"보다 크거나 같습니다":
			x+"는"+y+"보다 작습니다");

	}

}
