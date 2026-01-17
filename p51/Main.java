package p51;

public class Main {
    public static void main(String[] args) {


        Book phyBook = new Book("Pysics", "Rahat", "1");
        Book cheBook = new Book("2");

        int bookNum = Book.getTotalBooks();
        System.out.println(bookNum);
        phyBook.borrowBook();
        phyBook.borrowBook();
        phyBook.returnBook();
        cheBook.returnBook();
        cheBook.borrowBook();
        cheBook.returnBook();
        System.out.println(Book.getTotalBooks());

        
    }
}
