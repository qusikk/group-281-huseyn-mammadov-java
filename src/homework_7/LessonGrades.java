package homework_7;

public class LessonGrades {

    public static int randomGrade() {
        return (int)(Math.random() * 4) + 2;
    }

    public static void main(String[] args) {

        int totalGrades = 0;
        int numbersOfFives = 0;

        for (int lesson = 1; lesson <= 20; lesson++) {

            int grade = randomGrade();

            System.out.println("Lesson " + lesson + "osenka" + grade);

            totalGrades += grade;

            if (grade == 5) {
                numbersOfFives++;
            }
        }

        double average = totalGrades / 20.0;

        System.out.println("Average: " + Math.round(average));
        System.out.println("Number of fives: " + numbersOfFives);
    }
}


