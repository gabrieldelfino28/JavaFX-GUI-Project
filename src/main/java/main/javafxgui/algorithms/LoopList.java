package main.javafxgui.algorithms;

import javafx.scene.control.Alert;
import main.javafxgui.algorithms.LMethods.LMethods;


import javax.swing.*;
import java.lang.*;


public class LoopList {

    LMethods m = new LMethods();
    //Alert alert = new Alert(Alert.AlertType.INFORMATION);
    public void main(String text) {
        String Menu;

        try {
            Menu = text;
            switch (Menu) {
                case "" -> JOptionPane.showMessageDialog(null, "Blank Input!\nPlease enter one of the exercises listened above.");
                case "1" -> Ex_31();
                case "2" -> Ex_32();
                case "3" -> Ex_33();
                case "4" -> Ex_34();
                case "5" -> Ex_35();
                case "6" -> Ex_36();
                case "7" -> Ex_37();
                case "8" -> Ex_38();
                case "9" -> Ex_39();
                case "10" -> Ex_40();
                case "11" -> Ex_41();
                case "12" -> Ex_42();
                case "13" -> Ex_43();
                case "14" -> Ex_44();
                case "15" -> Ex_45();
                default -> JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "Exiting", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_31() {
        /*
         * Objective: Calculation of the square of numbers between 10 and 15 (Interval) With function.
         */
        try {

            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform an interval\ninform the 1st number:"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform an interval\ninform the 2nd number:"));
            for (int i = num1; i <= num2; i++) {
                int square = m.FuncSquare_Ex31(i);
                JOptionPane.showMessageDialog(null, "Square of the number: " + i + " is " + square);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_32() {
        /*
         * Objective: Calculation of the factorial of any number typed by the user, with function.
         * WARNING: Factorial of numbers above 16, goes memory overflow and the results are showed as negative numbers or 0.
         */
        try {
            double num = Integer.parseInt(JOptionPane.showInputDialog("Factorial\nInform a number"));
            double fat = m.FuncFactorial_Ex32(num);

            JOptionPane.showMessageDialog(null, "Factorial of " + num + " is " + fat);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_33() {
        /*
         * Objective: Receive a number and calculate a sum of number series -> 1 + 1/2 + 1/3 + ... + 1/N.
         */
        try {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Inform a limit"));
            double sum = m.FuncSumSeries_Ex33(num);
            JOptionPane.showMessageDialog(null, "Sum of 1 + ... 1/" + num + "\nResult: " + sum);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_34() {
        /*
         * Objective: Receive a number and show the multiplication table related to it -> N * 1 = x ... N * 10 = x
         * Here I used an integer Array to receive all the multiplication results, to show all the results at once
         * to the user, instead of opening 10 dialogue messages showing the result.
         */
        try {
            int[] res = new int[10];
            int num = Integer.parseInt(JOptionPane.showInputDialog("Inform a value: "));

            res = m.FuncMultiplicationTable_Ex34(num, res);

            JOptionPane.showMessageDialog(null, "Results of " + num +
                    "\n" + num + " x 1 = " + res[0] +
                    "\n" + num + " x 2 = " + res[1] +
                    "\n" + num + " x 3 = " + res[2] +
                    "\n" + num + " x 4 = " + res[3] +
                    "\n" + num + " x 5 = " + res[4] +
                    "\n" + num + " x 6 = " + res[5] +
                    "\n" + num + " x 7 = " + res[6] +
                    "\n" + num + " x 8 = " + res[7] +
                    "\n" + num + " x 9 = " + res[8] +
                    "\n" + num + " x 10 = " + res[9]);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void Ex_35() {
        /*
         * Objective: Receive two numbers, and show the sum of the odds between these two.
         */
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 1st value: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 2nd value: "));
            int sum;

            if (num2 > num1) {
                sum = m.FuncOddsSum_Ex35(num2, num1); //It calls the function differently depending on which value is the largest
            } else {
                sum = m.FuncOddsSum_Ex35(num1, num2);
            }

            JOptionPane.showMessageDialog(null, "The result of the sum of odds is " + sum);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_36() {
        /*
         * Objective: Receive a value (N) and calculate a sum of series -> 1/1! + ... + 1/N! (Division + Factorial)
         */
        try {
            double num = Integer.parseInt(JOptionPane.showInputDialog("Inform a limit for the sum"));
            double sum = m.FuncSumSeries_Ex36(num);

            JOptionPane.showMessageDialog(null, "Sum results: " + sum);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void Ex_37() {
        /*
         * Objective: Fibonacci sequence
         */
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Inform a limit for Fibonacci"));

            StringBuilder fibonacci = m.FuncFibonacci_Ex37(num);
            JOptionPane.showMessageDialog(null, "Fibonacci sequence: " + fibonacci);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_38() {
        /*
         * Objective: Receive 10 Numbers and show the biggest and the largest
         */
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Inform a number"));
            int maior = num;
            int menor = num;
            for (int i = 1; i < 10; i++) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Inform a number"));
                if (num > maior) {
                    maior = num;
                } else if (num < menor) {
                    menor = num;
                }
            }

            JOptionPane.showMessageDialog(null, "Largest value: " + maior + " and smallest value: " + menor);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_39() {
        /*
         * Objective: Quantity of grains in a board:
         *    House: 1 2 3 4 ... 64
         * Quantity: 1 2 4 8 ... N 2^i
         * Warning: Memory overflow because of extremely large numbers like 2^63 ...
         */
        try {
            double qtdGraos = m.FuncSumGrains_Ex39();

            JOptionPane.showMessageDialog(null, "Grains: 2^0 + 2^1 + ... + 2^64\nSum of all the grains in the board: " + qtdGraos);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_40() {
        /*
         * Objective: Get 2 Integer numbers. Check and show all existing prime numbers between them.
         */

        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 1st number"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 2nd number"));

            StringBuilder result = m.FuncPrimeNumber_Ex40(num1, num2);

            JOptionPane.showMessageDialog(null, "Prime numbers between "+num1+" and "+num2+":\n" + result);

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }


    public void Ex_41() {
        /*
         * Objective: Show all the possibilities of 2 dice so that the sum results in 7.
         */
        try {
            StringBuilder result = m.FuncDiceThrow_Ex41();

            JOptionPane.showMessageDialog(null,"All the possibilities of the 2 dice: \n"+result);

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_42() {
        /*
         * Objective: Calculate and show the series 1 + 2/3 + 3/5 + ... + 50/99
         */
        try {

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_43() {
        /*
         * Objective: Calculate and show how many years it will take for Ana to be bigger than Maria knowing that
         * Ana is 1.10 m and grows 3 cm per year and Maria is 1.5 m and grows 2 cm a year.
         */
        try {

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_44() {
        /*
         * Objective: Receive the base and exponent number. Calculate and show the power value.
         */
        try {

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_45() {
        /*
         * Objective: Calculate and show the series 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
         */
        try {
            System.out.println("test");
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input or Exception Detected!\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}
