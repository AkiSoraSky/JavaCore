package pack2;

import java.util.Scanner;

public class CollegeLibrary extends Library {

    private String college;

    public CollegeLibrary(String college, int bookcount, String librarian) {
        super(bookcount, librarian);
        this.college = college;
    }

    public void lendBook(String title, int stdId) {
        boolean found = false;
        for (String book : books) {
            if (book != null) {
                if (book.equalsIgnoreCase(title)) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println(title + " was lent to " + stdId);
        }
        else {
            System.out.println(title + " not available");
        }
    }

    public static void main(String[] args) {
        CollegeLibrary cl = new CollegeLibrary("LALALALA", 20, "Sharma Ji Ka Beta");
        cl.addBook(0, "Legion dubara aayega");
        cl.addBook(1, "Legion dubara firse aayega");
        cl.addBook(2, "Legion dubara aake jaega");
        cl.addBook(3, "Legion dubara aake jaega lekin fir aayega");
        cl.addBook(4, "Legion dubara aake jaega lekin fir aayega then fir jaega");

        cl.showBooks();

        cl.lendBook("Legion dubara aayega", 20);
    }
}
