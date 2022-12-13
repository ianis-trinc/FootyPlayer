package FootyPlayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdatePanel  extends JFrame{
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JButton btnUpdate;
    private JPanel updatePane;
    private JLabel lbError;

    public UpdatePanel(String stringToUpdate) {
        setContentPane(updatePane);

        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        if (stringToUpdate == "password") {
            label1.setText("Enter old password:");
            label2.setText("Enter new password:");
        } else if (stringToUpdate == "email") {
            label1.setText("Enter old email:");
            label2.setText("Enter new email:");
        } else if (stringToUpdate == "username") {
            label1.setText("Enter old username:");
            label2.setText("Enter new username:");
        }

    btnUpdate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (stringToUpdate) {
                case "password":
                    if (textField1.getText().equals(MainFrame.user.getPassword())) {
                        MainFrame.user.setPassword(textField2.getText());

                        dispose();
                    } else {
                        lbError.setText("Old password is incorrect!");
                    }
                    break;
                case "username":
                    if (textField1.getText().equals(MainFrame.user.getUsername())) {
                        MainFrame.user.setUsername(textField2.getText());
                        dispose();
                    } else {
                        lbError.setText("Old username is incorrect!");
                    }

                    break;
                case "email":
                    if (textField1.getText().equals(MainFrame.user.getEmail())) {
                        MainFrame.user.setEmail(textField2.getText());

                        dispose();
                    } else {
                        lbError.setText("Old email is incorrect!");
                    }
                    break;
                default:
                    lbError.setText("Error!!!");
                    break;
            }
        }
    });
}
}
