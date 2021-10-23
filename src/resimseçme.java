import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class resimseçme extends JFrame implements ActionListener {
	
	JFrame resimframe;
	ImageIcon resim1,resim2,resim3,resim4,resim5,resim6;
	JPanel resimpaneli,butonpaneli;
	JButton a,b,c,d,f,g;
	JLabel a1,b1,c1,d1,f1,g1;
	public static String resimyolu;
	
	resimseçme()
	{
		resimframe = new JFrame("Please choose for profil photos");
		resim1 = new ImageIcon("pt/a.jpg");
		a1 = new JLabel(resim1);
		resim2 = new ImageIcon("pt/b.jpg");
		b1 = new JLabel(resim2);
		resim3 = new ImageIcon("pt/c.jpg");
		c1 = new JLabel(resim3);
		resim4 = new ImageIcon("pt/d.jpg");
		d1 = new JLabel(resim4);
	    resim5 = new ImageIcon("pt/e.jpg");
	    f1 = new JLabel(resim5);
		resim6 = new ImageIcon("pt/f.jpg");
		g1 = new JLabel(resim6);
		resimpaneli = new JPanel(new GridLayout(1,6));
		butonpaneli = new JPanel(new GridLayout(1,6));
		a = new JButton("Choose This One");
		a.addActionListener(this);
		a.setForeground(Color.WHITE);
		a.setBackground(Color.BLACK);
		b = new JButton("Choose This One");
		b.addActionListener(this);
		b.setForeground(Color.WHITE);
		b.setBackground(Color.BLACK);
		c = new JButton("Choose This One");
		c.addActionListener(this);
		c.setForeground(Color.WHITE);
		c.setBackground(Color.BLACK);
		d = new JButton("Choose This One");
		d.addActionListener(this);
		d.setForeground(Color.WHITE);
		d.setBackground(Color.BLACK);
		f = new JButton("Choose This One");
		f.addActionListener(this);
		f.setForeground(Color.WHITE);
		f.setBackground(Color.BLACK);
		g = new JButton("Choose This One");
		g.addActionListener(this);
		g.setForeground(Color.WHITE);
		g.setBackground(Color.BLACK);
		resimpaneli.add(a1);
		resimpaneli.add(b1);
		resimpaneli.add(c1);
		resimpaneli.add(d1);
		resimpaneli.add(f1);
		resimpaneli.add(g1);
		butonpaneli.add(a);
		butonpaneli.add(b);
		butonpaneli.add(c);
		butonpaneli.add(d);
		butonpaneli.add(f);
		butonpaneli.add(g);
		
		resimframe.add(resimpaneli, BorderLayout.CENTER);
		resimframe.add(butonpaneli, BorderLayout.SOUTH);
		
		resimframe.setSize(1090, 350);
		resimframe.setTitle("Please Choose Your Profil Photos");
		resimframe.setResizable(false);
		resimframe.setLocationRelativeTo(null);
		resimframe.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==a) 
		{
			resimyolu = resim1.getDescription();
			resimframe.setVisible(false);
		}
		if(e.getSource()==b)
		{
			resimyolu = resim2.getDescription();
			resimframe.setVisible(false);
		}
		if(e.getSource()==c)
		{
			resimyolu = resim3.getDescription();
			resimframe.setVisible(false);
		}
		if(e.getSource()==d)
		{
			resimyolu = resim4.getDescription();
			resimframe.setVisible(false);
		}
		if(e.getSource()==f)
		{
			resimyolu = resim5.getDescription();
			resimframe.setVisible(false);
		}
		if(e.getSource()==g)
		{
			resimyolu = resim6.getDescription();
			resimframe.setVisible(false);
		}
		
	}

}
