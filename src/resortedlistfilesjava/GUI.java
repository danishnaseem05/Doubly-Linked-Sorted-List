package resortedlistfilesjava;

import javax.swing.JOptionPane;

public class GUI {

    public static void main(String[] args){

        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second number");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);

        int sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The answer is " + sum, "Sum", JOptionPane.PLAIN_MESSAGE);

    }

}
