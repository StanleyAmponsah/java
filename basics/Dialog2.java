//y=x^2 + 2=
 


import javax.swing.JOptionPane;

public class Dialog2 {
    public static void main(String[] args) {
        // declaration of variables
        double x, y;
        // accept input data from user
        String stan = JOptionPane.showInputDialog("Enter a value for x:");
        // converting string input to double
        x = Double.parseDouble(stan);
        // evaluate the expression
        y = Math.pow(x, 2)+2;
        JOptionPane.showMessageDialog(null,y+"","Evaluate Y",JOptionPane.INFORMATION_MESSAGE);
    }
}
