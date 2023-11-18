package com.example.lettergrade;

import javax.swing.*;

public class LetterGrade {
    public static void main(String[] args){
        double QuizResult = Double.parseDouble(JOptionPane.showInputDialog
                (null," enter your own quiz result "));
        double result = calculation(QuizResult);

    }
    private static double calculation(double number){

        if (number <=49 && number <=100 ){
            JOptionPane.showMessageDialog(null,"YOU ARE FAILED");
        }

        else if (number>= 50 && number <=0 ){
            JOptionPane.showMessageDialog(null,"YOU ARE PASSED");
        }
        else {
            JOptionPane.showMessageDialog(null,"please enter a valid number from 0 to 100");
        }
        return number;

    }
}
