public class BookApp {
    public static void main(String[] args){
        Book a = new Book("Illiad","Homer","A heroic story of a man",
                55.00,"Yes");
        Book b = new Book("The Giver","Lois Lowry","A dystopian world without color or pain",
                5.99,"No");
        System.out.println(a.getDisplayText());
        System.out.println(b.getDisplayText());
    }
}
