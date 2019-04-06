package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel2Frame2 extends JPanel implements ActionListener{
	JButton Button1 = new JButton("Prev");
	JFrame frame;
	public Panel2Frame2(JFrame frame) {
		add(Button1 );
		Button1.addActionListener(this);
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Button1) {
			new MainFrame();
			frame.dispose();
		}
	}

}
