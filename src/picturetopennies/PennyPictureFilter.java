package picturetopennies;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;

public class PennyPictureFilter {
    
    public static BufferedImage squareFilter(BufferedImage image, int resScan, int outputPennyPixelResolution, Color backgroundColor) {
        
        if (image == null) return null;
        if (resScan < 1) return null;
        if (outputPennyPixelResolution < 1) return null;
        
        int columns = image.getWidth() / resScan; //chops off end pixels if uneven divide
        int rows = image.getHeight() / resScan;
        
        int[][] greyValues = new int[rows][columns];
        Color[][] pennyColors = new Color[rows][columns];
        int[] tempPixel = new int[3];
        Raster raster = image.getData();
        BufferedImage outputImage = new BufferedImage(columns * outputPennyPixelResolution, rows * outputPennyPixelResolution, BufferedImage.TRANSLUCENT);
        Graphics2D graphicsOut = outputImage.createGraphics();
        
        for (int y = 0; y < rows; y++) { //for each square section
            for (int x = 0; x < columns; x++) {
                
                //get the average color for the section
                int totalRed = 0;
                int totalGreen = 0;
                int totalBlue = 0;
                
                for (int j = 0; j < resScan; j++) {
                    for (int k = 0; k < resScan; k++) {
                        int[] pixel = raster.getPixel(x * resScan + k, y * resScan + j, tempPixel);
                        totalRed += pixel[0];
                        totalGreen += pixel[1];
                        totalBlue += pixel[2];
                }}
                
                int averageRed = totalRed / (resScan * resScan);
                int averageGreen = totalGreen / (resScan * resScan);
                int averageBlue = totalBlue / (resScan * resScan);
                
                //convert average color of section to greyscale value
                int greyValue = (int) Math.round((0.2989 * averageRed) + (0.5870 * averageGreen) + (0.1140 * averageBlue));
                greyValues[y][x] = greyValue;
                
        }}
        
        //convert the greyscale values to a range of penny colors
        for (int y = 0; y < greyValues.length; y++) {
            for (int x = 0; x < greyValues[0].length; x++) {
                
                int greyValue = greyValues[y][x];
                
                double red =  (greyValue / 255.0) * (lightestPenny.getRed() - darkestPenny.getRed()) + darkestPenny.getRed();
                double green = (greyValue / 255.0) * (lightestPenny.getGreen() - darkestPenny.getGreen()) + darkestPenny.getGreen();
                double blue = (greyValue / 255.0) * (lightestPenny.getBlue() - darkestPenny.getBlue()) + darkestPenny.getBlue();
                
                int redInt = (int) Math.round(red);
                int greenInt = (int) Math.round(green);
                int blueInt =  (int) Math.round(blue);
                
                pennyColors[y][x] = new Color(redInt, greenInt, blueInt);
        }}
        
        //draw the output picture
        //background first
        graphicsOut.setColor(backgroundColor);
        graphicsOut.fillRect(0, 0, outputImage.getWidth(), outputImage.getHeight());
        
        //draw pennies
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                graphicsOut.setColor(pennyColors[y][x]);
                graphicsOut.fillOval(x * outputPennyPixelResolution, y * outputPennyPixelResolution, 
                                         outputPennyPixelResolution, outputPennyPixelResolution);
        }}
        
        return outputImage;
    }
    
    public static BufferedImage honeyCombFilter(BufferedImage image, int resScan, int outputPennyPixelResolution, Color backgroundColor) {
        
        if (image == null) return null;
        if (resScan < 1) return null;
        if (outputPennyPixelResolution < 1) return null;
        
        int penniesPerLargeRow = image.getWidth() / resScan; //chops off end pixels if uneven divide
        int rows = (int) (image.getHeight() / (resScan * ROOT3_OVER2) );
        
        int[][] greyValues = new int[rows][penniesPerLargeRow];
        Color[][] pennyColors = new Color[rows][penniesPerLargeRow];
        int[] tempPixel = new int[3];
        Raster raster = image.getData();
        
        int outputImageHeight = (int) ((rows * outputPennyPixelResolution * ROOT3_OVER2) + (outputPennyPixelResolution * (1 - ROOT3_OVER2)));
        BufferedImage outputImage = new BufferedImage(penniesPerLargeRow * outputPennyPixelResolution, outputImageHeight, BufferedImage.TRANSLUCENT);
        Graphics2D graphicsOut = outputImage.createGraphics();
        
        for (int y = 0; y < rows; y++) { //for each square section
            int numPenniesInCurrentRow = penniesPerLargeRow;
            if (y % 2 == 0) numPenniesInCurrentRow--; //ie small row
            for (int x = 0; x < numPenniesInCurrentRow; x++) {
                
                int yCoord = (int) (y * resScan * ROOT3_OVER2);
                int xCoord = x * resScan;
                if (y % 2 == 0) xCoord += resScan / 2;
                
                //get the average color for the section
                int totalRed = 0;
                int totalGreen = 0;
                int totalBlue = 0;
                
                for (int j = 0; j < resScan; j++) {
                    for (int k = 0; k < resScan; k++) {
                        
                        if (xCoord + k < image.getWidth() && yCoord + j < image.getHeight()) {
                            int[] pixel = raster.getPixel(xCoord + k, yCoord + j, tempPixel);
                            totalRed += pixel[0];
                            totalGreen += pixel[1];
                            totalBlue += pixel[2];
                        }
                }}
                
                int averageRed = totalRed / (resScan * resScan);
                int averageGreen = totalGreen / (resScan * resScan);
                int averageBlue = totalBlue / (resScan * resScan);
                
                //convert average color of section to greyscale value
                int greyValue = (int) Math.round((0.2989 * averageRed) + (0.5870 * averageGreen) + (0.1140 * averageBlue));
                greyValues[y][x] = greyValue;
                
        }}
        
        //convert the greyscale values to a range of penny colors
        for (int y = 0; y < greyValues.length; y++) {
            for (int x = 0; x < greyValues[0].length; x++) {
                
                int greyValue = greyValues[y][x];
                
                double red =  (greyValue / 255.0) * (lightestPenny.getRed() - darkestPenny.getRed()) + darkestPenny.getRed();
                double green = (greyValue / 255.0) * (lightestPenny.getGreen() - darkestPenny.getGreen()) + darkestPenny.getGreen();
                double blue = (greyValue / 255.0) * (lightestPenny.getBlue() - darkestPenny.getBlue()) + darkestPenny.getBlue();
                
                int redInt = (int) Math.round(red);
                int greenInt = (int) Math.round(green);
                int blueInt =  (int) Math.round(blue);
                
                pennyColors[y][x] = new Color(redInt, greenInt, blueInt);
        }}
        
        //draw the output picture
        //background first
        graphicsOut.setColor(backgroundColor);
        graphicsOut.fillRect(0, 0, outputImage.getWidth(), outputImage.getHeight());
        
        //draw pennies
        for (int y = 0; y < rows; y++) {
            int numPenniesInCurrentRow = penniesPerLargeRow;
            if (y % 2 == 0) numPenniesInCurrentRow--; //ie small row
            for (int x = 0; x < numPenniesInCurrentRow; x++) {
                
                int yCoord = (int) (y * outputPennyPixelResolution * ROOT3_OVER2);
                int xCoord = x * outputPennyPixelResolution;
                if (y % 2 == 0) xCoord += outputPennyPixelResolution / 2;
                
                graphicsOut.setColor(pennyColors[y][x]);
                graphicsOut.fillOval(xCoord, yCoord, outputPennyPixelResolution, outputPennyPixelResolution);
        }}
        
        return outputImage;
    }
    
    private static final Color darkestPenny = new Color(84, 61, 33);
    private static final Color lightestPenny = new Color(244, 155, 108);
    
    private static final double ROOT3_OVER2 = 0.86602540378443864676372317075294;
}
