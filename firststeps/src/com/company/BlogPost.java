package com.company;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    // "Lorem Ipsum", írta Gipsz Jakab, posztolva: "2000.05.04."
    //Lorem ipsum dolor sit amet.

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;

    }

    public BlogPost() {

    }

}
