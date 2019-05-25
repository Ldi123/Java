package abcd;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
public class demo extends JFrame implements ActionListener{
	JLabel lab1=new JLabel("������");
	JTextField tx1=new JTextField(10);
	JLabel lab2=new JLabel("���ã�");
	JCheckBox music=new JCheckBox("����");
	JCheckBox sport=new JCheckBox("�˶�");
	JCheckBox net=new JCheckBox("����");
	JLabel lab3=new JLabel("����Ҫ����") ;
	JButton jb1=new JButton("ȷ��");
	JButton jb2=new JButton("ȡ��");
	JRadioButton jr1=new JRadioButton("����");
	JRadioButton jr2=new JRadioButton("��ѧ��");
	JRadioButton jr3=new JRadioButton("��ʦ");
	private ButtonGroup bg=new ButtonGroup();
	
	JPanel panBotton=new JPanel();
	JPanel pan1=new JPanel();
	JPanel pan2=new JPanel();
	JPanel pan3=new JPanel();
	JPanel pan4=new JPanel();
	
	public demo() {
		this.setTitle("��Ȥ����ѡ��");
		this.setSize(400, 400);
		this.setBounds(getBounds());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
	public void initialize() {
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		pan1.add(lab1);
		pan1.add(tx1);
		pan2.add(lab2);
		pan2.add(music);
		pan2.add(sport);
		pan2.add(net);
		pan3.add(lab3);
		pan3.add(jr1);
		pan3.add(jr2);
		pan3.add(jr3);
		pan4.add(jb1);
		pan4.add(jb2);
		panBotton.setLayout(new GridLayout(4, 1));
		panBotton.add(pan1);
		panBotton.add(pan2);
		panBotton.add(pan3);
		panBotton.add(pan4);
		this.add(panBotton);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb1) {
			StringBuffer st=new StringBuffer();
			st.append("�ҽ�"+tx1.getText());
			st.append("\n���ã�");
			if(music.isSelected()) {
				st.append("����"+" ");
			}
			if(sport.isSelected()) {
				st.append("�˶�"+" ");
			}
			if(net.isSelected()) {
				st.append("����"+" ");
			}
			
			st.append("\n����Ҫ����");
			if(jr1.isSelected()) {
				st.append("����");
			}
			if(jr2.isSelected()) {
				st.append("��ѧ��");
			}
			if(jr3.isSelected()) {
				st.append("��ʦ");
			}
			JOptionPane.showMessageDialog(this, st);
			
		}
		
		if(e.getSource()==jb2) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		demo d=new demo();
		d.initialize();
	}
}
