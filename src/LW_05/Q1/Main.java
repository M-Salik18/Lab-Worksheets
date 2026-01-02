package LW_05.Q1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Seena Maragatham","Sujatha Thilaka","9789553023975",true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala","Seynamasasekaka", "9789553548721",true);
        Book book3 = new Book("Island of a Thousand Mirrors","Nayomi Munaweera","9781616953623",true);

        Library FCTLibrary = new Library();
        FCTLibrary.addLibraryItems(book1);
        FCTLibrary.addLibraryItems(book2);
        FCTLibrary.addLibraryItems(book3);

        FCTLibrary.displayLibraryInfo();
        FCTLibrary.listAllBorrowableItems();
        System.out.println("");
        FCTLibrary.checkOutBorrowableItems("Island of a Thousand Mirrors");
        System.out.println("");
        FCTLibrary.displayLibraryInfo();
        FCTLibrary.listAllBorrowableItems();

    }
}
