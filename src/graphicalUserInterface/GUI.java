package graphicalUserInterface;

import resortedlistfilesjava.SortedList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

public class GUI extends JFrame {

    private JTextArea textArea;
    private JButton displayBtn;
    private JButton addBtn;
    private JButton removeBtn;


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI();
            }
        });
    }

    public GUI(){
        super("Sorted Doubly Linked List");

        setLayout(new BorderLayout());
        SortedList<Integer> list = new SortedList<>();
        Random rand = new Random();
        final Iterator<Integer>[] listIt = new Iterator[]{list.iterator()};


        textArea = new JTextArea();
        displayBtn = new JButton("Display All List Items");
        displayBtn.setPreferredSize(new Dimension(50, 50));

        removeBtn = new JButton("Remove");
        addBtn = new JButton("Add");


        displayBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(listIt[0].hasNext()){
                    while(listIt[0].hasNext()){
                        textArea.append(listIt[0].next() +"\n");
                    }
                }
                else{
                    textArea.append("Sorry! the list is empty\n");
                }
            }
        });

       addBtn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               list.add(rand.nextInt(100));
               listIt[0] = list.iterator();
           }
       });

        add(textArea, BorderLayout.CENTER);
        add(displayBtn, BorderLayout.SOUTH);
        add(removeBtn, BorderLayout.LINE_END);
        add(addBtn, BorderLayout.LINE_START);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
