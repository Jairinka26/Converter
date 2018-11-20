import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Calc.CallBack {
    private ICalc iCalc;
    JTextField text = new JTextField();
    JTextField textResult = new JTextField();
    JButton button1 = new JButton("gramm to KG");

     Panel(){
         iCalc = new Calc();
         iCalc.init(this);
        add(text);
        setLayout(null);
        text.setBounds(10,10,100,50);
        text.setFont(new Font("Arial",Font.BOLD,25));
        text.isEditable();

        add(textResult);
        textResult.setBounds(10,70,100,50);
        textResult.setFont(new Font("Arial",Font.BOLD,25));
        textResult.isEditable();

        add(button1);
        button1.setSize(100,50);
        button1.setFont(new Font("Arial",Font.BOLD,10));
        button1.setLocation(120, 10);

        converter();
    }

    void converter (){
        button1.addActionListener(e -> {
                    double gramm = Double.parseDouble(text.getText()) / 1000;
                    iCalc.callCalc(String.valueOf(gramm));
                }
        );
    }

    @Override
    public void callBack(String message) {
        textResult.setText(message);
    }
}
