package classwork_6;

public class Dog {
	String name;
	String breed;
	int age;
	
	Dog(String name,String breed,int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public void bark () {
		System.out.println(name + "Gav");
	}
	public void introduce () {
		System.out.println(name + breed + age);
	}
			

}
