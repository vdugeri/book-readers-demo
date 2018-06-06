/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Verem
 */
public class BorrowBook {

    public static void main(String[] args) {
        Member staff = new Staff();
        Member student = new Student();

        Book myCousinRachael = new Book("Daphne Du Maurier", "My Cousin Rachel");

        List<Book> shelf = new ArrayList<>();

        Borrow borrow = new Borrow(myCousinRachael, staff);
        Borrow borrower2 = new Borrow(myCousinRachael, student);

        PriorityQueue<Borrow> borrowersList = new PriorityQueue<>();

        borrowersList.add(borrow);
        borrowersList.add(borrower2);

        Iterator iterator = borrowersList.iterator();
        while (iterator.hasNext()) {
            Borrow borrow1 = borrowersList.poll();
            Book book = borrow1.getBook();

            if (book.isAvailable()) {
                lend(book);
            }

        }

    }

    private static void lend(Book book) {
        book.decrementQuantity();
    }

}
