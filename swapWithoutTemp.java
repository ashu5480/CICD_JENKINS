public class swapWithoutTemp {

	public static void main(String[] arhs) {
		int a = 12;
		int b = 10;
		
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 
		System.out.println("after swap "+a+", "+b);
	}
}
