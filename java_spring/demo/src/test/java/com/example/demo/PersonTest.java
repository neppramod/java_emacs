package com.example.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest
{
    @Test
    public void testMethods() {
	Person p = new Person();
	p.setName("Monkey D. Luffy");
	p.setTitle("Pirate King");

	assertEquals(p.getName(), "Monkey D. Luffy");
	assertEquals(p.getTitle(), "Pirate King");
	
    }

    @Test
    public void testRole() {
	Person p = new Person();
	p.setRole("Captain");
	assertEquals(p.getRole(), "Captain");
    }
}
