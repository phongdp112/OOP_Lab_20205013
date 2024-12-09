// DigitalVideoDisc.java
package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDisc = 0;

    // Constructors
    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDisc, title);
     
    }

    public DigitalVideoDisc(String title, String category, float cost) {
      super(++nbDigitalVideoDisc, title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(++nbDigitalVideoDisc, title, category, director, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDisc, title, category, director, length, cost);
    }

    // Override toString() method
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $";
    }

    // Method to check if title matches
    public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title);
    }

}
