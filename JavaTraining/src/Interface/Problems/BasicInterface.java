package Interface.Problems;


interface LibraryItem {
    int getId();
    void borrow();
    void returnItem();
    boolean isBorrowed();
}

interface LibraryUser {
    String getName();
    void borrowItem(LibraryItem item);
    void returnItem(LibraryItem item);
}

class Book implements LibraryItem {
    private int id;
    private boolean borrowed;

    public Book(int id) {
        this.id = id;
        this.borrowed = false;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Book with ID " + id + " is borrowed.");
        } else {
            System.out.println("Book with ID " + id + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Book with ID " + id + " is returned.");
        } else {
            System.out.println("Book with ID " + id + " is not borrowed.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }
}

class DVD implements LibraryItem {
    private int id;
    private boolean borrowed;

    public DVD(int id) {
        this.id = id;
        this.borrowed = false;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("DVD with ID " + id + " is borrowed.");
        } else {
            System.out.println("DVD with ID " + id + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println("DVD with ID " + id + " is returned.");
        } else {
            System.out.println("DVD with ID " + id + " is not borrowed.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }
}

class LibraryMember implements LibraryUser {
    private String name;

    public LibraryMember(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void borrowItem(LibraryItem item) {
        if (!item.isBorrowed()) {
            item.borrow();
            System.out.println("Item with ID " + item.getId() + " is borrowed by " + name);
        } else {
            System.out.println("Item with ID " + item.getId() + " is already borrowed.");
        }
    }

    @Override
    public void returnItem(LibraryItem item) {
        if (item.isBorrowed()) {
            item.returnItem();
            System.out.println("Item with ID " + item.getId() + " is returned by " + name);
        } else {
            System.out.println("Item with ID " + item.getId() + " is not borrowed.");
        }
    }
}

public class BasicInterface {
    public static void main(String[] args) {

    	Book book1 = new Book(101);
        DVD dvd1 = new DVD(201);

        LibraryMember alice = new LibraryMember("Alice");

        alice.borrowItem(book1); 
        alice.borrowItem(book1); 

        alice.returnItem(book1); 
        alice.returnItem(book1); 

        alice.borrowItem(dvd1); 
    }
}
