package com.test;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
import javax.swing.JFrame;
 
 
public class FileDialogs extends JFrame implements ActionListener{
	Menu menu;
	MenuBar mbar;
	MenuItem open,load;
	File file;
	FileReader fread;
	BufferedReader breader;
	FileWriter fwiter;
	BufferedWriter bwiter;
	TextArea area;
	FileDialog log_save,log_open;
	FileDialogs()
	{
		super();
		menu=new Menu("对话框");
		mbar=new MenuBar();
		load=new MenuItem("load");
		open=new MenuItem("open");
		menu.add(load);
		menu.add(open);
		mbar.add(menu);
		log_save=new FileDialog(this, "保存文件对话框",FileDialog.SAVE);
		log_open=new FileDialog(this,"打开文件对话框",FileDialog.LOAD);
		setMenuBar(mbar);
		setBounds(100,100,500,500);
		setLayout(new FlowLayout());
		setVisible(true);
		validate();
		area=new TextArea();
		add(area);
		log_save.addWindowListener(new WindowAdapter() {
		  @Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
		}
		});
		log_save.addWindowListener(new WindowAdapter()
		{@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			log_save.setVisible(false);
			super.windowClosing(arg0);
		}
			
		});
		log_open.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				log_open.setVisible(false);
				super.windowClosing(e);
			}
		});
		open.addActionListener(new ActionListener()
		{
 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				log_open.setVisible(true);
				area.setText(null);
				String s=null;
				if(log_open.getFile()!=null)
				{
					File file=new File(log_open.getDirectory(),log_open.getFile());
					try {
						fread=new FileReader(file);
						breader=new BufferedReader(fread);
						while((s=breader.readLine())!=null)
						{
							area.append(s+"\n");
						}
						breader.close();
						fread.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		load.addActionListener(new ActionListener()
		{
 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				log_save.setVisible(true);
				String s=null;
				File file = new File(log_save.getDirectory(),log_save.getFile());
				try {
					fwiter=new FileWriter(file);
					bwiter=new BufferedWriter(fwiter);
					s=area.getText();
					bwiter.write(area.getText(),0,(area.getText().length()));
					bwiter.close();
					fwiter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		FileDialogs fs = new FileDialogs();
	}
	
 
}
