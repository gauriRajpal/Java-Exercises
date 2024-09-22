import java.util.*;

class Library{
    public ArrayList<book> books;
    public Library(ArrayList<book> books){
        this.books = books;
    }
    public void addBooks(book b){
        System.out.println("The book has been added to the library");
        this.books.add(b);
    }
    public void returnBook(book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
    public void issuedBook(book b,String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);;
        this.books.remove(b);
    }
}

class book{
    public String name, author;
    public book (String name,String author){
        this.name=name;
        this.author = author;
    }
    @Override
    public String toString(){
        return "Book{" +"name=" +name + '\'' + ",author=" + author +'\'' +'}';
    }
}

public class Library_managment{
    public static void main(String[] args) {
        ArrayList<book> bk = new ArrayList<>();
        book b1 = new book("Algorithm","clrs");
        book b2 = new book("C++","John");
        book b3 = new book("Harry Potter","J.K. Rowling");
        book b4 = new book("Percy Jackson","Rick Rordan");
        bk.add(b1);
        bk.add(b2);
        bk.add(b3);
        bk.add(b4);
        Library l = new Library(bk);
        System.out.println(l.books);
        l.issuedBook(b4, "Ram");
        System.out.println(l.books);
    }
}