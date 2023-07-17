import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountMultiples {

    public static Map<Integer, Integer> countMultiples(int[] numbers) {
        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Map<Integer, Integer> result = new HashMap<>();

        for (int multiple : multiples) {
            int count = 0;
            for (int num : numbers) {
                if (num % multiple == 0) {
                    count++;
                }
            }
            result.put(multiple, count);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        int[] inputList = new int[n];

        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            inputList[i] = scanner.nextInt();
        }

        Map<Integer, Integer> output = countMultiples(inputList);

        // Printing the output with colons instead of equals signs
        System.out.print("{");
        for (Map.Entry<Integer, Integer> entry : output.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            if (entry.getKey() != 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
