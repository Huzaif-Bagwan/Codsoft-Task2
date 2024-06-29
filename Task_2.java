import java.util.*;

public class Task_2 {

    public static void main(String[] args) {
        Scanner H= new Scanner(System.in);
        
        System.out.println("Enter the Numbers of subject");
        int totalsubjects = H.nextInt();

        int totalMarks=0;
        String grade;
        double avgpercentage;

        for (int i =0; i < totalsubjects; i++){
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            int marks = H.nextInt();

            if(marks < 0 || marks > 100){
                System.out.println("invalid marks! Please enter makrs between 1 to 100 ");
                i--;
                continue;

            }
            totalMarks +=marks;
        }

        avgpercentage=(double) totalMarks / totalsubjects;

        grade = calculateGrade(avgpercentage);

        System.out.println("\nTotal marks: " + totalMarks);
        System.out.printf("Avarage Precentage : %.2f%%\n", avgpercentage);
        System.out.println("Grade :"+ grade);


        H.close();


    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90){
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70){
            return "C";
        } else if (percentage >= 60){
            return "G";
        } else {
            return "f";
        }

    }
}
