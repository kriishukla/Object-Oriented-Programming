import java.util.List;

public class wildcard {
    public static double sumArray(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Integer list
        List<Integer> intList = List.of(1, 2, 3, 4, 5);

        // Double list
        List<Double> doubleList = List.of(1.5, 2.5, 3.5, 4.5, 5.5);

        double intSum = sumArray(intList);
        double doubleSum = sumArray(doubleList);

        System.out.println("Sum of integers: " + intSum);
        System.out.println("Sum of doubles: " + doubleSum);
    }
}
