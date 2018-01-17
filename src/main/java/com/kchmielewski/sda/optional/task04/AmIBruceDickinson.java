package com.kchmielewski.sda.optional.task04;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;

public interface AmIBruceDickinson {
    boolean amI(NullablePersonProvider provider);

    boolean amI(OptionalPersonProvider provider);
}
