import javax.swing.JOptionPane;
public class Input_QuadraticDialog {
    

    public static void main(String[] args) {

//x1 , 2 = -b +/- (b^2-4*a*c)^0.5)/2*a
    //assign their data types
    try {
        double a, b, c, x1, x2;
        String stan = JOptionPane.showInputDialog("Enter the coefficient of x^2");
        a = Double.parseDouble(stan);
        stan = JOptionPane.showInputDialog("Enter the coefficient of x");
        b = Double.parseDouble(stan);
        stan = JOptionPane.showInputDialog("Enter the value of the constant");
        c = Double.parseDouble(stan);

        // evaluate the expression or equation
        x1 = (-b - Math.sqrt(b*b-4*a*c))/ (2*a);
        x2 = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/ (2*a);

        // display the output
        JOptionPane.showMessageDialog(null,"The roots are "+x1+" and "+x2, "Quadratic Dialog",JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Enter numbers only", "Error Message",JOptionPane.INFORMATION_MESSAGE);
    }

       
        
    }
}
