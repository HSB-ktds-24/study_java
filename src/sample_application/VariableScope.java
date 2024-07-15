package sample_application;

public class VariableScope {

	public static void main(String[] args) {
	
		int num = 10;
		int other = 5;
		int k;
		
		if(num>other){
			 k = num;
		}
		else {
			 k =other;
		}
		
		System.out.println(num+"와"+other+"중 큰 숫자는"+k+"입니다");
	}

}
