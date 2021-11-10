package com.example.libraryBackend.model;

import java.util.List;

public class Books {
    private String id;
    private String title;
    private List<String> authors;
    private String publishers;
    private String publishedDate;
    private String description;
    private String type;
    private String identifier;
    private int pageCount;
    private String printType;
    private List<String> categories;
    private double averageRating;
    private String maturityRating;
    private String contentVersion;
    private String thumbnail;
    private String language;
    private String previewLink;
    private String infoLink;
    private Boolean isEbook;
    private Boolean isPdfAvailable;
    private String webReaderLink;

    public Books(){

    }

    public Books(String id, String title, List<String> authors, String publishers, String publishedDate,
                 String description, String type, String identifier, int pageCount, String printType,
                 List<String> categories, double averageRating, String maturityRating, String contentVersion,
                 String thumbnail, String language, String previewLink, String infoLink, Boolean isEbook,
                 Boolean isPdfAvailable, String webReaderLink) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publishers = publishers;
        this.publishedDate = publishedDate;
        this.description = description;
        this.type = type;
        this.identifier = identifier;
        this.pageCount = pageCount;
        this.printType = printType;
        this.categories = categories;
        this.averageRating = averageRating;
        this.maturityRating = maturityRating;
        this.contentVersion = contentVersion;
        this.thumbnail = thumbnail;
        this.language = language;
        this.previewLink = previewLink;
        this.infoLink = infoLink;
        this.isEbook = isEbook;
        this.isPdfAvailable = isPdfAvailable;
        this.webReaderLink = webReaderLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    public String getContentVersion() {
        return contentVersion;
    }

    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    public String getInfoLink() {
        return infoLink;
    }

    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    public Boolean getEbook() {
        return isEbook;
    }

    public void setEbook(Boolean ebook) {
        isEbook = ebook;
    }

    public Boolean getPdfAvailable() {
        return isPdfAvailable;
    }

    public void setPdfAvailable(Boolean pdfAvailable) {
        isPdfAvailable = pdfAvailable;
    }

    public String getWebReaderLink() {
        return webReaderLink;
    }

    public void setWebReaderLink(String webReaderLink) {
        this.webReaderLink = webReaderLink;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                ", publishers='" + publishers + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", identifier='" + identifier + '\'' +
                ", pageCount=" + pageCount +
                ", printType='" + printType + '\'' +
                ", categories=" + categories +
                ", averageRating=" + averageRating +
                ", maturityRating='" + maturityRating + '\'' +
                ", contentVersion='" + contentVersion + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", language='" + language + '\'' +
                ", previewLink='" + previewLink + '\'' +
                ", infoLink='" + infoLink + '\'' +
                ", isEbook=" + isEbook +
                ", isPdfAvailable=" + isPdfAvailable +
                ", webReaderLink='" + webReaderLink + '\'' +
                '}';
    }
}
