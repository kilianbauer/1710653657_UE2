import javax.swing.*;

public class Aufgabe2_1710653657 {

    public static void main(String[] args) {

        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte eine Zahl eingeben"));

        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte eine weitere Zahl eingeben"));

        int durchlauf = 0;

        if (zahl1 == zahl2){

            System.out.println(zahl1);

        }
        while (zahl1 != zahl2){

            durchlauf++;

            if (zahl1 > zahl2){

                zahl2++;
            }
            if (zahl2 > zahl1){

                zahl1++;
            }
            if (zahl1 == zahl2){

                System.out.println(zahl1);

                System.out.println("Anzahl der benötigten Schritte: " + durchlauf );

            }
        }
    }
}

