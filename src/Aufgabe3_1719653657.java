import javax.swing.*;

public class Aufgabe3_1719653657 {

    public static void main(String[] args){

        String input  = JOptionPane.showInputDialog("Alter eingeben");

        double age = Double.parseDouble(input);

        JOptionPane.showMessageDialog(null, age);

        int intage = Integer.parseInt(input);

        JOptionPane.showMessageDialog(null, intage);

        boolean ageboolean = Boolean.parseBoolean(input);

        JOptionPane.showMessageDialog(null, ageboolean);

        long longage = Long.parseLong(input);

        JOptionPane.showMessageDialog(null, longage);

        char agechar = input.charAt(0);

        JOptionPane.showMessageDialog(null, agechar);

        byte agebyte = Byte.parseByte(input);

        JOptionPane.showMessageDialog(null, agebyte);

        short shortage = Short.parseShort(input);

        JOptionPane.showMessageDialog(null, shortage);

        float agef = Float.parseFloat(input);

        JOptionPane.showMessageDialog(null, agef);

        String var = String.valueOf(age);

        JOptionPane.showMessageDialog(null, var);
    }
}
