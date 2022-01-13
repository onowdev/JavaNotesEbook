import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String[] args) {
        // Promt User to Enter name

        String name = JOptionPane.showInputDialog("What is your name?");

        //Create the Message
        String message=
                String.format("Welcome, %s, to Java Programming!", name);

        // display the message to Welcome the user by name
        JOptionPane.showMessageDialog(null, message);
    }// end Main Class
}// End Class Name dialog
