import javax.swing.JOptionPane;

public class DialogBox2 {
    public static void main(String[] args) {
        String stan = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Welcome "+stan+"",null, JOptionPane.INFORMATION_MESSAGE);
    }
}