import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter your Number : "+num);
		if(num%2==0) {
			System.out.println("GIven Number is Even");
		}
		else {
			System.out.println("Given Number is Odd1");
		}
	}
}
