import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operands operands = new Operands();
        Logic logic = new Logic();
        System.out.println("Welcome to calculator");
        logic.operation(operands.getInt(), operands.getChar(), operands.getInt());
        System.out.println("****************");
        System.out.println("Program was finished");
    }
}
