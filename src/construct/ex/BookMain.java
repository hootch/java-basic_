package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();
        Book book2 = new Book("제목임");
        book2.displayInfo();
    }
}
