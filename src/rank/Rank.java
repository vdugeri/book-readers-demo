/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rank;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author Verem
 */
public class Rank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grade a = new Grade("A", 80);
        Grade b = new Grade("B", 70);
        Grade aPlus = new Grade("A+", 90);
        Grade c = new Grade("C", 60);

        PriorityQueue<Grade> queue = new PriorityQueue<>(10);
        queue.add(b);
        queue.add(aPlus);
        queue.add(c);
        queue.add(a);

        Iterator iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(queue.poll());
        }
    }

}
