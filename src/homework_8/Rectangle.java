package homework_8;

public class Rectangle {
	double width;
	double height;
	
	Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}
	double getArea() {
		return height * width;
	}
	
	double getPerimeter() {
		return height + width;
	}
	
	void printInfo() {
		System.out.println("sirina" + "=" + width);
		System.out.println("visota" + "=" + height);
		System.out.println("perimeter" + "=" + getPerimeter());
		System.out.println("plosad" + "=" + getArea());
		
	}
	

}

