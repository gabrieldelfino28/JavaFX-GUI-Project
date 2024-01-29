package main.javafxgui.algorithms;

import javax.swing.JOptionPane;

public class ArraysList {
    public void MainMenu(String Menu) {

        try {
            switch (Menu) {
                case "" -> JOptionPane.showMessageDialog(null, "Blank Input!\nPlease enter one of the exercises listened above.");
                case "1" -> Ex_1();
                case "2" -> Ex_2();
                case "3" -> Ex_3();
                case "4" -> Ex_4();
                case "5" -> Ex_5();
                case "6" -> Ex_6();
                case "7" -> Ex_7();
                case "8" -> Ex_8();
                case "9" -> Ex_9();
                case "10" -> Ex_10();
                case "11" -> Ex_11();
                case "12" -> Ex_12();
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

    public void Ex_1() {
        int[] Vetor = new int[10];
        int media = 0;
        int somaImp = 0;
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            Vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Inform random integer values\nInform the " + (i + 1) + "° value of the array: "));
            if (Vetor[i] > 9 && Vetor[i] <= 200) {
                media += Vetor[i];
                cont++;
            }
            if (Vetor[i] % 2 != 0) {
                somaImp += Vetor[i];
            }
        }
        media /= cont; //media = media / cont;

        JOptionPane.showMessageDialog(null,"Average of the values between 10 and 200: "+media+
                "\nSum of all the odd numbers found: "+somaImp);
    }

    public void Ex_2(){

    }

    public void Ex_3(){

    }

    public void Ex_4(){

    }

    public void Ex_5(){

    }

    public void Ex_6(){

    }

    public void Ex_7(){

    }

    public void Ex_8(){

    }

    public void Ex_9(){

    }

    public void Ex_10(){

    }

    public void Ex_11(){

    }

    public void Ex_12(){

    }
}
