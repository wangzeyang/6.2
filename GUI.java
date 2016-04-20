import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel label1;
	private JButton button;
	private JTextField txtbox;
	private JTextField txtbox1;
public GUI (){
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(300, 400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	panel=new JPanel();
	panel.setBackground(Color.BLUE);

	label = new JLabel();
	label.setText("enter number");
	label1 =new JLabel();
	label1.setText("----------");
	
	txtbox = new JTextField(20);
	txtbox1 = new JTextField(20);
	
	
	button =new JButton();
	button.setText("find sum of this two number");
	
	button.addActionListener(this);
	
	frame.add(panel ); 
	panel.add(label);
	panel.add(txtbox);
	panel.add(txtbox1);
	panel.add(button);
	panel.add(label1);
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double s1=Double.parseDouble(txtbox.getText());
		double s2=Double.parseDouble(txtbox1.getText());
		JOptionPane.showMessageDialog(null, s1+s2);
	}
}