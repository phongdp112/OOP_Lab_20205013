package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors;
    

    public boolean addAuthor(String authorName) {
        if (authorName == null || authorName.trim().isEmpty()) {
            return false; // Invalid author name
        }
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            return true; // Successfully added
        }
        return false; // Author already exists
    }

    public boolean removeAuthor(String authorName) {
        if (authorName == null || authorName.trim().isEmpty()) {
            return false; // Invalid author name
        }
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            return true; // Successfully removed
        }
        return false; // Author not found
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }
}
