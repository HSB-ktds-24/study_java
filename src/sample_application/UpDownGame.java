package sample_application;
import java.util.*;

public class UpDownGame {

	public static void main(String[] args) {		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = r.nextInt(50);
		String message = null;
	
		
		while(true) {
			int k = sc.nextInt();
			if(k>n) {message="down";}
			else if(k<n) {message = "up";}
			else {message = "You win"; break;}
			
		}
		
		System.out.print(message);
		sc.close();
	}

}
