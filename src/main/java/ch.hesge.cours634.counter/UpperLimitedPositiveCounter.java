package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    int max;

    public UpperLimitedPositiveCounter(int start, int limit) {
        super(start);
        max = limit;
    }

    @Override
    public void inc() throws CounterException {
        if(getValue()+1 > max) {
            throw new CounterException("cannot exceed the max value" + max);
        }
        super.inc();
    }

    @Override
    public void add(int step) throws CounterException {
        if(getValue()+step > max) {
            throw new CounterException("cannot exceed the max value " + max);
        }
        if(getValue()+step < 0) {
            throw new CounterException("cannot be negative");
        }
        super.add(step);
    }
}
