import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class SoundEffects implements ActionListener {
	JButton cymbal=new JButton();
	JButton drum=new JButton();
	JButton woohoo=new JButton();
	JButton sw=new JButton();
	Dimension SMALL = new Dimension(200,200);
	
	public static void main(String[] args) {
		SoundEffects sf=new SoundEffects();
		sf.showButton();
	}
public void showButton() {
	JFrame frame=new JFrame();
	frame.setVisible(true);
	JPanel panel=new JPanel();
	frame.add(panel);
	
	
	cymbal.setSize(SMALL);
	cymbal.addActionListener(this);
	cymbal.setText("cymbal");
	
	
	drum.setSize(SMALL);
	drum.addActionListener(this);
	drum.setText("drum");

	
	woohoo.setSize(SMALL);
	woohoo.addActionListener(this);
	woohoo.setText("woohoo");
	
	
	sw.setSize(SMALL);
	sw.addActionListener(this);
	sw.setText("sawing wood");
	
	panel.add(cymbal);
	panel.add(drum);
	panel.add(woohoo);
	panel.add(sw);
	frame.pack();
	frame.setTitle("select a sound effect");
}
private void sound(String file) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(file));
	sound.play();}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) arg0.getSource();
	
	if(buttonPressed==cymbal) {
sound("cymbal.wav");
}else if(buttonPressed==drum) {
	sound("drum.wav");
	}else if(buttonPressed==woohoo) {
		sound("homer-woohoo.wav");
	}else{
		sound("sawing-wood-daniel_simon.wav");
	}
	
}
}
