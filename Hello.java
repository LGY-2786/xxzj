import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        greet(name);
        
        scanner.close();
    }
    
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}