package homework_2;

public class Students {

    String name;
    int age;
    double averageGrade;

    public Students(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public void printInfo() {
        System.out.println("Name " + name + ", age " + age + ", average grade " + averageGrade);
    }

   
    public int sum(int a, int b) {
        return a + b;
    }}