package classwork_1;
public class Classwork_2 {
	public static void main(String[] args) {
		
		int temp = 20;
		if (temp >= 15)
		{System.out.println("ura ulica");}
		
		else {System.out.println("xolodno");}
		
		
		int candy = 3;
		if (candy >= 5)
		{System.out.println("I have a lot of candy");}
		else if (candy < 5)
		{System.out.println("eee malo xavay");}
		else {System.out.println("vse sojral fuuu jirday");}
		
		
		
		int level = 3;
		if (level >= 20)
		{System.out.println("proska pro master");}
		else if (level >= 10)
		{System.out.println("sigma leeee");}
		else if (level >= 5)
		{System.out.println ("fu");}
		else {System.out.println("lox");}
		
		String animal = "собака";

        switch (animal) {
            case "собака":
                System.out.println("Гав-гав!");
                break;
            case "кошка":
                System.out.println("Мяу!");
                break;
            case "корова":
                System.out.println("Муу!");
                break;
            case "овца":
                System.out.println("Бее!");
                break;
            default:
                System.out.println("Не знаю такого loxa");
        }
        
    	String fruit = "yabloko";

        switch (fruit) {
            case "yabloko":
                System.out.println("iba cotko");
                break;
            case "grusa":
                System.out.println("vase ne cotko");
                break;
            case "banan":
                System.out.println("cotkooo");
                break;
            case "klubnika":
                System.out.println("IMBAAA");
                break;
            default:
                System.out.println("fu fu fu fu fu fu fu");
        }
        
        int time = 14;
        
        if (time >=6  && time <= 11) {
        	System.out.println ("Dobroye utro");
        } else if (time >= 12 && time <=17) {
        	System.out.println("dobriy den");
        	
        } else if (time >= 18 && time <= 22) {
        	System.out.println("dobriy vecer");
        	
        } else {
        	System.out.println("dobroy noci");
        	
        }

        
		
		
}
}