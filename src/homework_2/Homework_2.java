package homework_2;

public class Homework_2 {
    public static void main(String[] args) {

        
        Students myStudent = new Students("iba cotko", 67, 1.8);
        myStudent.printInfo();


        int result = myStudent.sum(5, 6);
        System.out.println(result);


        int a = 10;
        System.out.println("Before calling changeValue, a = " + a);
        myStudent.changeValue(a);                    

        int p = 5; 

       
    }}


   