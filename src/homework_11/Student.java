package homework_11;

public class Student {
    private String name;
    private int grade;
    private static int totalStudents = 0;
    
    public Student(String name, int grade) {
        this.grade = grade;
        this.name = name;
        totalStudents++;
    }
    
    public String getStatus() {
        if(grade >= 90) {
			return "Super";
		}
        else if(grade >= 70) {
        	return "Norm";
        }
        else if(grade >= 50) {
        	return "Udovletvoritelno";
        }
        else {
        	return "Lox";
        }
		
        		
			
    }
    
    public static int getTotalStudents()
    { return totalStudents; }
    
    @Override
    public String toString() {
    	return "Student{name='" + name + "', grade=" + grade + ", status='" + getStatus() + "'}";
}}