import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginPanel{
    private JPanel panel = new JPanel();
        private JLabel lblTitle;
        private JLabel lblUsername;
        private JTextField txtUsername;
        private JLabel lblPassword;
        private JPasswordField txtPassword;

    public LoginPanel(){
        init();
    }

    public void init(){
        panel.setLayout(null);
        panel.setSize(600, 300);

            JLabel lblTitle = new JLabel("Login Menu");
            lblTitle.setBounds(250, 25, 500, 20);
        panel.add(lblTitle);

            JLabel lblUsername = new JLabel("Username\t:");
            lblUsername.setBounds(100, 60, 100, 20);
        panel.add(lblUsername);

            JTextField txtUsername = new JTextField();
            txtUsername.setBounds(220, 60, 200, 20);
        panel.add(txtUsername);

            JLabel lblPassword = new JLabel("Password\t:");
            lblPassword.setBounds(100, 90, 100, 20);
        panel.add(lblPassword);

            JPasswordField txtPassword = new JPasswordField();
            txtPassword.setBounds(220, 90, 200, 20);
        panel.add(txtPassword);
    }
    
    public JPanel getPanel(){
        return panel;
    }
}