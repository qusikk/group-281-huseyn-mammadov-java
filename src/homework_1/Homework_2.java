package homework_1;
public class Homework_2 {
	public static void main(String[] args) {
		
		
		
		int ball = 4;
		if (ball == 5)
		{System.out.println("xoroso");}
		else if (ball == 4)
		{System.out.println("norm");}
		else if (ball == 3)
		{System.out.println("udovletvoritelno");}
		else if (ball == 2)
		{System.out.println("neudovletvoritelno");}
		else {System.out.println("error");}
		
		
		int a = 5;
		int b = 10;
		int c = 20;
		
		if(a % 2 == 0 && b % 2 == 0 && c % 2 == 0)
		{System.out.println("cetnoe");}
		else {System.out.println("necetnooe");}
			
		int g = 2;
				
		switch(g) {
			case 1 -> System.out.println("yanvar");
			case 2 -> System.out.println("fevral");
			case 3 -> System.out.println("mart");
		}
		
		
		int age = 24;

        if (age < 0) {
            System.out.println("Ошибка");
        } else if (age <= 12) {
            System.out.println("Ребёнок");
        } else if (age <= 17) {
            System.out.println("Подросток");
        } else if (age <= 59) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пожилой");
        }
        


        int alphabet = 'a';

        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                System.out.println("glasniy");
                break;
            default:
                System.out.println("soglasniy");}
        
        int f= 5;
        int r = 5;
        int t = 8;

        if (f <= 0 || r <= 0 || t <= 0) {
            System.out.println("Ne treugolnik");
        } else if (f + r <= t || f + r <= t || r + t <= f) {
            System.out.println("Ne treugolnik");
        } else if (f == r && r == t) {
            System.out.println("Ravnostoronniy");
        } else if (f == r || f == t || r == t) {
            System.out.println("Ravnobedrenniy");
        } else {
            System.out.println("Raznostoronniy");
        }
        
        
        int year = 2000;

        if (year <= 0) {
            System.out.println("Oshibka");
        } else if (year % 400 == 0) {
            System.out.println("Visokosnyy");
        } else if (year % 100 == 0) {
            System.out.println("Obychnyj");
        } else if (year % 4 == 0) {
            System.out.println("Visokosnyy");
        } else {
            System.out.println("Obychnyj");
        }
		
//		b % 2 == 0
		
		
	}
	}
		