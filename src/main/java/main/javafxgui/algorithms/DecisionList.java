package main.javafxgui.algorithms;
/*
 * Author: Gabriel Delfino
 * Date: 10/07/2023 (DD/MM/YYYY format)
 * Objective: Solve exercises from the first batch: 16 - 30.
 * Warning: Most of the Variables might be in portuguese, though the input text from the menus is in english.
 */


import main.javafxgui.algorithms.DSmethods.Dmethods;
import main.javafxgui.algorithms.DSmethods.liquidWage;

import javax.swing.*;

public class DecisionList {

    Dmethods m = new Dmethods(); //Extra Methods and functions will be here.

    public void main(String text) {

        String Menu;

        try {
            Menu = text;
            System.out.println(Menu);
            switch (Menu) {
                case "" -> JOptionPane.showMessageDialog(null, "Blank Input!\nPlease enter one of the exercises listened above.");
                case "1" -> Ex_16();
                case "2" -> Ex_17();
                case "3" -> Ex_18();
                case "4" -> Ex_19();
                case "5" -> Ex_20();
                case "6" -> Ex_21();
                case "7" -> Ex_22();
                case "8" -> Ex_23();
                case "9" -> Ex_24();
                case "10" -> Ex_25();
                case "11" -> Ex_26();
                case "12" -> Ex_27();
                case "13" -> Ex_28();
                case "14" -> Ex_29();
                case "15" -> Ex_30();
                default -> JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "Exiting", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void Ex_16() {
        try {
            liquidWage sal = new liquidWage(); //Abstract class with all the data to calculate a generic Liquid Wage.

            //Inputs
            sal.hourQ = Double.parseDouble(JOptionPane.showInputDialog("Inform the hours quantity"));
            sal.hourV = Double.parseDouble(JOptionPane.showInputDialog("Inform the hours value"));
            sal.discount = Double.parseDouble(JOptionPane.showInputDialog("Inform the discount percentage"));
            sal.desN = Double.parseDouble(JOptionPane.showInputDialog("Inform the descendants quantity"));

            //Calculation
            sal.desN = sal.desN * 100;
            sal.discount = (sal.discount / 100);
            sal.sB = (sal.hourQ * sal.hourV);

            // Final Wage = Brutal Wage - (Brutal Wage * Discount percentage) + Descendants value
            sal.sL = (sal.sB - (sal.sL * sal.desN) + sal.desN);

            JOptionPane.showMessageDialog(null, "The Final value of the Liquid Wage is: " + sal.sL);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }


    public void Ex_17() {
        try {
            double tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Inform the route timing (hours): "));
            double velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Inform the Average Speed (m/s) : "));
            double quantidadeLitros = m.Speed_LiquidQuantity_17(tempoPercurso, velocidadeMedia);

            JOptionPane.showMessageDialog(null, "Liters quantity: " + quantidadeLitros);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_18() {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 1st value"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 2nd value"));
            int dif = m.Difference_Calculation_18(num1, num2);

            JOptionPane.showMessageDialog(null, "Result of the difference between the largest and smallest value: " + dif);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void Ex_19() {
        try {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Inform the 1st value"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Inform the 2nd value"));

            double biggestNum = m.RealLargestNumber_19(num1, num2);

            JOptionPane.showMessageDialog(null, "Largest value: " + biggestNum);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_20() {
        try {
            double A = Double.parseDouble(JOptionPane.showInputDialog("Inform the A value"));
            double B = Double.parseDouble(JOptionPane.showInputDialog("Inform the B value"));
            double C = Double.parseDouble(JOptionPane.showInputDialog("Inform the C value"));

            double Dt = m.Delta_20(A, B, C);
            System.out.println(Dt);
            if (Dt < 0) {
                JOptionPane.showMessageDialog(null, "No real X (roots) values found");
            }

            if (Dt > 0) {
                //X = -B +- sqrt(Dt) / 2*a
                double x1 = ((-B) + Math.pow(Dt, 0.5)) / (2 * A);
                double x2 = ((-B) - Math.pow(Dt, 0.5)) / (2 * A);
                JOptionPane.showMessageDialog(null, "X' value: " + x1 + " X'' values: " + x2);

            } else {
                double x1 = ((-B) + Math.pow(Dt, 0.5)) / (2 * A);
                double x2 = ((-B) - Math.pow(Dt, 0.5)) / (2 * A);
                JOptionPane.showMessageDialog(null, "X' value: " + x1 + " X'' values: " + x2);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_21() {
        try {
            double[] nota = new double[4];
            double media = 0;
            for (int i = 0; i < 4; i++) {
                nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Inform the " + (i + 1) + " ° grade: "));
                media += nota[i];
            }
            media /= 4; //media = media /4;
            JOptionPane.showMessageDialog(null, "The average grade is " + media);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }


    public void Ex_22() {
        try {
            int number1 = Integer.parseInt(JOptionPane.showInputDialog("Inform the first number: "));
            int number2 = Integer.parseInt(JOptionPane.showInputDialog("Inform the second number: "));
            int[] order = new int[2];

            order = m.AscendingOrder_22(order, number1, number2); //Ordering Function
            JOptionPane.showMessageDialog(null, "Ascending order: " + order[0] + " " + order[1]);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_23() {
        try {
            int[] num = new int[4];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "º | 3 numbers in order and last one random: "));
            }
            m.Ordering_23(num);
        }catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void Ex_24() {
        try {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Inform a value: "));
            m.DivisibleNumber_24(number);
        }catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_25() {
        /*
         *  Objetive: Calculate the duration of a generic game, receiving the initial and ending time of the game.
         */
        try {
            int horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Inform the initial hour (0 - 24)"));
            int minInicial = Integer.parseInt(JOptionPane.showInputDialog("Inform the initial minutes (0 - 60) "));
            int horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Inform the final hour (0 - 24)"));
            int minFinal = Integer.parseInt(JOptionPane.showInputDialog("Inform the final minutes (0 - 24)"));

            int horaDuracao = m.HourCalculation_25(horaInicial, horaFinal);
            int minDuracao = m.MinuteCalculation_25(minInicial, minFinal);

            if (minDuracao > minInicial) {
                horaDuracao -= 1;
            }

            /*
             * Example/Test
             * 23 : 30  + 00:30 == 00:00 + 00:15 = 00:15 hence 45 mins + 02:00-> 02:45 duration
             * When the game ended 02 : 15
             * When the game started 23 : 15
             * 02 : 45
             */

            JOptionPane.showMessageDialog(null, "Game duration: " + horaDuracao + " hours and " + minDuracao + " minutes.");
        }catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_26() {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform a value: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform a value: "));

            m.Ordering_26(num1, num2);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_27() {
        try {
            double numVoltas = Double.parseDouble(JOptionPane.showInputDialog("Inform the turns quantity"));
            double extensaoCircuito = Double.parseDouble(JOptionPane.showInputDialog("Inform the circuit extension (in meters)"));
            double tempo = Double.parseDouble(JOptionPane.showInputDialog("Inform the duration of the race (in minutes)"));

            double velocidadeMedia = m.AverageSpeed_27(numVoltas, extensaoCircuito, tempo);
            JOptionPane.showMessageDialog(null, "The Average speed (km/h) is " + velocidadeMedia);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void Ex_28() {
        try {
            double precoInicial = Double.parseDouble(JOptionPane.showInputDialog("Inform the initial price"));
            double valorMensal = Double.parseDouble(JOptionPane.showInputDialog("Inform the monthly value"));
            double precoAtual = m.NewPriceCalculation_28(precoInicial, valorMensal);

            JOptionPane.showMessageDialog(null, "The new price of the product 'x' will be: " + precoAtual);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_29() {
        try {
            int tipoInvestimento;
            do {
                tipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Inform the type of investment.\n1 - Savings 2 - Fixed Income"));
                if (tipoInvestimento != 1 && tipoInvestimento != 2) {
                    JOptionPane.showMessageDialog(null, "Invalid input.");
                }
            } while (tipoInvestimento != 1 && tipoInvestimento != 2);
            double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Inform the value of the investment"));
            double valorNovo = m.NewValueInvestment_29(tipoInvestimento, valorInvestimento);

            JOptionPane.showMessageDialog(null, "New value after 30 days will be: " + valorNovo);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Ex_30() {
        try {
            int dia0 = Integer.parseInt(JOptionPane.showInputDialog("Inform your birthday day"));
            int mes0 = Integer.parseInt(JOptionPane.showInputDialog("Inform your birthday month"));
            int ano0 = Integer.parseInt(JOptionPane.showInputDialog("Inform your birthday year"));

            int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Inform your current day"));
            int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Inform your current month"));
            int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Inform your current year"));

            if (dia1 < dia0) {
                mes1 -= 1;
                if (mes1 < 8) { //if it's before August
                    if (mes1 == 2) {
                        if (ano1 % 4 == 0) { //Checking leap year o
                            dia1 += 29;
                        } else {
                            dia1 += 28;
                        }
                    } else if (mes1 % 2 > 0 || mes1 == 0) { //if it's not feb, then check if it's pairs(evens) or odds
                        dia1 += 31;
                    } else {
                        dia1 += 30;
                    }
                } else if (mes1 % 2 == 0) {//After august (including august)
                    dia1 += 31;//even
                } else {
                    dia1 += 30;//odd
                }
            }

            if (mes1 < mes0) {
                ano1 -= 1;
                mes1 += 12;
            }
            int anodiff = ano1 - ano0;
            int mesdiff = mes1 - mes0;
            int diadiff = dia1 - dia0;

            JOptionPane.showMessageDialog(null, "Your age is: " + anodiff + " years, " + mesdiff + " months and " + diadiff + " days.");
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid Input type or Exception Detected.\nExiting.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

}
