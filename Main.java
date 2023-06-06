import java.util.List;

public class Main {
    public static void main(String[] args) {
        double radius = 5.0; // Example radius value
//qn 4
        Circle circle = new Circle(radius);

        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());

        // Modifying the radius
        circle.setRadius(7.5);

        System.out.println("Updated Circle Radius: " + circle.getRadius());
        System.out.println("Updated Circle Area: " + circle.calculateArea());
        System.out.println("Updated Circle Circumference: " + circle.calculateCircumference());

        // Create an Employee object
        Employee employee = new Employee("Emmanuel Nelson", " Engineer", 50000.0);

        // Display employee details
        employee.displayEmployeeDetails();

        // Update and display new salary
        employee.setSalary(55000.0);
        System.out.println("Updated salary: $" + employee.getSalary());

        // Increase salary by 10%
        employee.increaseSalary(10);
        System.out.println("Increased salary: $" + employee.getSalary());

// Create a book collection
        BookCollection collection = new BookCollection();

        // Add some books
        Book book1 = new Book("Tears of my mother", "Bake Robert Tumuhaise", "ISBN 1");
        Book book2 = new Book("Emma", "Jane Austen", "ISBN 2");
        Book book3 = new Book("Juliet &Romeo", "Shakespeare", "ISBN 3");
        Book book4 = new Book("Crazy Mom", "Shakespeare", "ISBN 4");

        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);
        collection.addBook(book4);

        // Display all books in the collection
        System.out.println("All Books:");
        List<Book> allBooks = collection.getAllBooks();
        for (Book book : allBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println();
        }

        // Remove a book
        collection.removeBook(book2);

        // Display all books after removal
        System.out.println("Books after removal:");
        allBooks = collection.getAllBooks();
        for (Book book : allBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println();
        }

    }

}
