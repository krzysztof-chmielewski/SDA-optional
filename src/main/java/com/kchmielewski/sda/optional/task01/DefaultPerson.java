package com.kchmielewski.sda.optional.task01;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;

public interface DefaultPerson {
    Person defaultPerson();

    Person getPersonOrDefault(NullablePersonProvider provider);

    Person getPersonOrDefault(OptionalPersonProvider provider);
}
