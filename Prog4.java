import java.util.*;

public class MultiplesCount {
    public static Map<Integer, Integer> getMultiplesCount(List<Integer> numbers, List<Integer> multiples) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int multiple : multiples) {
            countMap.put(multiple, 0); // Initialize count for each multiple
        }

        for (int number : numbers) {
            for (int multiple : multiples) {
                if (number % multiple == 0) {
                    countMap.put(multiple, countMap.get(multiple) + 1);
                }
            }
        }

        return countMap;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        List<Integer> multiples = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Integer, Integer> counts = getMultiplesCount(numbers, multiples);

        System.out.println(counts);
    }
}