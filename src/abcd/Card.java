package abcd;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Card extends JFrame{
	CardLayout cc=new CardLayout(15,5);
	JTextField jf=new JTextField();
	JPanel pan=new JPanel(cc);
	JPanel panbut=new JPanel();
	JPanel pan1=new JPanel();
	JPanel pan2=new JPanel();
	JPanel pan3=new JPanel();
	JLabel lab1=new JLabel("one");
	JLabel lab2=new JLabel("on");
	JLabel lab3=new JLabel("o");
	JButton butt=new JButton("push");
	public Card() {
		this.setBounds(500,500,500,500);
		this.setTitle("这是一个布局实例");
		this.setVisible(true);
		init();
	}
	public void init() {
		pan.add(pan1);
		pan.add(pan2);
		pan.add(pan3);
		panbut.add(butt);
		pan1.add(lab1);
		pan2.add(lab2);
		pan3.add(lab3);
		this.add(pan,BorderLayout.CENTER);
		this.add(butt,BorderLayout.SOUTH);
		this.add(jf, BorderLayout.NORTH);
		butt.addMouseListener(new ttt());
	}
	class ttt implements MouseListener{
		public void mouseClicked(MouseEvent e) {
			jf.setText("点击鼠标事件！");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO 自动生成的方法存根
			
		}
	}
public static void main(String[] args) {
	Card card=new Card();
}
}

