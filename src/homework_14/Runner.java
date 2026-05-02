package homework_14;

public class Runner {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE + 1);
		
		
		int a = 1/0; // tut drugoy standart poetomu osibka
		double b = 1.0/0.0;
		System.out.println(b);
		
		
		int a2 = 100000, b1 = 100000;
		System.out.println((long)a2 * b1);
		System.out.println(a2 * b1);
		
		int a3 = 5;
		int b3 = a;
		b++;
		System.out.println(a3);
		System.out.println(b3);
		
		
		System.out.println("a" + "b" == "ab");
		System.out.println("ab".equals("ab"));
	}

}
