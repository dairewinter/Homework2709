package ObjectsAndClasses;

import java.util.Objects;
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

    public String toString(){
        return this.title + " " + this.author;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Book)){
            return false;
        }
        if (this == obj){
            return true;
        }
        Book that = (Book) obj;
        return this.title.equals(that.title) && this.author.equals(that.author);
    }

    public int hashCode(){
        return Objects.hash(title, author);
    }
}
