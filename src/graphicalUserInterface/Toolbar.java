package graphicalUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel {

    private JButton displayBtn;
    private JButton addBtn;
    private JButton removeBtn;


    public Toolbar(){
        displayBtn = new JButton("Display All");
        removeBtn = new JButton("Remove");
        addBtn = new JButton("Add");

        setLayout(new FlowLayout(FlowLayout.LEFT));



        add(displayBtn, BorderLayout.SOUTH);
        add(removeBtn, BorderLayout.LINE_END);
        add(addBtn, BorderLayout.LINE_START);
    }


}
