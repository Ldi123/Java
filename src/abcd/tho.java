package abcd;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class tho {
public static void main(String[] args) {
	JFileChooser cho=new JFileChooser();
	int op=cho.showOpenDialog(null);
	if(op==JFileChooser.APPROVE_OPTION) {
		JOptionPane.showMessageDialog(null, "��ѡ��򿪵��ļ��ǣ�"+cho.getSelectedFiles());
	}else {
		JOptionPane.showMessageDialog(null, "��ȡ���򿪣�");
	}
}
}

