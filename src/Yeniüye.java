import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import java.awt.*;
import javax.swing.*;

public class Yeniüye extends JFrame implements ActionListener
{
	JFrame anaframe,resimframe,frame;
	JPanel anapanel,panel2,resimpaneli,butonpaneli;
	JLabel nick,şifre,doğrulama,kredi,label,kartno,kartşifre;
	JTextField nick1,şifre1,doğrulama1,kartno1,kartşifre1;
	JComboBox krediseçimi;
	JButton confirm,profilp,a,b,c,d,f,g;
	Object o;
	Timer myTimer,newtimer;
	String miktar;
	Yeniüye()
	{
		
		String[] kredifiyat = { "500 credit-10tl", "2200 credit-50tl", "4800 credit-100tl", "10000 credit-200tl"};
		anaframe = new JFrame("Registation");
		anapanel = new JPanel(new GridLayout(6,2));
		anapanel.setBackground(Color.DARK_GRAY);
		anapanel.setForeground(Color.WHITE);
		panel2 = new JPanel(new GridLayout(2,1));
		nick = new JLabel("Please Enter Your Name :");
		nick.setFont(nick.getFont().deriveFont(20.0f));
		nick.setForeground(Color.WHITE);
		şifre = new JLabel("Please Enter Your Password :");
		şifre.setFont(şifre.getFont().deriveFont(20.0f));
		şifre.setForeground(Color.WHITE);
		doğrulama = new JLabel("Please Enter Verification code :");
		doğrulama.setFont(doğrulama.getFont().deriveFont(17.0f));
		doğrulama.setForeground(Color.WHITE);
		kredi = new JLabel("Please define credit amount :");
		kredi.setFont(kredi.getFont().deriveFont(20.0f));
		kredi.setForeground(Color.WHITE);
		nick1 = new JTextField();
		şifre1 = new JTextField();
		doğrulama1 = new JTextField();
		kartno = new JLabel("Please Enter Card No :");
		kartno.setForeground(Color.WHITE);
		kartno.setFont(kartno.getFont().deriveFont(17.0f));
		kartşifre = new JLabel("Please Enter card Password :");
		kartşifre.setForeground(Color.WHITE);
		kartşifre.setFont(kartşifre.getFont().deriveFont(17.0f));
		kartno1 = new JTextField("");
		kartşifre1 = new JTextField("");
		krediseçimi = new JComboBox(kredifiyat);
		krediseçimi.setForeground(Color.WHITE);
		krediseçimi.setBackground(Color.DARK_GRAY);
		confirm = new JButton("Confirm");
		confirm.setFont(confirm.getFont().deriveFont(17.0f));
		confirm.addActionListener(this);
		confirm.setForeground(Color.WHITE);
		confirm.setBackground(Color.BLACK);
		profilp = new JButton("Profil Photos");
		profilp.setFont(profilp.getFont().deriveFont(17.0f));
		profilp.addActionListener(this);
		profilp.setForeground(Color.WHITE);
		profilp.setBackground(Color.BLACK);
		
		anapanel.add(nick);
		anapanel.add(nick1);
		anapanel.add(şifre);
		anapanel.add(şifre1);
		anapanel.add(doğrulama);
		anapanel.add(doğrulama1);
		anapanel.add(kartno);
		anapanel.add(kartno1);
		anapanel.add(kartşifre);
		anapanel.add(kartşifre1);
		anapanel.add(kredi);
		anapanel.add(krediseçimi);
		panel2.add(profilp);
		panel2.add(confirm);
		anaframe.add(anapanel,BorderLayout.CENTER);
		anaframe.add(panel2,BorderLayout.SOUTH);
		
		anaframe.setSize(600,400);
		anaframe.setTitle("Registation");
		anaframe.setResizable(false);
		anaframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		anaframe.setLocationRelativeTo(null);
		anaframe.setVisible(true);
		o=this;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==profilp) 
		{
			new resimseçme();
			
		}
		
		
		if(e.getSource()==confirm) 
		{
			String name = nick1.getText();
			String pass = şifre1.getText();
			String doğru = doğrulama1.getText();
			String kartno2 = kartno1.getText();
			String kartşifre2 = kartşifre1.getText();
			miktar=(String) krediseçimi.getSelectedItem();
			if(krediseçimi.getSelectedItem().equals("500 credit-10tl"))
			{
			 miktar ="500";
			}
			if(krediseçimi.getSelectedItem().equals("2200 credit-50tl"))
			{
		 	 miktar ="2200";
			}
			if(krediseçimi.getSelectedItem().equals("4800 credit-100tl"))
			{
		 	 miktar ="4800";
			}
			if(krediseçimi.getSelectedItem().equals("10000 credit-200tl"))
			{
		 	 miktar ="10000";
			}
			String resimyolu1=resimseçme.resimyolu;
			
			
			int k=MainClass.kullanıcıadları.size();
			
			for(int t=0;t<k;t++) 
			{
				
				if(name.equals(MainClass.kullanıcıadları.get(t))) 
				{
					nick1.setText("THİS NAME HAS BEEN USED");
					şifre1.setText("SECURİTY PROBLEM DETECTED");
					doğrulama1.setText("PROGRAM WİLL SHUT DOWN");
					 
					myTimer=new Timer();
		            TimerTask exit =new TimerTask() 
		             {
		            	@Override
		            	 public void run() 
		                 {
		            		 System.exit(1);      
		                                  
		                 }
		             };
		 
		             myTimer.schedule(exit,5000);
		             
				}
				
			}
			label=new JLabel("SYSTEM HAS CHECKING TO SECURITY");
			label.setFont(label.getFont().deriveFont(80.0f));
			frame=new JFrame("SYSTEM CHECKING");
			frame.add(label);
			frame.setSize(1920, 600);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			
			newtimer=new Timer();
            TimerTask check =new TimerTask() 
             {
            	@Override
            	 public void run() 
                 {
            		frame.setVisible(false);
            		MainClass.kullanıcıadları.add(name);
            		MainClass.şifreler.add(pass);
            		MainClass.doğrulamakodları.add(doğru);
            		MainClass.krediler.add(miktar);
            		MainClass.imgpath.add(resimyolu1);
            		MainClass.silahlar.add("default");
            		MainClass.silahlar.add("default");
            		MainClass.silahlar.add("default");
            		MainClass.kartlar.add(kartno2);
            		MainClass.kartşifreleri.add(kartşifre2);
            		frame.setVisible(false);
            		new Üyegirişi();
                                  
                 }
             };
             newtimer.schedule(check,5000);  
		}
	}	
}
