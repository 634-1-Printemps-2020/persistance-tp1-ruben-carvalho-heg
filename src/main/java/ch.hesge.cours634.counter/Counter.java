package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    int count;

    public Counter(int start) {
        count = start;
    }

    @Override
    public void inc() throws CounterException {
        count++;
    }

    @Override
    public void add(int step) throws CounterException {
        count += step;
    }

    @Override
    public int getValue() {
        return count;
    }
}
