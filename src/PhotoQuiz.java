/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		int score = 0;
		quizWindow.setVisible(true);
		
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window
             // *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
                
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
              String URL = "https://indywithkids.com/wp-content/uploads/2018/06/fireworks.jpg";
		// 2. create a variable of type "Component" that will hold your image
              Component pic;
		// 3. use the "createImage()" method below to initialize your Component
              pic = createImage(URL);
		// 4. add the image to the quiz window
              quizWindow.add(pic);
		// 5. call the pack() method on the quiz window
              quizWindow.pack();
              pic.addMouseMotionListener(null);
		// 6. ask a question that relates to the image
              String input = JOptionPane.showInputDialog(null, "What are these? (Use singular words)");
		// 7. print "CORRECT" if the user gave the right answer
		// 8. print "INCORRECT" if the answer is wrong
                      if(input.equalsIgnoreCase("firework")) {
                    	 
                    	  JOptionPane.showMessageDialog(null, "CORRECT!");  
                    	   score++;
                      }else {
                    	  JOptionPane.showMessageDialog(null, "INCORRECT!");
                      }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
              quizWindow.remove(pic);
		// 10. find another image and create it (might take more than one line of code)
              String URL2 = "https://cdn-image.realsimple.com/sites/default/files/styles/portrait_435x518/public/silo-brown-egg.jpg?itok=7hn-7S9K";
              Component egg;
              egg = createImage(URL2);
        // 11. add the second image to the quiz window
              quizWindow.add(egg);
		// 12. pack the quiz window
              quizWindow.pack();
              egg.addMouseMotionListener(null);
        ////13. ask ?
              String input2 = JOptionPane.showInputDialog(null,"What is this?");
        ////14. check answer
              if (input2.equalsIgnoreCase("egg")) {
            	  JOptionPane.showMessageDialog(null, "CORRECT");
            	  score++;
              }else {
            	  JOptionPane.showMessageDialog(null, "INCORRECT!!!");
              }
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz(done)
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





