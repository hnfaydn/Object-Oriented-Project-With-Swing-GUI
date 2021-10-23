import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class community extends JFrame implements ActionListener
{
	JFrame anaframe;
	JLabel icon;
	ImageIcon resim;
	JButton exit;
	
	community()
	{
		anaframe = new JFrame();
		exit = new JButton("Exit");
		exit.addActionListener(this);
		exit.setBackground(Color.DARK_GRAY);
		exit.setForeground(Color.WHITE);
		resim = new ImageIcon("forum.jpg");
		icon = new JLabel(resim);
		
		anaframe.add(exit, BorderLayout.SOUTH);
		anaframe.add(icon, BorderLayout.CENTER);
		anaframe.setSize(1900,950);
		anaframe.setResizable(false);
		anaframe.setLocationRelativeTo(null);
		anaframe.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit) 
		{
			anaframe.setVisible(false);
		}
		
	}
}
