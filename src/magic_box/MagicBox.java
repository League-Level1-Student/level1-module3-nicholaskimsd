package magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	/*
	 * We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the magic_box package) to play sounds, 
	 *    show images or speak.
	 * 
	 * 3. Choose 3 different locations on the background image.You can either use the mouse position, 
	 *    or the color of the image, then decide what action the Media Palace should take in each case. 
	 *     backgroundImage.getRGB(e.getX(), e.getY()) will give you the color of the current pixel.
	 */

	BufferedImage backgroundImage;
	MediaPalace hi =new MediaPalace();


	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.addMouseListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/magic_box/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	//hi.playMusicOnComputer("src/Daequan.mp3");
		
		int go = e.getY();
		int stop = e.getX();
		System.out.println(go);
		System.out.println(stop);
		int i = 0;
		if(e.getX()==172&&e.getY()==55) {
			JOptionPane.showMessageDialog(null, "You have found a clue find the next clue");
		
		}
		if(e.getX()==104&&e.getY()==467) {
			JOptionPane.showMessageDialog(null, "you have found the clue you will buy new pants.  Find the next clue for your good boiii points");
			
		}
		if(e.getX()==0&&e.getY()==467) {
			String lol = JOptionPane.showInputDialog("YOu have found the final clue, for the good boiiii points you need to answer these questions."
					+ "the first one is whats 9+10");
			if(lol.equalsIgnoreCase("21")) {
				
				JOptionPane.showMessageDialog(null, "Good job you have 2 more questions");
				i++;
				
			}
			else {
				JOptionPane.showMessageDialog(null, "you suck and your trash go back to your hole.  LEAVE YOU ARE NOT WORTHY");
				
			}
			String ko = JOptionPane.showInputDialog("Whose better Daequan or Ninja");
			if(ko.equalsIgnoreCase("Ninja")) {
				JOptionPane.showMessageDialog(null, "your a legend");
				i++;
			}
			else {
				JOptionPane.showMessageDialog(null, "your a disgrace LEAVE NOW");
			}
			String jo = JOptionPane.showInputDialog("How many protons and electrons are in TUngsten");
			if(jo.equalsIgnoreCase("148")) {
				JOptionPane.showMessageDialog(null, "Wow good Job Nerd, but actually your a legend");
				 i++;
			}
			else {
				JOptionPane.showMessageDialog(null, "STUPEEEEEEEEEEEEEEEE");
			}
			if(i==3) {
				JOptionPane.showMessageDialog(null, "YOUR INSANE nad you get super boiiii points");
			}
			 if (i==2) {
				JOptionPane
				.showMessageDialog(null, "MEH");
			}
			 else {
				 JOptionPane.showMessageDialog(null, "your actually Shareeish trassh");
			 }
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


