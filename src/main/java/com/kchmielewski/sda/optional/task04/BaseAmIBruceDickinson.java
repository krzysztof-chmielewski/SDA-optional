package com.kchmielewski.sda.optional.task04;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;

public class BaseAmIBruceDickinson implements AmIBruceDickinson {
    public boolean amI(NullablePersonProvider provider) {
        return false;
    }

    public boolean amI(OptionalPersonProvider provider) {
        return false;
    }
}
