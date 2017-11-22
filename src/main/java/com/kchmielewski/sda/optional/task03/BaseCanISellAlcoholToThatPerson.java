package com.kchmielewski.sda.optional.task03;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;

public class BaseCanISellAlcoholToThatPerson implements CanISellAlcoholToThatPerson {
    public boolean canISellAlcohol(NullablePersonProvider provider) {
        Person person = provider.person();
        if (person == null) {
            throw new IllegalArgumentException();
        }

        return person.age() >= 18;
    }

    public boolean canISellAlcohol(OptionalPersonProvider provider) {
        return provider.person().orElseThrow(IllegalArgumentException::new).age() >= 18;
    }
}
