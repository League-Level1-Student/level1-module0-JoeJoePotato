
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


public class cutnessTv implements ActionListener {
	JButton duck=new JButton();
	JButton frog=new JButton();
	JButton unicorn=new JButton();
	Dimension SMALL = new Dimension(200,200);
	public static void main(String[] args) {
		cutnessTv ct=new cutnessTv();
		ct.showButton();
	}
	public void showButton() {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		duck.addActionListener(this);
		duck.setSize(SMALL);
	duck.setText("Ducks!!!");
		
	frog.addActionListener(this);
	frog.setSize(SMALL);
frog.setText("Frogs!!!");

unicorn.addActionListener(this);
unicorn.setSize(SMALL);
unicorn.setText("Unicorns!!!");

panel.add(duck);
panel.add(frog);
panel.add(unicorn);
frame.pack();
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==duck) {
		showDucks();
	}else if(buttonPressed==frog) {
		showFrog();
	}else {
		showFluffyUnicorns();
	}
	}
}
