import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.*;

import javax.swing.*;

public class media extends JFrame implements ActionListener
{
	JFrame anaframe;
	JButton exit;
	JLabel media;
	ImageIcon mediaa;
	
	media()
	{
		anaframe = new JFrame("Media");
		exit = new JButton("Exit");
		exit.addActionListener(this);
		exit.setBackground(Color.DARK_GRAY);
		exit.setForeground(Color.WHITE);
		mediaa = new ImageIcon("media.jpg");
		media = new JLabel(mediaa);
		
		anaframe.add(exit, BorderLayout.SOUTH);
		anaframe.add(media);
		anaframe.setSize(1580,870);
		anaframe.setResizable(false);
		anaframe.setLocationRelativeTo(null);
		anaframe.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==exit)
		{
			anaframe.setVisible(false);
		}
		
	}
	

}
