#更改图形化界面对应按钮的颜色
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorPane extends JFrame implements ActionListener{
	Container container;
	JButton jbuttons[];
	private String name[]= {
			"blue","cyan","green",
			"magenta","orange","pink",
			"red","white","yellow"
			};
	public ColorPane() {
		super("ColorChange");
		JFrame f=new JFrame();
		container=getContentPane();
		GridLayout grid = new GridLayout(3,2,0,0);
		container.setLayout(grid);
		jbuttons=new JButton[name.length];
		for(int i=0;i<name.length;i++) {
		jbuttons[i]=new JButton(name[i]);
		jbuttons[i].addActionListener(this);
		container.add(jbuttons[i]);
		}
		setSize(500,500);
        setVisible(true);
	}
public static void main(String[] args) {
	ColorPane cc=new ColorPane ();
	cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==jbuttons[0]) {
		jbuttons[0].setBackground(Color.BLUE);
		jbuttons[0].updateUI();
	}
	if(e.getSource()==jbuttons[1]) {
		jbuttons[1].setBackground(Color.CYAN);
		jbuttons[1].updateUI();
	}
	if(e.getSource()==jbuttons[2]) {
		jbuttons[2].setBackground(Color.GREEN);
		jbuttons[2].updateUI();
	}
	if(e.getSource()==jbuttons[3]) {
		jbuttons[3].setBackground(Color.MAGENTA);
		jbuttons[3].updateUI();
	}
	if(e.getSource()==jbuttons[4]) {
		jbuttons[4].setBackground(Color.ORANGE);
		jbuttons[4].updateUI();
	}
	if(e.getSource()==jbuttons[5]) {
		jbuttons[5].setBackground(Color.PINK);
		jbuttons[5].updateUI();
	}
	if(e.getSource()==jbuttons[6]) {
		jbuttons[6].setBackground(Color.RED);
		jbuttons[6].updateUI();
	}
	if(e.getSource()==jbuttons[7]) {
		jbuttons[7].setBackground(Color.WHITE);
		jbuttons[7].updateUI();
	}
	if(e.getSource()==jbuttons[8]) {
		jbuttons[8].setBackground(Color.YELLOW);
		jbuttons[8].updateUI();
	}
	
}
}
