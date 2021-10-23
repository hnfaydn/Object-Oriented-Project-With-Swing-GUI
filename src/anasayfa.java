import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Timer;

import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class anasayfa extends JFrame implements ActionListener {
	
    static JFrame anaframe;
    static JPanel anapanel,supportpanel,profilpanel,forumpanel,supportveşans,profilsupport,boş1,boş2,p1,p2;
    static JButton support,şanskutusu,download,news,game,media,community,market,buycredit;
    static JLabel  resim1,language,region,oyunsaati,isim,kredi,arkaplan;
    static ImageIcon resim,resimp;
    static JComboBox account;
    static FileWriter fw;
    Timer newtimer;
    static BufferedWriter bw;
    int k;
    static File file;
    Date saat;
    
    public String sistemTarihiniGetir(String tarihFormati)
    {
     Calendar takvim = Calendar.getInstance();
     SimpleDateFormat sdf = new SimpleDateFormat(tarihFormati);
     return sdf.format(takvim.getTime());
    }

    public anasayfa() 
    { 
    	
    	newtimer=new Timer();
        TimerTask check =new TimerTask() 
         {
        	@Override
        	 public void run() 
             {
        		file = new File("Kullanıcılar.txt");
        		if(!file.exists()) 
        		{
        			try 
        			{
        				file.createNewFile();
        			} catch (IOException e1)
        			{
        				
        				e1.printStackTrace();
        			}
        		}
            	
            	try {
        			 fw = new FileWriter(file,false);
        			 bw = new BufferedWriter(fw);
        			 for(int i = 0;i<MainClass.kullanıcıadları.size();i++) {
        				 bw.write(MainClass.kullanıcıadları.get(i)+"|"+MainClass.şifreler.get(i)+"|"+MainClass.doğrulamakodları.get(i)+"|"+MainClass.krediler.get(i)+"|"+MainClass.imgpath.get(i)+"|"+MainClass.silahlar.get(i*3)+"|"+MainClass.silahlar.get(i*3+1)+"|"+MainClass.silahlar.get(i*3+2)+"|"+MainClass.kartlar.get(i)+"|"+MainClass.kartşifreleri.get(i)+"|");
        			 }	
        			 bw.close();
        			 }
        		 catch (IOException e1) {
        			
        			e1.printStackTrace();
        		
        		 }
                              
             }
         };
         newtimer.schedule(check,/*M.Ö*/10000);
		
    	
    	String saat = sistemTarihiniGetir("H:mm");
    	 
    	  anaframe = new JFrame("GürkanFace");
    	  anapanel = new JPanel(new GridLayout(3,1));
    	  supportpanel = new JPanel(new GridLayout(1,3));
    	  supportveşans = new JPanel(new GridLayout(1,5));
          profilpanel = new JPanel(new GridLayout(2,6));
          forumpanel = new JPanel(new GridLayout(1,6));
          support = new JButton("SUPPORT");
          support.addActionListener(this);
          
          language = new JLabel("Language English");
          language.setForeground(Color.WHITE);
          language.setFont(language.getFont().deriveFont(13.0f));
          region = new JLabel(" Region Turkish");
          region.setForeground(Color.WHITE);
          region.setFont(region.getFont().deriveFont(13.0f));
          oyunsaati = new JLabel(saat);
          oyunsaati.setForeground(Color.WHITE);
          oyunsaati.setFont(oyunsaati.getFont().deriveFont(13.0f));
          şanskutusu = new JButton("Lucky Box");
          şanskutusu.addActionListener(this);
         
          support.setBackground(Color.DARK_GRAY);
          support.setForeground(Color.WHITE);
          şanskutusu.setBackground(Color.DARK_GRAY);
          şanskutusu.setForeground(Color.WHITE);
          
          
          supportveşans.add(support);
          supportveşans.add(language);
          supportveşans.add(region);
          supportveşans.add(oyunsaati);
          supportveşans.add(şanskutusu);
         
         
          
          
          
          isim = new JLabel(MainClass.kullanıcıadları.get(Üyegirişi.i));
          
          isim.setForeground(Color.WHITE);
          
          isim.setFont(isim.getFont().deriveFont(13.0f));
          
          kredi = new JLabel(MainClass.krediler.get(Üyegirişi.i));
          
          kredi.setForeground(Color.WHITE);
          
          kredi.setFont(kredi.getFont().deriveFont(13.0f));
          
          
         
          buycredit = new JButton("Buy Credits");
          buycredit.addActionListener(this);
          buycredit.setBackground(Color.DARK_GRAY);
          buycredit.setForeground(Color.WHITE);
          buycredit.setFont(buycredit.getFont().deriveFont(13.0f));
          
          String[] combo = {"Account Informations","My Account","Logout"};
          account = new JComboBox(combo);
          account.addActionListener(this);
          account.setBackground(Color.DARK_GRAY);
          account.setForeground(Color.white);
          account.setFont(account.getFont().deriveFont(13.0f));
          profilpanel.add(isim);
          profilpanel.add(buycredit);
          profilpanel.add(kredi);
          profilpanel.add(account);
         
          p1 = new JPanel();
          
          p1.setBackground(Color.DARK_GRAY);
          profilpanel.setBackground(Color.DARK_GRAY);
          supportveşans.setBackground(Color.DARK_GRAY);
          supportpanel.add(supportveşans);
          supportpanel.add(p1);
          
          supportpanel.add(profilpanel);
          
         
          
          news = new JButton("News");
          news.addActionListener(this);
          game = new JButton("About Game");
          game.addActionListener(this);
          media = new JButton("Media");
          media.addActionListener(this);
          community = new JButton("Community");
          community.addActionListener(this);
          
          
          market = new JButton("Buying");
          market.addActionListener(this);
          download = new JButton("Download");
          download.addActionListener(this);
          news.setBackground(Color.darkGray);
          game.setBackground(Color.darkGray);
          media.setBackground(Color.darkGray);
          community.setBackground(Color.darkGray);
          market.setBackground(Color.darkGray);
          download.setBackground(Color.darkGray);
          game.setForeground(Color.white);
          media.setForeground(Color.white);
          community.setForeground(Color.white);
          market.setForeground(Color.white);
          news.setForeground(Color.white);
          download.setForeground(Color.white);
          
          
          forumpanel.add(news);
          forumpanel.add(game);
          forumpanel.add(media);
          forumpanel.add(community);
          forumpanel.add(market);
          forumpanel.add(download);
          anapanel.setBackground(Color.BLACK);
          boş1 = new JPanel();
          boş2 = new JPanel();
          forumpanel.setBackground(Color.BLACK);
          boş1.setBackground(Color.BLACK);
          boş2.setBackground(Color.BLACK);
          anapanel.add(boş1);
          anapanel.add(forumpanel);
          anapanel.add(boş2);
          
          String resimyolu = "framebackground.jpg";
          resim = new ImageIcon(resimyolu);
          arkaplan = new JLabel(resim);
          arkaplan.setBackground(Color.BLACK);
          anaframe.add(supportpanel, BorderLayout.NORTH);
          anaframe.add(arkaplan, BorderLayout.CENTER);
          anaframe.add(anapanel,BorderLayout.SOUTH);
          anaframe.setForeground(Color.WHITE);
          anaframe.setSize(1920,1080);
          anaframe.setUndecorated(true);
          anaframe.setResizable(false);
          anaframe.setVisible(true);
          
          
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==support)
		{
			new support();
		}
		if(e.getSource()==şanskutusu)
		{
			new şanskutusu();
			
		}
		if(e.getSource()==download)
		{
			new download();
		}
		
		if(e.getSource()==news)
		{
			new news();
		}
		
		if(e.getSource()==game)
		{
			new game();
		}
		if(e.getSource()==media)
		{
			new media();
		}
		if(e.getSource()==community)
		{
			new community();
		}
		if(e.getSource()==buycredit)
		{
			new buycredit();
		}
		if(account.getSelectedItem()=="My Account") 
		{
			new myaccount();
			account.setSelectedItem("Account Informations");
		}
		if(account.getSelectedItem()=="Logout") 
		{
			
			try {
				 fw = new FileWriter(file,false);
				 bw = new BufferedWriter(fw);
				 for(int i = 0;i<MainClass.kullanıcıadları.size();i++) {
				 bw.write(MainClass.kullanıcıadları.get(i)+"|"+MainClass.şifreler.get(i)+"|"+MainClass.doğrulamakodları.get(i)+"|"+MainClass.krediler.get(i)+"|"+MainClass.imgpath.get(i)+"|"+MainClass.silahlar.get(i*3)+"|"+MainClass.silahlar.get(i*3+1)+"|"+MainClass.silahlar.get(i*3+2)+"|"+MainClass.kartlar.get(i)+"|"+MainClass.kartşifreleri.get(i)+"|");
				 }	
				 bw.close();
				 System.exit(2);
				 }
			 catch (IOException e1) {
				
				e1.printStackTrace();
			
			 }
		 
		}
		
		if(e.getSource()==market) 
		{
			
			new buy();
		}
		
	} 
     
    
	}
	
