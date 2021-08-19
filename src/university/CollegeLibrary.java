package university;

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
        CollegeLibrary cl = new CollegeLibrary("LU", 20, "Sharma Ji Ka Beta");

        cl.addBook(0, "Legion");
        cl.addBook(1, "The Spy");
        cl.addBook(2, "Conjuring");
        cl.addBook(3, "Harry Potter");
        cl.addBook(4, "Naruto");

        cl.showBooks();
        Scanner sc = new Scanner(System.in);
        String bookName = sc.nextLine();
        cl.lendBook(bookName, 20);
    }
}
