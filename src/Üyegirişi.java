import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class Üyegirişi extends JFrame implements ActionListener 
{

	static JFrame girişframe;
	static JPanel mainpanel;
	static JTextField nick,şifre,doğrulamakodu;
	static JLabel nick1,şifre1,doğrulamakodu1;
	static JButton confirm;
	static Object o;
	static int i;
	Üyegirişi() 
	{
		
		girişframe = new JFrame("Verification Area");
		confirm = new JButton("Confirm");
		confirm.setForeground(Color.WHITE);
		confirm.setBackground(Color.BLACK);
		confirm.addActionListener(this);
		
		mainpanel = new JPanel(new GridLayout(3,3));
		mainpanel.setForeground(Color.WHITE);
		mainpanel.setBackground(Color.darkGray);
		nick = new JTextField();
		şifre = new JPasswordField();
		doğrulamakodu = new JTextField();
		nick1 = new JLabel("Nick Name :");
		nick1.setForeground(Color.WHITE);
		nick1.setBackground(Color.darkGray);
		şifre1 = new JLabel("Password :");
		şifre1.setForeground(Color.WHITE);
		şifre1.setBackground(Color.darkGray);
		doğrulamakodu1 = new JLabel("Verification code :");
		doğrulamakodu1.setForeground(Color.WHITE);
		doğrulamakodu1.setBackground(Color.darkGray);
		mainpanel.add(nick1);
		nick1.setFont(nick1.getFont().deriveFont(40.0f));
		mainpanel.add(nick);
		nick.setFont(nick.getFont().deriveFont(20.0f));
		mainpanel.add(şifre1);
		şifre1.setFont(şifre1.getFont().deriveFont(40.0f));
		mainpanel.add(şifre);
		şifre.setFont(şifre.getFont().deriveFont(20.0f));
		mainpanel.add(doğrulamakodu1);
		doğrulamakodu1.setFont(doğrulamakodu1.getFont().deriveFont(40.0f));
		mainpanel.add(doğrulamakodu);
		doğrulamakodu.setFont(doğrulamakodu.getFont().deriveFont(20.0f));
		girişframe.add(mainpanel,BorderLayout.CENTER);
		girişframe.add(confirm,BorderLayout.SOUTH);
		girişframe.setSize(800, 400);
		girişframe.setTitle("Verification Area");
		girişframe.setResizable(false);
		girişframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		girişframe.setLocationRelativeTo(null);
		girişframe.setVisible(true);
		
		o=this;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==confirm) 
		{
			
			String name = nick.getText();
			String password = şifre.getText();
			String varicode =doğrulamakodu.getText();
			
			for( i = 0;i<MainClass.kullanıcıadları.size();i++) 
			{
			
				if(name.equals(MainClass.kullanıcıadları.get(i))) 
				{
					if(password.equals(MainClass.şifreler.get(i)))
					{
						if(varicode.equals(MainClass.doğrulamakodları.get(i)))
						{
							
							girişframe.setVisible(false);
							
							
							new anasayfa();
							break;
						}
					}
				}
			}
		}		
	}
}
