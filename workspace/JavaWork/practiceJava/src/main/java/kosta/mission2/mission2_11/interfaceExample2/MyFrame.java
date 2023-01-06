package kosta.mission2.mission2_11.interfaceExample2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame implements ActionListener, WindowListener {
    public static void main(String[] args) {
        new MyFrame();
    }

    public MyFrame(){
        Button button = new Button("Button");
        add(button);
        button.addActionListener(this);
        addWindowListener(this);

        setSize(300, 200);
        setLocation(300, 200);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Button button = (Button) e.getSource();
        String label = button.getLabel();
        System.out.println(label);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
