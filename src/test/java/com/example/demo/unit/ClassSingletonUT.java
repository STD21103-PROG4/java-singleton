package com.example.demo.unit;

import com.example.demo.ClassSingleton;
import org.junit.Assert;
import org.junit.Test;

public class ClassSingletonUT {
    @Test
    public void testGetInstance() {
        ClassSingleton instance1 = ClassSingleton.getInstance();
        ClassSingleton instance2 = ClassSingleton.getInstance();

        Assert.assertSame(instance1, instance2);
    }

    @Test
    public void testSingletonDescription() {
        String description = "Test Description";
        ClassSingleton instance = ClassSingleton.getInstance();
        instance.setDescription(description);

        ClassSingleton newInstance = ClassSingleton.getInstance();
        String newInstanceDescription = newInstance.getDescription();

        Assert.assertEquals(description, newInstanceDescription);
    }
}
