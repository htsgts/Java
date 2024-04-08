package test.textarea;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaTest1 extends JFrame {
	String[] lblStrs = {"작성자:","글제목:","내용:"};
	String[] locs = {"North","Center","South"};
	int[] cols = {7, 20, 30};
	JPanel[] pans = new JPanel[lblStrs.length];
	JLabel[] lbls = new JLabel[lblStrs.length];
	JTextField[] tfs = new JTextField[lblStrs.length-1];
	JTextArea ta = new JTextArea(7,cols[2]);
			
	public JTextAreaTest1() {
		for(int i=0;i<lblStrs.length;i++) {
			pans[i] = new JPanel(new FlowLayout(FlowLayout.LEFT));
			lbls[i] = new JLabel(lblStrs[i]);
			pans[i].add(lbls[i]);
			if(i<2) {
				tfs[i] = new JTextField(cols[i]);
				pans[i].add(tfs[i]);
			}else {
				pans[i].add(ta);
			}
			
			add(pans[i], locs[i]);
		}
		setTitle("JTestArea");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 250, 400, 250);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new JTextAreaTest1();

	}

}
