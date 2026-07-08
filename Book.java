

public class Book {

    // Method Overloading

    int numberOfPages = 111;
    String myBook(String title){
        return "This is my book";
    }
    int myBook(int numberOfPages){
        return 5;
    }
    boolean myBook(){
        return true;
    }
    public static void main(String[] args) {
        Book book = new Book();
        System.out.printf("%s\n", book.myBook("Tom and jerry"));
        System.out.printf("%d\n", book.myBook(12));
        System.out.printf("%b", book.myBook());
    }
}