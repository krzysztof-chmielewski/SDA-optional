package com.kchmielewski.sda.optional.task04;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;

public class BaseAmIBruceDickonson implements AmIBruceDickonson {
    public boolean amI(NullablePersonProvider provider) {
        return false;
    }

    public boolean amI(OptionalPersonProvider provider) {
        return false;
    }
}
