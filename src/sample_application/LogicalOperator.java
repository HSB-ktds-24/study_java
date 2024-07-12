package sample_application;
import java.util.*;

public class LogicalOperator {

	public static void main(String[] args) {
		
		// 키보드에서 숫자를 입력받아 변수에 할당하기
		System.out.println("100보다 작고 0보다 큰 수를 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println("방금 입력한 숫자는"+a+"입니다");
		
		boolean flagZ = a>0;
		System.out.println("0보다 큰가요?"+a);
		boolean flagH = a<100;
		System.out.println("100보다 작은가요?"+a);
		boolean flag = flagZ && flagH;
		System.out.println("0보다 크고 100보다 작은가요?"+flag);
		
		System.out.println(100>a&&a>0?"성공":"실패");
	}

}
