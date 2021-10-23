import java.awt.event.*;

import javax.imageio.*;
import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.util.*;


public class MainClass extends JFrame {
	private static final String filename = "Kullanıcılar.txt";
	public static ArrayList<String> kullanıcıadları = new ArrayList<String>();
	public static ArrayList<String> şifreler = new ArrayList<String>();
	public static ArrayList<String> doğrulamakodları = new ArrayList<String>();
	public static ArrayList<String> krediler =new ArrayList<String>();
	public static ArrayList<String> imgpath =new ArrayList<String>();
	public static ArrayList<String> silahlar =new ArrayList<String>();	
	public static ArrayList<String> kartlar =new ArrayList<String>();
	public static ArrayList<String> kartşifreleri =new ArrayList<String>();
	protected static BufferedReader buff = null;
	protected static FileReader file = null;
	
	public static void main(String[] args) throws IOException 
	{
		
		açılışhazırlığı();
		new açılış();
		
	}
	private static void açılışhazırlığı() throws IOException 
		{
		file = new FileReader(filename);
		buff =new BufferedReader(file);
		
		String line;
		String st = null;
		while ((line = buff.readLine()) != null) {
			st = line;	
		}
		
		
		if(!st.equals(""))
		{
			StringTokenizer t=new StringTokenizer(st,"|");
			
			while(t.hasMoreTokens())
			{
				kullanıcıadları.add(t.nextToken());
				şifreler.add(t.nextToken());
				doğrulamakodları.add(t.nextToken());
				krediler.add(t.nextToken());
				imgpath.add(t.nextToken());
				silahlar.add(t.nextToken());
				silahlar.add(t.nextToken());
				silahlar.add(t.nextToken());
				kartlar.add(t.nextToken());
				kartşifreleri.add(t.nextToken());
			}
		
		}	
		
	}
		
}



