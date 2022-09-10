public class Factorial {
    public static int factorialUsingLoop(int num) {
        int factorial = 1;
        while (num > 1) {
            factorial *= num;
            num--;
        }
        return factorial;

    }

    public static int factorilaUsingRecursion(int num) {
        return num == 2 ? 2 : num * factorilaUsingRecursion(num - 1);
    }
}
