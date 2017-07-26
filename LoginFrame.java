package Project;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

class LoginFrame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    //... Components
    private static JTextField name = new JTextField(5);
    private static JTextField username = new JTextField(5);
    private static JTextField password = new JTextField(20);
    private static JTextField email = new JTextField(5);
    private static JTextField mobile = new JTextField(20);
    private static JButton    register    = new JButton("Submit information to register");
    private static JButton    back    = new JButton("Back to home page");
    //======================================================= constructor
    /** Constructor */
    public LoginFrame()
    {
    	JPanel content1 = new JPanel(new GridLayout(5,2));
        content1.add(new JLabel("Name: "));
        content1.add(name);
        this.setContentPane(content1);
    	JPanel content2 = new JPanel();
        content2.add(new JLabel("Username: "));
        content2.add(username);
        this.setContentPane(content2);
    	JPanel content3 = new JPanel();
        content3.add(new JLabel("Password: "));
        content3.add(password);
        this.setContentPane(content3);
    	JPanel content4 = new JPanel(); 
        content4.add(new JLabel("Email: "));
        content4.add(email);
        this.setContentPane(content4);
    	JPanel content5 = new JPanel();
        content5.add(new JLabel("Mobile no.: "));
        content5.add(mobile);
        this.setContentPane(content5);
    	JPanel content = new JPanel();
        content.add(new JLabel("<html><p><br></p></html>"));
        register.setAlignmentX(Component.CENTER_ALIGNMENT);
        content.add(register);
        content.add(new JLabel("<html><p><br></p></html>"));
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        content.add(back);
        register.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
		      {
		        // display/center the jdialog when the button is pressed
		    	  System.out.println("You clicked the button"); 
		    }
		});
        back.addActionListener(new ActionListener()
		{
		      public void actionPerformed(ActionEvent e)
		      {
		        // display/center the jdialog when the button is pressed
		    	  System.out.println("You clicked the button"); 
		    }
		});
   this.pack();
        this .setTitle("Elearning - LoginPage");
   	}

	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.equals("signin"))
		{	JOptionPane.showMessageDialog(null, "Hello");
		}
	}
}
