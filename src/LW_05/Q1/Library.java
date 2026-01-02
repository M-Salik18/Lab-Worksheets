package LW_05.Q1;

import java.util.ArrayList;
public class Library {
    private ArrayList<Book> BorrowableItemsList = new ArrayList<>();

    public void addLibraryItems(Book borrowableItems){
        BorrowableItemsList.add(borrowableItems);
    }
    public void checkOutBorrowableItems(String title){
        for(Book book: BorrowableItemsList){
            if(book.getTitle().equals(title) && book.isAvailable()){
                System.out.println("Book is Available");
                System.out.println("Checking out: " + book.getTitle());
                book.setAvailable(false);
            }
        }
    }

    public void listAllBorrowableItems(){
        System.out.println("Available Books");
        System.out.println("------------------------------");
        for(Book book: BorrowableItemsList){
            if(book.isAvailable()){
                System.out.println(book.getTitle());
            }
        }
    }

    public void displayLibraryInfo(){
        int count=0;
        for (Book book: BorrowableItemsList){
            if(book.isAvailable()){
                count++;
            }
        }
        System.out.println("Number of books available: "+count);
    }
}
