package Exp_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Question_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
}

class LoginFrame extends JFrame {

    private final JTextField txtUser = new JTextField(16);
    private final JPasswordField txtPass = new JPasswordField(16);
    private final JButton btnLogin = new JButton("Login");

    public LoginFrame() {
        super("Swing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(10, 14, 10, 14);
        gc.anchor = GridBagConstraints.WEST;

        int row = 0;
        gc.gridx = 0; gc.gridy = row; panel.add(new JLabel("Username"), gc);
        gc.gridx = 1; panel.add(txtUser, gc); row++;

        gc.gridx = 0; gc.gridy = row; panel.add(new JLabel("Password"), gc);
        gc.gridx = 1; panel.add(txtPass, gc); row++;

        gc.gridx = 0; gc.gridy = row; gc.gridwidth = 2; gc.anchor = GridBagConstraints.CENTER;
        btnLogin.addActionListener(this::onLogin);
        panel.add(btnLogin, gc);

        // Press Enter to trigger Login
        getRootPane().setDefaultButton(btnLogin);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void onLogin(ActionEvent e) {
        String user = txtUser.getText().trim();
        String pass = new String(txtPass.getPassword());

        if ("Karunya".equals(user) && "Karunya".equals(pass)) {
            JOptionPane.showMessageDialog(this, "Login Successful", "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed", "Message",
                    JOptionPane.ERROR_MESSAGE);
        }
        // Optional: clear password after attempt
        txtPass.setText("");
    }
}
