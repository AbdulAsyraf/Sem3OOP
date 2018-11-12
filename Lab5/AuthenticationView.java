import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javafx.scene.layout.Border;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AuthenticationView{
    private JFrame frame;
        //Top
        private JPanel panelTop;
            private JLabel lblTitle;
        
        //Bottom
        private JPanel panelBottom;
            private JButton btnOK;
            private JButton btnCancel;
            private JButton btnNew;
    
    public AuthenticationView(){
        init();
    }
    
    public void init(){
        JFrame frame = new JFrame("Lab 5 Things");
        frame.setSize(600, 400);
            JPanel panelTop = new JPanel();
                JLabel lblTitle = new JLabel("Authentication Menu");
            panelTop.add(lblTitle);
        frame.add(panelTop, BorderLayout.PAGE_START);

            LoginPanel login = new LoginPanel();
            JPanel testLogin = login.getPanel();
        frame.add(testLogin, BorderLayout.CENTER);
        
            UserRegistrationPanel register = new UserRegistrationPanel();
            JPanel newUser = register.getPanel();
            newUser.setVisible(false);
        frame.add(newUser, BorderLayout.CENTER);

            JPanel panelBottom = new JPanel();
                JButton btnOK = new JButton("OK");
                    btnOK.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            newUser.setVisible(false);
                            testLogin.setVisible(true);
                        }
                    });
                JButton btnCancel = new JButton("Cancel");
                    btnCancel.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent f){
                            newUser.setVisible(false);
                            testLogin.setVisible(true);
                        }
                    });
                JButton btnNew = new JButton("New User");
                    btnNew.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent g){
                            newUser.setVisible(true);
                            testLogin.setVisible(false);
                        }
                    });
            panelBottom.add(btnOK);
            panelBottom.add(btnCancel);
            panelBottom.add(btnNew);
        frame.add(panelBottom, BorderLayout.PAGE_END);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new AuthenticationView();
    }
}