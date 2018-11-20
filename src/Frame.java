import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {


    void createFrame(){
        setTitle("Converter");
        setSize(500,365);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Panel());
        setVisible(true);
       // panel.createPanel();
    }


}
