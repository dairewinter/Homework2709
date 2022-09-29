package ObjectsAndClasses;

import java.util.PrimitiveIterator;

public class Book {
    private String title;
    private Author author;
    private int yearPublishing;

    public Book (String title, Author author, int yearPublishing){
        this.author = author;
        this.title = title;
        this.yearPublishing = yearPublishing;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getYearPublishing(){
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing){
        this.yearPublishing = yearPublishing;


    }

}
