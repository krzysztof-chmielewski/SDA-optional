package com.kchmielewski.sda.optional.task02;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;

public class BasePersonName implements PersonName {
    @Override
    public String getName(NullablePersonProvider provider) {
        return null;
    }

    @Override
    public String getName(OptionalPersonProvider provider) {
        return null;
    }
}
