public class Aufgabe4_1710653657 {

    public static void main(String[] args){

        for(int i = 1; i < 11;i++){

            System.out.println("Schleifendurchläufe: " + i);
        }
        int zähler1 = 1;

        while (zähler1 < 11){

            System.out.println("Schleifendurchläufe: " + zähler1);
            zähler1++;
        }
        zähler1 = 1;

        do {

            System.out.println("Der Schleifenzähler ist " + zähler1);
            zähler1++;

        } while(zähler1 < 11);

    }
}
