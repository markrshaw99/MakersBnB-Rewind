package com.makers.makersbnb;

import com.makers.makersbnb.model.Space;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpaceTest {

    @Test
    public void testSpaceGettersAndSetters() {
        // Create a new Space instance
        Space space = new Space("Cosy Apartment");

        // Test setter and getter for name
        assertEquals("Cosy Apartment", space.getName());
        space.setName("Luxurious Villa");
        assertEquals("Luxurious Villa", space.getName());

        // Test setter and getter for description
        space.setDescription("A beautiful apartment in the city centre");
        assertEquals("A beautiful apartment in the city centre", space.getDescription());

        // Test setter and getter for price
        space.setPrice(150.50f);
        assertEquals(150.50f, space.getPrice());

        // Test setter and getter for id
        space.setId(1L);
        assertEquals(1L, space.getId());
    }

    @Test
    public void testSpaceNoArgConstructor() {
        // Test the no-args constructor (provided by @NoArgsConstructor)
        Space space = new Space();
        space.setName("Test Space");
        space.setDescription("A test space");
        space.setPrice(99.99f);
        space.setId(2L);

        assertEquals("Test Space", space.getName());
        assertEquals("A test space", space.getDescription());
        assertEquals(99.99f, space.getPrice());
        assertEquals(2L, space.getId());
    }
}

