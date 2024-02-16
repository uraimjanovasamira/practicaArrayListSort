import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            integers.add(random.nextInt(0, 2));

        }

        LinkedList<Integer> integers2 = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            integers2.add(random.nextInt(0, 2));

        }


        System.out.println(method(integers));
        System.out.println(method2(integers2));
    }

    public static ArrayList<Integer> method(ArrayList<Integer> integers) {
        System.out.print("Random numbers in ArrayList:" + integers + "\n");
        System.out.print("Отсортированные числа: ");
        Collections.sort(integers);
        return integers;

    }

    public static LinkedList<Integer> method2(LinkedList<Integer> integers2) {
        System.out.print("\nRandom numbers in LinkedList:" + integers2 + "\n");
        System.out.print("Отсортированные числа: ");
        Collections.sort(integers2);
        return integers2;
    }

}