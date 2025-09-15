package JavaDataTypes;

/*
Track:
Book ID (int), title (String), price (double), availability (boolean).
Output: Borrow/return status.
Focus: mixing primitive + non-primitive types.
 */

public class LibraryManagementEx {
    public static void main(String[] args) {

        int bookId = 1;
        String bookTitle = "2 States";
        double bookPrice = 500.50;
        boolean isBookAvailable = true;

        System.out.println("------------Library Management------------");
        System.out.println("Book ID:" + bookId);
        System.out.println("Book Title:" + bookTitle);
        System.out.println("Book Price:" + bookPrice);
        System.out.println("Book Availability:" + isBookAvailable);

    }
}