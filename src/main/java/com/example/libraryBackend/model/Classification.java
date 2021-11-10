package com.example.libraryBackend.model;

public class Classification {
    private String title;
    private String imageUrl;

    public Classification(){

    }

    public Classification(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Classification{" +
                "title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
