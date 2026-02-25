package homework_8;

import java.util.Scanner;

public class Homework_8 {
	public static void main(String[] args) {
//		1
		int number = 4;
		
		if (number % 2 == 0) {
			System.out.println("cetnoye");
		} else {System.out.println("necetnoye");}
		
//		2
		int score = 67;
		if (score >= 90) {
			
			System.out.println("otlicno");
		}
		else if (score >= 75) {
			System.out.println("xoroso");
		}
		else if(score >= 60) {
		System.out.println("udovletvoritelno");
		}
		else if (score < 60) {
		System.out.println("ploxo")	;
		}
		else {System.out.println("error");}
//		4
		int price = 2367;
		if(price >= 5000) {
			System.out.println("Discount 15%");
		}
		else if (price >= 2000) {
			System.out.println("Discount 10%");
		}
		else if (price >= 1000) {
			System.out.println("Discount 5%");
		}
		else {System.out.println("Without discount");}
//		6
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		System.out.println(n);
		for(int i = 1;i <= 10;i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}
//		7
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number from 1 to 1000");
		int n1 = s1.nextInt();
		System.out.println(n1);
		int sum3 = 0;
		int kolvo = 0;
	    for(int p = 1; p <= n1 ;p++) {
			if(p % 2 == 0) {
				sum3 += p;
				kolvo++;
				
			}}
			System.out.println("Summa vsex cisel-" + sum3);
			System.out.println("Kolvo cetnix" + kolvo);}
	
//	8
	
		
		
		
			
		
		
		
		
		
	

}
