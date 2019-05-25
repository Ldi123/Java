package abcd;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.CharBuffer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class ClockDemo extends JFrame implements ActionListener, Runnable{
	int hour=0,min=0,sec=0;
	Thread mythred=new Thread(this);
	JLabel lab=new JLabel("00:00:00");
	JPanel pan=new JPanel();
	JButton bu1=new JButton("开始");
	JButton bu2=new JButton("暂停");
	JButton bu3=new JButton("结束");
	Boolean time=false;
public ClockDemo() {
	super("计时器");
    lab.setHorizontalAlignment(JLabel.CENTER);
	this.setBounds(200, 200, 500, 200);
	this.setBackground(Color.WHITE);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	init();
}
public void init() {
	this.add(lab);
	pan.add(bu1);
	pan.add(bu2);
	pan.add(bu3);
	this.add(pan,BorderLayout.SOUTH);
	bu1.addActionListener(this);
	bu2.addActionListener(this);
	bu3.addActionListener(this);
}
public void run() {
	while(time) {
		try {
			Thread.sleep(1000);
			sec++;
			if(sec>=60) {
				sec=0;
				min+=1;
				if(min>=60) {
					min=0;
					hour+=1;
					if(hour>=99) {
						hour=0;
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		showtime();
	}
	
	}
public void showtime() {
	StringBuffer st=new StringBuffer();
	st.append(hour<10? "0"+hour+":":hour+":");
	st.append(min<10? "0"+min+":":min+":");
	st.append(sec<10? "0"+sec:sec);
	lab.setText(st.toString());
}
public static void main(String[] args) {
	ClockDemo cc=new ClockDemo();
}

public void actionPerformed(ActionEvent e) {
	if(e.getSource()==bu1) {
		if(!time) {
			time=true;
			mythred.start();
			showtime();
		}
	}
	if(e.getSource()==bu2) {
		time=false;
		mythred.interrupt();
		showtime();
	}
	if(e.getSource()==bu3) {
		time=false;
		mythred.interrupt();
		hour=min=sec=0;
		showtime();
	}
}
}

