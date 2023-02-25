package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next(); //used to read a single token or word
		System.out.println(shape);
		
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		StdDraw.setPenColor(red, green, blue);
		
		boolean filled = in.nextBoolean();
		
		double x = in.nextDouble();
		double y = in.nextDouble();
		double hw = in.nextDouble();
		double hh = in.nextDouble();
		if (shape.equals("rectangle")) {
			if(filled)
			{
				StdDraw.filledRectangle( x,  y , hw,  hh);
			}
			else 
			{
				StdDraw.rectangle( x ,  y ,  hw, hh);
			}
		} else {
			if(filled)
			{
				StdDraw.filledEllipse( x,  y , hw,  hh);
			}
			else 
			{
				StdDraw.ellipse( x ,  y ,  hw, hh);
			}
		}
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, .4, .2 );
		
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledRectangle(0.8, 0.5, .05, .05 );
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.2);
		
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledRectangle(0.2, 0.4, .1, .1 );
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledEllipse(0.75, 0.6, 0.1, 0.1);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.line(0.2, 0.3, 0.4, 0.5);
		StdDraw.line(0.2, 0.3, 0.6, 0.3);
		StdDraw.line(0.6,0.3,0.4,0.5);
	}
}
