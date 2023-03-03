import java.util.Scanner;

public class App {
    public static String input(String args) {
        System.out.println(args);
        Scanner inp = new Scanner(System.in);
        return inp.nextLine();
        };
    public static void main(String[] args) {
        String[] string = {"one", "two", "three", "four", "five"};

        for (int i = 0; i <= string.length-1; i++){
            System.out.println(string[i]);
        };
        System.out.println(input("Enter name plz uwu"));
    }
}
