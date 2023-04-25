import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String input = "";

        while (!input.equalsIgnoreCase("stop")) {

            int uwu = random.nextInt(10);
            int oni = random.nextInt(10);

            int res = uwu * oni;

            System.out.printf("%d x %d ?%n", uwu, oni);

            try {

                int reponse = scanner.nextInt();

                if (reponse == res) {
                    System.out.println("vrai");
                } else {
                    System.out.println("faux");
                }
                scanner.nextLine();
            } catch (Exception e) {
                break;
            }
        }
        scanner.close();
        System.out.println("fin");
    }
}
