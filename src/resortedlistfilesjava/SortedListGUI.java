package resortedlistfilesjava;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public class SortedListGUI extends JFrame {

    // Constants:


    // GUI Components:
    JTextArea  textArea           = new JTextArea  ();
    JLabel     numberLabel        = new JLabel     ("Number: ");
    JTextField numberTextField    = new JTextField (10);

    JButton    addButton        = new JButton    ("Add");
    JButton    deleteButton     = new JButton    ("Delete");
    JButton    displayAllButton = new JButton    ("Display All");
    JButton    exitButton       = new JButton    ("Exit");

    // Class Instance Data:
    private SortedList<Integer> myList = new SortedList<>();


    public SortedListGUI(){
        super("Sorted Unique Integer Doubly Linked List");

        JPanel flow1Panel  = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JPanel flow2Panel  = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JPanel gridPanel   = new JPanel (new GridLayout (2, 1));

        textArea.setEditable (false);

        flow1Panel.add  (numberLabel);
        flow1Panel.add  (numberTextField);

        flow2Panel.add  (addButton);
        flow2Panel.add  (deleteButton);
        flow2Panel.add  (displayAllButton);
        flow2Panel.add  (exitButton);

        gridPanel.add (flow1Panel);
        gridPanel.add (flow2Panel);

        add (new JScrollPane(textArea), BorderLayout.CENTER);
        add (gridPanel,                 BorderLayout.SOUTH);

        addButton.addActionListener        (event -> addNumber ());
        deleteButton.addActionListener     (event -> deleteNumber ());
        displayAllButton.addActionListener (event -> displayAllNumbers ());
        exitButton.addActionListener       (event -> exit ());

    }


    private  void addNumber(){
        String input = numberTextField.getText();

        // Clear the text field are getting the number
        numberTextField.setText("");

        if(input.equals("") || input.equals(" ")){
            // Prompt the user to give a number
            JOptionPane.showMessageDialog(null,"Error: Please enter a number");
            return;
        }

        try{
            Integer num = Integer.parseInt(input);

            if(myList.indexOf(num) != -1){
                // Prompt the user to give a number
                JOptionPane.showMessageDialog(null, "Error: Given number " + num + " already exists");
            }
            else{
                myList.add(num);
                textArea.append("Number " + num + " has been added to the list\n");
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter a valid integer");
        }
    }


    private void deleteNumber(){
        String input = numberTextField.getText();

        // Clear the text field are getting the number
        numberTextField.setText("");

        if(input.equals("") || input.equals(" ")){
            // Prompt the user to give a number
            JOptionPane.showMessageDialog(null,"Error: Please enter a number");
            return;
        }

        try {
            Integer num = Integer.parseInt(input);
            if(myList.indexOf(num) == -1){
                // Prompt user that the number is not in the list
                JOptionPane.showMessageDialog(null, "Error: Number is not in the List");
            }
            else{
                myList.remove(num);
                textArea.append("Number " + num + " has been removed from the list\n");
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter a valid integer");
        }
    }


    private void displayAllNumbers(){
        Iterator<Integer> myListIt = myList.iterator();

        if(!myList.isEmpty()){
            // Clear Text Area then append the elements of the list to it
            textArea.setText("");
            while(myListIt.hasNext()){
                textArea.append(myListIt.next() + "\n");
            }
        }
        else{
            // Prompt user that list is empty
            JOptionPane.showMessageDialog(null, "Error: The List is empty");
        }
    }


    private void exit(){



    }


    public static void main (String[] args){

        SortedListGUI app = new SortedListGUI ();
        app.setSize                  (600, 600);
        app.setLocation              (450, 220);
        app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        app.setVisible               (true);

    }


}
