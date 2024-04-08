package exam.main;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreBoard extends ScoreTest {
	String[] lblStrs = {"1위:","2위:","3위:"};
	JPanel[] pans = new JPanel[lblStrs.length];
	JLabel[] lbls = new JLabel[lblStrs.length];
	
	
	public ScoreBoard(){
	super.setLayout(new GridLayout(0,1));
		for(int i=0;i<lblStrs.length;i++) {
			pans[i] = new JPanel(new FlowLayout(FlowLayout.LEFT));
			lbls[i] = new JLabel(lblStrs[i]);
			pans[i].add(lbls[i]);
			add(pans[i]);
		}
		
		setTitle("순위 발표");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200,500,200);
		setVisible(true);
	}
}
