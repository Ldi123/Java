package abcd;

import javax.swing.JOptionPane;

public class good {
public static void main(String[] args) {
	int op = 0;
	String s1="�Ұ���";
	String st=JOptionPane.showInputDialog("�������Ұ��㣺");
	while(true) {
		if(st==null) {
		JOptionPane.showMessageDialog(null, "�����Ҳ�����ر�!");
		st=JOptionPane.showInputDialog("�������Ұ��㣺");
		}
		if(st.equalsIgnoreCase("�Ұ���")) {
			JOptionPane.showMessageDialog(null, "��Ҳ���㣡");
			System.exit(0);
		}else{
	op=JOptionPane.showConfirmDialog(null, "��֪������˵�����Ұ���");
	if(op==JOptionPane.YES_OPTION) {
		JOptionPane.showMessageDialog(null, "��Ҳ����!");
		st=null;
		System.exit(0);
	}
	if(op==JOptionPane.CANCEL_OPTION) {
			while(st==null) {
			JOptionPane.showMessageDialog(null, "�����Ҳ�����ر�!");
			st=JOptionPane.showInputDialog("�������Ұ��㣺");
		}
	}
	
	}
		if(op==JOptionPane.ERROR_MESSAGE) {
			if(st==null) {
			JOptionPane.showMessageDialog(null, "�����Ҳ�����ر�!");
			st=JOptionPane.showInputDialog("�������Ұ��㣺");
			}
		}
	else {
		JOptionPane.showMessageDialog(null, "�����Ҳ�����ر�!");
		st=JOptionPane.showInputDialog("�������Ұ��㣺");
	}
}

}
}

