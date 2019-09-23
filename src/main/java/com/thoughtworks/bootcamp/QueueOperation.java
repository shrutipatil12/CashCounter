package com.thoughtworks.bootcamp;

public class QueueOperation {
    private int count;

    QueueOperation(int count) {
        this.count = count;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

}
