package FootyPlayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel panel1;
    private JTabbedPane settingsPanel;
    private JTextField textField1;
    private JButton btnSetUsername;
    private JButton btnSetEmail;
    private JButton btnSetPassword;
    private JLabel lbUsername;
    private JLabel lbEmail;
    private JLabel lbPassword;

    static public User user = new User("ianis", "ianis.trinc02@e-uvt.ro", "password123");

public MainFrame() {
    setContentPane(panel1);
    setSize(700, 500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    lbEmail.setText("Email: " + user.getEmail());
    lbUsername.setText("Username: " + user.getUsername());
    lbPassword.setText("PASSWORD");
    btnSetUsername.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            UpdatePanel update = new UpdatePanel( "username");
            System.out.println(user.getUsername());
        }
    });
    btnSetEmail.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            UpdatePanel update = new UpdatePanel( "email");
        }
    });
    btnSetPassword.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            UpdatePanel udpate = new UpdatePanel("password");
        }
    });


}

}
