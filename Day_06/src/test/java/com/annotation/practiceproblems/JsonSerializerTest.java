package com.annotation.practiceproblems;

import com.annotation.practiceproblems.customannotations.advancedlevel.customserialization.User;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JsonSerializerTest {
    @Test
    public void testUserToJson() {
        User user = new User("Vivek Sahu", "merebhai@example.com");
        String json = user.toJson();

        assertTrue(json.contains("\"user_name\": \"Vivek Sahu\"")); // Check username
        assertTrue(json.contains("\"user_email\": \"merebhai@example.com\"")); // Check email
    }
}
