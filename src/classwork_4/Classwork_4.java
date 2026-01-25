package classwork_4;
import java.util.Arrays;

public class Classwork_4 {
	public static void main(String[] args) {
		
		
		 int[] numbers = {7, 13, 21, 42, 100};
	    System.out.println(Arrays.toString(numbers));
	    
	    
	    
	    int[] numbers1 = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] % 2 == 0) { 
                System.out.print(numbers1[i] + " ");}}
	    
        
     
        int[] numbers3 = {5, 10, 3, 8, 2, 7, 4};
        int sum = 0;

        for (int n : numbers3) {
            sum += n;
        }

        System.out.println("summa " + sum);
        
        
        
        for (int i = 1; i <= 20; i++) {
        	System.out.println(i + " ");
        }
        
        for (int i = 10; i >= 0; i--) {
        	System.out.println(i + " ");
        }
        
        for (int i = 2; i <= 30; i += 2) {
        	System.out.println(i);
        }
        
        for (int i = 1;i <= 10; i++) {
        	System.out.println("6" + "*" + i + "=" + i*6);
        }
        
        
        int numm = 1;
        
        while (numm <= 15) {
        	System.out.println(numm);
        	numm++;
        }
        
        
        int i = 5;

        do {
            System.out.println( i);
            i++; } while (i <= 25);
	
	
	
	  int sum2 = 0;
	  for (int u = 1;u <= 20;u++) {
		  
		 sum2 += u;
	  }
	  
	  System.out.println(sum2);
	  
	  
	  
	int sum3 = 0;
                
   
   for (int t = 2; t <= 30;t+=1) {
	  if (t % 2 != 0)
		  sum3 += t; {
		 
		  System.out.println(sum3);
	  }

   }

   if (sum3 > 200) {
       System.out.println("summa bolshe 200");
   } else {
       System.out.println("summa menshe 200");
   };

   
        
        
        
        
        
        

	}}
	
	
	

