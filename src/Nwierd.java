import java.util.Scanner;
public class Nwierd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N % 2 == 1) {

            System.out.println("Weird");
        }

        else {
            if ((N >= 2) && (N <= 5))
            {
                System.out.println("Not Weird");
            }
            else if ((N >= 6) && (N <= 20)) {
                System.out.println("Weird");

            }

            else if (N > 20)
            {
                    System.out.println("Not Weird");
            }

            }
        }
    }

