package com.laily.newproject.Model;

public class Book {
    private  String id,pdfTitle,pdfUrl;

    public Book(){

    }

    public Book(String id, String pdfTitle, String pdfUrl) {
        this.id = id;
        this.pdfTitle = pdfTitle;
        this.pdfUrl = pdfUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPdfTitle() {
        return pdfTitle;
    }

    public void setPdfTitle(String pdfTitle) {
        this.pdfTitle = pdfTitle;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }
}
