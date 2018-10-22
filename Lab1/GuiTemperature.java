import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuiTemperature{
    private JTextField txt_input;
    private JTextField txt_output;

    public GuiTemperature(){
        init();
    }

    public void init(){
        JFrame frame = new JFrame();
        frame.setSize(800,70);
        frame.setLayout(new FlowLayout());

            JLabel lbl_input = new JLabel("Temperature in Fahrenheit : ");
        frame.add(lbl_input);

            txt_input = new JTextField(15);
        frame.add(txt_input);

            JButton btn_process = new JButton("Convert");
            btn_process.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String input = txt_input.getText();
                    Double obj_input = new Double(input);

                    double double_input = obj_input.doubleValue();

                    Temperature temperature = new Temperature();
                    double double_temperature = temperature.convertTemperaturetoCelsius(double_input);

                    Double obj_output = new Double(double_temperature);
                    String output = obj_output.toString();
                    txt_output.setText(output);

                    txt_input.setText("");
            }
        });

        frame.add(btn_process);

            txt_output = new JTextField(15);
            txt_output.setEditable(false);
        frame.add(txt_output);

        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }
    public static void main (String[] args){
        new GuiTemperature();
    }
}
