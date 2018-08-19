package com.test;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Demo {
	
	public static void main(String[] args) {
		FileDialog fd = new FileDialog( new Frame(""));
		fd.addWindowListener(new WindowAdapter() {
		
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
			}
		});
	}

}
