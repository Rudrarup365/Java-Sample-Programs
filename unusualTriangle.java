package testing;

public class unusualTriangle {

    public static void printPattern(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            int num = start;
            int step = n - i + 1;
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num -= step;
                step++;
            }
            System.out.println();
            start += n - i + 1;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }

}
