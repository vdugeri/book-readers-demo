/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rank;

/**
 *
 * @author Verem
 */
public class Book {

    private String authorName;
    private String ISBN;
    private String title;
    private int quantity;
    private boolean isAvailable;

    public Book(String authorName, String title) {
        this.authorName = authorName;
        this.title = title;
    }


    public void decrementQuantity() {
        if (isAvailable) {
            this.quantity -= 1;
        }
    }

    public boolean isAvailable() {
        return this.quantity > 0;
    }

}
