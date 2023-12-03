import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Boxpair<T, S> {
    private T t;
    private S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() {
        return t;
    }

    public S getSecond() {
        return s;
    }

    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(8) + 1;
            randomNumbers.add(randomNumber);
        }

        int product = 1;
        for (int num : randomNumbers) {
            product *= num;
        }

        Boxpair<Integer, List<Integer>> box = new Boxpair<>();
        box.add(product, randomNumbers);

        System.out.println("First: " + box.getFirst());
        System.out.println("Second: " + box.getSecond());
    }
}
