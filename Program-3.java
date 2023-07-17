import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeriesGenerator {
    public static List<Integer> generateSeries(int a) {
        List<Integer> series = new ArrayList<>();
        int num = 1;
        int count = 0;
        
        while (count < a) {
            series.add(num);
            num += 2;
            count++;
        }
        
        if (a % 2 == 0) {
            series.remove(series.size() - 1); // Remove the last element if 'a' is even
        }
        
        return series;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        
        scanner.close();

        List<Integer> series = generateSeries(a);
        System.out.println("Generated Series: " + series);
    }
}
