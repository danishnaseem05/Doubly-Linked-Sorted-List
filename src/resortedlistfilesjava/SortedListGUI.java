package resortedlistfilesjava;

import javax.swing.*;
import java.awt.*;

public class SortedListGUI extends JFrame {

    JLabel idLabel           = new JLabel     ("ID: ");
    JTextField idTextField   = new JTextField (10);
    JLabel nameLabel         = new JLabel     ("Name: ");
    JTextField nameTextField = new JTextField (10);

    JButton addButton        = new JButton    ("Add");
    JButton deleteButton     = new JButton    ("Delete");
    JButton displayAllButton = new JButton    ("Display All");
    JButton exitButton       = new JButton    ("Exit");

    JTextArea textArea       = new JTextArea  ();


    public SortedListGUI(){

        JPanel flow1Panel  = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JPanel flow2Panel  = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JPanel gridPanel   = new JPanel (new GridLayout (2, 1));
        JPanel borderPanel = new JPanel (new BorderLayout());

        flow1Panel.add  (idLabel);
        flow1Panel.add  (idTextField);
        flow1Panel.add  (nameLabel);
        flow1Panel.add  (nameTextField);

        flow2Panel.add  (addButton);
        flow2Panel.add  (deleteButton);
        flow2Panel.add  (displayAllButton);
        flow2Panel.add  (exitButton);

        gridPanel.add   (flow1Panel);
        gridPanel.add   (flow2Panel);

        borderPanel.add (new JScrollPane(textArea), BorderLayout.CENTER);
        borderPanel.add (gridPanel, BorderLayout.SOUTH);

        add             (borderPanel);

    }


    public static void main (String[] args){

        SortedListGUI app = new SortedListGUI ();
        app.setSize                  (400, 600);
        app.setLocation              (600, 200);
        app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        app.setVisible               (true);

    }


}
