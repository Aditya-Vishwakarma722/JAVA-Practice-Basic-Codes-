import java.util.*;

class Division {

    public int dividor(List<Integer> arr, int d, int m) {

        if (m > arr.size()) return 0;

        int count = 0;
        int size = arr.size();

        for (int i = 0; i <= size - m; i++) {

            int sum = 0;

            for (int j = i; j < i + m; j++) {
                sum += arr.get(j);
            }

            if (sum == d) count++;
        }

        return count;
    }
}

public class Subarray_Division {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Division sv = new Division();

        int size = scn.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arr.add(scn.nextInt());
        }

        int d = scn.nextInt();
        int m = scn.nextInt();

        System.out.println(sv.dividor(arr, d, m));

        scn.close();
    }
}
