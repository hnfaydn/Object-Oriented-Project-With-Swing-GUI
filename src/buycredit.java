import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

public class buycredit extends JFrame implements ActionListener
{
	JFrame anaframe;
	JPanel mainpanel,buttonpanel;
	JButton confirm;
	JLabel karti,kartş,wellcome,info;
	JTextField kartno,kartşifre;
	JComboBox kredit;
	Timer newtimer;
	buycredit()
	{
		anaframe = new JFrame("Buying Credits Market");
		mainpanel = new JPanel(new GridLayout(2,2));
		buttonpanel = new JPanel(new GridLayout(3,1));
		confirm = new JButton("Exit");
		confirm.addActionListener(this);
		wellcome = new JLabel("Wellcome Dear "+MainClass.kullanıcıadları.get(Üyegirişi.i));
		karti = new JLabel("Please enter card no :");
		kartş = new JLabel("Please enter card password");
		info = new JLabel("");
		kartno = new JTextField();
		kartşifre = new JPasswordField();
		String[] fiyatlar = {"1000credi-10tl","2000credi-15tl","3000credi-20tl","5000credi-30tl","10000credi-50tl","20000credi-80tl"};
		kredit = new JComboBox(fiyatlar);
		kredit.addActionListener(this);
		
		mainpanel.add(karti);
		mainpanel.add(kartno);
		mainpanel.add(kartş);
		mainpanel.add(kartşifre);
		
		buttonpanel.add(info);
		buttonpanel.add(kredit);
		buttonpanel.add(confirm);
		
		anaframe.add(buttonpanel, BorderLayout.SOUTH);
		anaframe.add(wellcome, BorderLayout.NORTH);
		anaframe.add(mainpanel, BorderLayout.CENTER);
		
		anaframe.setSize(500,300);
		anaframe.setLocationRelativeTo(null);
		anaframe.setVisible(true);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{

		if(e.getSource()==confirm) 
		{
			
		
		
		if(kredit.getSelectedItem()=="1000credi-10tl")
		{
			if(MainClass.kartlar.get(Üyegirişi.i).equals(kartno.getText())) 
			{
				if(MainClass.kartşifreleri.get(Üyegirişi.i).equals(kartşifre.getText()))
				{
					
					info.setText("Correct İnformation thank you for this shop");
					int x = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+1000;
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(x));
			
				}
				else 
				{
					info.setText("Wrong İnformation Plase Cheeck your information");
					newtimer=new Timer();
		            TimerTask check =new TimerTask() 
		             {
		            	@Override
		            	 public void run() 
		                 {
		            		info.setText("");
		            		kartno.setText("");
		            		kartşifre.setText("");
		                                  
		                 }
		             };
		             newtimer.schedule(check,3000);
				}
			}
			else 
			{
				info.setText("Wrong İnformation Plase Cheeck your information");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		info.setText("");
	            		kartno.setText("");
	            		kartşifre.setText("");
	                                  
	                 }
	             };
	             newtimer.schedule(check,3000);
			}
		}
		
