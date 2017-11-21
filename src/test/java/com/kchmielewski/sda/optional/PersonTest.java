package com.kchmielewski.sda.optional;

import com.google.common.testing.NullPointerTester;
import org.junit.Test;

public class PersonTest {
    private final NullPointerTester tester = new NullPointerTester();

    @Test
    public void constructorCannotAcceptNullValues() throws Exception {
        tester.testAllPublicConstructors(Person.class);
    }
}