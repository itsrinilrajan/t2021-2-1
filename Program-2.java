import java.util.ArrayList;
import java.util.Scanner;

public class NumberSeriesGenerator {

    public static ArrayList<Integer> generateSeries(int x) {
        if (x <= 0) {
            return new ArrayList<>();
        }

        ArrayList<Integer> output = new ArrayList<>();
        int num = 1;

        while (output.size() < x) {
            output.add(num);
            num += 2;
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> series = generateSeries(x);
        System.out.println("Output for a = " + x + ": " + series);
    }
}
