package com.kchmielewski.sda.optional.task02;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;

public class BasePersonName implements PersonName {
    @Override
    public String getName(NullablePersonProvider provider) {
        Person person = provider.person();
        return person == null ? "" : person.name();
    }

    @Override
    public String getName(OptionalPersonProvider provider) {
        return provider.person().map(Person::name).orElse("");
    }
}
