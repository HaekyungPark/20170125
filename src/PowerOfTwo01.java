import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int result = 1;
		System.out.println("승수: ");
		
		int pow = sc.nextInt();
		
			result = (int) Math.pow(2, pow);
			System.out.println("2의 " + pow + "제곱근은 "+ result + "입니다.");
			
		
	}

}
