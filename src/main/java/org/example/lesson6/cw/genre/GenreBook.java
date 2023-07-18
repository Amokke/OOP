package org.example.lesson6.cw.genre;

public class GenreBook implements Genre {
    private String genreName;

    public GenreBook(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String toGenre() {
        return genreName;
    }
}
