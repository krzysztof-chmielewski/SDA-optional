package com.kchmielewski.sda.optional;

public class NullablePersonProvider {
    private final Person person;

    public NullablePersonProvider(Person person) {
        this.person = person;
    }

    public Person person() {
        return person;
    }
}
