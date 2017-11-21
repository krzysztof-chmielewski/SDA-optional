package com.kchmielewski.sda.optional;

import java.util.Optional;

public class OptionalPersonProvider {
    private final Person person;

    public OptionalPersonProvider(Person person) {
        this.person = person;
    }

    public Optional<Person> person() {
        return Optional.ofNullable(person);
    }
}
