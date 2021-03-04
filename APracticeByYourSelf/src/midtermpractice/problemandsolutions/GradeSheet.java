package midterm.problemandsolutions;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {
            double quizScore = 80;
            double midTermScore = 68;
            double finalScore= 90;
            int numberOfExam = 3;
            double sum = quizScore+midTermScore+finalScore;
            double avgScore = sum/numberOfExam;

            System.out.println("Average score is "+avgScore);

            if (avgScore >= 90){
                System.out.println("Grade is A");
            }
            else if (avgScore >=70 && avgScore <90 ) {
                System.out.println("Grade is B");
            }
            else if (avgScore >=50 && avgScore <70 ) {
                System.out.println("Grade is C");
            }
            else {
                System.out.println("Grade is F");
            }
        }
    }
