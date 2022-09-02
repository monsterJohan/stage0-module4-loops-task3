package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int beforeLast = 0;
        int last = 1;
        int current = 1;
        if (lastFibonacci == 1) {
            System.out.println(beforeLast);
        } else if (lastFibonacci == 2) {
            System.out.println(beforeLast);
            System.out.println(last);
        } else {
            System.out.println(beforeLast);
            System.out.println(last);
            System.out.println(current);

            lastFibonacci -= 3;
            while (lastFibonacci-- > 0) {
                beforeLast = last;
                last = current;
                current = beforeLast + last;

                System.out.println(current);
            }
        }
    }
}
