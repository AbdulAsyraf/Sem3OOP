import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import javafx.scene.layout.Border;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
            JPanel panelTop = new JPanel();
                JLabel lblTitle = new JLabel("Authentication Menu");
            panelTop.add(lblTitle);
        frame.add(panelTop, BorderLayout.PAGE_START);

            JPanel panelBottom = new JPanel();
                JButton btnOK = new JButton("OK");
                JButton btnCancel = new JButton("Cancel");
                JButton btnNew = new JButton("New User");
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