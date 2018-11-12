import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserRegistrationPanel{
    private JPanel panel = new JPanel();
        private JLabel lblTitle;
        private JLabel lblUsername;
        private JTextField txtUsername;
        private JLabel lblPassword;
        private JPasswordField txtPassword;
        private JLabel lblConfirmPass;
        private JPasswordField txtConfirmPass;
        private JLabel lblEmail;
        private JTextField txtEmail;

    public UserRegistrationPanel(){
        init();
    }

    public void init(){
        panel.setLayout(null);
        panel.setSize(600, 300);

            JLabel lblTitle = new JLabel("User Registration");
            lblTitle.setBounds(250, 25, 500, 20);
        panel.add(lblTitle);

            JLabel lblUsername = new JLabel("Username\t:");
            lblUsername.setBounds(80, 60, 100, 20);
        panel.add(lblUsername);

            JTextField txtUsername = new JTextField();
            txtUsername.setBounds(240, 60, 200, 20);
        panel.add(txtUsername);

            JLabel lblPassword = new JLabel("Password\t:");
            lblPassword.setBounds(80, 90, 100, 20);
        panel.add(lblPassword);

            JPasswordField txtPassword = new JPasswordField();
            txtPassword.setBounds(240, 90, 200, 20);
        panel.add(txtPassword);

            JLabel lblConfirmPass = new JLabel("Confirm Password\t:");
            lblConfirmPass.setBounds(80, 120, 140, 20);
        panel.add(lblConfirmPass);

            JPasswordField txtConfirmPass = new JPasswordField();
            txtConfirmPass.setBounds(240, 120, 200, 20);
        panel.add(txtConfirmPass);

            JLabel lblEmail = new JLabel("Email\t:");
            lblEmail.setBounds(80, 150, 100, 20);
        panel.add(lblEmail);

            JTextField txtEmail = new JTextField();
            txtEmail.setBounds(240, 150, 200, 20);
        panel.add(txtEmail);
    }

    public JPanel getPanel(){
        return panel;
    }
}