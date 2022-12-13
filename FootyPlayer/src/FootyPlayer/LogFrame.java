package FootyPlayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogFrame extends JFrame {

    private JPanel logPanel;
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton btnLog;

    public LogFrame() {
        setContentPane(logPanel);
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        btnLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tfUsername.getText().equals("ianis") && pfPassword.getText().equals("parola")) {
                    MainFrame frame = new MainFrame();
                    dispose();
                }
//                dispose();
            }
        });
    }
}
