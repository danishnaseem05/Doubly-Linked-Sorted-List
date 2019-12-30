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
    private Toolbar toolbar;

    private JButton displayBtn;
    private JButton addBtn;
    private JButton removeBtn;

    private SortedList<Integer> myList;
    private Iterator<Integer> myListIt;

    private Random rand;


    public MainFrame(){
        super("Sorted Doubly Linked List");
        setLayout(new BorderLayout());

        myList = new SortedList<>();
        myListIt = myList.iterator();

        rand = new Random();

        textPanel = new TextPanel();
        toolbar = new Toolbar();

        displayBtn = new JButton("Display All List Items");
        displayBtn.setPreferredSize(new Dimension(50, 50));
        removeBtn = new JButton("Remove");
        addBtn = new JButton("Add");

        setDisplayBtnActionListener();
        setAddBtnActionListener();
        setRemoveBtnActionListener();

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(displayBtn, BorderLayout.SOUTH);
        add(removeBtn, BorderLayout.LINE_END);
        add(addBtn, BorderLayout.LINE_START);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



    private void setDisplayBtnActionListener(){
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
    }


    private void setAddBtnActionListener(){
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myList.add(rand.nextInt(100));
                myListIt = myList.iterator();
            }
        });
    }


    //TODO
    private void setRemoveBtnActionListener() {

    }


}
