package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueOperatonTest {

    @Test
    void givenZeroPersonInQueue_WhenCheckQueueIsEmptyOrNot_ThenShouldReturnQueueIsEmpty() {
        QueueOperation queueOperation = new QueueOperation(0);
        Assertions.assertEquals(true, queueOperation.isEmpty());
    }

}
