package com.example.listdramas;

public class list_drama {
    private String name; // название
    private String genre;  // жанр
    private int photo; // обложка

    public list_drama(String name, String genre, int photo){

        this.name=name;
        this.genre=genre;
        this.photo=photo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPhoto() {
        return this.photo;
    }

    public void setFlagResource(int photo) {
        this.photo = photo;
    }
}
