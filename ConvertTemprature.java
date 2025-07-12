import java.util.Scanner;

public class ConvertTemprature {
	public static void main() {
        System.out.println("Enter Temprature in Farnehite");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        
        double tempIndegree = (temp-32)*5/9;
        
        System.out.println("Temparature in Degree" + tempIndegree);
	}
}