		if(kredit.getSelectedItem()=="2000credi-15tl")
		{
			if(MainClass.kartlar.get(Üyegirişi.i).equals(kartno.getText())) 
			{
				if(MainClass.kartşifreleri.get(Üyegirişi.i).equals(kartşifre.getText())) {
					info.setText("Correct İnformation thank you for this shop");
					int x = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+2000;
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(x));
				}
				else 
				{
					info.setText("Wrong İnformation Plase Cheeck your information");
					newtimer=new Timer();
		            TimerTask check =new TimerTask() 
		             {
		            	@Override
		            	 public void run() 
		                 {
		            		info.setText("");
		            		kartno.setText("");
		            		kartşifre.setText("");
		                                  
		                 }
		             };
		             newtimer.schedule(check,3000);
				}
			}
			else 
			{
				info.setText("Wrong İnformation Plase Cheeck your information");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		info.setText("");
	            		kartno.setText("");
	            		kartşifre.setText("");
	                                  
	                 }
	             };
	             newtimer.schedule(check,3000);
			}
		}
		if(kredit.getSelectedItem()=="3000credi-20tl")
		{
			if(MainClass.kartlar.get(Üyegirişi.i).equals(kartno.getText())) 
			{
				if(MainClass.kartşifreleri.get(Üyegirişi.i).equals(kartşifre.getText())) 
				{
					info.setText("Correct İnformation thank you for this shop");
					int x = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+3000;
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(x));
			
				}
				else 
				{
					info.setText("Wrong İnformation Plase Cheeck your information");
					newtimer=new Timer();
		            TimerTask check =new TimerTask() 
		             {
		            	@Override
		            	 public void run() 
		                 {
		            		info.setText("");
		            		kartno.setText("");
		            		kartşifre.setText("");
		                                  
		                 }
		             };
		             newtimer.schedule(check,3000);
				}
			}
			else 
			{
				info.setText("Wrong İnformation Plase Cheeck your information");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		info.setText("");
	            		kartno.setText("");
	            		kartşifre.setText("");
	                                  
	                 }
	             };
	             newtimer.schedule(check,3000);
			}
		}
		if(kredit.getSelectedItem()=="5000credi-30tl")
		{
			if(MainClass.kartlar.get(Üyegirişi.i).equals(kartno.getText())) 
			{
				if(MainClass.kartşifreleri.get(Üyegirişi.i).equals(kartşifre.getText())) 
				{
					info.setText("Correct İnformation thank you for this shop");
					int x = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+5000;
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(x));
				}
				else 
				{
					info.setText("Wrong İnformation Plase Cheeck your information");
					newtimer=new Timer();
		            TimerTask check =new TimerTask() 
		             {
		            	@Override
		            	 public void run() 
		                 {
		            		info.setText("");
		            		kartno.setText("");
		            		kartşifre.setText("");
		                                  
		                 }
		             };
		             newtimer.schedule(check,3000);
				}
			}
			else 
			{
				info.setText("Wrong İnformation Plase Cheeck your information");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		info.setText("");
	            		kartno.setText("");
	            		kartşifre.setText("");
	                                  
	                 }
	             };
	             newtimer.schedule(check,3000);
			}
		}
		if(kredit.getSelectedItem()=="10000credi-50tl")
		{
			if(MainClass.kartlar.get(Üyegirişi.i).equals(kartno.getText())) 
			{
				if(MainClass.kartşifreleri.get(Üyegirişi.i).equals(kartşifre.getText())) 
				{
					info.setText("Correct İnformation thank you for this shop");
					int x = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+10000;
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(x));
				}
				else 
				{
					info.setText("Wrong İnformation Plase Cheeck your information");
					newtimer=new Timer();
		            TimerTask check =new TimerTask() 
		             {
		            	@Override
		            	 public void run() 
		                 {
		            		info.setText("");
		            		kartno.setText("");
		            		kartşifre.setText("");
		                                  
		                 }
		             };
		             newtimer.schedule(check,3000);
				}
			}
			else 
			{
				info.setText("Wrong İnformation Plase Cheeck your information");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		info.setText("");
	            		kartno.setText("");
	            		kartşifre.setText("");
	                                  
	                 }
	             };
	             newtimer.schedule(check,3000);
			}
		}
		if(kredit.getSelectedItem().equals("20000credi-80tl"))
		{
			if(MainClass.kartlar.get(Üyegirişi.i).equals(kartno.getText())) 
			{
				if(MainClass.kartşifreleri.get(Üyegirişi.i).equals(kartşifre.getText())) 
				{
					info.setText("Correct İnformation thank you for this shop");
					int x = Integer.parseInt(MainClass.krediler.get(Üyegirişi.i))+20000;
					MainClass.krediler.set(Üyegirişi.i, String.valueOf(x));
				}
				else 
				{
					info.setText("Wrong İnformation Plase Cheeck your information");
					newtimer=new Timer();
		            TimerTask check =new TimerTask() 
		             {
		            	@Override
		            	 public void run() 
		                 {
		            		info.setText("");
		            		kartno.setText("");
		            		kartşifre.setText("");
		                                  
		                 }
		             };
		             newtimer.schedule(check,3000);
				}
			}
			else 
			{
				info.setText("Wrong İnformation Plase Cheeck your information");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		info.setText("");
	            		kartno.setText("");
	            		kartşifre.setText("");
	                                  
	                 }
	             };
	             newtimer.schedule(check,3000);
			}
			
		}
		anasayfa.kredi.setText(MainClass.krediler.get(Üyegirişi.i));
		anaframe.setVisible(false);
		}
		
	}
	
}
