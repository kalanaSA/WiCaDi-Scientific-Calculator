package Graphs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import java.util.InputMismatchException;

public class Graph extends JPanel implements ActionListener{
    int count = 0;
    //creates any variables that need to communicate between classes
    Timer tm = new Timer(1, this);
    static GraphDesign mainGraph = new GraphDesign();
    static String parentFunction;
    static double[] trans = new double[6];
    public static final String[] parents = { "Linear", "Quadratic", "Rational", "Exponential", "Logarithmic", "Sinusodial" };
    @Override
    public void paintComponent(Graphics g){
        
       
            
             super.paintComponent(g);
        //draws the grid on the form and starts timer
        mainGraph.drawGrid(g);
        tm.start();
        //sets line color
        g.setColor(Color.RED);
        //figures out which parent function was selected and passes inputs to graph layout to graph
        if(parentFunction.equals("Linear")){
            mainGraph.plotPoints(trans[0], trans[1]);
        }else if(parentFunction.equals("Quadratic")){
            mainGraph.plotPoints(trans[0], trans[1], trans[2]);
        }else if(parentFunction.equals("Rational")){
            mainGraph.plotPoints(trans[0], trans[1], trans[2], trans[3], trans[4], trans[5]);
        }else if(parentFunction.equals("Exponential")){
            mainGraph.plotPoints(trans[0]);
        }else if(parentFunction.equals("Logarithmic")){
            mainGraph.plotPoints(trans[0], trans[1], trans[2], trans[3], trans[4]);
        }else if(parentFunction.equals("Sinusodial")){
             mainGraph.plotPoints(trans[0], trans[1], trans[2], trans[3]);
        }
        //takes the points from graph layout and draws them on the graph
        for(int i = 0;i < count;i++){
            if((mainGraph.getyPoints(i) > 0 && mainGraph.getyPoints(i) < mainGraph.getHeight()) && (mainGraph.gety2Points(i) > 0 && mainGraph.gety2Points(i) < mainGraph.getHeight())){
                g.drawLine(i, mainGraph.getyPoints(i), i - 1, mainGraph.gety2Points(i));  
            }
            
        } 
            
        
                   
    }
    public void actionPerformed(ActionEvent e){
//      creates an effect of drawing from left to right
        if(count < mainGraph.getWidth() ){
            count = count + 5;
            repaint();
        }      
    }
    public void first(){
        
        try{
            
            
        //creates the list box dialogue to choose parent function
        JFrame frame = new JFrame();
        Graph input = new Graph();
        parentFunction = (String) JOptionPane.showInputDialog(frame, 
        "What is the function?",
        "Functions",
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        parents, 
        parents[0]);
        //figures out what parent function was selected then shows the required message box
        if(parentFunction.equals("Linear")){
            input.initalizeInput(2, "Formula: y = ax + b");
        }else if(parentFunction.equals("Quadratic")){
            input.initalizeInput(3, "Formula: y = a(x-b)^2 + c");
        }else if(parentFunction.equals("Rational")){
            input.initalizeInput(6, "Formula: y = (ax^2 + bx + c)/(dx^2 + ex + f)");
        }else if(parentFunction.equals("Exponential")){
            input.initalizeInput(1, "Formula: y = a^x");
        }else if(parentFunction.equals("Logarithmic")){
            input.initalizeInput(5, "Formula: y = a(logb(c(x + d)))+e");
        }else if(parentFunction.equals("Sinusodial")){
            input.initalizeInput(4, "Formula: y = a(sin(b(x + c))) + d");
        }
        //shows the form which is graphed to
        Graph t = new Graph();  
        JFrame jf = new JFrame();
        jf.setTitle("WiCadi Graphing Calculator");
        jf.setSize(mainGraph.getWidth(), mainGraph.getHeight());
        jf.setVisible(true);
        jf.add(t);   
            
        }
        catch(Exception e){
            System.out.println(e);
        }
       
         
    } 
    public void initalizeInput(int inputs, String form){
        //creates the panel and maximum text fields to be displayed
            JPanel myPanel = new JPanel();
            JTextField[] Field = new JTextField[6];
                for (int i = 0;i < inputs;i++ ){
                    //adds a label then text field then horizontal spacing as many times as requested
                    myPanel.add(new JLabel((char)(i + 97) + " value:"));
                    Field[i] = new JTextField(String.valueOf(0));
                    Field[i].setColumns(3);
                    myPanel.add(Field[i]);
                    myPanel.add(Box.createHorizontalStrut(15));
                }
                //creates a confirm dialouge with the panel created
                JOptionPane.showConfirmDialog(null, myPanel, 
                form, JOptionPane.DEFAULT_OPTION);
                for (int i = 0;i < inputs;i++ ){
                    //takes the numbers added to the fields
                    if(mainGraph.isValidInput(Field[i].getText(), "0123456789-.")){
                        trans[i] = Double.parseDouble(Field[i].getText());
                    }else{
                        System.out.println("Invalid Input at field " + (char)(i + 97));
                    }
                }
    }
}

