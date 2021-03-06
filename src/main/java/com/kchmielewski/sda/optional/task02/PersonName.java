package com.kchmielewski.sda.optional.task02;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;

public interface PersonName {
    String getName(NullablePersonProvider provider);

    String getName(OptionalPersonProvider provider);
}
