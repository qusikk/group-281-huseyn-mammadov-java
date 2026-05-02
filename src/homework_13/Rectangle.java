package homework_13;

public class Rectangle {
	double width;
	double height;
	
	public Rectangle(double width,double height ) {
		this.width = width;
		this.height = height;
		
	}
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return 2 * (width + height);
	}
	public void describe() {
		System.out.println("Sirina" + width + "Visota" + height);
		System.out.println("PLosad" + "=" + area());
		System.out.println("Perimeter" + "=" + perimeter());
	}

}
