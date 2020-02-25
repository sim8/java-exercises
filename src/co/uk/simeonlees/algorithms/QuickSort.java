package co.uk.simeonlees.algorithms;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class QuickSort extends SortingAlgorithm {
    public int[] sort(int[] items) {
        if (items.length < 2) {
            return items;
        }
        int splitIndex = ThreadLocalRandom.current().nextInt(0, items.length); // nextInt is exclusive of upper bound
        int splitValue = items[splitIndex];

        // TODO - remove unnecessary conversion to/from stream
        int[] lower = Arrays.stream(items).filter(x -> x < splitValue).toArray();
        int[] upper = Arrays.stream(items).filter(x -> x >= splitValue).toArray();
        int[] lowerSorted = sort(lower);
        int[] upperSorted = sort(upper);
        return IntStream.concat(Arrays.stream(lowerSorted), Arrays.stream(upperSorted))
            .toArray();
    }
}
