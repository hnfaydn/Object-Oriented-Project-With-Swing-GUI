import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.*;

public class buy extends JFrame implements ActionListener {
	
	
	JFrame mainframe;
	JPanel mainpanel,labelpanel;
	JButton r16,fararm,karkom,twm,ay,axe,exit,b4;
	JLabel mainguns,secondaryguns,meleeweapon,b1,b2,b3,b5,b6;
	ImageIcon r16a4,far,kar,twmx,ay2,axet;
	Timer newtimer;
	Object r16a44,fararmm,karkomm,twmm,at2266,axee;
	static int x;
	
	static int total;
	int i = Üyegirişi.i;
	buy()
	{
		r16a4 r1 = new r16a4();
		fararm f1 = new fararm();
		karkom k1 = new karkom();
		twm t1 = new twm();
		ay226 a1 = new ay226();
		axe ax1 = new axe();
		
		mainframe = new JFrame("Market Place");
		mainpanel = new JPanel(new GridLayout(4,3));
		mainpanel.setBackground(Color.DARK_GRAY);
		labelpanel = new JPanel(new GridLayout(1,3));
		mainguns = new JLabel("Primary weapons");
		secondaryguns = new JLabel("Secondary Weapons");
		meleeweapon = new JLabel("Melee Weapons");
		exit = new JButton("Buy That End of the Shop");
		exit.addActionListener(this);
		exit.setBackground(Color.DARK_GRAY);
		exit.setForeground(Color.WHITE);
		
		
		
		b1 = new JLabel();
		b2 = new JLabel();
		b3 = new JLabel();
		b4 = new JButton("Cancel");
		b4.addActionListener(this);
		b4.setBackground(Color.DARK_GRAY);
		b4.setForeground(Color.WHITE);
		b4.setFont(b4.getFont().deriveFont(40.0f));
		b5 = new JLabel();
		b6 = new JLabel();
		
		r16 = new JButton();
		r16.addActionListener(this);
		r16a4 = new ImageIcon(r1.getPath());
		r16.setIcon(r16a4);
		
		fararm = new JButton();
		fararm.addActionListener(this);
		far = new ImageIcon(f1.getPath());
		fararm.setIcon(far);
		
		karkom = new JButton();
		karkom.addActionListener(this);
		kar = new ImageIcon(k1.getPath());
		karkom.setIcon(kar);
		
		twm = new JButton();
		twm.addActionListener(this);
		twmx = new ImageIcon(t1.getPath());
		twm.setIcon(twmx);
		
		ay = new JButton();
		ay.addActionListener(this);
		ay2 = new ImageIcon(a1.getPath());
		ay.setIcon(ay2);
		
		axe = new JButton();
		axe.addActionListener(this);
		axet = new ImageIcon(ax1.getPath());
		axe.setIcon(axet);
		
		r16.setBackground(Color.DARK_GRAY);
		fararm.setBackground(Color.DARK_GRAY);
		karkom.setBackground(Color.DARK_GRAY);
		twm.setBackground(Color.DARK_GRAY);
		ay.setBackground(Color.DARK_GRAY);
		axe.setBackground(Color.DARK_GRAY);
		
		b6.setFont(b6.getFont().deriveFont(20.0f));
		b6.setForeground(Color.WHITE);
		b5.setFont(b6.getFont().deriveFont(20.0f));
		b5.setForeground(Color.RED);
		mainpanel.add(r16);
		mainpanel.add(ay);
		mainpanel.add(axe);
		mainpanel.add(fararm);
		mainpanel.add(b1);
		mainpanel.add(b2);
		mainpanel.add(karkom);
		mainpanel.add(b3);
		mainpanel.add(b4);
		mainpanel.add(twm);
		mainpanel.add(b5);
		mainpanel.add(b6);
		mainguns.setFont(mainguns.getFont().deriveFont(20.0f));
		secondaryguns.setFont(secondaryguns.getFont().deriveFont(20.0f));
		meleeweapon.setFont(meleeweapon.getFont().deriveFont(20.0f));
		labelpanel.add(mainguns);
		labelpanel.add(secondaryguns);
		labelpanel.add(meleeweapon);
		exit.setFont(exit.getFont().deriveFont(20.0f));
		mainframe.add(exit, BorderLayout.SOUTH);
		mainframe.add(mainpanel, BorderLayout.CENTER);
		mainframe.add(labelpanel, BorderLayout.NORTH);
		
		mainframe.setSize(1600,900);
		mainframe.setResizable(false);
		mainframe.setLocationRelativeTo(null);
		mainframe.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource()==r16) 
		{
			int y = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i));
			if(y >= inter.primaryweaponskredits) 
			{
				MainClass.silahlar.set(Üyegirişi.i*3, "R16A4");
				 x = y-inter.primaryweaponskredits;
				
				MainClass.krediler.set(Üyegirişi.i, String.valueOf(x));
				total += inter.primaryweaponskredits;
				b6.setText("Total shop credits amount is \n "+total);
				
				
			}
			else 
			{
				b5.setText("You don't have enough \n credit for this purcase");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		
	                      b5.setText("");            
	                 }
	             };
	             newtimer.schedule(check,3000); 
			}
				
		}
		
		if(e.getSource()==fararm) 
		{
			int y = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i));
			if(y >= inter.primaryweaponskredits) 
			{
				MainClass.silahlar.set(Üyegirişi.i*3, "Fararm ATF12");
				 x = y-inter.primaryweaponskredits;
				
				MainClass.krediler.set(Üyegirişi.i, String.valueOf(x));
				total += inter.primaryweaponskredits;
				b6.setText("Total shop credits amount is \n "+total);
				
			}
			else 
			{
				b5.setText("You don't have enough \n credit for this purcase");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		
	                      b5.setText("");            
	                 }
	             };
	             newtimer.schedule(check,3000); 
			}
		}
		if(e.getSource()==karkom) 
		{
			 int y = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i));
			if(y >= inter.primaryweaponskredits) 
			{
				MainClass.silahlar.set(i, "Karkom");
				 x = y-inter.primaryweaponskredits;
				
				MainClass.krediler.set(Üyegirişi.i*3, String.valueOf(x));
				total += inter.primaryweaponskredits;
				b6.setText("Total shop credits amount is \n "+total);
			}
			else 
			{
				b5.setText("You don't have enough \n credit for this purcase");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		
	                      b5.setText("");            
	                 }
	             };
	             newtimer.schedule(check,3000); 
			}
		}
		if(e.getSource()==twm) 
		{
			int y = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i));
			if(y >= inter.primaryweaponskredits) 
			{
				MainClass.silahlar.set(i, "TWM X308");
				 x = y-inter.primaryweaponskredits;
				
				MainClass.krediler.set(Üyegirişi.i*3, String.valueOf(x));
				total += inter.primaryweaponskredits;
				b6.setText("Total shop credits amount is \n "+total);
			}
			else 
			{
				b5.setText("You don't have enough \n credit for this purcase");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		
	                      b5.setText("");            
	                 }
	             };
	             newtimer.schedule(check,3000); 
			}
		}
		if(e.getSource()==ay) 
		{
			int y = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i));
			if(y >= inter.secondaryweaponskredits) 
			{
				MainClass.silahlar.set((Üyegirişi.i*3)+1, "AY 226");
				 x = y-inter.secondaryweaponskredits;
				
				MainClass.krediler.set(Üyegirişi.i, String.valueOf(x));
				total += inter.secondaryweaponskredits;
				b6.setText("Total shop credits amount is \n "+total);
			}
			else 
			{
				b5.setText("You don't have enough \n credit for this purcase");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		
	                      b5.setText("");            
	                 }
	             };
	             newtimer.schedule(check,3000); 
			}
		}
		if(e.getSource()==axe) 
		{
			int y = Integer.parseInt(MainClass.krediler.get(i));
			if(y >= inter.meleeweaponskredits) 
			{
				MainClass.silahlar.set((Üyegirişi.i*3)+2, "Tactical Axe");
				 x = y-inter.meleeweaponskredits;
				
				MainClass.krediler.set(Üyegirişi.i, String.valueOf(x));
				total += inter.meleeweaponskredits;
				b6.setText("Total shop credits amount is \n "+total);
			}
			else 
			{
				b5.setText("You don't have enough \n credit for this purcase");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		
	                      b5.setText("");            
	                 }
	             };
	             newtimer.schedule(check,3000); 
			}
		}
		
		if(e.getSource()==exit) 
		{
			
			mainframe.setVisible(false);
			total = 0;
			anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
		}
		
		if(e.getSource()==b4) 
		{
			MainClass.krediler.set(Üyegirişi.i, String.valueOf(x+total));
			total =0;
			mainframe.setVisible(false);
			new buy();
			
		}
	}

	

}
