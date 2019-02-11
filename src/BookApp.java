import java.util.Scanner;

public class BookApp {
    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);
        System.out.print("Enter the amount of books you would like: ");
        int amount = keybd.nextInt();
        Book a = new Book("Illiad","Homer","A heroic story of a man",
                55.45,"Yes", amount);
        Book b = new Book("The Giver","Lois Lowry","A dystopian world without color or pain",
                5.99, "No", amount);
        System.out.println(a.getDisplayText());
        System.out.println(b.getDisplayText());
    }
}
