
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class game extends JFrame implements ActionListener {

	JFrame anaframe;
	JButton exit;
	JPanel mainpanel;
	JTextArea a,b,c,d,e;
	
	game()
	{
		anaframe = new JFrame("About Game");
		exit = new JButton("Exit");
		exit.addActionListener(this);
		exit.setBackground(Color.DARK_GRAY);
		exit.setForeground(Color.WHITE);
		mainpanel = new JPanel(new GridLayout(5,1));
		 a = new JTextArea();
		a.setEditable(false);
		a.setText("Crytek′s explosive free-to-play FPS is now available for download on Warface.com and Steam. Compelling Co-op and fast-paced action are waiting for you every day.\n \n");
		a.setFont(a.getFont().deriveFont(20.0f));
		
		b = new JTextArea(2,1);
		b.setEditable(false);
		b.setText("NEW WORLD ORDER\r\n" + 
				"CONSPIRACY, CORRUPTION, AND CHAOS \n \n");
		b.setFont(a.getFont().deriveFont(20.0f));
		
		c = new JTextArea();
		c.setEditable(false);
		c.setText("VERSUS\r\n" + 
				"STATE YOUR SUPERIORITY\r\n" + 
				"Warface and Blackwood go up against each other in intense Versus match-ups. And with up to eight players on each side, the action always comes thick and fast! \n You can swap roles in-game at any time, maximizing your performance on the battlefield. \n \n");
		c.setFont(a.getFont().deriveFont(20.0f));
		d = new JTextArea();
		d.setEditable(false);
		d.setText("CO-OP\r\n" + 
				"UNITE AND CONQUER\r\n" + 
				"Join forces with friends to annihilate the enemy. In Warface's unique Co-op mode you can play with up to five people to take down Blackwood forces around the globe.\n With new challenges and rewards every day, players of all levels will find something worth fighting for! \n \n");
		d.setFont(a.getFont().deriveFont(20.0f));
		e = new JTextArea();
		e.setEditable(false);
		e.setText("CLASSES\r\n" + 
				"PLAY YOUR PART\r\n" + 
				"Warface offers players four soldier classes with different tactical approaches and advantages: Rifleman, Sniper, Medic, and Engineer.");
		e.setFont(a.getFont().deriveFont(20.0f));
		
		a.setBackground(Color.DARK_GRAY);
		a.setForeground(Color.WHITE);
		b.setBackground(Color.DARK_GRAY);
		b.setForeground(Color.WHITE);
		c.setBackground(Color.DARK_GRAY);
		c.setForeground(Color.WHITE);
		d.setBackground(Color.DARK_GRAY);
		d.setForeground(Color.WHITE);
		e.setBackground(Color.DARK_GRAY);
		e.setForeground(Color.WHITE);
		mainpanel.add(a);
		mainpanel.add(b);
		mainpanel.add(c);
		mainpanel.add(d);
		mainpanel.add(e);
		anaframe.add(exit, BorderLayout.SOUTH);
		anaframe.add(mainpanel , BorderLayout.CENTER);
		anaframe.setSize(1600,900);
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
