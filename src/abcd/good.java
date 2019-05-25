package abcd;

import javax.swing.JOptionPane;

public class good {
public static void main(String[] args) {
	int op = 0;
	String s1="我爱你";
	String st=JOptionPane.showInputDialog("请输入我爱你：");
	while(true) {
		if(st==null) {
		JOptionPane.showMessageDialog(null, "不爱我不允许关闭!");
		st=JOptionPane.showInputDialog("请输入我爱你：");
		}
		if(st.equalsIgnoreCase("我爱你")) {
			JOptionPane.showMessageDialog(null, "我也爱你！");
			System.exit(0);
		}else{
	op=JOptionPane.showConfirmDialog(null, "我知道你想说的是我爱你");
	if(op==JOptionPane.YES_OPTION) {
		JOptionPane.showMessageDialog(null, "我也爱你!");
		st=null;
		System.exit(0);
	}
	if(op==JOptionPane.CANCEL_OPTION) {
			while(st==null) {
			JOptionPane.showMessageDialog(null, "不爱我不允许关闭!");
			st=JOptionPane.showInputDialog("请输入我爱你：");
		}
	}
	
	}
		if(op==JOptionPane.ERROR_MESSAGE) {
			if(st==null) {
			JOptionPane.showMessageDialog(null, "不爱我不允许关闭!");
			st=JOptionPane.showInputDialog("请输入我爱你：");
			}
		}
	else {
		JOptionPane.showMessageDialog(null, "不爱我不允许关闭!");
		st=JOptionPane.showInputDialog("请输入我爱你：");
	}
}

}
}

