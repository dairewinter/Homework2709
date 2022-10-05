import ObjectsAndClasses.Author;
import ObjectsAndClasses.Book;

public class Main {


    public static void main(String[] args) {
        Author dickens = new Author("Charles", "Dickens");
        Author smith = new Author("Patti", "Smith");

        Book oliverTwist = new Book("Oliver Twist", dickens, 1976);
        Book theYearOfTheMonkey = new Book ("The Year of the Monkey", smith, 2020);

        System.out.println("Автор: " + dickens.getName() + " " + dickens.getSurname() + ", Книга: " + oliverTwist.getTitle() + ", Год издания: " + oliverTwist.getYearPublishing());
        System.out.println("Автор: " + smith.getName() + " " + smith.getSurname() + ", Книга: " + theYearOfTheMonkey.getTitle() + ", Год издания: " + theYearOfTheMonkey.getYearPublishing());
        theYearOfTheMonkey.setYearPublishing(2019);
        System.out.println("Предыдущий год издания The year of the Monkey = " + theYearOfTheMonkey.getYearPublishing());
        System.out.println(dickens.toString());


    }

}