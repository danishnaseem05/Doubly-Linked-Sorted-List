package graphicalUserInterface;

import resortedlistfilesjava.SortedList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private JButton displayBtn;
    private JButton addBtn;
    private JButton removeBtn;

    private SortedList<Integer> myList;
    private Iterator<Integer> myListIt;


    public MainFrame(){
        super("Sorted Doubly Linked List");

        setLayout(new BorderLayout());
        myList = new SortedList<>();
        Random rand = new Random();
        myListIt = myList.iterator();


        textPanel = new TextPanel();
        displayBtn = new JButton("Display All List Items");
        displayBtn.setPreferredSize(new Dimension(50, 50));

        removeBtn = new JButton("Remove");
        addBtn = new JButton("Add");


        displayBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!myList.isEmpty()){
                    while(myListIt.hasNext()){
                        textPanel.appendText(myListIt.next() +"\n");
                    }
                }
                else{
                    textPanel.appendText("Sorry! the list is empty\n");
                }
            }
        });

       addBtn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               myList.add(rand.nextInt(100));
               myListIt = myList.iterator();
           }
       });

        add(textPanel, BorderLayout.CENTER);
        add(displayBtn, BorderLayout.SOUTH);
        add(removeBtn, BorderLayout.LINE_END);
        add(addBtn, BorderLayout.LINE_START);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
