package physicgradingsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author elisha
 */
public class PhysicGradingSystem {

    public static void main(String[] args) {
        
        System.out.print("Enter a student’s score out of 100:");
        try (Scanner user_input = new Scanner(System.in)) {
            int entered_score = user_input.nextInt();

           
            int grade;
            String remarks;

            if(entered_score >= 80 && entered_score <= 100){
                grade = 1;
                remarks = "D1";
                System.out.println("The score:"+entered_score+" marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 75 && entered_score <= 79){
                grade = 2;
                remarks = "D2";
                System.out.println("The score:"+entered_score+" marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 66 && entered_score <= 74){
                grade = 3;
                remarks = "C3";
                System.out.println("The score:"+entered_score+" marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 60 && entered_score <= 65){
                grade = 4;
                remarks = "C4";
                System.out.println("The score:"+entered_score+" marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 50 && entered_score <= 59){
                grade = 5;
                remarks = "C5";
                System.out.println("The score:"+entered_score+" marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 45 && entered_score <= 49) {
                grade = 6;
                remarks = "C6";
                System.out.println("The score:"+entered_score+" marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 35 && entered_score <= 44){
                grade = 7;
                remarks = "P7";
                System.out.println("The score:"+entered_score+" marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 30 && entered_score <= 34){
                grade = 8;
                remarks = "P8";
                System.out.println("The score:"+entered_score+" marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 0 && entered_score <= 29) {
                grade = 9;
                remarks = "F";
                System.out.println("The score:"+entered_score+" marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else{
                System.out.println("Invalid input.");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric value only.");
        }
        
        
    }
    
}
