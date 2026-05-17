package com.mycompany.chatapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageTest {

    @Test
    public void testMessageLengthSuccess() {

        Message msg = new Message(
                1,
                "+27718693002",
                "Hi Mike, can you join us for dinner tonight?"
        );

        assertEquals(
                "Message ready to send.",
                msg.checkMessageLength()
        );
    }

    @Test
    public void testRecipientSuccess() {

        Message msg = new Message(
                1,
                "+27718693002",
                "Hello"
        );

        assertTrue(msg.checkRecipientCell());
    }

    @Test
    public void testRecipientFailure() {

        Message msg = new Message(
                1,
                "0812345678",
                "Hello"
        );

        assertFalse(msg.checkRecipientCell());
    }

    @Test
    public void testSentMessageOption() {

        Message msg = new Message(
                1,
                "+27718693002",
                "Hello"
        );

        assertEquals(
                "Message successfully sent.",
                msg.sentMessage(1)
        );
    }
}