package com.kchmielewski.sda.optional.task04;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;

public class BaseAmIBruceDickonson implements AmIBruceDickonson {
    public boolean amI(NullablePersonProvider provider) {
        Person person = provider.person();

        return person != null && person.name().equals("Bruce") && person.surname().equals("Dickonson");
    }

    public boolean amI(OptionalPersonProvider provider) {
        return provider.person().filter(p -> p.name().equals("Bruce") && p.surname().equals("Dickonson")).isPresent();
    }
}
