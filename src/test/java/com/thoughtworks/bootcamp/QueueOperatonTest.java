package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueOperatonTest {

    @Test
    void givenZeroPersonInQueue_WhenCheckQueueIsEmptyOrNot_ThenShouldReturnQueueIsEmpty() {
        QueueOperation queueOperation = new QueueOperation(0);
        Assertions.assertEquals(true, queueOperation.isEmpty());
    }

    @Test
    void givenOnePersonInQueue_WhenCheckQueueIsEmptyOrNot_ThenShouldReturnQueueIsNotEmpty() {
        QueueOperation queueOperation = new QueueOperation(1);
        Assertions.assertEquals(false, queueOperation.isEmpty());
    }
}
