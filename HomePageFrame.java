package Project;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

class HomePageFrame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    //... Components
    public static JButton    signin = new JButton("Login");
    public static JButton    register    = new JButton("Sign up");
    public static JButton    course    = new JButton("Courses Overview");
    public static JLabel text = new JLabel("<html><p>Please select one of the following options to proceed further:</p></html>");
    
    private static void createAndShowGUI(){
    	JFrame frame = new JFrame("Elearning - HomePage");
    	addComponentsToPane(frame.getContentPane());
    	frame.pack();
   	 frame.setVisible(true);
    }
    public static void addComponentsToPane(Container content)
    {
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setBackground(Color.WHITE);
        content.setForeground(Color.BLACK);
        content.add(new JLabel("<html><p><br></p></html>"));
        text.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        content.add(text);
        content.add(new JLabel("<html><p><br></p></html>"));
        signin.setAlignmentX(Component.CENTER_ALIGNMENT);
        content.add(signin);
        content.add(new JLabel("<html><p><br></p></html>"));
        register.setAlignmentX(Component.CENTER_ALIGNMENT);
        content.add(register);
        content.add(new JLabel("<html><p><br></p></html>"));
        course.setAlignmentX(Component.CENTER_ALIGNMENT);
        content.add(course);
        
		signin.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
		      {
		        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	LoginFrame login = new LoginFrame();
		            	login.setVisible(true);
		            }
		        });
		        
		    }
		});
		register.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
		      {
		        // display/center the jdialog when the button is pressed
		    	  System.out.println("You clicked the button"); 
		    }
		});
		course.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
		      {
		        // display/center the jdialog when the button is pressed
		    	  System.out.println("You clicked the button"); 
		    }
		});
    }

	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.equals("signin"))
		{	JOptionPane.showMessageDialog(null, "Hello");
		}
	}    
    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
    
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
