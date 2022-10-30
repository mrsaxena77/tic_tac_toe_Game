import java.util.*;

public class query {

    public static Scanner scn = new Scanner (System.in);

    public static int[]  input2 (int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void queries(long n, int[] arr) {
        int[] freq = new int[10];
        while (n != 0) {
            long d = n % 10;
            n = n / 10;import java.util.*;

public class freq {

    public static Scanner scn = new Scanner (System.in);

    public static int[] input2 (int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void input(int n) {

    }

    public static int countFreq (int n, int d) {
        int count = 0;
        while (n != 0) {
            int lastDig = n % 10;
            n = n / 10;

            if (lastDig == d) {
                count++;
            }
        }
        return count;
    }

    public static void main (String[] args) {
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = countFreq(n, d);
        System.out.print(f); 

    }
}

            freq[(int) d]++;
        }
        for (int q : arr  ) {
            System.out.println(freq[q]);
        }
    }

    public static void main (String[] args) {
        long n = scn.nextLong();
        int[] arr = input2(scn.nextInt());
        queries(n, arr);
    }
}
