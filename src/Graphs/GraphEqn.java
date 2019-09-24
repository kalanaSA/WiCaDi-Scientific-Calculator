package Graphs;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraphEqn extends JFrame implements ActionListener{

	GraphComponent graphArea;
	JTextField inputField;
        
        //Center on the screen
    private void setCenterScreen(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int locX = dim.width/2 - this.getWidth()/2;
        int locY = dim.height/2 - this.getHeight()/2;
        this.setLocation(locX,locY);
    }
	
	public GraphEqn(String formula) {
		super("Graph maker");
		
		//Main panel
		JPanel mainPanel = new JPanel(new BorderLayout());
		//Inputs: text field and Draw button
		JPanel inputs = new JPanel();
		//text field
		inputField = new JTextField(30);
		//button
		JButton button = new JButton("Draw");
		//Add a function to the button
		button.addActionListener(this);
		//Add the text field and the button to the inputs panel
		inputs.add(inputField);
		inputs.add(button);
		//Add the inputs panel to the main one
		mainPanel.add(inputs, BorderLayout.NORTH);
		//Add an area for functions' graphs
		graphArea = new GraphComponent();
		//Add it to the main panel
		mainPanel.add(graphArea);
		//Add the main panel to the default panel
		super.getContentPane().add(mainPanel);
		//Set automatically the best size for each element
		super.pack();
		//Set the frame visible
		super.setVisible(true);
                this.setCenterScreen();
                
                
                inputField.setText(formula);
                button.doClick();
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
			/*We added this listener only to the Draw button
			 therefore we know for sure that was the element clicked
			 */
			//Update the equation
			graphArea.equation = "y="+inputField.getText();
			//repaint the graph area
			graphArea.repaint();
	}
}