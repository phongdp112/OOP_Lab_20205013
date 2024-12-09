package hust.soict.hedspi.aims.media;


import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    // Constructor
    public CompactDisc(String title, String category,  String director, int length, float cost,  String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Add Track
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Track added successfully.");
        }
    }

    // Remove Track
    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Track removed successfully.");
        } else {
            System.out.println("Track not found in the CD.");
        }
    }

    // Get total length of CD
    @Override
    public int getLength() {
        return tracks.stream().mapToInt(Track::getLength).sum();
    }

    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + artist + " - " + getLength() + ": " + getCost() + " $";
    }
}
