import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char fillCharacter;

        for (;;) {

            System.out.print("Enter size (1-50): ");
            int size = scanner.nextInt();

            if (size < 1 || size > 50) {
                System.out.println("Size must be between 1-50!");
                continue;
            }

            System.out.print("Enter fill character: ");
            fillCharacter = scanner.next().charAt(0);

            for (int i = 1; i <= size; i++) {
                for (int j = 0; j < size - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(fillCharacter);
                    if (j < i - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}