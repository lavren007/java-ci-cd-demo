package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class AppTest {
    
    @Test
    public void testAdd() {
        assertEquals(8, App.add(5, 3));
        assertEquals(0, App.add(-5, 5));
        assertEquals(100, App.add(50, 50));
    }
    
    @Test
    public void testIsEven() {
        assertTrue(App.isEven(2));
        assertTrue(App.isEven(0));
        assertTrue(App.isEven(-4));
        assertFalse(App.isEven(3));
        assertFalse(App.isEven(-7));
    }
    
    @Test
    public void testFilterEvenNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        List<Integer> result = App.filterEvenNumbers(input);
        
        assertEquals(expected, result);
        assertEquals(3, result.size());
        assertTrue(result.contains(2));
        assertFalse(result.contains(1));
    }
    
    @Test
    public void testEmptyList() {
        List<Integer> emptyList = Arrays.asList();
        List<Integer> result = App.filterEvenNumbers(emptyList);
        
        assertTrue(result.isEmpty());
        assertEquals(0, result.size());
    }
}