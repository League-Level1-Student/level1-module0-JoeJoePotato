
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	FortuneCookie fc=new FortuneCookie();
	fc.showButton();
}
	public void showButton(){
JFrame frame=new JFrame();
		frame.setVisible(true);
		JButton button=new JButton();
		frame.add(button);
		button.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand=new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "Your day will be great!");
		}else if(rand==1) {
			JOptionPane.showMessageDialog(null, "Your day will be better than average.");
		}else if(rand==2) {
			JOptionPane.showMessageDialog(null, "Your day will be fairly average");
		}else if(rand==3) {
			JOptionPane.showMessageDialog(null, "Your day will be worse than average.");
		}else {
			JOptionPane.showMessageDialog(null, "Your day will be terrible! Stay indoors.");
		}
	}
}
