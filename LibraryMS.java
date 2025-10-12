import java.util.*;
class Book{
    private String bookId;
    private String title;
    private String author;
    private String isIssued = "No";
    private String IssuedTo;
    Book(){}
    Book(String bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = "No";
        this.IssuedTo = "";
    }
    public String getBookId(){return bookId;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getIsIssued(){return isIssued;}
    public void issueBook(String memberId){
        this.IssuedTo = memberId;
        this.isIssued = "Yes";
    }
    public void returnBook(){
        this.IssuedTo = "";
        this.isIssued = "No";
    }
    public void displayInfo(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Is Issued: " + isIssued);
        if(isIssued.equals("Yes")){
            System.out.println("Issued To: " + IssuedTo);
        }
    }
}
abstract class Person{
    private String personId;
    private String name;
    private String email;
    Person(){}
    Person(String personId, String name, String email){
        this.personId = personId;
        this.name = name;
        this.email = email;
    }
    public String getPersonId(){return personId;}
    public String getName(){return name;}
    public String getEmail(){return email;}
    public void displayInfo(){}
}
class Student extends Person{
    private String courseName;
    private String rollNo;
    private List<String> Lended = new ArrayList<>();
    Student(String personId, String name, String email, String courseName, String rollNo){
        super(personId, name, email);
        this.courseName = courseName;
        this.rollNo = rollNo;
    }
    public void lendBook(String bookId){
        Lended.add(bookId);
        System.out.println("Book with ID " + bookId + " lent to student " + rollNo);
    }
    @Override
    public void displayInfo(){
        System.out.println("Student Info:");
        System.out.println("ID: " + getPersonId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Student Roll No: " + rollNo);
        System.out.println("Course Name: " + courseName);
    }
}

class Professor extends Person{
    private String departmentName;
    private String employeeId;
    private List<String> Lended = new ArrayList<>();
    private int CountofBooksLended = 0;
    Professor(String personId, String name, String email, String departmentName, String employeeId){
        super(personId, name, email);
        this.departmentName = departmentName;
        this.employeeId = employeeId;
    }
    public void lendBook(String bookId){
        if(this.CountofBooksLended >= 5){
            System.out.println("Cannot lend more than 5 books to a professor.");
            return;
        }
        Lended.add(bookId);
        CountofBooksLended++;
        System.out.println("Book with ID " + bookId + " lent to professor " + employeeId);
    }
    @Override
    public void displayInfo(){
        System.out.println("Professor Info:");
        System.out.println("ID: " + getPersonId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department Name: " + departmentName);
    } 
}

class Librarian{
    protected String LibrarianId;
    protected String name;
    Librarian(String LibrarianId, String name){
        this.LibrarianId = LibrarianId;
        this.name = name;
    }
    public void issueBook(Book book, Person person){
        if(book == null || person == null){
            System.out.println("Invalid book or person.");
            return;
        }
        if(person instanceof Student){
            ((Student)person).lendBook(book.getBookId());
            book.issueBook(person.getPersonId());
        } 
        else if(person instanceof Professor){
            ((Professor)person).lendBook(book.getBookId());
            book.issueBook(person.getPersonId());
        } 
        else {
            System.out.println("Unknown person type.");
        }
    }
    public void returnBook(Book book, Person person){
        if(book == null || person == null){
            System.out.println("Invalid book or person.");
            return;
        }
        book.returnBook();
        System.out.println("Book with ID " + book.getBookId() + " returned by " + person.getPersonId());
    }
}
public class LibraryMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        List<Person> members = new ArrayList<>();
        Librarian librarian = new Librarian("L001", "Mr. Smith");

        // Sample data
        books.add(new Book("B001", "Java Programming", "James Gosling"));
        books.add(new Book("B002", "Data Structures", "Robert Lafore"));
        books.add(new Book("B003", "Algorithms", "Thomas Cormen"));

        members.add(new Student("S001", "Alice", "alice@email.com", "CS", "R001"));
        members.add(new Professor("P001", "Dr. Bob", "bob@email.com", "IT", "E001"));

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display all books");
            System.out.println("2. Display all members");
            System.out.println("3. Issue book");
            System.out.println("4. Return book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    for (Book b : books) {
                        b.displayInfo();
                        System.out.println();
                    }
                    break;
                case 2:
                    for (Person p : members) {
                        p.displayInfo();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    String bookId = sc.nextLine();
                    System.out.print("Enter Member ID to issue to: ");
                    String memberId = sc.nextLine();
                    Book bookToIssue = null;
                    Person memberToIssue = null;
                    for (Book b : books) {
                        if (b.getBookId().equals(bookId)) {
                            bookToIssue = b;
                            break;
                        }
                    }
                    for (Person p : members) {
                        if (p.getPersonId().equals(memberId)) {
                            memberToIssue = p;
                            break;
                        }
                    }
                    librarian.issueBook(bookToIssue, memberToIssue);
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    String bookIdReturn = sc.nextLine();
                    System.out.print("Enter Member ID returning: ");
                    String memberIdReturn = sc.nextLine();
                    Book bookToReturn = null;
                    Person memberReturning = null;
                    for (Book b : books) {
                        if (b.getBookId().equals(bookIdReturn)) {
                            bookToReturn = b;
                            break;
                        }
                    }
                    for (Person p : members) {
                        if (p.getPersonId().equals(memberIdReturn)) {
                            memberReturning = p;
                            break;
                        }
                    }
                    librarian.returnBook(bookToReturn, memberReturning);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
