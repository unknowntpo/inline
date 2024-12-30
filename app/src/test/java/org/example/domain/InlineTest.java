package org.example.domain;

import org.example.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InlineTest {
    @Test
    void oneCustomerInlineAndCheckStatus() {
        Inline inline = new Inline();
        int fakeRestaurantId = 10;
        int regId = inline.inline(fakeRestaurantId, "0933758305", "john@example.com", 3);
        InlineStatus status = inline.checkInlineStatus(regId);
        assertEquals(0, status.getPosition());
    }
}
