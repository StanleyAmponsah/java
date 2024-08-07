import javax.swing.JOptionPane;
public class Try {
    public static void main(String[] args) {
        int x;
        String stan = JOptionPane.showInputDialog("What's your name?");
        String fresh = JOptionPane.showInputDialog("How old are you?");
        x = Integer.parseInt(fresh);

        JOptionPane.showMessageDialog(null, "Welcome "+stan+"\n You are "+x+" years old",null, JOptionPane.INFORMATION_MESSAGE);
    }
}
