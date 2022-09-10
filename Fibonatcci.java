public class Fibonatcci {
    public static int fibonatcciIterative(int n) { // O(n)
        if (n < 2) {
            return n;
        }
        int x = 0;
        int feb = 1;
        for (int i = 0; i <= n - 2; i++) {
            int temp = feb;
            feb += x;
            x = temp;
        }
        return feb;
    }

    public static int fibonatcciRecursive(int n) { // O(n^2) really bad compared to the iterative approach

        // if (n <2) {
        // return n;
        // }
        // return fibonatcciRecursive(n-1) + fibonatcciIterative(n - 2);

        return n < 2 ? n : fibonatcciRecursive(n - 1) + fibonatcciRecursive(n - 2);
    }
}
