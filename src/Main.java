import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Ввести количество элементов.");
        System.out.println("0)Выход.");
        Scanner in = new Scanner(System.in);
        int check=0;
        while (!in.hasNextInt()) {
            System.out.println("Ошибка. Неверный ввод. Введите число.");
            in.next();
        }
        int quit = in.nextInt();
        while (quit<0||quit>1) {
            System.out.println("Ошибка. Введите число 0 или 1.");
            quit = in.nextInt();
        }
        while (quit != 0)
        {
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();
            int N;
            while (!in.hasNextInt())
            {
                System.out.println("Ошибка. Неверный ввод. Введите целое число.");
                in.next();
            }
            N = in.nextInt();
            while (N<1) {
                System.out.println("Ошибка. Введите число больше нуля.");
                N = in.nextInt();
            }
            System.out.println("|Method         |ArrayList           |LinkedList          | \n" +
                    "|---------------|--------------------|--------------------|");

            System.out.print("|add            |");
            System.out.println(printResult(TestCollection.testAdd(arrayList, N), TestCollection.testAdd(linkedList, N)));

            System.out.print("|remove(first)  |");
            System.out.println(printResult(TestCollection.testRemoveFirst(arrayList, N), TestCollection.testRemoveFirst(linkedList, N)));

            System.out.print("|remove(last)   |");
            System.out.println(printResult(TestCollection.testRemoveLast(arrayList, N), TestCollection.testRemoveLast(linkedList, N)));

            System.out.print("|remove(center) |");
            System.out.println(printResult(TestCollection.testRemoveCenter(arrayList, N), TestCollection.testRemoveCenter(linkedList, N)));

            System.out.print("|get            |");
            System.out.println(printResult(TestCollection.testGet(arrayList, N), TestCollection.testGet(linkedList, N)));

            System.out.print("|get(first)     |");
            System.out.println(printResult(TestCollection.testGetFirst(arrayList, N), TestCollection.testGetFirst(linkedList, N)));

            System.out.print("|get(last)      |");
            System.out.println(printResult(TestCollection.testGetLast(arrayList, N), TestCollection.testGetLast(linkedList, N)));

            System.out.print("|get(center)    |");
            System.out.println(printResult(TestCollection.testGetCenter(arrayList, N), TestCollection.testGetCenter(linkedList, N)));


            System.out.print("|clear          |");
            System.out.println(printResult(TestCollection.testClear(arrayList, N), TestCollection.testClear(linkedList, N)));
        }
    }

    private static String printResult(long res1, long res2) {
        return String.format("%20d|%20d|\n|---------------|--------------------|--------------------|", res1, res2);
    }


}