package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }


    @Override
    public boolean equals(Object o) {
        // Kiểm tra nếu đối tượng truyền vào là null hoặc không phải là đối tượng của lớp Track
        if (this == o) return true;  // Nếu là cùng đối tượng thì trả về true
        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;  // Ép kiểu Object sang Track
        if (length != track.length) return false;  // So sánh độ dài
        return title != null ? title.equals(track.title) : track.title == null;  // So sánh title
    }
    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength() + " minutes");
    }

    @Override
    public String toString() {
        return "Track - " + title + " - " + length + " minutes";
    }
    
}
