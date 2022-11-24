import java.util.*;

public class Dequeue {
    Deque<Integer> dq;
    boolean flag = true;
    // flag true is insertion form front and false is insertion from end

    public Dequeue() {
        this.dq = new LinkedList<Integer>();
    }

    public void insert(int key) {
        if (this.dq.isEmpty()) {
            dq.add(key);
            flag = false;
            System.out.println("inserted : " + key);
        } else if (flag) {
            if (key > this.dq.getFirst()) {
                this.dq.addFirst(key);
                System.out.println("inserted : " + key);
                flag = false;

            } else if (key > this.dq.getLast()) {
                this.dq.addLast(key);
                System.out.println("inserted : " + key);
                flag = false;
            } else {
                System.out.println("Insertion conditiions not met for key " + key);
                flag = false;
                return;
            }
        } else {
            if (key > this.dq.getLast()) {
                this.dq.addLast(key);
                System.out.println("inserted : " + key);
                flag = true;
            } else if (key > this.dq.getFirst()) {
                this.dq.addFirst(key);
                System.out.println("inserted : " + key);
                flag = true;
            } else {
                System.out.println("Insertion conditiions not met for key " + key);
                flag = true;
                return;
            }
        }
    }
}