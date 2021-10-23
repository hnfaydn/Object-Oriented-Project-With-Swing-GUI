import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class şanskutusu extends JFrame implements ActionListener
{	
	JFrame anaframe;
	JPanel mainpanel,kutupanel,butonpanel,labelpaneli,boşpanel,boşpanel2;
	JButton exit,confirm,boşbuton;
	JLabel oinfo, o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,wellcome,info,gifimage,boşinfolabel,kutufiyatı;
	ImageIcon gif;
	int x ;
	
	şanskutusu()
	{
		anaframe = new JFrame("Lucky Box");
		mainpanel = new JPanel();
		mainpanel.setBackground(Color.darkGray);
		kutupanel = new JPanel(new GridLayout(1,3));
		labelpaneli = new JPanel(new GridLayout(13,1));
		labelpaneli.setBackground(Color.darkGray);
		butonpanel = new JPanel(new GridLayout(1,7));
		
		butonpanel.setBackground(Color.DARK_GRAY);
		boşpanel = new JPanel();
		boşpanel.setBackground(Color.darkGray);
		boşpanel2 = new JPanel();
		boşpanel2.setBackground(Color.darkGray);
		
		oinfo = new JLabel("You will recieve Credits with those luck");
		oinfo.setForeground(Color.RED);
		oinfo.setBackground(Color.darkGray);
		oinfo.setFont(oinfo.getFont().deriveFont(14.0f));
		
		o1 = new JLabel("100 kredit %10 luck");
		o1.setForeground(Color.RED);
		o1.setBackground(Color.darkGray);
		o1.setFont(o1.getFont().deriveFont(14.0f));
		
		o2 = new JLabel("250 kredit %15 luck");
		o2.setForeground(Color.RED);
		o2.setBackground(Color.darkGray);
		o2.setFont(o2.getFont().deriveFont(14.0f));
		
		o3 = new JLabel("500 kredit %25 luck");
		o3.setForeground(Color.RED);
		o3.setBackground(Color.darkGray);
		o3.setFont(o3.getFont().deriveFont(14.0f));
		
		o4 = new JLabel("1000 kredit %25 luck");
		o4.setForeground(Color.RED);
		o4.setBackground(Color.darkGray);
		o4.setFont(o4.getFont().deriveFont(14.0f));
		
		o5 = new JLabel("2000 kredit %5 luck");
		o5.setForeground(Color.RED);
		o5.setBackground(Color.darkGray);
		o5.setFont(o5.getFont().deriveFont(14.0f));
		
		o6 = new JLabel("3000 kredit %5 luck");
		o6.setForeground(Color.RED);
		o6.setBackground(Color.darkGray);
		o6.setFont(o6.getFont().deriveFont(14.0f));
		
		o7 = new JLabel("4000 kredit %5 luck");
		o7.setForeground(Color.RED);
		o7.setBackground(Color.darkGray);
		o7.setFont(o7.getFont().deriveFont(14.0f));
		
		o8 = new JLabel("5000 kredit %2,5 luck");
		o8.setForeground(Color.RED);
		o8.setBackground(Color.darkGray);
		o8.setFont(o8.getFont().deriveFont(14.0f));
		
		o9 = new JLabel("6000 kredit %2,5 luck");
		o9.setForeground(Color.RED);
		o9.setBackground(Color.darkGray);
		o9.setFont(o9.getFont().deriveFont(14.0f));
		
		o10 = new JLabel("7500 kredit %2,5 luck");
		o10.setForeground(Color.RED);
		o10.setBackground(Color.darkGray);
		o10.setFont(o10.getFont().deriveFont(14.0f));
		
		o11 = new JLabel("10000 kredit %2,5 luck");
		o11.setForeground(Color.RED);
		o11.setBackground(Color.darkGray);
		o11.setFont(o11.getFont().deriveFont(14.0f));
		
		kutufiyatı = new JLabel("1000 Credit pay to per box");
		kutufiyatı.setForeground(Color.RED);
		kutufiyatı.setBackground(Color.darkGray);
		
		boşinfolabel = new JLabel("");
		boşinfolabel.setForeground(Color.RED);
		boşinfolabel.setBackground(Color.BLACK);
		boşinfolabel.setFont(boşinfolabel.getFont().deriveFont(14.0f));
		gif = new ImageIcon("şanskutusu.gif");
		gifimage = new JLabel(gif);
		
		exit = new JButton("Exit");
		exit.addActionListener(this);
		exit.setForeground(Color.RED);
		exit.setBackground(Color.BLACK);
		confirm = new JButton("Buy a random box");
		confirm.setForeground(Color.WHITE);
		confirm.setBackground(Color.black);
		confirm.addActionListener(this);
		
		
		labelpaneli.add(kutufiyatı);
		labelpaneli.add(oinfo);
		labelpaneli.add(o1);
		labelpaneli.add(o2);
		labelpaneli.add(o3);
		labelpaneli.add(o4);
		labelpaneli.add(o5);
		labelpaneli.add(o6);
		labelpaneli.add(o7);
		labelpaneli.add(o8);
		labelpaneli.add(o9);
		labelpaneli.add(o10);
		labelpaneli.add(o11);
		
		butonpanel.add(confirm);
		butonpanel.add(boşinfolabel);
		
		
		kutupanel.add(labelpaneli);
		kutupanel.add(gifimage);
		kutupanel.add(boşpanel2);
		
		mainpanel.add(kutupanel , BorderLayout.CENTER);
		
		mainpanel.add(butonpanel , BorderLayout.SOUTH);
		
		anaframe.add(mainpanel);
		anaframe.add(exit, BorderLayout.SOUTH);
		
		anaframe.setSize(900,500);
		anaframe.setResizable(false);
		anaframe.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==confirm) 
		{
			if(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i)) >= inter.şanskutusufiyatı) 
			{
				MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))-inter.şanskutusufiyatı));
				
				x = (int) (Math.random()*10000);
				
				if(x >= 0 && x <1000) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+100));
					boşinfolabel.setText("100 Credit added in your account");
					
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
					
				}
				if(x >= 1000 && x <2500) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+250));
					boşinfolabel.setText("250 Credit added in your account");
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
				}
				if(x >= 2500 && x <5000) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+500));
					boşinfolabel.setText("500 Credit added in your account");
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
				}
				if(x >= 5000 && x <7500) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+1000));
					boşinfolabel.setText("1000 Credit added in your account");
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
				}
				if(x >= 7500 && x <8000) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+2000));
					boşinfolabel.setText("2000 Credit added in your account");
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
				}
				if(x >= 8000 && x <8500) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+3000));
					boşinfolabel.setText("3000 Credit added in your account");
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
				}
				if(x >= 8500 && x <9000) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+4000));
					boşinfolabel.setText("4000 Credit added in your account");
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
				}
				if(x >= 9000 && x <9250) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+5000));
					boşinfolabel.setText("5000 Credit added in your account");
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
				}
				if(x >= 9250 && x <9500) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+6000));
					boşinfolabel.setText("6000 Credit added in your account");
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
				}
				if(x >= 9500 && x <9750) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+7500));
					boşinfolabel.setText("7500 Credit added in your account");
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
				}
				if(x >= 9750 && x <10000) 
				{
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+10000));
					boşinfolabel.setText("10000 Credit added in your account");
					anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
				}
				
				
			}
			else 
			{
				boşinfolabel.setText("Insufficient Credit to buy");
			}
		}
		if(e.getSource()==exit) 
		{
			anaframe.setVisible(false);
		}
	}

}
