import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

public class support extends JFrame implements ActionListener{
	
	JComboBox problem;
	JFrame anaframe;
	JLabel photo;
	JLabel uyarı;
	String [] seçim = {"Game","Password","Buying Problem","Selling Problem","İllegal Program","Complain user"};
	
	support()
	{
		
		 problem = new JComboBox(seçim);
		 problem.addActionListener(this);
		 anaframe = new JFrame("Support Services");
		ImageIcon support = new ImageIcon("support.jpg");
		 photo = new JLabel(support);
		 uyarı = new JLabel("Our Custormer Support Services is busy please define your problem for re-call");
		anaframe.add(photo);
		anaframe.add(problem,BorderLayout.SOUTH);
		uyarı.setSize(1600,600);
		uyarı.setFont(uyarı.getFont().deriveFont(35.0f));
		anaframe.add(uyarı,BorderLayout.NORTH);
		
		anaframe.setSize(1600,900);
		anaframe.setResizable(false);
		anaframe.setLocationRelativeTo(null);
		anaframe.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(problem.getSelectedItem()=="Game" ||problem.getSelectedItem()=="Password" ||problem.getSelectedItem()=="Buying Problem" ||problem.getSelectedItem()=="Selling Problem" ||problem.getSelectedItem()=="İllegal Program" ||problem.getSelectedItem()=="Complain user")
		{
			uyarı.setText("Your Problem recieved We Will Send an E-mail For your problem");
			Timer myTimer=new Timer();
            TimerTask exit =new TimerTask() 
             {
            	@Override
            	 public void run() 
                 {
            		 anaframe.setVisible(false);      
                                  
                 }
             };
 
             myTimer.schedule(exit,5000);
		}
		
	}
}
