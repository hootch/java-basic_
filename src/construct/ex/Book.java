package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this("", "", 0);
    }
    Book(String title){
        this(title, "unknown", 0);
    }
    Book(String title, String author){
        this(title, author, 0);
    }
    Book(String t, String a, int p){
        title = t;
        author = a;
        page = p;
    }
    void displayInfo(){
        System.out.println("Title : " + title);
        System.out.println("author : " + author);
        System.out.println("page : " + page);
    }
}
