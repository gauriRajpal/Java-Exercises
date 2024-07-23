class Library{
    String[] books;
    int noOfBooks;
    Library(){
        this.books = new String[100];
        this.noOfBooks = 0;
    }
    void addBooks(String Book){
        this.books[noOfBooks] = Book;
        noOfBooks++;
        System.out.println(Book+"Has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are : ");
        for(String book : this.books){
            if(book==null){
                continue;
            }
            System.out.println(" "+book);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book))
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String Book){
        addBooks(Book);
    }
}

public class Implement_a_library_using_class {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBooks("Pride and perjudice");
        centralLibrary.addBooks("Harry Potter and the prisoner of askaban");
        centralLibrary.issueBook("Count Dracula");
        centralLibrary.returnBook("Heidi");
        centralLibrary.showAvailableBooks();
    }
}
