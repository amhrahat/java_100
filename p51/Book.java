package p51;

class Book {

    static int totalBooks;
    
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

   

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    
    }

    Book(String isbn){
        this( "Unknown", "Unknown", isbn);
    }

    public void borrowBook(){
        if(isBorrowed){

            System.out.println("Already booked "+ this.title);
        }
 
        else{
            System.out.println(this.title +" is borrowed, enjoy!");
            this.isBorrowed = true;
        }
    }

    public void returnBook(){
        if(isBorrowed){
            System.out.println(this.title +" is returend, thank you");
            this.isBorrowed = false;

        }
        else{
            System.out.println("Not borrowed yet");
        
        }

 
    } 

    public static int getTotalBooks(){
        return totalBooks;
    }
}
