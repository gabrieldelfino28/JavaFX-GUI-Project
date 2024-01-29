package main.javafxgui.algorithms;

import javafx.scene.control.Alert;
import main.javafxgui.algorithms.LMethods.LMethods;


import javax.swing.JOptionPane;


public class LoopList {

    LMethods m = new LMethods();

    //Alert alert = new Alert(Alert.AlertType.INFORMATION);
    public void MainMenu(String Menu) {

        try {
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
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            if (errorMessage.equals("Cannot invoke \"String.trim()\" because \"in\" is null")) {
                JOptionPane.showMessageDialog(null, "Exiting", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input, please try again.", "Warning", JOptionPane.WARNING_MESSAGE);
                MainMenu(Menu);
            }
        }
    }

    public void Ex_31() {
        /*
         * Objective: Calculation of the square of numbers between 10 and 15 (Interval) With function.
         */
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform an interval\ninform the 1st number:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform an interval\ninform the 2nd number:"));
        for (int i = num1; i <= num2; i++) {
            int square = m.FuncSquare_Ex31(i);
            JOptionPane.showMessageDialog(null, "Square of the number: " + i + " is " + square);
        }

    }

    public void Ex_32() {
        /*
         * Objective: Calculation of the factorial of any number typed by the user, with function.
         * WARNING: Factorial of numbers above 16, goes memory overflow and the results are showed as negative numbers or 0.
         */
        double num = Integer.parseInt(JOptionPane.showInputDialog("Factorial\nInform a number"));
        double fat = m.FuncFactorial_Ex32(num);

        JOptionPane.showMessageDialog(null, "Factorial of " + num + " is " + fat);

    }

    public void Ex_33() {
        /*
         * Objective: Receive a number and calculate a sum of number series -> 1 + 1/2 + 1/3 + ... + 1/N.
         */
        double num = Double.parseDouble(JOptionPane.showInputDialog("Inform a limit"));
        double sum = m.FuncSumSeries_Ex33(num);
        JOptionPane.showMessageDialog(null, "Sum of 1 + ... 1/" + num + "\nResult: " + sum);
    }

    public void Ex_34() {
        /*
         * Objective: Receive a number and show the multiplication table related to it -> N * 1 = x ... N * 10 = x
         * Here I used an integer Array to receive all the multiplication results, to show all the results at once
         * to the user, instead of opening 10 dialogue messages showing the result.
         */

        int[] res = new int[10];
        int num = Integer.parseInt(JOptionPane.showInputDialog("Inform a value: "));

        res = m.FuncMultiplicationTable_Ex34(num, res);

        StringBuilder Answer = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            Answer.append("\n").append(num).append(" x ").append(i + 1).append(" = ").append(res[i]);
        }

        JOptionPane.showMessageDialog(null, "Results of " + num + Answer);
    }

    public void Ex_35() {
        /*
         * Objective: Receive two numbers, and show the sum of the odds between these two.
         */
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 1st value: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 2nd value: "));
        int sum;

        if (num2 > num1) {
            sum = m.FuncOddsSum_Ex35(num2, num1); //It calls the function differently depending on which value is the largest
        } else {
            sum = m.FuncOddsSum_Ex35(num1, num2);
        }

        JOptionPane.showMessageDialog(null, "The result of the sum of odds is " + sum);
    }

    public void Ex_36() {
        /*
         * Objective: Receive a value (N) and calculate a sum of series -> 1/1! + ... + 1/N! (Division + Factorial)
         */

        double num = Integer.parseInt(JOptionPane.showInputDialog("Inform a limit for the sum"));
        double sum = m.FuncSumSeries_Ex36(num);

        JOptionPane.showMessageDialog(null, "Sum results: " + sum);

    }

    public void Ex_37() {
        /*
         * Objective: Fibonacci sequence
         */

        int num = Integer.parseInt(JOptionPane.showInputDialog("Inform a limit for Fibonacci"));

        StringBuilder fibonacci = m.FuncFibonacci_Ex37(num);
        JOptionPane.showMessageDialog(null, "Fibonacci sequence: " + fibonacci);

    }

    public void Ex_38() {
        /*
         * Objective: Receive 10 Numbers and show the biggest and the largest
         */

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

    }

    public void Ex_39() {
        /*
         * Objective: Quantity of grains in a board:
         *    House: 1 2 3 4 ... 64
         * Quantity: 1 2 4 8 ... N 2^i
         * Warning: Memory overflow because of extremely large numbers like 2^63 ...
         *
         */

        double qtdGraos = m.FuncSumGrains_Ex39();

        JOptionPane.showMessageDialog(null, "Grains: 2^0 + 2^1 + ... + 2^64\nSum of all the grains in the board: " + qtdGraos);
    }

    public void Ex_40() {
        /*
         * Objective: Get 2 Integer numbers. Check and show all existing prime numbers between them.
         */

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 1st number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 2nd number"));

        StringBuilder result = m.FuncPrimeNumber_Ex40(num1, num2);

        JOptionPane.showMessageDialog(null, "Prime numbers between " + num1 + " and " + num2 + ":\n" + result);

    }


    public void Ex_41() {
        /*
         * Objective: Show all the possibilities of 2 dice so that the sum results in 7.
         */
        StringBuilder result = m.FuncDiceThrow_Ex41();

        JOptionPane.showMessageDialog(null, "All the possibilities of the 2 dice: \n" + result);

    }

    public void Ex_42() {
        /*
         * Objective: Calculate and show the series 1 + 2/3 + 3/5 + ... + 50/99
         */
        double res = m.FuncSumSeries_Ex42();
        JOptionPane.showMessageDialog(null, "Result of the series: " + res);

    }

    public void Ex_43() {
        /*
         * Objective: Calculate and show how many years it will take for Ana to be bigger than Maria knowing that
         * Ana is 1.10 m and grows 3 cm per year and Maria is 1.5 m and grows 2 cm a year.
         */

        //I'll calculate their heights using centimeters instead of meters.

        int Ana = 110;
        int Maria = 150;
        int i = 0;

        do {
            Ana += 3;
            Maria += 2;
            i += 1; //Years calculator
        } while (Ana < Maria);

        JOptionPane.showMessageDialog(null, "Ana will be bigger than Maria in " + i + " years");

    }

    public void Ex_44() {
        /*
         * Objective: Receive the base and exponent number. Calculate and show the power value.
         * (Using loops not Math.pow() please).
         */

        int base = Integer.parseInt(JOptionPane.showInputDialog("Inform the base (number)"));
        int exp = Integer.parseInt(JOptionPane.showInputDialog("Inform the exponent: "));

        int result = m.FuncExponent_Ex44(base, exp);

        JOptionPane.showMessageDialog(null, "Result: " + result);
    }

    public void Ex_45() {
        /*
         * Objective: Calculate and show the series 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
         */

        double res = m.FuncSumSeries_Ex45();
        JOptionPane.showMessageDialog(null, "Result of the series: " + res);

    }
}
