import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size for the dequeue : ");
        int n = Integer.parseInt(sc.nextLine());
        Dequeue dq = new Dequeue();
        System.out.println("Enter " + n + " numbers in order of their insertion");
        for (int i = 0; i < n; i++) {
            dq.insert(Integer.parseInt(sc.nextLine()));
        }
        System.out.println("The dequeue after insertions is : ");
        for (int i : dq.dq) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
