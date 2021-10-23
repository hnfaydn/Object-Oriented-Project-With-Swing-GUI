import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

import javax.swing.*;

public class news extends JFrame implements ActionListener {

	JFrame anaframe;
	JPanel anapanel,haber1,haber2,haber3;
	JLabel news,resim1,resim2,resim3;
	JTextArea yazı1,yazı2,yazı3;
	JButton exit,resimb,resimi,resimü;
	ImageIcon r1,r2,r3;
	news()
	{
		anaframe = new JFrame("News");
		anaframe.setBackground(Color.DARK_GRAY);
		anapanel = new JPanel(new GridLayout(3,2));
		haber1 = new JPanel();
		haber2 = new JPanel();
		haber3 = new JPanel();
		exit = new JButton("Exit");
		exit.addActionListener(this);
		exit.setBackground(Color.DARK_GRAY);
		exit.setForeground(Color.WHITE);
		news = new JLabel("NEWS");
		news.setFont(news.getFont().deriveFont(20.0f));
		news.setBackground(Color.DARK_GRAY);
		news.setForeground(Color.red);
		r1 = new ImageIcon("news/r1.png");
		resim1 = new JLabel(r1);
		r2 = new ImageIcon("news/r2.png");
		resim2 = new JLabel(r2);
		r3 = new ImageIcon("news/r3.png");
		resim3 = new JLabel(r3);

		anapanel.setBackground(Color.DARK_GRAY);
		
		
		yazı1 = new JTextArea();
		yazı1.setEditable(false);
		yazı1.setText("KREDITS PURCHASE NOTICE\r\n" + 
				"Categories: Article\r\n" + 
				"10 Nov 2017 03:21 UTC\r\n" + 
				"Soldiers!\r\n" + 
				"\r\n" + 
				"There is currently a delay between the time of  Kredits purchase and their receival when using Paypal."
				+ "\n You will however  receieve all the purchased Kredits asap. We are currently investigating the situation."
				+ "\n Thank you for your understanding.");
		yazı2 = new JTextArea();
		yazı2.setEditable(false);
		yazı2.setText("NEW EXPERIMENTAL PVP GAME MODE: BATTLE ROYALE!\r\n" + 
				"Categories: Article\r\n" + 
				"10 Nov 2017 09:50 UTC\r\n" + 
				"Soldier, this is by far the toughest challenge of the year — the new game mode will require you to be always on the ready,"
				+ "\n it’s Battle Royale. The game mode will be available in the next update, only for a limited time.");
		yazı3 = new JTextArea();
		yazı3.setEditable(false);
		yazı3.setText("SVK-AS – NOW IN STORE\r\n" + 
				"Categories: Article\r\n" + 
				"10 Nov 2017 08:26 UTC\r\n" + 
				"There’s no room for compromise in precision shooting. If you agree with this statement, SVK-AS is the sniper rifle you’re looking for.");
		
		yazı1.setBackground(Color.DARK_GRAY);
		yazı1.setForeground(Color.WHITE);
		yazı2.setBackground(Color.DARK_GRAY);
		yazı2.setForeground(Color.WHITE);
		yazı3.setBackground(Color.DARK_GRAY);
		yazı3.setForeground(Color.WHITE);
		

		anapanel.add(resim1);
		anapanel.add(yazı1);
		anapanel.add(resim2);
		anapanel.add(yazı2);
		anapanel.add(resim3);
		anapanel.add(yazı3);
		
		anaframe.add(anapanel, BorderLayout.CENTER);
		anaframe.add(exit , BorderLayout.SOUTH);
		anaframe.add(news, BorderLayout.NORTH);
		
		anaframe.setSize(1500,780);
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
