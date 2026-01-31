package physicgradingsystem;

import java.util.Scanner;

/**
 *
 * @author elisha
 */
public class PhysicGradingSystem {

    public static void main(String[] args) {
        
        int i = 1;
//        int entered_score=0;
        int entered_score1=0;
        int entered_score2=0;
        int entered_score3=0;
        int entered_score4=0;
        int entered_score5=0;
        
        Scanner user_input = new Scanner(System.in);
            
            while(i<=5){
                
//                entered_score = user_input.nextInt();
                if(i==1){
                    System.out.print("Enter 1st student’s score:");
                    entered_score1 = user_input.nextInt();
                }
                if(i==2){
                    System.out.print("Enter 2nd student’s score:");
                    entered_score2 = user_input.nextInt();
                }
                if(i==3){
                    System.out.print("Enter 3rd student’s score:");
                    entered_score3 = user_input.nextInt();
                }
                if(i==4){
                    System.out.print("Enter 4th student’s score:");
                    entered_score4 = user_input.nextInt();
                }
                if(i==5){
                    System.out.print("Enter 5th student’s score:");
                    entered_score5 = user_input.nextInt();
                    
                }
                i++;
            }  
            
            displaySummary(entered_score1);
            displaySummary(entered_score2);
            displaySummary(entered_score3);
            displaySummary(entered_score4);
            displaySummary(entered_score5);
            
        
    }
//    method to display summary
    public static void displaySummary(int entered_score){
            int grade;
            String remarks;

            if(entered_score >= 80 && entered_score <= 100){
                grade = 1;
                remarks = "D1";
                System.out.println("\nThe score:"+entered_score+"marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 75 && entered_score <= 79){
                grade = 2;
                remarks = "D2";
                System.out.println("\nThe score:"+entered_score+"marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 66 && entered_score <= 74){
                grade = 3;
                remarks = "C3";
                System.out.println("\nThe score:"+entered_score+"marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 60 && entered_score <= 65){
                grade = 4;
                remarks = "C4";
                System.out.println("\nThe score:"+entered_score+"marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 50 && entered_score <= 59){
                grade = 5;
                remarks = "C5";
                System.out.println("\nThe score:"+entered_score+"marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 45 && entered_score <= 49) {
                grade = 6;
                remarks = "C6";
                System.out.println("\nThe score:"+entered_score+"marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 35 && entered_score <= 44){
                grade = 7;
                remarks = "P7";
                System.out.println("\nThe score:"+entered_score+"marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 30 && entered_score <= 34){
                grade = 8;
                remarks = "P8";
                System.out.println("\nThe score:"+entered_score+"marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else if (entered_score >= 0 && entered_score <= 29) {
                grade = 9;
                remarks = "F";
                System.out.println("\nThe score:"+entered_score+"marks");
                System.out.println("Grade:"+grade);
                System.out.println("Remark:"+remarks);
            } else{
                System.out.println("Invalid input.");
            }
            
            }
    
}
