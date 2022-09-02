package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int curNumber = 0;
        while (lengthOfLastNumber-- > 0) {
            sum += (curNumber * 10 + 9);
            curNumber = curNumber * 10 + 9;
        }

        System.out.println(sum);
    }
}
