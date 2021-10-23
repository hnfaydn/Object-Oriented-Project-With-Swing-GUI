import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;
import javax.swing.border.*;

public class myaccount extends JFrame implements ActionListener 
{
	JFrame mainframe;
	JPanel mainpanel,resimpanel,şifre,silahlar,resimveşifre;
	JButton exit,şifredeğişim,kartdeğişim;
	JLabel isim,kredi,oldpass,changingpass,changingcard,newpass,newcard,newcardpass,profilresim,silah1,silah2,silah3,main,secondary,melee,info,boş1;
	ImageIcon profil,silahp,silahs,silahm;
	JTextField newcardd;
	JPasswordField oldpas,newpas,newcardpas;
	Timer newtimer;
	
	Object r16a44,fararmm,karkomm,twmm,at2266,axee;
	Border border;
	myaccount()
	{
		
		r16a4 r1 = new r16a4();
		fararm f1 = new fararm();
		karkom k1 = new karkom();
		twm t1 = new twm();
		ay226 a1 = new ay226();
		axe ax1 = new axe();
		
		mainframe = new JFrame("My Account");
		mainpanel = new JPanel();
		resimpanel = new JPanel();
		şifre = new JPanel(new GridLayout(15,1));
		resimveşifre = new JPanel(new GridLayout(2,1));
		silahlar = new JPanel(new GridLayout(3,3));
		mainpanel.setBackground(Color.DARK_GRAY);
		resimpanel.setBackground(Color.DARK_GRAY);
		şifre.setBackground(Color.DARK_GRAY);
		resimveşifre.setBackground(Color.DARK_GRAY);
		silahlar.setBackground(Color.DARK_GRAY);
		
		isim = new JLabel("  Name : "+MainClass.kullanıcıadları.get(Üyegirişi.i));
		isim.setForeground(Color.WHITE);
		isim.setFont(isim.getFont().deriveFont(18.0f));
		kredi = new JLabel("  Credit :"+MainClass.krediler.get(Üyegirişi.i));
		kredi.setForeground(Color.WHITE);
		kredi.setFont(kredi.getFont().deriveFont(18.0f));
		changingpass = new JLabel("     "+"Password Changing Area");
		changingpass.setForeground(Color.WHITE);
		changingpass.setFont(changingpass.getFont().deriveFont(18.0f));
		changingcard = new JLabel("     "+"Changing Card Area");
		changingcard.setForeground(Color.WHITE);
		changingcard.setFont(changingcard.getFont().deriveFont(18.0f));
		oldpass = new JLabel("     "+"Please enter current password");
		oldpass.setForeground(Color.WHITE);
		oldpass.setFont(oldpass.getFont().deriveFont(18.0f));
		newpass = new JLabel("     "+"Please enter new Password");
		newpass.setForeground(Color.WHITE);
		newpass.setFont(newpass.getFont().deriveFont(18.0f));
		newcard = new JLabel("     "+"Please enter new card number");
		newcard.setForeground(Color.WHITE);
		newcard.setFont(newcard.getFont().deriveFont(18.0f));
		newcardpass = new JLabel("     "+"Please enter new card password");
		newcardpass.setForeground(Color.WHITE);
		newcardpass.setFont(newcardpass.getFont().deriveFont(18.0f));
		main = new JLabel("     "+"Primary Weapon");
		main.setForeground(Color.WHITE);
		main.setFont(main.getFont().deriveFont(20.0f));
		secondary = new JLabel("     "+"Secondary Weapon");
		secondary.setForeground(Color.WHITE);
		secondary.setFont(secondary.getFont().deriveFont(20.0f));
		melee = new JLabel ("     "+"Melee Weapon");
		melee.setForeground(Color.WHITE);
		melee.setFont(melee.getFont().deriveFont(20.0f));
		
		boş1 = new JLabel();
		info = new JLabel("");
		info.setForeground(Color.WHITE);
		info.setFont(melee.getFont().deriveFont(20.0f));
		oldpas = new JPasswordField();
		newpas = new JPasswordField();
		newcardd = new JTextField();
		newcardpas = new JPasswordField();
		şifredeğişim = new JButton("Change Password");
		şifredeğişim.addActionListener(this);
		şifredeğişim.setForeground(Color.WHITE);
		şifredeğişim.setBackground(Color.BLACK);
		şifredeğişim.setFont(şifredeğişim.getFont().deriveFont(18.0f));
		
		kartdeğişim = new JButton("Change Card");
		kartdeğişim.addActionListener(this);
		kartdeğişim.setForeground(Color.WHITE);
		kartdeğişim.setBackground(Color.BLACK);
		kartdeğişim.setFont(kartdeğişim.getFont().deriveFont(18.0f));
		profil = new ImageIcon(MainClass.imgpath.get(Üyegirişi.i));
		profilresim = new JLabel(profil);
		exit = new JButton("Exit");
		exit.addActionListener(this);
		exit.setBackground(Color.DARK_GRAY);
		exit.setForeground(Color.white);
		kartdeğişim.setFont(kartdeğişim.getFont().deriveFont(18.0f));
		
		if(MainClass.silahlar.get(Üyegirişi.i*3).equals("default")) 
		{
			silahp = new ImageIcon("guns/fakir.png");
			silah1 = new JLabel(silahp);
		}
		
		if(MainClass.silahlar.get(Üyegirişi.i*3).equals("R16A4")) 
		{
			
			silahp = new ImageIcon(r1.getPath());
			silah1 = new JLabel(silahp);
		}
		
		if(MainClass.silahlar.get(Üyegirişi.i*3).equals("Fararm ATF12")) 
		{
			
			silahp = new ImageIcon(f1.getPath());
			silah1 = new JLabel(silahp);
		}
		
		if(MainClass.silahlar.get(Üyegirişi.i*3).equals("Karkom")) 
		{
			
			silahp = new ImageIcon(k1.getPath());
			silah1 = new JLabel(silahp);
		}
		
		if(MainClass.silahlar.get(Üyegirişi.i*3).equals("TWM X308")) 
		{
			
			silahp = new ImageIcon(t1.getPath());
			silah1 = new JLabel(silahp);
		}
		if(MainClass.silahlar.get(Üyegirişi.i*3+1).equals("AY 226")) 
		{
			
			silahs = new ImageIcon(a1.getPath());
			silah2 = new JLabel(silahs);
		}
		if(MainClass.silahlar.get(Üyegirişi.i*3+1).equals("default")) 
		{
			silahs = new ImageIcon("guns/fakir.png");
			silah2 = new JLabel(silahs);
		}
		if(MainClass.silahlar.get(Üyegirişi.i*3+2).equals("Tactical Axe")) 
		{
			
			silahm = new ImageIcon(ax1.getPath());
			silah3 = new JLabel(silahm);
		}
		if(MainClass.silahlar.get(Üyegirişi.i*3+2).equals("default")) 
		{
			silahm = new ImageIcon("guns/fakir.png");
			silah3 = new JLabel(silahm);
		}
		
		
		
		resimpanel.add(profilresim);
		
		şifre.add(isim);
		şifre.add(kredi);
		şifre.add(changingpass);
		şifre.add(oldpass);
		şifre.add(oldpas);
		şifre.add(newpass);
		şifre.add(newpas);
		şifre.add(şifredeğişim);
		şifre.add(changingcard);
		şifre.add(newcard);
		şifre.add(newcardd);
		şifre.add(newcardpass);
		şifre.add(newcardpas);
		şifre.add(kartdeğişim);
		
		resimveşifre.add(resimpanel);
		resimveşifre.add(şifre);
		
		
		silahlar.add(main);
		silahlar.add(secondary);
		silahlar.add(melee);
		silahlar.add(silah1);
		silahlar.add(silah2);
		silahlar.add(silah3);
		silahlar.add(boş1);
		silahlar.add(info);
		
		mainpanel.add(silahlar, BorderLayout.CENTER);
		
		mainframe.add(exit, BorderLayout.SOUTH);
		mainframe.add(resimveşifre, BorderLayout.WEST);
		mainframe.add(mainpanel, BorderLayout.CENTER);
		
		mainframe.setSize(1600,900);
		mainframe.setResizable(false);
		mainframe.setLocationRelativeTo(null);
		mainframe.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==exit) 
		{
			mainframe.setVisible(false);
			
		}
		if ( e.getSource()==şifredeğişim) 
		{
			if(MainClass.şifreler.get(Üyegirişi.i).equals(oldpas.getText())) 
			{
				info.setText("Password changed succesfully");
				MainClass.şifreler.set(Üyegirişi.i, newpas.getText());
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		
	                    info.setText("");
	                 }
	             };
	             newtimer.schedule(check,3000); 
	             
	             
			}
			
			else 
			{
				info.setText("Wrong Password Please Check Your information");
				newtimer=new Timer();
	            TimerTask check =new TimerTask() 
	             {
	            	@Override
	            	 public void run() 
	                 {
	            		
	                    info.setText("");
	                 }
	             };
	             newtimer.schedule(check,3000); 
				
			}
		}
		
		if(e.getSource()==kartdeğişim) 
		{
			MainClass.kartlar.set(Üyegirişi.i, newcardd.getText());
			MainClass.kartşifreleri.set(Üyegirişi.i, newcardpas.getText());
			
			info.setText("Your Card informations Changed Successfully");
			
			newtimer=new Timer();
            TimerTask check =new TimerTask() 
             {
            	@Override
            	 public void run() 
                 {
            		
                    info.setText("");
                 }
             };
             newtimer.schedule(check,3000); 
			
		}
		
	}

}
