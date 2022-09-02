package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first == 0 || second == 0) {
            System.out.println(first >= second ? first : second);
        } else {
            boolean isBigger = Math.abs(first) >= Math.abs(second);
            int reminder = isBigger ?
                    Math.abs(first) % Math.abs(second) : Math.abs(second) % Math.abs(first);
            int nextNumber = isBigger ?
                    Math.abs(second) : Math.abs(first);
            int prevReminder = reminder;
            while(reminder != 0) {
                reminder = nextNumber % reminder;
                nextNumber = prevReminder;
                prevReminder = reminder;
            }

            System.out.println(nextNumber);
        }

    }
}
