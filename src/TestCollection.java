import java.util.Collection;
import java.util.List;
/**
 * @author Mokhammad Nadzhim
 * @version 1.0
 */

/**
 * A class that calculates the running time of operations in arraylist and linkedlist
 */
public class TestCollection {

    private TestCollection(){}

    /**
     * measures the execution time of n addition operations
     *
     * @param testList collection for the test
     * @param n        number of necessary elements
     * @return execution time
     */
    public static long testAdd(List<Integer> testList, int n) {
        long start = System.nanoTime();
        for (int i = 0; i < n; i++)
            testList.add(i);
        return System.nanoTime() - start;
    }

    /**
     * measures the time of n deletion operations from the first position
     *
     * @param testList collection for the test
     * @param n        number of necessary elements
     * @return execution time
     */
    public static long testRemoveFirst(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        for (int i = 0; i < n; i++)
            testList.remove(0);
        return System.nanoTime() - start;
    }

    /**
     * measures the time of n deletion operations from the last position
     *
     * @param testList collection for the test
     * @param n        number of necessary elements
     * @return execution time
     */
    public static long testRemoveLast(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        for (int i = n - 1; i >= 0; i--)
            testList.remove(i);
        return System.nanoTime() - start;
    }

    /**
     * measures the time of n removal operations from the middle
     *
     * @param testList collection for the test
     * @param n        number of necessary elements
     * @return execution time
     */
    public static long testRemoveCenter(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        int halfN = n / 2;
        for (int i = 0; i < n; i++)
            testList.remove(halfN - i / 2 - 1);
        return System.nanoTime() - start;
    }

    /**
     * we measure the time of receipt from all n positions
     *
     * @param testList collection for the test
     * @param n        number of necessary elements
     * @return execution time
     */
    public static long testGet(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        for (int i = 0; i < n; i++)
            testList.get(i);
        return System.nanoTime() - start;
    }

    /**
     * measures the time of n receiving operations from the first position
     *
     * @param testList collection for the test
     * @param n        number of necessary elements
     * @return execution time
     */
    public static long testGetFirst(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        for (int i = 0; i < n; i++)
            testList.get(0);
        return System.nanoTime() - start;
    }

    /**
     * measures the time of n receiving operations from the last position
     *
     * @param testList collection for the test
     * @param n        number of necessary elements
     * @return execution time
     */
    public static long testGetLast(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        for (int i = n - 1; i >= 0; i--)
            testList.get(n-1);
        return System.nanoTime() - start;
    }

    /**
     * measures the time of n operations of getting from the middle
     *
     * @param testList collection for the test
     * @param n        number of necessary elements
     * @return execution time
     */
    public static long testGetCenter(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        int halfN = n / 2;
        for (int i = 0; i < n; i++)
            testList.get(halfN);
        return System.nanoTime() - start;
    }

    /**
     * we measure the cleaning time
     *
     * @param testList collection for the test
     * @param n        number of necessary elements
     * @return execution time
     */
    public static long testClear(List<Integer> testList, int n) {
        addTo(n, testList);
        long start = System.nanoTime();
        testList.clear();
        return System.nanoTime() - start;
    }

    /**
     * complements the elements to the required amount
     *
     * @param count  required quantity
     * @param addCol collection to add
     */
    private static void addTo(int count, Collection<Integer> addCol) {
        for (int i = addCol.size(); i < count; i++)
            addCol.add(i);
    }
}