package mod8;

import java.io.*;
import java.util.Random;

/**
 * Responsible for generate an image.
 * 
 * @author Nick Hamnett
 * @version 2019-06-25
 *
 */
public class ImageDriver {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// Open image as random access file.
		RandomAccessFile raf = new RandomAccessFile(new File("example.ppm"), "rw");

		// Jump to beginning of file.
		raf.seek(0);

		// Width and height of the image.
		int width = 300;
		int height = 300;

		// Write information about the image.
		String header = "P6\n";
		raf.write(header.getBytes()); // writeChars writes each char as 2 bytes.

		String widthHeight = String.format("%d %d\n", width, height);
		raf.write(widthHeight.getBytes());

		String colorLimit = "255\n";
		raf.write(colorLimit.getBytes());

		// Use Random to generate a random red, green and blue value.
		Random rand = new Random();

		// Loop through each row
		for (int row = 0; row < height; row++) {
			// Loop through each column in row
			for (int col = 0; col < width; col++) {
				int red = rand.nextInt(255);
				int green = rand.nextInt(255);
				int blue = rand.nextInt(255);

				raf.writeByte(red);
				raf.writeByte(green);
				raf.writeByte(blue);
			}
		}

		raf.close();

		System.out.println("Generated image!");
		System.out.println("Use http://paulcuth.me.uk/netpbm-viewer/ to view it.");
	}

}
