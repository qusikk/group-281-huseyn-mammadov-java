package classwork_6;

public class Rectangle {
	double width;
	double height;
	
	public double area(){
	return height * width;
	}
	public double perimeter() {
		return 2 * (width + height);
	}
	public boolean isSquare () {
		if (width == height) {
			return true;
		}
		else{return false;}
	}
	

}
