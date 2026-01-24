package homework_2;

public class Homework_2 {
    public static void main(String[] args) {

        
        Students myStudent = new Students("iba cotko", 67, 1.8);
        myStudent.printInfo();


        int result = myStudent.sum(5, 6);
        System.out.println(result);
    }}