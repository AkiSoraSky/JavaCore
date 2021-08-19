package university;

public class Library {
    private int bookcount;
    public String[] books = new String[100];
    public String librarian;

    public Library(int bookcount, String librarian) {
        this.bookcount = bookcount;
        this.librarian = librarian;
    }

    protected void addBook(int pos, String title) {
        books[pos] = title;
    }

    protected void showBooks() {
        System.out.println("The books has following Books");
        for (String book : books) {
            if (book != null)
                System.out.println(">>" + book);
            }
    }
}
