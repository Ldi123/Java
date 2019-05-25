package abcd;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FileChooserUI;
public class Textedit extends JFrame{
	JPopupMenu pp=new JPopupMenu();
	JToolBar tools=new JToolBar();
	JButton bu1=new JButton("剪切");
	JButton bu2=new JButton("复制");
	JButton bu3=new JButton("粘贴");
	JTextArea te=new JTextArea();
	JScrollPane scopan=new JScrollPane(te);
	JMenuBar jmb=new JMenuBar();
	JMenu jm1=new JMenu("文件[N]");
	JMenu jm2=new JMenu("编辑[E]");
	JMenu jm3=new JMenu("帮助[H]");
	JMenuItem jmt1=new JMenuItem("新建[N]");
	JMenuItem jmt2=new JMenuItem("打开[O]");
	JMenuItem jmt3=new JMenuItem("另存为[S]");
	JMenuItem jmt4=new JMenuItem("退出");
	JCheckBoxMenuItem jmc=new JCheckBoxMenuItem("自动换行");
	JMenuItem jmt5=new JMenuItem("剪切");
	JMenuItem jmt6=new JMenuItem("复制");
	JMenuItem jmt7=new JMenuItem("粘贴");
	JMenuItem jmt8=new JMenuItem("关于");
	JFileChooser fchoose=new JFileChooser();
	File file;
public Textedit(){
	this.setTitle("文本编辑器");
	this.setBounds(500, 500, 500, 500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	init();
}
public void init() {
	jm1.setMnemonic(KeyEvent.VK_0);
	jm2.setMnemonic(KeyEvent.VK_1);
	jm3.setMnemonic(KeyEvent.VK_2);
	jmt1.setMnemonic(KeyEvent.VK_N);
	jmt2.setMnemonic(KeyEvent.VK_O);
	jmt3.setMnemonic(KeyEvent.VK_S);
	jmt4.setMnemonic(KeyEvent.VK_F4);
	jmt5.setMnemonic(KeyEvent.VK_F5);
	jmt6.setMnemonic(KeyEvent.VK_F6);
	jmt7.setMnemonic(KeyEvent.VK_F7);
	jmt8.setMnemonic(KeyEvent.VK_F8);
	jmt1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK,true));
	jmt2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK,true));
	jmt3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK,true));
	jm1.add(jmt1);
	jm1.add(jmt2);
	jm1.add(jmt3);
	jm1.add(jmt4);
	jm2.add(jmc);
	jm2.add(jmt5);
	jm2.add(jmt6);
	jm2.add(jmt7);
	jm3.add(jmt8);
	jmb.add(jm1);
	jmb.add(jm2);
	jmb.add(jm3);
	pp.add(jmt5);
	pp.add(jmt6);
	pp.add(jmt7);
	jmt1.addActionListener(new AtionHead());
	jmt2.addActionListener(new AtionHead());
	te.addMouseListener(new MouseAdapter() {
		public void mouseReleased(MouseEvent e) {
		if(e.isPopupTrigger()) {
			pp.show(te, e.getX(), e.getY());
		}
		}

	});
	bu1.setToolTipText("剪切文本到文本框");
	bu2.setToolTipText("复制文本到文本框");
	bu3.setToolTipText("粘贴文本到文本框");
	tools.add(bu1);
	tools.add(bu2);
	tools.add(bu3);
	this.setJMenuBar(jmb);
	jmt4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	});
	this.add(scopan,BorderLayout.CENTER);
	this.add(tools, BorderLayout.NORTH);	
}

class AtionHead implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jmt1) {
			newfile();
		}
		if(e.getSource()==jmt2) {
			openfile();
		}
	}
	}
public void newfile() {
	if(!te.getText().equals("")) {
		savefile();
	}
	te.setText(null);
	file=null;
	this.setTitle("新建文本文档");
}
public void savefile() {
	if(file!=null&&file.exists()) {
		try {
			FileWriter fw=new FileWriter(file);
			te.write(fw);
			fw.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
public void openfile() {
	if(fchoose.showOpenDialog(this)==fchoose.APPROVE_OPTION) {
		file=fchoose.getSelectedFile();
		try {
			FileReader fr=new FileReader(file);
			te.read(fr, null);
			this.setTitle(file.getName()+"-文本编辑器");
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
public static void main(String[] args) {
	new Textedit();
}
}

