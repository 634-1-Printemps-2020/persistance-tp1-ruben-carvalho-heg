package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter implements ICounter {
    int count;
    int max;

    public UpperLimitedPositiveCounter(int start) {
        count = start;
    }
    public UpperLimitedPositiveCounter(int start, int limit) {
        count = start;
        max = limit;
    }

    @Override
    public void inc() throws CounterException {
        if(count < 0) {
            throw new CounterException();
        }
        count++;
    }

    @Override
    public void add(int step) throws CounterException {
        if(count > max) {
            throw new CounterException();
        }
        count+=step;
    }

    @Override
    public int getValue() {
        return count;
    }
}
