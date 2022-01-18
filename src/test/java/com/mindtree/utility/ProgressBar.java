package com.mindtree.utility;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/** This class is to show the progress of automation
 * @since 29/12/2021
 *
 */
public class ProgressBar extends JFrame{
	
	JProgressBar jb;    
	int i=0;     
	public ProgressBar(){    
	jb=new JProgressBar(0,100);    
	jb.setBounds(40,40,1000,30);         
	jb.setValue(0);    
	jb.setStringPainted(true);    
	add(jb);    
	setSize(1000,200);    
	jb.setForeground(Color.red);
	setLayout(null);  
	}
	public void iterate(int i) {
		jb.setValue(i);
		
	}

}
