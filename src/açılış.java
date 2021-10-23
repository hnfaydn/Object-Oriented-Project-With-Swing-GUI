import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class açılış extends JFrame implements ActionListener
	{
	JFrame açılışekranı ;
	JPanel açılışpaneli  ;
	JLabel üyesorgu;
	JButton kayıtlıüye,yeniüye;
	Object o;
	açılış()
	{
		 açılışekranı = new JFrame("Wellcome To Gürkanface");
		 açılışpaneli = new JPanel(new GridLayout(2,1));
		 üyesorgu = new JLabel("Are you a registered or new player?");
		 üyesorgu.setFont(üyesorgu.getFont().deriveFont(20.0f));
		 kayıtlıüye = new JButton("I am registered user");
		 kayıtlıüye.setBackground(Color.DARK_GRAY);
		 kayıtlıüye.setForeground(Color.white);
		 kayıtlıüye.setFont(kayıtlıüye.getFont().deriveFont(30.0f));
		 kayıtlıüye.addActionListener(this);
		 yeniüye = new JButton("I am a new user");
		 yeniüye.setBackground(Color.DARK_GRAY);
		 yeniüye.setForeground(Color.RED);
		 yeniüye.setFont(yeniüye.getFont().deriveFont(30.0f));
		 yeniüye.addActionListener(this);
		 üyesorgu.setFont(üyesorgu.getFont().deriveFont(15.0f));
		 
		 açılışpaneli.add(kayıtlıüye);
		 açılışpaneli.add(yeniüye);
		 açılışekranı.add(üyesorgu,BorderLayout.NORTH);
		 açılışekranı.add(açılışpaneli,BorderLayout.CENTER);
		 
		 
		 açılışekranı.setSize(600,400);
		 açılışekranı.setTitle("Wellcome to Gürkanface");
		 açılışekranı.setResizable(false);
		 açılışekranı.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 açılışekranı.setLocationRelativeTo(null);
		 açılışekranı.setVisible(true);
		 o=this;
		 
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==kayıtlıüye)
		{
			açılışekranı.setVisible(false);
			 new Üyegirişi();
			
		}
		if(e.getSource()==yeniüye)
		{
			açılışekranı.setVisible(false);
			new Yeniüye();
		}
		
	}
	}

