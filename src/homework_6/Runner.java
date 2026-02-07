package homework_6;

public class Runner {
	public static void main(String[] args) {
		
		double[] prices = {45.6, 19.9, 99.4, 8.2, 150.7, 33.1, 67.8, 12.5, 200.0, 55.3};
		System.out.println("Prices of toys");
		
		double sumprices = 0;
		
		for(double price : prices) {
			
			long roundedPrice = Math.round(price);
			System.out.println("Toy"+ price + "Toys price after");
			
			
			sumprices /= 10;
			sumprices = Math.round(sumprices);
			System.out.println("OKrug cena"+ sumprices);
		
		}
		
		
		
		                                                                                                                              
		
	}

	
	
	
	
 
}
