import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

public class download extends JFrame
{
	JFrame anaframe1,anaframe2,anaframe3,anaframe4;
	JButton exit;
	JPanel mainpanel1,mainpanel2,mainpanel3,mainpanel4;
	ImageIcon bedir,medet,sempozyum,sigara;
	JLabel bedir1,medet1,sempozyum1,sigara1,info1,info2;
	Timer newtimer1,newtimer2,newtimer3,newtimer4;
	
	download()
	{
		anaframe1 = new JFrame(" Game is Downloading");
		anaframe2 = new JFrame("Game is Downloading");
		anaframe3 = new JFrame("Game is Downloading");
		anaframe4 = new JFrame("Game is Downloading");
		mainpanel1 = new JPanel();
		mainpanel2 = new JPanel();
		mainpanel3 = new JPanel();
		mainpanel4 = new JPanel();
		sempozyum = new ImageIcon("medetpp.png");
		sigara = new ImageIcon("tenor.gif");
		bedir = new ImageIcon("bedir.gif");
		medet = new ImageIcon("medet.gif");
		
		bedir1 = new JLabel(bedir);
		sempozyum1 = new JLabel(sempozyum);
		sigara1 = new JLabel(sigara);
		medet1 = new JLabel(medet);
		
		info2 = new JLabel("Downloading is Completed");
		
		mainpanel1.add(sempozyum1);
		anaframe1.add(info2, BorderLayout.SOUTH);
		anaframe1.add(mainpanel1 , BorderLayout.CENTER);
		anaframe1.setSize(900,800);
		anaframe1.setResizable(false);
		anaframe1.setLocationRelativeTo(null);
		anaframe1.setVisible(true);
		
		mainpanel2.add(sigara1);
 		
 		anaframe2.add(mainpanel2);
 		anaframe2.setResizable(false);
 		anaframe2.setSize(900,600);
 		anaframe2.setLocationRelativeTo(null);
 		
 		mainpanel3.add(bedir1);
   	
   		anaframe3.add(mainpanel3);
   		anaframe3.setResizable(false);
   		
   		anaframe3.setSize(900,600);
   		anaframe3.setLocationRelativeTo(null);
   		
   		
		mainpanel4.add(medet1);
        mainpanel4.add(info2 , BorderLayout.SOUTH);
  		
  		anaframe4.add(mainpanel4);
  		anaframe4.setResizable(false);
  		
  		anaframe4.setSize(900,600);
  		anaframe4.setLocationRelativeTo(null);
		
		
			newtimer1=new Timer();
	        TimerTask check =new TimerTask() 
	         {
	        	@Override
	        	 public void run() 
	             {
	        		anaframe2.setVisible(true);
	        		anaframe1.setVisible(false);
	        		
	        		newtimer2=new Timer();
	         		
	                TimerTask check1 =new TimerTask() 
	                 {
	                	@Override
	                	 public void run() 
	                     {
	                		anaframe3.setVisible(true);
	                		anaframe2.setVisible(false);
	                		
	                		newtimer3=new Timer();
	                  		
	                        TimerTask check2 =new TimerTask() 
	                         {
	                        	@Override
	                        	 public void run() 
	                             {
	                        		anaframe4.setVisible(true);
	                        		anaframe3.setVisible(false);
	                        		
	                        		newtimer4=new Timer();
	                         		
	                                TimerTask check3 =new TimerTask() 
	                                 {
	                                	@Override
	                                	 public void run() 
	                                     {
	                                		anaframe4.setVisible(false);
	                                                      
	                                     }
	                                 };
	                                 newtimer4.schedule(check3,12000);   
	                        		
	                             }
	                         };
	                         newtimer3.schedule(check2,10000);  
	                                      
	                     }
	                 };
	                 newtimer2.schedule(check1,10000);  
	                              
	             }
	        
	         };
	         newtimer1.schedule(check,5000);  
 
	}
	
}
