package com.kchmielewski.sda.optional.task01;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;

public class BaseDefaultPerson implements DefaultPerson {
    @Override
    public Person defaultPerson() {
        return new Person("Bruce", "Dickinson", 59);
    }

    @Override
    public Person getPersonOrDefault(NullablePersonProvider provider) {
        Person person = provider.person();
        return person == null ? defaultPerson() : person;
    }

    @Override
    public Person getPersonOrDefault(OptionalPersonProvider provider) {
        return provider.person().orElse(defaultPerson());
    }
}
